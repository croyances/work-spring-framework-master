##1.传统的xml配置

```	xml
<beans>
    <bean id="catService" class="cc.shine.service.CatServiceImpl"></bean>
</beans>
```

```java
public interface CatService {
	void say();
}

public class CatServiceImpl implements CatService{
	@Override
	public void say() {
		System.out.println("cat"+"--------------");
	}
}
```

```java
public class MyTest02 {

	@Test
	public void Test002(){
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("application.xml");
		CatService catService = (CatService) classPathXmlApplicationContext.getBean("catService");
		catService.say();
	}
}
```

##2.基于注解的配置
```xml
<context:component-scan base-package="cc.shine" />
```

```java
@Service("catService")
public class CatServiceImpl implements CatService{
	@Override
	public void say() {
		System.out.println("基于注解"+"--------------");
	}
}
```

```java
public class MyTest02 {

	@Test
	public void Test002(){
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("application.xml");
		CatService catService = (CatService) classPathXmlApplicationContext.getBean("catService");
		catService.say();
	}
}
```

##3.基于javacConfig配置
> 常用的 Configuration  ImportResource  Import Bean

```java
@Configuration
public class Config {
	@Bean
	public CatService catService(){
		return new CatServiceImpl();
	}
}

public class CatServiceImpl implements CatService{
	@Override
	public void say() {
		System.out.println("基于javaConfig"+"--------------");
	}
}

public class MyTest {
	@Test
	public void Test01(){
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Config.class);
		CatServiceImpl bean = annotationConfigApplicationContext.getBean(CatService.class);
		bean.say();
	}

}

```
