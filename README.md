# Add SpringDoc OpenAPI UI to your Spring Boot Project

*Tested with Java 17 and SpringBoot 2.7.6*

## STEP 1
**Add the dependency _SpringDoc OpenAPI UI_:** </br>
```
<dependency>
    <groupId>org.springdoc</groupId>
    <artifactId>springdoc-openapi-ui</artifactId>
    <version>1.6.13</version>
</dependency>
```
https://mvnrepository.com/artifact/org.springdoc/springdoc-openapi-ui

## STEP 2
**Add the following property in application.properties file** </br>
_This is optional but could avoid few future problems_
```
spring.mvc.pathmatch.matching-strategy=ant-path-matcher
```

## STEP 3
**Check Swagger UI website**
Run your application and access the following url:
```
host:port/swagger-ui/index.html
http://localhost:8080/swagger-ui/index.html
```
http://localhost:8080/swagger-ui/index.html
