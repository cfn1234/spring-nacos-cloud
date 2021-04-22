package com.thunder.controller;

import com.thunder.entity.MapsVO;
import com.thunder.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: cfn
 * @date: 2020/12/15 19:51
 * @description:
 */
@RestController
@RequestMapping("test")
public class TestController {

	@Autowired
	private FeignService feignService;

	@GetMapping("test1")
	public MapsVO test1(){
		MapsVO test = feignService.test("11");
		return test;
	}
}
