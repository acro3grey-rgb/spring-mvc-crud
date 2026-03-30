# Spring MVC CRUD Application

CRUD-приложение на Spring MVC с использованием Hibernate (JPA) и MySQL.

Реализовано:
- просмотр пользователей
- добавление
- редактирование
- удаление

Технологии:
Java 17, Spring MVC, Hibernate (EntityManager), MySQL, Thymeleaf, Tomcat 10, Maven.

Конфигурация выполнена через JavaConfig и аннотации (AppInit, WebConfig, PersistenceConfig) без использования XML и Spring Boot.

Запуск:
mvn clean package → скопировать .war в Tomcat/webapps → открыть http://localhost:8080/spring-mvc-crud/users

Автор: https://github.com/acro3grey-rgb
