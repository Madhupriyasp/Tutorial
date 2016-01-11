package com.tutorial.controller;
import java.io.IOException;

import javax.jdo.PersistenceManager;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tutorial.jdo.PMF;
import com.tutorial.jdo.Users;

@Controller
public class JavaServletController {
		@RequestMapping("/")
		public String homePage(HttpServletRequest req) {

			return "HomePage";
		}
		@RequestMapping("/getSignupPage")
		public String signUpPage(HttpServletRequest req) {

			return "TutorialSignup";
		}

		@RequestMapping(value = "/storeRegisterDetail",method =RequestMethod.POST)		
		public String storeRegisteredDataToDb(HttpServletRequest request,
				HttpServletResponse response) throws ServletException, IOException {
			System.out.println("hwllo why i m getting null value");
			
			String name = request.getParameter("name");
			String email = request.getParameter("email");
			String username= request.getParameter("username");
			String password = request.getParameter("password");
			String con_password = request.getParameter("con_password");
			String mobile = request.getParameter("mobile");
			String city = request.getParameter("city");
			String state = request.getParameter("state");
			String country = request.getParameter("country");

			System.out.println("name"+name);
		    PersistenceManager pm = PMF.getInstance().getPersistenceManager();
		    try {
		    	
		    	Users users = new Users();
		    	users.setName(name);
		    	users.setEmail(email);
		    	users.setUsername(username);
		    	users.setPassword(password);
		    	users.setConfpassword(con_password);
		    	users.setMobile(mobile);
		    	users.setCity(city);
		    	users.setState(state);
		    	users.setCountry(country);
		    	pm.makePersistent(users);
		    } finally {
		        pm.close();
		    }
		   
		   
		    return "HomePage";
		}




}
		
