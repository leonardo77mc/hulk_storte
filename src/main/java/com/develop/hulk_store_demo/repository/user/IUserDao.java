package com.develop.hulk_store_demo.repository.user;

import com.develop.hulk_store_demo.entity.user.User;
import org.springframework.data.repository.CrudRepository;

public interface IUserDao extends CrudRepository<User, Long> {
}
