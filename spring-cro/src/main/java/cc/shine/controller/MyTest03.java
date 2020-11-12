package cc.shine.controller;

import cc.shine.config.Config;
import cc.shine.service.CatService;
import cc.shine.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author caiwenhai
 * @version 1.0
 * @date 2020/11/12 17:34
 */
public class MyTest03 {


	@Test
	public void Test03() {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Config.class);
		UserService bean = annotationConfigApplicationContext.getBean(UserService.class);
		CatService bean1 = annotationConfigApplicationContext.getBean(CatService.class);
		bean.say();
		bean1.say();
	}
}
