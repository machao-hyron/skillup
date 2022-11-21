-- 账号情报表
CREATE TABLE IF NOT EXISTS `t_account_info` (
  `employee_id` char(7) NOT NULL,
  `e_mail` VARCHAR(50) NOT NULL,
  `psw` varchar(20) NOT NULL,
  `create_time` Datetime NOT NULL,
  `create_user_id` char(7) NOT NULL,
  `update_time` Datetime NULL DEFAULT NULL,
  `update_user_id` char(7) NULL DEFAULT NULL,
  PRIMARY KEY (`employee_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- 员工情报表
CREATE TABLE IF NOT EXISTS `t_employee_info` (
  `employee_id` char(7) NOT NULL,
  `department_id` char(4) NOT NULL,
  `project_id` varchar(5) NOT NULL,
  `employee_name` varchar(10) NOT NULL,
  `employee_sex` char(1) NOT NULL,
  `employee_birth` Date NOT NULL,
  `graduation_year` YEAR NOT NULL,
  `graduation_university` varchar(50) NOT NULL,
  `induction_date` Date NOT NULL,
  `on_job_flg` tinyint(1) NOT NULL,
  `resignation_date`Date NOT NULL,
  `employee_img` varchar(50) NOT NULL,
  `create_time` Datetime NOT NULL,
  `create_user_id` char(7) NOT NULL,
  `update_time` Datetime NULL DEFAULT NULL,
  `update_user_id` char(7) NULL DEFAULT NULL,
  PRIMARY KEY (`employee_id`,`department_id`,`project_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


-- 工作履历表
CREATE TABLE IF NOT EXISTS `t_work_experience` (
  `employee_id` char(7) NOT NULL,
  `from_year` YEAR NOT NULL,
  `to_year` YEAR NOT NULL,
  `position` varchar(10) NOT NULL,
  `create_time` Datetime NOT NULL,
  `create_user_id` char(7) NOT NULL,
  `update_time` Datetime NULL DEFAULT NULL,
  `update_user_id` char(7) NULL DEFAULT NULL,
  PRIMARY KEY (`employee_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;



-- 技能信息表
CREATE TABLE IF NOT EXISTS `t_skill_info` (
  `employee_id` char(7) NOT NULL,
  `java` tinyint(1) NOT NULL,
  `c_sharp` tinyint(1) NOT NULL,
  `android` tinyint(1) NOT NULL,
  `ios` tinyint(1) NOT NULL,
  `c_plus` tinyint(1) NOT NULL,
  `net` tinyint(1) NOT NULL,
  `spring` tinyint(1) NOT NULL,
  `oracle` tinyint(1) NOT NULL,
  `mysql` tinyint(1) NOT NULL,
  `sqlserver` tinyint(1) NOT NULL,
  `jsp` tinyint(1) NOT NULL,
  `jquery` tinyint(1) NOT NULL,
  `css` tinyint(1) NOT NULL,
  `html` tinyint(1) NOT NULL,
  `thymeleaf` tinyint(1) NOT NULL,
  `angular` tinyint(1) NOT NULL,
  `vue` tinyint(1) NOT NULL,
  `react` tinyint(1) NOT NULL,
  `create_time` Datetime NOT NULL,
  `create_user_id` char(7) NOT NULL,
  `update_time` Datetime NULL DEFAULT NULL,
  `update_user_id` char(7) NULL DEFAULT NULL,
  PRIMARY KEY (`employee_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;





-- 考勤表 
CREATE TABLE IF NOT EXISTS `t_work_time` (
  `department_id` char(4) NOT NULL,
  `employee_id` char(7) NOT NULL,
  `employee_name` varchar(10) NOT NULL,
  `work_date` date NOT NULL,
  `arrive_time` time DEFAULT NULL,
  `leave_time` time DEFAULT NULL,
  `extra_work_time` tinyint(4) DEFAULT 0,
  `insert_time` datetime NOT NULL,
  `insert_person_id` char(7) NOT NULL,
  `update_time` datetime NOT NULL,
  `update_person_id` char(7) NOT NULL,
  PRIMARY KEY (`employee_id`,`work_date`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- 加班时间集计结果表 
CREATE TABLE IF NOT EXISTS `t_work_time_total` (
  `operator_id` char(7) NOT NULL,
  `employee_id` char(7) NOT NULL,
  `employee_name` varchar(10) NOT NULL,
  `department_id` char(4) NOT NULL,
  `project_id` varchar(17) NOT NULL,
  `year` tinyint(4) NOT NULL,
  `month` tinyint(4) NOT NULL,
  `extra_work_time` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- 项目情报表 
CREATE TABLE IF NOT EXISTS `t_project_information` (
  `department_id` char(4) NOT NULL,
  `project_id` varchar(7) NOT NULL,
  `project_name` varchar(15) NOT NULL,
  `project_leader_id` char(7) NOT NULL,
  `project_general_id` varchar(7) NOT NULL,
  `insert_time` datetime NOT NULL,
  `insert_person_id` char(7) NOT NULL,
  `update_time` datetime NOT NULL,
  `update_person_id` char(7) NOT NULL,
  PRIMARY KEY (`department_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


-- 部门MST表 
CREATE TABLE IF NOT EXISTS `t_department_MST` (
  `department_id` char(4) NOT NULL,
  `department_name` varchar(15) NOT NULL,
  PRIMARY KEY (`department_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;