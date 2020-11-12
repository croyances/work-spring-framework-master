package cc.shine.config;

import cc.shine.service.UserService;
import cc.shine.service.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;

/**
 * @author caiwenhai
 * @version 1.0
 * @date 2020/11/12 15:45
 */

@ImportResource("application.xml")
public class Config {
	@Bean
	public UserService userService(){
		return new UserServiceImpl();
	}
}
