```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xmlns:context="http://www.springframework.org/schema/context"
    xsi:schemaLocation="http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd
        http://www.springframework.org/schema/context
        https://www.springframework.org/schema/context/spring-context.xsd">

    <context:annotation-config/>

</beans>
```

## 注解说明
- @AutoWired 自动装配通过Type,Name。
- @Resource 自动装配通过Name, Type。
- @Component 组件，放在类上，说明被Spring管理，相当于bean。
- @Value 赋值
```java
@Component
public class User {
    //    @Value("DAVIS")
    public String name;

    //@Value("")也可以放在set方法上
    @Value("DAVIS")
    public void setName(String name) {
        this.name = name;
        }
}
```
