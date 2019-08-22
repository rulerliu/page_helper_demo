CREATE TABLE `user` (
  `id` int(32) NOT NULL AUTO_INCREMENT,
  `userName` varchar(32) NOT NULL,
  `passWord` varchar(50) NOT NULL,
  `realName` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

insert into user values(null, 'aa', 'aa', null);
insert into user values(null, 'bb', 'bb', null);
insert into user values(null, 'cc', 'cc', null);
insert into user values(null, 'dd', 'dd', null);
insert into user values(null, 'ee', 'ee', null);
insert into user values(null, 'ff', 'ff', null);