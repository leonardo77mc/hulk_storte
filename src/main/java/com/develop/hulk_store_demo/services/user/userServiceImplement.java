package com.develop.hulk_store_demo.services.user;

import com.develop.hulk_store_demo.entity.user.User;
import com.develop.hulk_store_demo.repository.user.IUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class userServiceImplement implements IUserService {

    @Autowired
    private IUserDao userDao;

    @Override
    @Transactional
    public User save(User user) {
        return this.userDao.save(user);
    }
}
