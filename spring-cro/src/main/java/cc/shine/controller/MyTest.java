package cc.shine.controller;

import cc.shine.config.Config;
import cc.shine.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author caiwenhai
 * @version 1.0
 * @date 2020/11/12 15:47
 */
public class MyTest {



	@Test
	public void Test01(){
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Config.class);
		UserService bean = annotationConfigApplicationContext.getBean(UserService.class);
		bean.say();
	}

}
