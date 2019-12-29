package com.telusko.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping("home")
	public ModelAndView home(@RequestParam("name") String myName, HttpSession session) {
//	public String home(HttpServletRequest req, HttpServletResponse res) {
//		HttpSession session = req.getSession();
//		String name = req.getParameter("name");
		ModelAndView mv = new ModelAndView();
//		System.out.println("in home: " + myName);
//		session.setAttribute("name", myName);
		mv.addObject("name", myName);
		mv.setViewName("home");
		return mv;
	}
}
