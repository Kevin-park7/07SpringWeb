package spring.web.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//@Controller
public class User001Controller {

	public User001Controller() {
		// TODO Auto-generated constructor stub
		System.out.println("==>User001Controller default Constructor call.....");
	}
	
	@RequestMapping("/logon.do")
	public ModelAndView logon() {
		
		System.out.println("\n:: ==> logon() start....");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/user001/logon.jsp");
		
		return modelAndView;
	}
	
	@RequestMapping("/home.do")
	public ModelAndView home() {
		
		System.out.println("\n:: ==> home() start....");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/user001/home.jsp");
		
		return modelAndView;
	}
	@RequestMapping("/logonAction.do")
	public ModelAndView logonAction() {
		
		System.out.println("\n:: ==> logonAction() start....");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/user001/logonAction.jsp");
		
		return modelAndView;
	}
	
	@RequestMapping("/logout.do")
	public ModelAndView logout() {
		
		System.out.println("\n:: ==> logout() start....");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/user001/logout.jsp");
		
		return modelAndView;
	}

}
