package com.thunder.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: cfn
 * @date: 2021/4/22 10:21
 * @description:
 */
@RestController
public class UserController {

	/**
	 * 测试代码
	 * @param string
	 * @return
	 */
	@GetMapping(value = "/echo/{string}")
	public Map<String, String> echo(@PathVariable String string) {
		Map<String, String> map = new HashMap<>();
		map.put("add", string);
		return map;
	}
}
