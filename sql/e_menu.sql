CREATE DATABASE  IF NOT EXISTS `e_menu` /*!40100 DEFAULT CHARACTER SET latin1 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `e_menu`;
-- MySQL dump 10.13  Distrib 8.0.15, for macos10.14 (x86_64)
--
-- Host: 127.0.0.1    Database: e_menu
-- ------------------------------------------------------
-- Server version	8.0.17

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `appraise_res`
--

DROP TABLE IF EXISTS `appraise_res`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `appraise_res` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `app_res_num` varchar(50) DEFAULT NULL COMMENT '饭店编号',
  `app_user_name` varchar(50) DEFAULT NULL COMMENT '顾客名字',
  `app_res_content` varchar(255) DEFAULT NULL COMMENT '评论内容',
  `app_prise_star` int(1) DEFAULT NULL COMMENT '评价饭店价格星星',
  `app_deli_star` int(1) DEFAULT NULL COMMENT '评价饭店好不好吃星星',
  `app_server_star` int(1) DEFAULT NULL COMMENT '评价饭店服务态度星星',
  `app_star` int(1) DEFAULT NULL COMMENT '总评星星',
  `addperson` varchar(255) DEFAULT NULL COMMENT '添加人',
  `addtime` varchar(255) DEFAULT NULL COMMENT '添加时间',
  `updateperson` varchar(255) DEFAULT NULL COMMENT '更新人',
  `updatetime` varchar(255) DEFAULT NULL COMMENT '更新时间',
  `deletesign` int(1) DEFAULT NULL COMMENT '删除标识',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=gb2312 COMMENT='顾客对饭店的评价';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `appraise_res`
--

LOCK TABLES `appraise_res` WRITE;
/*!40000 ALTER TABLE `appraise_res` DISABLE KEYS */;
INSERT INTO `appraise_res` VALUES (1,'10005','admin','真好吃',3,5,5,4,NULL,NULL,NULL,NULL,NULL),(2,'10005','admin','辣死我了',3,5,5,4,NULL,NULL,NULL,NULL,NULL),(3,'10004','admin','做的太辣了',1,1,1,1,NULL,NULL,NULL,NULL,NULL),(4,'10001','admin','口味偏重',1,1,1,1,NULL,NULL,NULL,NULL,NULL),(5,'10002','admin','还会再来',1,1,1,1,NULL,NULL,NULL,NULL,NULL),(6,'10006','admin','点赞666',1,1,1,1,NULL,NULL,NULL,NULL,NULL),(7,'10005','admin','很喜欢',1,1,1,1,NULL,NULL,NULL,NULL,NULL),(8,'10001','admin','不好吃呀',1,1,1,1,NULL,NULL,NULL,NULL,NULL),(9,'10003','admin','好吃',1,1,1,1,NULL,NULL,NULL,NULL,NULL),(10,'10002','admin','好吃',1,1,1,1,NULL,NULL,NULL,NULL,NULL),(11,'10001','admin','厨师手艺不错',1,1,1,1,NULL,NULL,NULL,NULL,NULL),(12,'10006','admin','技艺精湛',1,1,1,1,NULL,NULL,NULL,NULL,NULL),(13,'10001','admin','很好吃',1,1,1,1,NULL,NULL,NULL,NULL,NULL),(14,'10006','admin','餐厅很干净',1,1,1,1,NULL,NULL,NULL,NULL,NULL),(15,'10003','admin','好吃不贵',1,1,1,1,NULL,NULL,NULL,NULL,NULL),(16,'10004','admin','不错',1,1,1,1,NULL,NULL,NULL,NULL,NULL),(17,'10004','admin','不错',1,1,1,1,NULL,NULL,NULL,NULL,NULL),(19,'10003','admin','手艺好',1,1,1,1,NULL,NULL,NULL,NULL,NULL),(20,'10001','admin','手艺一流',1,1,1,1,NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `appraise_res` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `list`
--

DROP TABLE IF EXISTS `list`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `list` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `list_ord_num` int(100) DEFAULT NULL COMMENT '订单号',
  `list_me_num` int(11) DEFAULT NULL COMMENT '菜编号',
  `list_prise` varchar(255) DEFAULT NULL COMMENT '订单上的价格',
  `list_res_num` varchar(255) DEFAULT NULL COMMENT '饭店编号',
  `list_user_name` varchar(255) DEFAULT NULL COMMENT '用户名',
  `addperson` varchar(255) DEFAULT NULL COMMENT '添加人',
  `addtime` varchar(255) DEFAULT NULL COMMENT '添加时间',
  `updateperson` varchar(255) DEFAULT NULL COMMENT '更新人',
  `updatetime` varchar(255) DEFAULT NULL COMMENT '更新时间',
  `deletesign` int(1) DEFAULT NULL COMMENT '删除标识',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=8269 DEFAULT CHARSET=gb2312 COMMENT='顾客点的菜';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `list`
--

LOCK TABLES `list` WRITE;
/*!40000 ALTER TABLE `list` DISABLE KEYS */;
INSERT INTO `list` VALUES (9,7137643,102,'62','10001','admin',NULL,NULL,NULL,NULL,NULL),(10,7137643,103,'62','10001','admin',NULL,NULL,NULL,NULL,NULL),(11,7555035,104,'52','10001','admin',NULL,NULL,NULL,NULL,NULL),(12,7555035,105,'52','10001','admin',NULL,NULL,NULL,NULL,NULL),(13,7726423,105,'60','10001','admin',NULL,NULL,NULL,NULL,NULL),(14,7726423,106,'60','10001','admin',NULL,NULL,NULL,NULL,NULL),(15,7704360,103,'66','10001','admin',NULL,NULL,NULL,NULL,NULL),(8256,9216220,103,'164','10005','zhouss',NULL,NULL,NULL,NULL,NULL),(8257,9216220,104,'164','10005','zhouss',NULL,NULL,NULL,NULL,NULL),(8258,9216220,102,'164','10005','zhouss',NULL,NULL,NULL,NULL,NULL),(8259,9216220,103,'164','10005','zhouss',NULL,NULL,NULL,NULL,NULL),(8260,9216220,102,'164','10005','zhouss',NULL,NULL,NULL,NULL,NULL),(8261,9216220,102,'164','10005','zhouss',NULL,NULL,NULL,NULL,NULL),(8262,9216220,104,'164','10005','zhouss',NULL,NULL,NULL,NULL,NULL),(8263,9216220,102,'164','10005','zhouss',NULL,NULL,NULL,NULL,NULL),(8264,9216220,102,'164','10005','zhouss',NULL,NULL,NULL,NULL,NULL),(8265,9216220,103,'164','10005','zhouss',NULL,NULL,NULL,NULL,NULL),(8266,9216220,102,'164','10005','zhouss',NULL,NULL,NULL,NULL,NULL),(8267,9216220,102,'164','10005','zhouss',NULL,NULL,NULL,NULL,NULL),(8268,9216220,102,'164','10005','zhouss',NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `list` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `menu`
--

DROP TABLE IF EXISTS `menu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `menu` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `menu_classes` int(1) DEFAULT NULL COMMENT '菜系类别:0推荐；1热菜；2凉菜；3主食；4酒水',
  `menu_price` int(5) DEFAULT NULL COMMENT '菜价',
  `food_num` int(11) DEFAULT NULL COMMENT '菜编号',
  `food_name` varchar(20) DEFAULT NULL COMMENT '菜名',
  `menu_discount` int(2) DEFAULT NULL COMMENT '折扣',
  `menu_num` int(11) DEFAULT NULL COMMENT '菜单编号',
  `menu_res_num` int(11) DEFAULT NULL COMMENT '饭店编号',
  `food_img` varchar(255) DEFAULT NULL COMMENT '菜图片链接',
  `addperson` varchar(255) DEFAULT NULL COMMENT '添加人',
  `addtime` varchar(255) DEFAULT NULL COMMENT '添加时间',
  `updateperson` varchar(255) DEFAULT NULL COMMENT '更新人',
  `updatetime` varchar(255) DEFAULT NULL COMMENT '更新时间',
  `deletesign` int(11) DEFAULT NULL COMMENT '删除标识',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=43 DEFAULT CHARSET=gb2312 COMMENT='菜单';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `menu`
--

LOCK TABLES `menu` WRITE;
/*!40000 ALTER TABLE `menu` DISABLE KEYS */;
INSERT INTO `menu` VALUES (1,0,18,101,'瓦片梅肉',1,9001,10001,'img/500030.gif',NULL,NULL,NULL,NULL,NULL),(2,0,36,102,'竹架鱼',1,9001,10001,'img/500031.gif',NULL,NULL,NULL,NULL,NULL),(3,0,26,103,'东北乱炖',1,9001,10001,'img/500032.gif',NULL,NULL,NULL,NULL,NULL),(4,1,20,104,'鱼香肉丝',1,9001,10001,'img/500033.gif',NULL,NULL,NULL,NULL,NULL),(5,1,32,105,'红烧肉',1,9001,10001,'img/500034.gif',NULL,NULL,NULL,NULL,NULL),(6,1,28,106,'红烧排骨',1,9001,10001,'img/500035.gif',NULL,NULL,NULL,NULL,NULL),(7,1,30,107,'锅包肉',1,9001,10001,'img/500036.gif',NULL,NULL,NULL,NULL,NULL),(8,0,18,101,'瓦片梅肉',1,9001,10002,'img/500030.gif',NULL,NULL,NULL,NULL,NULL),(9,0,36,102,'竹架鱼',1,9001,10002,'img/500031.gif',NULL,NULL,NULL,NULL,NULL),(10,0,26,103,'东北乱炖',1,9001,10002,'img/500032.gif',NULL,NULL,NULL,NULL,NULL),(11,1,20,104,'鱼香肉丝',1,9001,10002,'img/500033.gif',NULL,NULL,NULL,NULL,NULL),(12,1,32,105,'红烧肉',1,9001,10002,'img/500034.gif',NULL,NULL,NULL,NULL,NULL),(13,1,28,106,'红烧排骨',1,9001,10002,'img/500035.gif',NULL,NULL,NULL,NULL,NULL),(14,1,30,107,'锅包肉',1,9001,10002,'img/500036.gif',NULL,NULL,NULL,NULL,NULL),(15,0,18,101,'瓦片梅肉',1,9001,10003,'img/500030.gif',NULL,NULL,NULL,NULL,NULL),(16,0,36,102,'竹架鱼',1,9001,10003,'img/500031.gif',NULL,NULL,NULL,NULL,NULL),(17,0,26,103,'东北乱炖',1,9001,10003,'img/500032.gif',NULL,NULL,NULL,NULL,NULL),(18,1,20,104,'鱼香肉丝',1,9001,10003,'img/500033.gif',NULL,NULL,NULL,NULL,NULL),(19,1,32,105,'红烧肉',1,9001,10003,'img/500034.gif',NULL,NULL,NULL,NULL,NULL),(20,1,28,106,'红烧排骨',1,9001,10003,'img/500035.gif',NULL,NULL,NULL,NULL,NULL),(21,1,30,107,'锅包肉',1,9001,10003,'img/500036.gif',NULL,NULL,NULL,NULL,NULL),(22,0,18,101,'瓦片梅肉',1,9001,10004,'img/500030.gif',NULL,NULL,NULL,NULL,NULL),(23,0,36,102,'竹架鱼',1,9001,10004,'img/500031.gif',NULL,NULL,NULL,NULL,NULL),(24,0,26,103,'东北乱炖',1,9001,10004,'img/500032.gif',NULL,NULL,NULL,NULL,NULL),(25,1,20,104,'鱼香肉丝',1,9001,10004,'img/500033.gif',NULL,NULL,NULL,NULL,NULL),(26,1,32,105,'红烧肉',1,9001,10004,'img/500034.gif',NULL,NULL,NULL,NULL,NULL),(27,1,28,106,'红烧排骨',1,9001,10004,'img/500035.gif',NULL,NULL,NULL,NULL,NULL),(28,1,30,107,'锅包肉',1,9001,10004,'img/500036.gif',NULL,NULL,NULL,NULL,NULL),(29,0,18,101,'瓦片梅肉',1,9001,10005,'img/500030.gif',NULL,NULL,NULL,NULL,NULL),(30,0,36,102,'竹架鱼',1,9001,10005,'img/500031.gif',NULL,NULL,NULL,NULL,NULL),(31,0,26,103,'东北乱炖',1,9001,10005,'img/500032.gif',NULL,NULL,NULL,NULL,NULL),(32,1,20,104,'鱼香肉丝',1,9001,10005,'img/500033.gif',NULL,NULL,NULL,NULL,NULL),(33,1,32,105,'红烧肉',1,9001,10005,'img/500034.gif',NULL,NULL,NULL,NULL,NULL),(34,1,28,106,'红烧排骨',1,9001,10005,'img/500035.gif',NULL,NULL,NULL,NULL,NULL),(35,1,30,107,'锅包肉',1,9001,10005,'img/500036.gif',NULL,NULL,NULL,NULL,NULL),(36,0,18,101,'瓦片梅肉',1,9001,10006,'img/500030.gif',NULL,NULL,NULL,NULL,NULL),(37,0,36,102,'竹架鱼',1,9001,10006,'img/500031.gif',NULL,NULL,NULL,NULL,NULL),(38,0,26,103,'东北乱炖',1,9001,10006,'img/500032.gif',NULL,NULL,NULL,NULL,NULL),(39,1,20,104,'鱼香肉丝',1,9001,10006,'img/500033.gif',NULL,NULL,NULL,NULL,NULL),(40,1,32,105,'红烧肉',1,9001,10006,'img/500034.gif',NULL,NULL,NULL,NULL,NULL),(41,1,28,106,'红烧排骨',1,9001,10006,'img/500035.gif',NULL,NULL,NULL,NULL,NULL),(42,1,30,107,'锅包肉',1,9001,10006,'img/500036.gif',NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `menu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `order`
--

DROP TABLE IF EXISTS `order`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `order` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `ord_num` int(10) DEFAULT NULL COMMENT '订单号',
  `ord_user_name` varchar(20) DEFAULT NULL COMMENT '预订订单的用户名',
  `ord_prise` float(10,3) DEFAULT NULL COMMENT '订单总价',
  `ord_res_num` int(11) DEFAULT NULL COMMENT '饭店编号',
  `ord_date` varchar(50) DEFAULT NULL COMMENT '预订时间',
  `ord_number` int(3) DEFAULT NULL COMMENT '预订要吃饭的人数',
  `ord_status` varchar(255) DEFAULT NULL COMMENT '订单状态',
  `ord_waiter_name` varchar(255) DEFAULT NULL COMMENT '服务员名字',
  `addperson` varchar(255) DEFAULT NULL COMMENT '添加人',
  `addtime` varchar(255) DEFAULT NULL COMMENT '添加时间',
  `updateperson` varchar(255) DEFAULT NULL COMMENT '更新人',
  `updatetime` varchar(255) DEFAULT NULL COMMENT '更新时间',
  `deletesign` int(1) DEFAULT NULL COMMENT '删除标识',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=6243 DEFAULT CHARSET=gb2312 COMMENT='订单';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `order`
--

LOCK TABLES `order` WRITE;
/*!40000 ALTER TABLE `order` DISABLE KEYS */;
INSERT INTO `order` VALUES (1,7137643,'admin',62.000,10001,'2014-06-21',2,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(2,7555035,'admin',52.000,10001,'2014-06-30',2,NULL,'qwe1',NULL,NULL,NULL,NULL,NULL),(3,7726423,'admin',60.000,10001,'2014-06-21',2,NULL,'qwe1',NULL,NULL,NULL,NULL,NULL),(4,7704360,'admin',66.000,10001,'2014-06-21',2,NULL,'qwe1',NULL,NULL,NULL,NULL,NULL),(5,4318462,'admin',84.000,10002,'2014-07-24',3,NULL,'qwe2',NULL,NULL,NULL,NULL,NULL),(6,599644,'admin',46.000,10001,'2014-07-24',3,NULL,'qwe1',NULL,NULL,NULL,NULL,NULL),(7,656570,'zhousy',46.000,10002,'2014-07-25',9,NULL,'qwe2',NULL,NULL,NULL,NULL,NULL),(8,1264342,'admin',62.000,10004,'2014-07-23',1,NULL,'qwe4',NULL,NULL,NULL,NULL,NULL),(9,1887122,'admin',94.000,10003,'2014-07-26',2,NULL,'qwe3',NULL,NULL,NULL,NULL,NULL),(10,6501171,NULL,80.000,10005,'2014-07-30',44,NULL,'qwe5',NULL,NULL,NULL,NULL,NULL),(11,2637465,'admin',88.000,10006,'2014-07-30',22,NULL,'qwe6',NULL,NULL,NULL,NULL,NULL),(12,4864480,'admin',60.000,10006,'2014-07-02',2,NULL,'qwe6',NULL,NULL,NULL,NULL,NULL),(13,4935695,'admin',58.000,10005,'2014-07-10',3,NULL,'qwe5',NULL,NULL,NULL,NULL,NULL),(14,4971417,'admin',58.000,10006,'2014-07-29',8,NULL,'qwe6',NULL,NULL,NULL,NULL,NULL),(15,5016540,'zhousy',60.000,10004,'2014-07-29',3,NULL,'qwe4',NULL,NULL,NULL,NULL,NULL),(16,5083782,'zhousy',120.000,10003,'2014-07-28',1,NULL,'qwe3',NULL,NULL,NULL,NULL,NULL),(17,5358037,'admin',92.000,10003,'2014-08-12',5,NULL,'qwe3',NULL,NULL,NULL,NULL,NULL),(18,5412304,'admin',92.000,10003,'2014-08-12',5,NULL,'qwe3',NULL,NULL,NULL,NULL,NULL),(19,5506471,'admin',104.000,10004,'2014-08-28',2,NULL,'qwe4',NULL,NULL,NULL,NULL,NULL),(20,5784767,'admin',104.000,10004,'2014-08-28',2,NULL,'qwe4',NULL,NULL,NULL,NULL,NULL),(6242,9216220,'zhouss',164.000,10005,'2020-05-22',2,NULL,NULL,NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `order` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `restaurant`
--

DROP TABLE IF EXISTS `restaurant`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `restaurant` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `res_num` int(11) DEFAULT NULL COMMENT '饭店编号',
  `res_name` varchar(50) DEFAULT NULL COMMENT '饭店名称',
  `res_rank` varchar(255) DEFAULT NULL COMMENT '饭店等级',
  `res_tel` varchar(15) DEFAULT NULL COMMENT '饭店电话',
  `res_add` varchar(100) DEFAULT NULL COMMENT '饭店地址',
  `res_pro` varchar(30) DEFAULT NULL COMMENT '省',
  `res_city` varchar(30) DEFAULT NULL COMMENT '市',
  `addperson` varchar(255) DEFAULT NULL COMMENT '添加人',
  `addtime` varchar(255) DEFAULT NULL COMMENT '添加时间',
  `updateperson` varchar(255) DEFAULT NULL COMMENT '更新人',
  `updatetime` varchar(255) DEFAULT NULL COMMENT '更新时间',
  `deletesign` int(1) DEFAULT NULL COMMENT '删除标识',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=gb2312 COMMENT='餐馆的信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `restaurant`
--

LOCK TABLES `restaurant` WRITE;
/*!40000 ALTER TABLE `restaurant` DISABLE KEYS */;
INSERT INTO `restaurant` VALUES (1,10001,'姥姥家','5.0','024-63885689','和平区','辽宁省','沈阳市','movie1.jpg',NULL,NULL,NULL,NULL),(2,10002,'来地方','4.2','1254564687','沈北新区','辽宁省','葫芦岛市','movie2.jpg',NULL,NULL,NULL,NULL),(3,10003,'好日子','2.8','78945612302','黄寺广场','河北省','秦皇岛市','movie3.jpg',NULL,NULL,NULL,NULL),(4,10004,'京桥日本料理','3.5','78956423102','北三经街67号','山东省','济南市','movie4.jpg',NULL,NULL,NULL,NULL),(5,10005,'御兰园铁板烧牛排馆','4.5','78965412301','和平区七纬路22号(近北三经街)','北京','海淀区','movie5.jpg',NULL,NULL,NULL,NULL),(6,10006,'盆盆香','3.6','78945612301','和平区北三经街51号','上海','浦东新区','movie6.jpg',NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `restaurant` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `user` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(20) DEFAULT NULL COMMENT '用户名',
  `user_pwd` varchar(20) DEFAULT NULL COMMENT '用户密码',
  `user_email` varchar(40) DEFAULT NULL COMMENT '用户邮箱',
  `user_sign` int(2) DEFAULT NULL COMMENT '标识符：1顾客；2服务员；3大堂经理;',
  `user_tel` varchar(15) DEFAULT NULL COMMENT '电话',
  `user_sex` varchar(2) DEFAULT NULL COMMENT '性别',
  `user_res` int(11) DEFAULT NULL COMMENT '属于饭店的编号',
  `user_real_name` varchar(30) DEFAULT NULL COMMENT '真实姓名',
  `user_img` varchar(255) DEFAULT NULL COMMENT '用户头像图片链接',
  `addperson` varchar(255) DEFAULT NULL COMMENT '添加人',
  `addtime` varchar(255) DEFAULT NULL COMMENT '添加时间',
  `updateperson` varchar(255) DEFAULT NULL COMMENT '更新人',
  `updatetime` varchar(255) DEFAULT NULL COMMENT '更新时间',
  `deletesign` int(1) DEFAULT NULL COMMENT '删除标识',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=gb2312 COMMENT='用户信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'admin','admin','admin@admin.com',0,'18604293390','男',NULL,'admin','../userimg/e16b70fc.jpg',NULL,NULL,NULL,NULL,NULL),(2,'zhousy','pwd','zhou@admin.com',1,'12345678901','男',NULL,'zhousiyuan','../userimg/e16b70fc.jpg',NULL,NULL,NULL,NULL,NULL),(15,'zhouss','pwd','ss@admin.com',1,'12345678901','男',NULL,'zhouss','../userimg/e16b70fc.jpg',NULL,NULL,NULL,NULL,NULL),(16,'zhouxx','pwd','ss@admin.com',1,'12345678901','男',NULL,'zhouxx','../userimg/e16b70fc.jpg',NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-05-23 23:55:08
