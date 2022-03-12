## 部署步骤
## 一、配置数据库
- src/main/resources/application.yml：配置相应对端口，username，password
- 注意自己使用的mysql版本，不同使用版本  **driver-class-name**不同 
- **mysql5.0**: com.mysql.jdbc.Driver     **mysql8.0**:   com.mysql.cj.jdbc.Driver
2. doc/开发文档.md: 建库建表，在登陆了mysql后，按照顺序CV文档中的SQL语句进行执行即可
## 二、启动应用
- src/main/java/com/innovation/platform/PlatformApplication.java: 启动即可
