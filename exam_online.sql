/*
 Navicat Premium Data Transfer

 Source Server         : me
 Source Server Type    : MySQL
 Source Server Version : 50721
 Source Host           : localhost:3306
 Source Schema         : exam_online

 Target Server Type    : MySQL
 Target Server Version : 50721
 File Encoding         : 65001

 Date: 22/03/2018 19:37:51
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for courses
-- ----------------------------
DROP TABLE IF EXISTS `courses`;
CREATE TABLE `courses`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `course_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 25 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of courses
-- ----------------------------
INSERT INTO `courses` VALUES (1, 'JavaSE');
INSERT INTO `courses` VALUES (2, 'HTML');
INSERT INTO `courses` VALUES (3, 'Javascript');
INSERT INTO `courses` VALUES (4, 'CSS');
INSERT INTO `courses` VALUES (5, 'Oracle');
INSERT INTO `courses` VALUES (6, 'JDBC');
INSERT INTO `courses` VALUES (7, 'JSP');
INSERT INTO `courses` VALUES (8, 'Servlet');
INSERT INTO `courses` VALUES (9, 'JUnit');
INSERT INTO `courses` VALUES (10, 'Struts 1/2');
INSERT INTO `courses` VALUES (11, 'Hibernate');
INSERT INTO `courses` VALUES (12, 'ibatis/MyBatis');
INSERT INTO `courses` VALUES (13, 'Spring');
INSERT INTO `courses` VALUES (14, 'Spring MVC');
INSERT INTO `courses` VALUES (15, 'jQuery');
INSERT INTO `courses` VALUES (16, 'easyui');
INSERT INTO `courses` VALUES (17, 'AJAX');
INSERT INTO `courses` VALUES (18, 'Android');
INSERT INTO `courses` VALUES (19, 'WebService');
INSERT INTO `courses` VALUES (20, 'XML');
INSERT INTO `courses` VALUES (21, 'UML');
INSERT INTO `courses` VALUES (22, 'Ant');
INSERT INTO `courses` VALUES (23, 'log4j');
INSERT INTO `courses` VALUES (24, 'Lunix/Unix');

-- ----------------------------
-- Table structure for eo_user
-- ----------------------------
DROP TABLE IF EXISTS `eo_user`;
CREATE TABLE `eo_user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `eou_no` varchar(18) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `id_card_no` varchar(18) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `user_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `pass_word` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `mobile` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '手机号码',
  `home_tel` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '家庭电话',
  `home_addr` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '家庭住址',
  `sch_addr` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `qq` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `email` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `user_type` int(12) NULL DEFAULT NULL,
  `gender` varchar(8) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `birthday` date NULL DEFAULT NULL,
  `nation_place` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '籍贯',
  `marjor` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `edu_Background` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '最高学历',
  `graduate_School` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '毕业院校',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of eo_user
-- ----------------------------
INSERT INTO `eo_user` VALUES (1, '211111', '123456789', '苏炯', '1', NULL, NULL, NULL, NULL, NULL, NULL, 1, NULL, NULL, NULL, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for examination
-- ----------------------------
DROP TABLE IF EXISTS `examination`;
CREATE TABLE `examination`  (
  `exam_no` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `user_id` int(11) NOT NULL,
  `exam_date` date NULL DEFAULT NULL,
  `single_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `multiple_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `true_false_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `fill_in_gaps_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `simple_anwser_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `program_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `descrpt` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`exam_no`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for examinfo
-- ----------------------------
DROP TABLE IF EXISTS `examinfo`;
CREATE TABLE `examinfo`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `exam_no` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for fsp_questions
-- ----------------------------
DROP TABLE IF EXISTS `fsp_questions`;
CREATE TABLE `fsp_questions`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `question` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `question_type` int(11) NOT NULL,
  `teacher_category_id` int(11) NOT NULL,
  `pubdate` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0),
  `descrpt` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `option_1` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `option_1_answer` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `option_2` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `option_2_answer` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `option_3` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `option_3_answer` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `option_4` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `option_4_answer` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `option_5` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `option_5_answer` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `state` int(11) NOT NULL DEFAULT 0,
  `user_id` int(11) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 10 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of fsp_questions
-- ----------------------------
INSERT INTO `fsp_questions` VALUES (2, '1212', 4, 11, '2018-03-20 16:28:55', '你是sb', '12', '阿萨德', '', '爱的', '', '阿顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶顶', '阿萨德', '啊', '', '', 4, 1);
INSERT INTO `fsp_questions` VALUES (3, 'qwe', 4, 15, '2018-03-20 16:28:59', 'qew', 'qwe', '', '', '', '', '', '', '', '', 'qwe', 4, 1);
INSERT INTO `fsp_questions` VALUES (4, '请用java输出helloWorld！', 4, 8, '2018-03-20 15:55:06', '这尼玛是智障吧', 'fuck', '', '', '', '', '', '', '', '', '', 4, 1);
INSERT INTO `fsp_questions` VALUES (6, '去玩儿天宇天宇通用', 4, 1, '2018-03-20 15:58:01', '啊', '', '', '', '', '', '', '', '', '', '', 4, 1);
INSERT INTO `fsp_questions` VALUES (7, '第一题', 4, 1, '2018-03-20 16:00:05', '12', '1', '1', '', '', '', '', '', '', '', '12', 4, 1);
INSERT INTO `fsp_questions` VALUES (8, '阿斯达1234567', 4, 1, '2018-03-20 16:01:49', '12', '121', '', '', '', '', '', '', '', '', '', 4, 1);
INSERT INTO `fsp_questions` VALUES (9, '内部类是一个很有用的类（说错了）', 3, 16, '2018-03-20 16:36:21', '真的超级坑', '什么是内部类？', '呵呵', '', '', '', '', '', '', '', '', 4, 1);

-- ----------------------------
-- Table structure for smd_questions
-- ----------------------------
DROP TABLE IF EXISTS `smd_questions`;
CREATE TABLE `smd_questions`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `question` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `question_type` int(11) NOT NULL COMMENT '(1,单选，2,多选，3,判断)',
  `teacher_category_id` int(11) NOT NULL,
  `pubdate` datetime(0) NULL DEFAULT NULL COMMENT '出题时间',
  `descrpt` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `option_A` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `option_B` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `option_C` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `option_D` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `option_E` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `option_F` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `option_G` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `answer` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `state` int(11) NOT NULL DEFAULT 0,
  `user_id` int(11) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 23 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of smd_questions
-- ----------------------------
INSERT INTO `smd_questions` VALUES (8, '12', 0, 1, '2018-03-20 09:45:32', '123', '', '', '', '', '', '', '', '0', 4, 1);
INSERT INTO `smd_questions` VALUES (9, '我是题目1', 0, 1, '2018-03-20 09:46:09', 'asdasd', '', '', '', '', '', '', '', 'asdasd', 4, 1);
INSERT INTO `smd_questions` VALUES (11, '哈哈哈哈哈哈好吧', 0, 1, '2018-03-20 15:55:56', '啊啊啊', '', '', '', '', '', '', '', '阿斯达', 4, 1);
INSERT INTO `smd_questions` VALUES (13, '阿斯达', 0, 1, '2018-03-20 16:02:25', '12', '', '', '', '', '', '', '', '0', 4, 1);
INSERT INTO `smd_questions` VALUES (14, '12', 0, 1, '2018-03-22 15:04:03', '12', '', '', '', '', '', '', '', '12', 1, 1);
INSERT INTO `smd_questions` VALUES (15, 'ffffffffffffffffffffffff', 0, 1, '2018-03-22 15:34:14', '1231', '12', '12', '12', '', '', '', '', '0', 1, 1);
INSERT INTO `smd_questions` VALUES (16, '12', 0, 1, '2018-03-22 15:11:58', '12', '', '', '', '', '', '', '12', '0', 1, 1);
INSERT INTO `smd_questions` VALUES (17, 'hehehhas', 0, 1, '2018-03-22 15:33:50', '12', '12', '', '', '', '', '', '', '0', 1, 1);
INSERT INTO `smd_questions` VALUES (18, '12', 2, 1, '2018-03-22 15:24:00', '12', NULL, NULL, NULL, NULL, NULL, NULL, NULL, '1', 1, 1);
INSERT INTO `smd_questions` VALUES (19, '', 0, 1, '2018-03-22 15:25:52', '', '', '', '', '', '', '', '', '0', 1, 1);
INSERT INTO `smd_questions` VALUES (20, '', 0, 1, '2018-03-22 15:32:41', '', '', '', '', '', '', '', '', '0', 1, 1);
INSERT INTO `smd_questions` VALUES (21, '12', 0, 1, '2018-03-22 15:33:20', '1212', '', '', '', '', '', '', '', '0', 1, 1);

-- ----------------------------
-- Table structure for stu_answer
-- ----------------------------
DROP TABLE IF EXISTS `stu_answer`;
CREATE TABLE `stu_answer`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `answer` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `exam_no` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `user_id` int(11) NULL DEFAULT NULL,
  `question_id` int(11) NOT NULL,
  `total_score` double(3, 1) NULL DEFAULT NULL,
  `get_score` double(3, 1) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for stu_score
-- ----------------------------
DROP TABLE IF EXISTS `stu_score`;
CREATE TABLE `stu_score`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `score` double(3, 1) NULL DEFAULT NULL,
  `test_date` date NULL DEFAULT NULL,
  `descrpt` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `user_id` int(11) NOT NULL,
  `exam_no` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `fsp_score` double(3, 1) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for student_comment
-- ----------------------------
DROP TABLE IF EXISTS `student_comment`;
CREATE TABLE `student_comment`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `content` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `user_id` int(11) NOT NULL,
  `question_id` int(11) NOT NULL,
  `discuss_date` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0),
  `user_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for teacher_category
-- ----------------------------
DROP TABLE IF EXISTS `teacher_category`;
CREATE TABLE `teacher_category`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `teacher_category_name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `course_id` int(11) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 20 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of teacher_category
-- ----------------------------
INSERT INTO `teacher_category` VALUES (1, '数据类型', 1);
INSERT INTO `teacher_category` VALUES (2, '变量、数据类型、运算符', 1);
INSERT INTO `teacher_category` VALUES (3, '条件结构、循环结构、switch', 1);
INSERT INTO `teacher_category` VALUES (4, '数组', 1);
INSERT INTO `teacher_category` VALUES (5, '构造函数', 1);
INSERT INTO `teacher_category` VALUES (6, '方法', 1);
INSERT INTO `teacher_category` VALUES (7, '访问修饰符', 1);
INSERT INTO `teacher_category` VALUES (8, 'static、关键字', 1);
INSERT INTO `teacher_category` VALUES (9, '类和对象、包', 1);
INSERT INTO `teacher_category` VALUES (10, '继承、抽象类、多态', 1);
INSERT INTO `teacher_category` VALUES (11, '接口', 1);
INSERT INTO `teacher_category` VALUES (12, '异常', 1);
INSERT INTO `teacher_category` VALUES (13, 'java.lang包', 1);
INSERT INTO `teacher_category` VALUES (14, 'java.util包', 1);
INSERT INTO `teacher_category` VALUES (15, 'java.io包', 1);
INSERT INTO `teacher_category` VALUES (16, '内部类', 1);
INSERT INTO `teacher_category` VALUES (17, '多线程', 1);
INSERT INTO `teacher_category` VALUES (18, 'Socket', 1);
INSERT INTO `teacher_category` VALUES (19, 'AWT/SWING', 1);

SET FOREIGN_KEY_CHECKS = 1;
