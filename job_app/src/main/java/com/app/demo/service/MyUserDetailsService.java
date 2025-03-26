package com.app.demo.service;

import com.app.demo.module.User;
import com.app.demo.module.UserPrinciple;
import com.app.demo.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService
{

    @Autowired
    private UserRepo repo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println(" $$$$$$$$$$$$$$$$ " + username);
        User user = repo.findByUserName(username);
        if (user==null){
            throw new UsernameNotFoundException("User name Not found");
        }
        System.out.println("****************** ((*&^%$$#@#@#:" + user.toString());
        return new UserPrinciple(user);
    }
}
