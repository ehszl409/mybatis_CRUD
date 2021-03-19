# MyBatis 
##### 03.19 최신화

###환경
```text
	- MyBatis Framework
	- MySQL Driver
	- Spring Boot DevTools
	- Spring Web
	- Lombok
```


### DB 설정
```sql
create table product(
    id int auto_increment primary key,
    name varchar(50),
    code varchar(50)
);

create table sell(
    id int auto_increment primary key,
    productId int,
    username varchar(30)
);
```

### 서버 설정
```yml
server:
  port: 8080
  servlet:
   context-path: /
   
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/pos?serverTimezone=Asia/Seoul
    username: pos
    password: pos1234
    driver-class-name: com.mysql.cj.jdbc.Driver
```
