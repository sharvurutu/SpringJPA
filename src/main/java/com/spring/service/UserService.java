package com.spring.service;

import java.util.List;

import com.spring.entity.UserEntity;

public interface UserService {
	public void newUser(UserEntity user);
	public List<UserEntity> getAll();

}
