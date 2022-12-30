package com.longyue.orvetimeservice.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

import com.github.yulichang.annotation.EntityMapping;
import lombok.Data;
import org.apache.ibatis.annotations.ResultMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 员工信息表
 * @TableName t_employee_info
 */
@TableName(value ="t_employee_info")
@Data
public class TEmployeeInfo implements Serializable {
    /**
     * 员工id
     */
    @TableId
    private String employeeId;

    /**
     * 部门id
     */

    private String departmentId;

    /**
     * 项目id
     */

    private String projectId;

    /**
     * 雇员姓名
     */
    private String employeeName;

    /**
     * 雇员性别
     */
    private String employeeSex;

    /**
     * 雇员_出生
     */
    private Date employeeBirth;

    /**
     * 毕业_年
     */
    private Object graduationYear;

    /**
     * 大学毕业
     */
    private String graduationUniversity;

    /**
     * 入职日期
     */
    private Date inductionDate;

    /**
     * 作业_重量
     */
    private Integer onJobFlg;

    /**
     * 辞职_日期
     */
    private Date resignationDate;

    /**
     * 员工_ img
     */
    private String employeeImg;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 创建用户id
     */
    private String createUserId;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 修改用户id
     */
    private String updateUserId;


    @TableField(exist = false)
    @EntityMapping(thisField = "departmentId",joinField = "departmentId")
    private TDepartmentMst tDepartmentMst;
    @TableField(exist = false)
    private TWorkTime tWorkTime;
    @TableField(exist = false)
    private TAccountInfo tAccountInfo;

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
        TEmployeeInfo other = (TEmployeeInfo) that;
        return (this.getEmployeeId() == null ? other.getEmployeeId() == null : this.getEmployeeId().equals(other.getEmployeeId()))
            && (this.getDepartmentId() == null ? other.getDepartmentId() == null : this.getDepartmentId().equals(other.getDepartmentId()))
            && (this.getProjectId() == null ? other.getProjectId() == null : this.getProjectId().equals(other.getProjectId()))
            && (this.getEmployeeName() == null ? other.getEmployeeName() == null : this.getEmployeeName().equals(other.getEmployeeName()))
            && (this.getEmployeeSex() == null ? other.getEmployeeSex() == null : this.getEmployeeSex().equals(other.getEmployeeSex()))
            && (this.getEmployeeBirth() == null ? other.getEmployeeBirth() == null : this.getEmployeeBirth().equals(other.getEmployeeBirth()))
            && (this.getGraduationYear() == null ? other.getGraduationYear() == null : this.getGraduationYear().equals(other.getGraduationYear()))
            && (this.getGraduationUniversity() == null ? other.getGraduationUniversity() == null : this.getGraduationUniversity().equals(other.getGraduationUniversity()))
            && (this.getInductionDate() == null ? other.getInductionDate() == null : this.getInductionDate().equals(other.getInductionDate()))
            && (this.getOnJobFlg() == null ? other.getOnJobFlg() == null : this.getOnJobFlg().equals(other.getOnJobFlg()))
            && (this.getResignationDate() == null ? other.getResignationDate() == null : this.getResignationDate().equals(other.getResignationDate()))
            && (this.getEmployeeImg() == null ? other.getEmployeeImg() == null : this.getEmployeeImg().equals(other.getEmployeeImg()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getCreateUserId() == null ? other.getCreateUserId() == null : this.getCreateUserId().equals(other.getCreateUserId()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getUpdateUserId() == null ? other.getUpdateUserId() == null : this.getUpdateUserId().equals(other.getUpdateUserId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getEmployeeId() == null) ? 0 : getEmployeeId().hashCode());
        result = prime * result + ((getDepartmentId() == null) ? 0 : getDepartmentId().hashCode());
        result = prime * result + ((getProjectId() == null) ? 0 : getProjectId().hashCode());
        result = prime * result + ((getEmployeeName() == null) ? 0 : getEmployeeName().hashCode());
        result = prime * result + ((getEmployeeSex() == null) ? 0 : getEmployeeSex().hashCode());
        result = prime * result + ((getEmployeeBirth() == null) ? 0 : getEmployeeBirth().hashCode());
        result = prime * result + ((getGraduationYear() == null) ? 0 : getGraduationYear().hashCode());
        result = prime * result + ((getGraduationUniversity() == null) ? 0 : getGraduationUniversity().hashCode());
        result = prime * result + ((getInductionDate() == null) ? 0 : getInductionDate().hashCode());
        result = prime * result + ((getOnJobFlg() == null) ? 0 : getOnJobFlg().hashCode());
        result = prime * result + ((getResignationDate() == null) ? 0 : getResignationDate().hashCode());
        result = prime * result + ((getEmployeeImg() == null) ? 0 : getEmployeeImg().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getCreateUserId() == null) ? 0 : getCreateUserId().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getUpdateUserId() == null) ? 0 : getUpdateUserId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", employeeId=").append(employeeId);
        sb.append(", departmentId=").append(departmentId);
        sb.append(", projectId=").append(projectId);
        sb.append(", employeeName=").append(employeeName);
        sb.append(", employeeSex=").append(employeeSex);
        sb.append(", employeeBirth=").append(employeeBirth);
        sb.append(", graduationYear=").append(graduationYear);
        sb.append(", graduationUniversity=").append(graduationUniversity);
        sb.append(", inductionDate=").append(inductionDate);
        sb.append(", onJobFlg=").append(onJobFlg);
        sb.append(", resignationDate=").append(resignationDate);
        sb.append(", employeeImg=").append(employeeImg);
        sb.append(", createTime=").append(createTime);
        sb.append(", createUserId=").append(createUserId);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", updateUserId=").append(updateUserId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}