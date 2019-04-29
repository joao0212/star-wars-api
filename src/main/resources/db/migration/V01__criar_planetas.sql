CREATE TABLE	`planeta` (
  `id` BIGINT(20) unsigned NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) NOT NULL,
  `terreno` varchar(100) NOT NULL,
  `clima` varchar(100) NOT NULL,
  `aparicoes` BIGINT(20) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=50 DEFAULT CHARSET=utf8;

