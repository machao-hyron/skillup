package com.lu.demo.commen;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/*通用返回结果类，服务端响应的数据会封装成此对象
*
* */
@Data
public class R<T> {

    private Integer code; //编码：1成功，0和其它数字为失败

    private String msg; //错误信息

    private T data; //数据

    private Map map = new HashMap(); //动态数据

    public static <T> com.lu.demo.commen.R<T> success(T object) {
        com.lu.demo.commen.R<T> r = new com.lu.demo.commen.R<T>();
        r.data = object;
        r.code = 1;
        return r;
    }

    public static <T> com.lu.demo.commen.R<T> error(String msg) {
        com.lu.demo.commen.R r = new com.lu.demo.commen.R();
        r.msg = msg;
        r.code = 0;
        return r;
    }

    public com.lu.demo.commen.R<T> add(String key, Object value) {
        this.map.put(key, value);
        return this;
    }

}
