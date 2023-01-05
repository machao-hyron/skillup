package com.hyron.ats.interceptor;

import com.hyron.ats.config.CreateTime;
import com.hyron.ats.config.CreateUserId;
import com.hyron.ats.config.UpdateTime;
import com.hyron.ats.config.UpdateUserId;
import com.hyron.ats.dto.CreateAndUpdate;
import org.apache.ibatis.binding.MapperMethod;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.SqlCommandType;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Signature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.util.Date;
import java.util.List;

@Component
@Intercepts({@Signature(type = Executor.class, method = "update", args = {MappedStatement.class, Object.class})})
public class CreateAndUpdateInterceptor implements Interceptor{
    private static final Logger logger = LoggerFactory.getLogger(CreateAndUpdateInterceptor.class);

    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        MappedStatement mappedStatement = (MappedStatement) invocation.getArgs()[0];

        // 获取 SQL 命令
        SqlCommandType sqlCommandType = mappedStatement.getSqlCommandType();
        //只判断新增和修改
        if (SqlCommandType.INSERT.equals(sqlCommandType) || SqlCommandType.UPDATE.equals(sqlCommandType)) {
            // 获取参数
            Object parameter = invocation.getArgs()[1];
            //批量操作时
            if (parameter instanceof MapperMethod.ParamMap) {
                MapperMethod.ParamMap map = (MapperMethod.ParamMap) parameter;
                Object obj = map.get("list");
                List<?> list = (List<?>) obj;
                if (list != null) {
                    for (Object o : list) {
                        setParameter(o, sqlCommandType);
                    }
                }
            } else {
                setParameter(parameter, sqlCommandType);
            }
        }
        return invocation.proceed();
    }

    public void setParameter(Object parameter, SqlCommandType sqlCommandType) throws Throwable {
        Class<?> aClass = parameter.getClass();
        Field[] declaredFields;
        //如果常用字段提取了公共类 CreateAndUpdate
        //判断CreateAndUpdate是否是父类
        if (CreateAndUpdate.class.isAssignableFrom(aClass)) {
            // 获取父类私有成员变量
            declaredFields = aClass.getSuperclass().getDeclaredFields();
        } else {
            // 获取私有成员变量
            declaredFields = aClass.getDeclaredFields();
        }
        for (Field field : declaredFields) {
            if (SqlCommandType.INSERT.equals(sqlCommandType)) { // insert 语句插入 CreateUserId
                if (field.getAnnotation(CreateUserId.class) != null) {
                    field.setAccessible(true);
                    // 这里实际开发中获取登录用户，目前没有登录拦截
                    field.set(parameter,"js000");
                }

                if (field.getAnnotation(CreateTime.class) != null) { // insert 语句插入 createTime
                    field.setAccessible(true);
                    field.set(parameter, new Date());
                }
            }

            if (SqlCommandType.INSERT.equals(sqlCommandType)) {
                if (field.getAnnotation(UpdateTime.class) != null) { // insert 语句插入 updateTime
                    field.setAccessible(true);
                    field.set(parameter, new Date());
                }
                if (field.getAnnotation(UpdateUserId.class) != null) { // insert 语句插入 UpdateUserId
                    field.setAccessible(true);
                    // 这里实际开发中获取登录用户，目前没有登录拦截
                    field.set(parameter, "js000");
                }
            }

            if (SqlCommandType.UPDATE.equals(sqlCommandType)) {
                if (field.getAnnotation(UpdateTime.class) != null) { // update 语句插入 updateTime
                    field.setAccessible(true);
                    field.set(parameter, new Date());
                }
                if (field.getAnnotation(UpdateUserId.class) != null) { // update 语句插入 UpdateUserId
                    field.setAccessible(true);
                    // 这里实际开发中获取登录用户，目前没有登录拦截
                    field.set(parameter, "js000");
                }
            }
        }
    }
}
