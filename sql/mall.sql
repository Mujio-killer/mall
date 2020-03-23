/*
Navicat MySQL Data Transfer

Source Server         : mujio
Source Server Version : 50045
Source Host           : localhost:3306
Source Database       : mall

Target Server Type    : MYSQL
Target Server Version : 50045
File Encoding         : 65001

Date: 2020-03-23 14:35:14
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for conn
-- ----------------------------
DROP TABLE IF EXISTS `conn`;
CREATE TABLE `conn` (
  `id` int(11) NOT NULL auto_increment,
  `orderid` int(11) default NULL,
  `goodsid` int(11) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of conn
-- ----------------------------
INSERT INTO `conn` VALUES ('1', '1', '1');
INSERT INTO `conn` VALUES ('2', '1', '2');
INSERT INTO `conn` VALUES ('3', '1', '3');
INSERT INTO `conn` VALUES ('4', '2', '4');
INSERT INTO `conn` VALUES ('5', '2', '5');
INSERT INTO `conn` VALUES ('6', '3', '6');
INSERT INTO `conn` VALUES ('7', '3', '7');
INSERT INTO `conn` VALUES ('8', '4', '8');
INSERT INTO `conn` VALUES ('9', '5', '9');
INSERT INTO `conn` VALUES ('10', '6', '10');
INSERT INTO `conn` VALUES ('11', '6', '1');
INSERT INTO `conn` VALUES ('12', '6', '2');
INSERT INTO `conn` VALUES ('13', '7', '3');
INSERT INTO `conn` VALUES ('14', '7', '4');
INSERT INTO `conn` VALUES ('15', '8', '5');
INSERT INTO `conn` VALUES ('16', '8', '6');
INSERT INTO `conn` VALUES ('17', '8', '7');
INSERT INTO `conn` VALUES ('18', '9', '8');
INSERT INTO `conn` VALUES ('19', '9', '9');
INSERT INTO `conn` VALUES ('20', '10', '10');
INSERT INTO `conn` VALUES ('21', '10', '4');

-- ----------------------------
-- Table structure for goods
-- ----------------------------
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods` (
  `id` int(11) NOT NULL auto_increment,
  `name` varchar(255) default NULL,
  `price` double default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of goods
-- ----------------------------
INSERT INTO `goods` VALUES ('1', '电脑', '7299');
INSERT INTO `goods` VALUES ('2', '鼠标', '49');
INSERT INTO `goods` VALUES ('3', '键盘', '239');
INSERT INTO `goods` VALUES ('4', '鼠标垫', '9');
INSERT INTO `goods` VALUES ('5', '转接口', '39');
INSERT INTO `goods` VALUES ('6', '电脑包', '109');
INSERT INTO `goods` VALUES ('7', '手写板', '319');
INSERT INTO `goods` VALUES ('8', '显示器', '699');
INSERT INTO `goods` VALUES ('9', '固态', '659');
INSERT INTO `goods` VALUES ('10', '内存', '229');

-- ----------------------------
-- Table structure for orders
-- ----------------------------
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders` (
  `id` int(11) NOT NULL auto_increment,
  `createdate` datetime default NULL COMMENT '创建时间',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of orders
-- ----------------------------
INSERT INTO `orders` VALUES ('1', '2020-03-23 11:10:03');
INSERT INTO `orders` VALUES ('2', '2020-03-23 11:10:08');
INSERT INTO `orders` VALUES ('3', '2020-03-23 11:10:10');
INSERT INTO `orders` VALUES ('4', '2020-03-23 11:10:13');
INSERT INTO `orders` VALUES ('5', '2020-03-23 11:10:16');
INSERT INTO `orders` VALUES ('6', '2020-03-23 11:10:19');
INSERT INTO `orders` VALUES ('7', '2020-03-23 11:10:21');
INSERT INTO `orders` VALUES ('8', '2020-03-23 11:10:24');
INSERT INTO `orders` VALUES ('9', '2020-03-23 11:10:28');
INSERT INTO `orders` VALUES ('10', '2020-03-23 11:10:30');
