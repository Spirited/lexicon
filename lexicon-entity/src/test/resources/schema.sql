CREATE TABLE IF NOT EXISTS `Users` (
  `user_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(200) NOT NULL,
  `last_name` varchar(200) NOT NULL,
  PRIMARY KEY (`user_id`)
);