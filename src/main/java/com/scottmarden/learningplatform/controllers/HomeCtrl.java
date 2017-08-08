package com.scottmarden.learningplatform.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeCtrl {
	
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/m/{chapter}/0483/{assignment}")
	public String assignment(@PathVariable String chapter, @PathVariable String assignment, Model model) {
		if(chapter.equals("38") && assignment.equals("0345")) {
			model.addAttribute("title", "Coding Forms");
			model.addAttribute("details", "Make a form!");
		}
		if(chapter.equals("26") && assignment.equals("2342")) {
			model.addAttribute("title", "Fortran to Binary");
			model.addAttribute("details", "The goal of this assignment....");
		}
		return "assignment.jsp";
	}
	
	@RequestMapping("/m/{chapter}/0553/{lesson}")
	public String lesson(@PathVariable String chapter, @PathVariable String lesson, Model model) {
		if(chapter.equals("38") && lesson.equals("0733")) {
			model.addAttribute("title", "Setting Up Your Servers");
			model.addAttribute("details", "The most important thing to remember about servers is....");
		}
		if(chapter.equals("38") && lesson.equals("0342")) {
			model.addAttribute("title", "Punch Cards");
			model.addAttribute("details", "Don't get them mixed up...");
		}
		if(chapter.equals("26") && lesson.equals("0348")) {
			model.addAttribute("title", "Advanced Fortran Info");
			model.addAttribute("details", "Now you're thinking in Fortran...");
		}
		
		return "lesson.jsp";
	}
}
