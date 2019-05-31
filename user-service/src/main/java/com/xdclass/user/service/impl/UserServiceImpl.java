package com.xdclass.user.service.impl;

import org.apache.dubbo.config.annotation.Service;

import com.xdclass.user.service.UserService;

@Service(version = "1.0.0")
public class UserServiceImpl implements UserService {

	@Override
	public String sayHello() {
		// TODO Auto-generated method stub
		return "hello";
	}

}
