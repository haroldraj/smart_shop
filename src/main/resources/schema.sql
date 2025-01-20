DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
    `id` BIGINT AUTO_INCREMENT PRIMARY KEY,
    `first_name` VARCHAR(255) NOT NULL,
    `last_name` VARCHAR(255),
    `phone_number` VARCHAR(255),
    `registration_date` DATETIME,
    `last_login_date` TIMESTAMP
)ENGINE = InnoDB
AUTO_INCREMENT = 112
DEFAULT CHARSET = utf8mb3
COLLATE = utf8mb3_general_ci;