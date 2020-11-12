package cc.shine.controller;

import cc.shine.service.CatService;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author caiwenhai
 * @version 1.0
 * @date 2020/11/12 16:34
 */
public class MyTest02 {

	@Test
	public void Test002() {
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("application.xml");
		CatService catService = (CatService) classPathXmlApplicationContext.getBean("catService");
		catService.say();
	}
}
