package com.longyue.orvetimeservice.domain.dto;

import com.baomidou.mybatisplus.annotation.TableField;
import com.longyue.orvetimeservice.domain.TAccountInfo;
import com.longyue.orvetimeservice.domain.TDepartmentMst;
import com.longyue.orvetimeservice.domain.TWorkTime;
import lombok.Data;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Accessors(chain = true)
public class UTEmployeePTF {
    /**
     *  工号
     */
    private String empId;

    /**
     * 部门名称
     */
    private String departmentName;

    /**
     * 雇员姓名
     */
    private String employeeName;

    /**
     * 累计加班时间
     */
    private Date dataTime;

    @Override
    public String toString() {
        return  "工号:'" + empId + '\'' +
                ", 部门:'" + departmentName + '\'' +
                ", 姓名:'" + employeeName + '\'' +
                ", 加班时间:" + dataTime ;
    }


}
