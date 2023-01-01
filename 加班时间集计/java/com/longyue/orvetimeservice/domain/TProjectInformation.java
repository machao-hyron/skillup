package com.longyue.orvetimeservice.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 项目信息
 * @TableName t_project_information
 */
@TableName(value ="t_project_information")
@Data
public class TProjectInformation implements Serializable {
    /**
     * 部门id
     */
    @TableId
    private String departmentId;

    /**
     * 项目id
     */
    private String projectId;

    /**
     * 项目名称
     */
    private String projectName;

    /**
     * 项目标题id
     */
    private String projectLeaderId;

    /**
     * 项目一般id
     */
    private String projectGeneralId;

    /**
     * 插入时间
     */
    private Date insertTime;

    /**
     * 插入人员id
     */
    private String insertPersonId;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 更新个人id
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
        TProjectInformation other = (TProjectInformation) that;
        return (this.getDepartmentId() == null ? other.getDepartmentId() == null : this.getDepartmentId().equals(other.getDepartmentId()))
            && (this.getProjectId() == null ? other.getProjectId() == null : this.getProjectId().equals(other.getProjectId()))
            && (this.getProjectName() == null ? other.getProjectName() == null : this.getProjectName().equals(other.getProjectName()))
            && (this.getProjectLeaderId() == null ? other.getProjectLeaderId() == null : this.getProjectLeaderId().equals(other.getProjectLeaderId()))
            && (this.getProjectGeneralId() == null ? other.getProjectGeneralId() == null : this.getProjectGeneralId().equals(other.getProjectGeneralId()))
            && (this.getInsertTime() == null ? other.getInsertTime() == null : this.getInsertTime().equals(other.getInsertTime()))
            && (this.getInsertPersonId() == null ? other.getInsertPersonId() == null : this.getInsertPersonId().equals(other.getInsertPersonId()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getUpdatePersonId() == null ? other.getUpdatePersonId() == null : this.getUpdatePersonId().equals(other.getUpdatePersonId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDepartmentId() == null) ? 0 : getDepartmentId().hashCode());
        result = prime * result + ((getProjectId() == null) ? 0 : getProjectId().hashCode());
        result = prime * result + ((getProjectName() == null) ? 0 : getProjectName().hashCode());
        result = prime * result + ((getProjectLeaderId() == null) ? 0 : getProjectLeaderId().hashCode());
        result = prime * result + ((getProjectGeneralId() == null) ? 0 : getProjectGeneralId().hashCode());
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
        sb.append(", departmentId=").append(departmentId);
        sb.append(", projectId=").append(projectId);
        sb.append(", projectName=").append(projectName);
        sb.append(", projectLeaderId=").append(projectLeaderId);
        sb.append(", projectGeneralId=").append(projectGeneralId);
        sb.append(", insertTime=").append(insertTime);
        sb.append(", insertPersonId=").append(insertPersonId);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", updatePersonId=").append(updatePersonId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}