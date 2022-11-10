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
  `job_no` VARCHAR(10) NOT NULL ,
  `mail` VARCHAR(32) NOT NULL,
  `password` VARCHAR(20) NOT NULL,
  `login_datetime` TIMESTAMP NULL DEFAULT NULL,
  `login_user` VARCHAR(10) NOT NULL ,
  `update_datetime` TIMESTAMP NULL DEFAULT NULL,
  `update_user` VARCHAR(10) NOT NULL ,
  PRIMARY KEY (`job_no`)
) ENGINE=INNODB DEFAULT CHARSET=utf8mb4;

/*
员工情报表创建
*/
DROP TABLE IF EXISTS `t_emp`;
CREATE TABLE IF NOT EXISTS `t_emp` (
  `job_no` VARCHAR(10) NOT NULL ,
  `dep_id` VARCHAR(10) NOT NULL,
  `project_id` VARCHAR(10) NOT NULL,
  `emp_name` VARCHAR(10) NOT NULL,
  `sex` CHAR(1) NOT NULL,
  `birthday_datetime` TIMESTAMP NULL DEFAULT NULL,
  `join_time` TIMESTAMP NULL DEFAULT NULL,
  `on_job_flag` CHAR(1) NOT NULL,
  `leave_time` VARCHAR(10) NOT NULL ,
  `emp_img` BLOB,
  `login_datetime` TIMESTAMP NULL DEFAULT NULL,
  `login_user` VARCHAR(10) NOT NULL ,
  `update_datetime` TIMESTAMP NULL DEFAULT NULL,
  `update_user` VARCHAR(10) NOT NULL ,
  PRIMARY KEY (`job_no`),
  INDEX(`emp_name`)
) ENGINE=INNODB DEFAULT CHARSET=utf8mb4;