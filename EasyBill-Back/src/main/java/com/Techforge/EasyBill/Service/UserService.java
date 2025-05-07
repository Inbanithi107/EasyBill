package com.Techforge.EasyBill.Service;

import com.Techforge.EasyBill.Entity.User;
import com.Techforge.EasyBill.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public void createuser(User user){
        repository.save(user);
    }
}
