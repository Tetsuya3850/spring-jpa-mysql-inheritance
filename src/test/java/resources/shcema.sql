CREATE TABLE billing_method (
   `id` int NOT NULL AUTO_INCREMENT,
   `bm_type` enum('CC','BA') NOT NULL,
    `owner` varchar(255) NOT NULL,
    `card_number` varchar(255),
    `account_number` varchar(255),
     PRIMARY KEY (`id`)
);