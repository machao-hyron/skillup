package com.longyue.orvetimeservice.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName t_work_time
 */
@TableName(value ="t_work_time")
@Data
public class TWorkTime implements Serializable {
    /**
     * 
     */
    @TableId
    private String employeeId;

    /**
     * 
     */
    private Date workDate;

    /**
     * 
     */
    private String departmentId;

    /**
     * 
     */
    private String employeeName;

    /**
     * 
     */
    private Date arriveTime;

    /**
     * 
     */
    private Date leaveTime;

    /**
     * 
     */
    private Integer extraWorkTime;

    /**
     * 
     */
    private Date insertTime;

    /**
     * 
     */
    private String insertPersonId;

    /**
     * 
     */
    private Date updateTime;

    /**
     * 
     */
    private String updatePersonId;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        TWorkTime other = (TWorkTime) that;
        return (this.getEmployeeId() == null ? other.getEmployeeId() == null : this.getEmployeeId().equals(other.getEmployeeId()))
            && (this.getWorkDate() == null ? other.getWorkDate() == null : this.getWorkDate().equals(other.getWorkDate()))
            && (this.getDepartmentId() == null ? other.getDepartmentId() == null : this.getDepartmentId().equals(other.getDepartmentId()))
            && (this.getEmployeeName() == null ? other.getEmployeeName() == null : this.getEmployeeName().equals(other.getEmployeeName()))
            && (this.getArriveTime() == null ? other.getArriveTime() == null : this.getArriveTime().equals(other.getArriveTime()))
            && (this.getLeaveTime() == null ? other.getLeaveTime() == null : this.getLeaveTime().equals(other.getLeaveTime()))
            && (this.getExtraWorkTime() == null ? other.getExtraWorkTime() == null : this.getExtraWorkTime().equals(other.getExtraWorkTime()))
            && (this.getInsertTime() == null ? other.getInsertTime() == null : this.getInsertTime().equals(other.getInsertTime()))
            && (this.getInsertPersonId() == null ? other.getInsertPersonId() == null : this.getInsertPersonId().equals(other.getInsertPersonId()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getUpdatePersonId() == null ? other.getUpdatePersonId() == null : this.getUpdatePersonId().equals(other.getUpdatePersonId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getEmployeeId() == null) ? 0 : getEmployeeId().hashCode());
        result = prime * result + ((getWorkDate() == null) ? 0 : getWorkDate().hashCode());
        result = prime * result + ((getDepartmentId() == null) ? 0 : getDepartmentId().hashCode());
        result = prime * result + ((getEmployeeName() == null) ? 0 : getEmployeeName().hashCode());
        result = prime * result + ((getArriveTime() == null) ? 0 : getArriveTime().hashCode());
        result = prime * result + ((getLeaveTime() == null) ? 0 : getLeaveTime().hashCode());
        result = prime * result + ((getExtraWorkTime() == null) ? 0 : getExtraWorkTime().hashCode());
        result = prime * result + ((getInsertTime() == null) ? 0 : getInsertTime().hashCode());
        result = prime * result + ((getInsertPersonId() == null) ? 0 : getInsertPersonId().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getUpdatePersonId() == null) ? 0 : getUpdatePersonId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", employeeId=").append(employeeId);
        sb.append(", workDate=").append(workDate);
        sb.append(", departmentId=").append(departmentId);
        sb.append(", employeeName=").append(employeeName);
        sb.append(", arriveTime=").append(arriveTime);
        sb.append(", leaveTime=").append(leaveTime);
        sb.append(", extraWorkTime=").append(extraWorkTime);
        sb.append(", insertTime=").append(insertTime);
        sb.append(", insertPersonId=").append(insertPersonId);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", updatePersonId=").append(updatePersonId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}