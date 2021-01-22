package com.spring.camping.login.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginViewController {

	@RequestMapping("login_view")
	public String login_view() {
		return "login/login_view";
	}
	
	
	
} // ----
