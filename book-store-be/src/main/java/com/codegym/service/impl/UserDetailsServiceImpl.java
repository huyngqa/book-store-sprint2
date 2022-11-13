package com.codegym.service.impl;

import com.codegym.model.User;
import com.codegym.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //check "ten dang nhap" is exits
        User user = userRepository.findByEmail(username);
        if (user == null) {
            throw new UsernameNotFoundException("Tài khoản: " + username + " không tồn tại");
        }
        return UserDetailsImpl.build(user);
    }
}
