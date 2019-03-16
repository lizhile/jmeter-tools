package cn.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FrontController {
    @RequestMapping("/test1.do")
	public void test1() {
		System.out.println("hello springboot");
	}
	
    @RequestMapping("/test2.do")
    @ResponseBody
	public String test2() {
		return "hello springboot";
	}
}
