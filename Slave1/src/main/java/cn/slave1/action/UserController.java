package cn.slave1.action;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
@RequestMapping("/f/")
public class UserController{
	
	@RequestMapping("test")
	public ModelAndView test(ModelAndView mav){
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^");
		mav.setViewName("slave1");
		return mav;
	}

}
