package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.MemberDao;
import com.google.gson.Gson;

@RestController
public class MemberController {
	@Autowired
	private MemberDao dao;

	public MemberDao getDao() {
		return dao;
	}

	@RequestMapping(value = "/listMember", produces = "application/json;charset=UTF-8")
	public String listAll() {
		String str = "";
		Gson gson = new Gson();
		str = gson.toJson(dao.listAll());
		System.out.println(str);
		return str;
	}
}
