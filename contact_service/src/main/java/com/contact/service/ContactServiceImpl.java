package com.contact.service;

import com.contact.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService{

    //fake list of contacts
    List<Contact> list = Arrays.asList(

            new Contact(1L,"snehal@gmail.com","Snehal",111L),
            new Contact(2L,"rahul@gmail.com","Rahul",111L),
            new Contact(3L,"sneha@gmail.com","Sneha",112L)

    );
    @Override
    public List<Contact> getContactOfUser(Long userId) {

        return list.stream().filter(x->x.getUId().equals(userId)).collect(Collectors.toList());

        //return null;
    }
}
