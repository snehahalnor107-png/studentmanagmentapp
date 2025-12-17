package edu.sh.sms.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AdminController 
{

	@RequestMapping("/")
	public String frontPage() 
	{
		return "frontPage";
	}
	
	@RequestMapping("/admingLogin")
	public String preLogin()
	{
		return "login";
	}
	
	@RequestMapping("/login")
	public String onLogin(@RequestParam String username, @RequestParam String password, Model m)
	{
		if(username.equals("Admin") && password.equals("Admin@12"))
		{
			return "adminScreen";
		}
		else {
			return "login";
		}
	}
}
