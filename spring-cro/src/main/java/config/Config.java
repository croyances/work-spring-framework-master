package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import service.UserService;
import service.UserServiceImpl;

/**
 * @author caiwenhai
 * @version 1.0
 * @date 2020/11/12 15:45
 */

@Configuration
public class Config {

	@Bean
	public UserService userService(){
		return new UserServiceImpl();
	}
}
