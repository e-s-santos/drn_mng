package com.drn.drn_mng.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.drn.drn_mng.rcdenm.StatusDrn;

@RestController
@RequestMapping("/api/sendStatus")
public class sendStatus {
	@PostMapping
	public String sendStatus(@RequestBody StatusDrn sts) {
		
		System.out.println(sts.longitude());
		return "Status recebido";
	}
}
