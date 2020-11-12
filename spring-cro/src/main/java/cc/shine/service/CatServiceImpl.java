package cc.shine.service;

import org.springframework.stereotype.Service;

/**
 * @author caiwenhai
 * @version 1.0
 * @date 2020/11/12 15:46
 */

@Service("catService")
public class CatServiceImpl implements CatService {
	@Override
	public void say() {
		System.out.println("cat" + "--------------");
	}
}
