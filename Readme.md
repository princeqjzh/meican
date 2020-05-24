**电商Sample应用(美餐网)**

启动方法
1. 创建DB, 初始化数据。 导入sql语句 sql/e_menu.sql;
2. 在 src/main/resources/hibernate.cfg.xml 中配置 MySQL DB 的用户名、密码；
3. 项目编译: mvn clean install
4. 项目启动：mvn tomcat7:run