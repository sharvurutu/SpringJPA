package com.spring.dao;

import java.util.List;

import com.spring.entity.UserEntity;

public interface UserDao {
	public void newUser(UserEntity user);
	public List<UserEntity> getAll();
}
