/*
考勤管理系统数据库创建
*/
DROP DATABASE IF EXISTS `ats_demo`;
CREATE DATABASE IF NOT EXISTS `ats_demo`;
USE `ats_demo`;

/*
部门mst表创建
*/
DROP TABLE IF EXISTS `t_dep`;
CREATE TABLE IF NOT EXISTS `t_dep` (
  `no`INT(32) NOT NULL AUTO_INCREMENT,
  `dep_id` VARCHAR(32) NOT NULL,
  `dep_name`VARCHAR(32) NOT NULL,
  PRIMARY KEY (`no`)
) ENGINE=INNODB DEFAULT CHARSET=utf8mb4;

/*
账号情报表创建
*/
DROP TABLE IF EXISTS `t_number`;
CREATE TABLE IF NOT EXISTS `t_number` (
  `job_id` VARCHAR(32) NOT NULL ,
  `mail` VARCHAR(50) NOT NULL,
  `password` VARCHAR(255) NOT NULL,
  `login_datetime` TIMESTAMP NULL DEFAULT NULL,
  `login_user` VARCHAR(32) NOT NULL ,
  `update_datetime` TIMESTAMP NULL DEFAULT NULL,
  `update_user` VARCHAR(32) NOT NULL ,
  PRIMARY KEY (`job_id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8mb4;
/*
项目信息表创建
*/
DROP TABLE IF EXISTS `t_project`;
CREATE TABLE IF NOT EXISTS `t_project` (
  `no`INT(32) NOT NULL AUTO_INCREMENT,
  `project_id`VARCHAR(32) NOT NULL,
  `dep_id` VARCHAR(32) NOT NULL,
  `project_name` DATE NULL DEFAULT NULL,
  `project_leader_no` VARCHAR(32) NOT NULL,
  `project_all_no` VARCHAR(32) NOT NULL ,
  `login_datetime` TIMESTAMP NULL DEFAULT NULL,
  `login_user` VARCHAR(32) NOT NULL ,
  `update_datetime` TIMESTAMP NULL DEFAULT NULL,
  `update_user` VARCHAR(32) NOT NULL ,
  PRIMARY KEY (`no`)
) ENGINE=INNODB DEFAULT CHARSET=utf8mb4;


/*
员工情报表创建
*/
DROP TABLE IF EXISTS `t_emp`;
CREATE TABLE IF NOT EXISTS `t_emp` (
  `job_id` VARCHAR(32) NOT NULL ,
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
  PRIMARY KEY (`job_id`),
  INDEX(`emp_name`)
) ENGINE=INNODB DEFAULT CHARSET=utf8mb4;

/*
工作履历表创建
*/
DROP TABLE IF EXISTS `t_record`;
CREATE TABLE IF NOT EXISTS `t_record` (
  `no` INT(32) NOT NULL AUTO_INCREMENT,
  `job_id`VARCHAR(32) NOT NULL,
  `from_time` DATE NULL DEFAULT NULL,
  `to_time`   DATE NULL DEFAULT NULL,
  `company_name` VARCHAR(32) NOT NULL ,
  `position` VARCHAR(32) NOT NULL,
  `login_datetime` TIMESTAMP NULL DEFAULT NULL,
  `login_user` VARCHAR(32) NOT NULL ,
  `update_datetime` TIMESTAMP NULL DEFAULT NULL,
  `update_user` VARCHAR(32) NOT NULL ,
  PRIMARY KEY (`no`),
  FOREIGN KEY(`job_id`) REFERENCES t_emp(`job_id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8mb4;
/*
技能信息表创建
*/
DROP TABLE IF EXISTS `t_skill`;
CREATE TABLE IF NOT EXISTS `t_skill` (
  `job_id` VARCHAR(32) NOT NULL ,
  `java` CHAR(1) NOT NULL,
  `c#` CHAR(1) NOT NULL,
  `ios` CHAR(1) NOT NULL,
  `android` CHAR(1) NOT NULL,
  `c++` CHAR(1) NOT NULL,
  `.net` CHAR(1) NOT NULL,
  `spring` CHAR(1) NOT NULL,
  `oracle` CHAR(1) NOT NULL,
  `sqlserver` CHAR(1) NOT NULL,
  `jsp` CHAR(1) NOT NULL,
  `jquery` CHAR(1) NOT NULL,
  `css` CHAR(1) NOT NULL,
  `html` CHAR(1) NOT NULL,
  `thymeleaf` CHAR(1) NOT NULL,
  `augular` CHAR(1) NOT NULL,
  `vue` CHAR(1) NOT NULL,
  `react` CHAR(1) NOT NULL,
  `login_datetime` TIMESTAMP NULL DEFAULT NULL,
  `login_user` VARCHAR(32) NOT NULL ,
  `update_datetime` TIMESTAMP NULL DEFAULT NULL,
  `update_user` VARCHAR(32) NOT NULL ,
  PRIMARY KEY (`job_id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8mb4;

/*
考勤表创建
*/
DROP TABLE IF EXISTS `t_work_time`;
CREATE TABLE IF NOT EXISTS `t_work_time` (
  `no`INT(32) NOT NULL AUTO_INCREMENT,
  `dep_id` VARCHAR(32) NOT NULL,
  `job_id`VARCHAR(32) NOT NULL,
  `emp_name`VARCHAR(32) NOT NULL,
  `work_datetime` DATE NULL DEFAULT NULL,
  `am_time`DATETIME NULL DEFAULT NULL,
  `pm_time`DATETIME NULL DEFAULT NULL,
  `overtime`INT(32) NOT NULL,
  `login_datetime` TIMESTAMP NULL DEFAULT NULL,
  `login_user` VARCHAR(32) NOT NULL ,
  `update_datetime` TIMESTAMP NULL DEFAULT NULL,
  `update_user` VARCHAR(32) NOT NULL ,
  PRIMARY KEY (`no`)
) ENGINE=INNODB DEFAULT CHARSET=utf8mb4;
