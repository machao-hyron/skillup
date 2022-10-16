
-- d311_study のデータベース構造をダンプしています
DROP DATABASE IF EXISTS `d311_study`;
CREATE DATABASE IF NOT EXISTS `d311_study` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `d311_study`;

--  テーブル d311_study.t_user_info の構造をダンプしています
DROP TABLE IF EXISTS `t_user_info`;
CREATE TABLE IF NOT EXISTS `t_user_info` (
  `user_id` int NOT NULL AUTO_INCREMENT,
  `user_name` varchar(10) NOT NULL,
  `age` int NOT NULL,
  `sex` char(1) NOT NULL,
  `memo` varchar(100) DEFAULT NULL,
  `create_datetime` timestamp NULL DEFAULT NULL,
  `upadte_datetime` timestamp NULL DEFAULT NULL,
  `pwd` varchar(20) NOT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- テーブル d311_study.t_user_info: ~2 rows (約) のデータをダンプしています
INSERT INTO `t_user_info` (`user_id`, `user_name`, `age`, `sex`, `memo`, `create_datetime`, `upadte_datetime`, `pwd`) VALUES
	(1, '张三', 18, '男', NULL, NULL, NULL, '123456'),
	(2, '李四', 20, '女', NULL, NULL, NULL, '123456');
