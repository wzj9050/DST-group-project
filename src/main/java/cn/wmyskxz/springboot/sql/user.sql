CREATE TABLE `user` (
                        `id` int(50) NOT NULL,
                        `name` varchar(50) DEFAULT NULL,
                        `age` int(50) DEFAULT NULL,
                        `sex` varchar(50) DEFAULT NULL,
                        PRIMARY KEY (`id`)
);
insert  into `user`(`id`,`name`,`age`,`sex`) values (1,'小芳',23,'女'),(2,'小马',25,'男'),(3,'小李',22,'男'),(4,'小静',22,'女'),(5,'lgf',26,'男');
