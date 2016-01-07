package com.tutorial.controller;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JavaServlet {
		@RequestMapping("/")
		public String homePage(HttpServletRequest req) {

			return "HomePage";
		}
}
		
