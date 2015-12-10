Misc Sai 03
=============================
Configurations
- Spring 4.1.7.RELEASE (XML Configurations)
- Hibernate 4.3.10.Final (JPA Annotation Configuration)
- Tiles 3.0.5
- Maven Build
- CoffeeScript

Build
-----

### 1 clone repository
> git clone git@github.com:slothink/quickstart-sai02.git

### 2 execute sql on database

```
CREATE DATABASE misc_sai_03 CHARACTER SET utf8 COLLATE utf8_general_ci;
CREATE USER 'misc_sai_03'@'localhost' IDENTIFIED BY 'asdf1234';
CREATE USER 'misc_sai_03'@'%' IDENTIFIED BY 'asdf1234';
GRANT ALL ON misc_sai_03.* to 'misc_sai_03'@'localhost';
GRANT ALL ON misc_sai_03.* to 'misc_sai_03';
```

출력된 sql 로 mysql 에 database 및 사용자 계정 생성한다

### 3 Start Server
> mvn tomcat7:run

### 4 Connect by Browser
> http://localhost:8080/quickstart03/index.do
