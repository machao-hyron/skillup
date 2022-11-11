/*
考勤管理系统数据库创建
*/
DROP DATABASE IF EXISTS `ats_demo`;
CREATE DATABASE IF NOT EXISTS `ats_demo`;
USE `ats_demo`;

/*
账号情报表创建
*/
DROP TABLE IF EXISTS `t_number`;
CREATE TABLE IF NOT EXISTS `t_number` (
  `job_no` VARCHAR(32) NOT NULL ,
  `mail` VARCHAR(50) NOT NULL,
  `password` VARCHAR(255) NOT NULL,
  `login_datetime` TIMESTAMP NULL DEFAULT NULL,
  `login_user` VARCHAR(32) NOT NULL ,
  `update_datetime` TIMESTAMP NULL DEFAULT NULL,
  `update_user` VARCHAR(32) NOT NULL ,
  PRIMARY KEY (`job_no`)
) ENGINE=INNODB DEFAULT CHARSET=utf8mb4;

/*
员工情报表创建
*/
DROP TABLE IF EXISTS `t_emp`;
CREATE TABLE IF NOT EXISTS `t_emp` (
  `job_no` VARCHAR(32) NOT NULL ,
  `dep_id` VARCHAR(32) NOT NULL,
  `project_id` VARCHAR(32) NOT NULL,
  `emp_name` VARCHAR(32) NOT NULL,
  `sex` CHAR(1) NOT NULL,
  `birthday_datetime` TIMESTAMP NULL DEFAULT NULL,
  `leave_school_time` DATE NULL DEFAULT NULL,
  `school` VARCHAR(32) NOT NULL,
  `join_time` TIMESTAMP NULL DEFAULT NULL,
  `on_job_flag` CHAR(1) NOT NULL,
  `leave_time` TIMESTAMP NULL DEFAULT NULL,
  `emp_img` BLOB,
  `login_datetime` TIMESTAMP NULL DEFAULT NULL,
  `login_user` VARCHAR(32) NOT NULL ,
  `update_datetime` TIMESTAMP NULL DEFAULT NULL,
  `update_user` VARCHAR(32) NOT NULL ,
  PRIMARY KEY (`job_no`),
  INDEX(`emp_name`)
) ENGINE=INNODB DEFAULT CHARSET=utf8mb4;

/*
工作履历表创建
*/
DROP TABLE IF EXISTS `t_record`;
CREATE TABLE IF NOT EXISTS `t_record` (
  `no` INT(32) NOT NULL AUTO_INCREMENT,
  `job_no`VARCHAR(32) NOT NULL,
  `from_time` DATE NULL DEFAULT NULL,
  `to_time`   DATE NULL DEFAULT NULL,
  `company_name` VARCHAR(32) NOT NULL ,
  `position` VARCHAR(32) NOT NULL,
  `login_datetime` TIMESTAMP NULL DEFAULT NULL,
  `login_user` VARCHAR(32) NOT NULL ,
  `update_datetime` TIMESTAMP NULL DEFAULT NULL,
  `update_user` VARCHAR(32) NOT NULL ,
  PRIMARY KEY (`no`),
  FOREIGN KEY(`job_no`) REFERENCES t_emp(`job_no`)
) ENGINE=INNODB DEFAULT CHARSET=utf8mb4;
