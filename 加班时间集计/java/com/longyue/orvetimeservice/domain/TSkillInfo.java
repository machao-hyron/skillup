package com.longyue.orvetimeservice.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 技能信息
 * @TableName t_skill_info
 */
@TableName(value ="t_skill_info")
@Data
public class TSkillInfo implements Serializable {
    /**
     * 雇员id
     */
    @TableId
    private String employeeId;

    /**
     * java
     */
    private Integer java;

    /**
     * 
     */
    private Integer cSharp;

    /**
     * 安卓
     */
    private Integer android;

    /**
     * 网间网操作系统
     */
    private Integer ios;

    /**
     * c_plus
     */
    private Integer cPlus;

    /**
     * net
     */
    private Integer net;

    /**
     * spring
     */
    private Integer spring;

    /**
     * oracle
     */
    private Integer oracle;

    /**
     * mysql
     */
    private Integer mysql;

    /**
     * sqlserver
     */
    private Integer sqlserver;

    /**
     * jsp
     */
    private Integer jsp;

    /**
     * jquery
     */
    private Integer jquery;

    /**
     * css
     */
    private Integer css;

    /**
     * html
     */
    private Integer html;

    /**
     * thymeleaf
     */
    private Integer thymeleaf;

    /**
     * 有棱角的
     */
    private Integer angular;

    /**
     * vue
     */
    private Integer vue;

    /**
     * 反应
     */
    private Integer react;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改用户id
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
        TSkillInfo other = (TSkillInfo) that;
        return (this.getEmployeeId() == null ? other.getEmployeeId() == null : this.getEmployeeId().equals(other.getEmployeeId()))
            && (this.getJava() == null ? other.getJava() == null : this.getJava().equals(other.getJava()))
            && (this.getCSharp() == null ? other.getCSharp() == null : this.getCSharp().equals(other.getCSharp()))
            && (this.getAndroid() == null ? other.getAndroid() == null : this.getAndroid().equals(other.getAndroid()))
            && (this.getIos() == null ? other.getIos() == null : this.getIos().equals(other.getIos()))
            && (this.getCPlus() == null ? other.getCPlus() == null : this.getCPlus().equals(other.getCPlus()))
            && (this.getNet() == null ? other.getNet() == null : this.getNet().equals(other.getNet()))
            && (this.getSpring() == null ? other.getSpring() == null : this.getSpring().equals(other.getSpring()))
            && (this.getOracle() == null ? other.getOracle() == null : this.getOracle().equals(other.getOracle()))
            && (this.getMysql() == null ? other.getMysql() == null : this.getMysql().equals(other.getMysql()))
            && (this.getSqlserver() == null ? other.getSqlserver() == null : this.getSqlserver().equals(other.getSqlserver()))
            && (this.getJsp() == null ? other.getJsp() == null : this.getJsp().equals(other.getJsp()))
            && (this.getJquery() == null ? other.getJquery() == null : this.getJquery().equals(other.getJquery()))
            && (this.getCss() == null ? other.getCss() == null : this.getCss().equals(other.getCss()))
            && (this.getHtml() == null ? other.getHtml() == null : this.getHtml().equals(other.getHtml()))
            && (this.getThymeleaf() == null ? other.getThymeleaf() == null : this.getThymeleaf().equals(other.getThymeleaf()))
            && (this.getAngular() == null ? other.getAngular() == null : this.getAngular().equals(other.getAngular()))
            && (this.getVue() == null ? other.getVue() == null : this.getVue().equals(other.getVue()))
            && (this.getReact() == null ? other.getReact() == null : this.getReact().equals(other.getReact()))
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
        result = prime * result + ((getJava() == null) ? 0 : getJava().hashCode());
        result = prime * result + ((getCSharp() == null) ? 0 : getCSharp().hashCode());
        result = prime * result + ((getAndroid() == null) ? 0 : getAndroid().hashCode());
        result = prime * result + ((getIos() == null) ? 0 : getIos().hashCode());
        result = prime * result + ((getCPlus() == null) ? 0 : getCPlus().hashCode());
        result = prime * result + ((getNet() == null) ? 0 : getNet().hashCode());
        result = prime * result + ((getSpring() == null) ? 0 : getSpring().hashCode());
        result = prime * result + ((getOracle() == null) ? 0 : getOracle().hashCode());
        result = prime * result + ((getMysql() == null) ? 0 : getMysql().hashCode());
        result = prime * result + ((getSqlserver() == null) ? 0 : getSqlserver().hashCode());
        result = prime * result + ((getJsp() == null) ? 0 : getJsp().hashCode());
        result = prime * result + ((getJquery() == null) ? 0 : getJquery().hashCode());
        result = prime * result + ((getCss() == null) ? 0 : getCss().hashCode());
        result = prime * result + ((getHtml() == null) ? 0 : getHtml().hashCode());
        result = prime * result + ((getThymeleaf() == null) ? 0 : getThymeleaf().hashCode());
        result = prime * result + ((getAngular() == null) ? 0 : getAngular().hashCode());
        result = prime * result + ((getVue() == null) ? 0 : getVue().hashCode());
        result = prime * result + ((getReact() == null) ? 0 : getReact().hashCode());
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
        sb.append(", java=").append(java);
        sb.append(", cSharp=").append(cSharp);
        sb.append(", android=").append(android);
        sb.append(", ios=").append(ios);
        sb.append(", cPlus=").append(cPlus);
        sb.append(", net=").append(net);
        sb.append(", spring=").append(spring);
        sb.append(", oracle=").append(oracle);
        sb.append(", mysql=").append(mysql);
        sb.append(", sqlserver=").append(sqlserver);
        sb.append(", jsp=").append(jsp);
        sb.append(", jquery=").append(jquery);
        sb.append(", css=").append(css);
        sb.append(", html=").append(html);
        sb.append(", thymeleaf=").append(thymeleaf);
        sb.append(", angular=").append(angular);
        sb.append(", vue=").append(vue);
        sb.append(", react=").append(react);
        sb.append(", createTime=").append(createTime);
        sb.append(", createUserId=").append(createUserId);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", updateUserId=").append(updateUserId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}