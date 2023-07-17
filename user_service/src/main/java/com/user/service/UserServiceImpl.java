package com.user.service;

import com.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService{

    //fake user list
    List<User> list = Arrays.asList(

            new User(111L,"Akash","9975899908"),
            new User(112L,"Akki","9999999999"),
            new User(113L,"Akkii","8888888888")

    );

    @Override
    public User getUser(Long id) {
        return this.list.stream().filter(x -> x.getUId().equals(id)).findAny().orElse(null);
    }
}
