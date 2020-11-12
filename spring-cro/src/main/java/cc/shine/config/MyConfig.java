package cc.shine.config;

import cc.shine.service.CatService;
import cc.shine.service.CatServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

/**
 * @author caiwenhai
 * @version 1.0
 * @date 2020/11/12 17:33
 */

@Import(Config.class)
public class MyConfig {
	@Bean
	public CatService catService() {
		return new CatServiceImpl();
	}
}
