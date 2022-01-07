package com.github.celzoo.tqi_evolution_project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserDetailsService  implements org.springframework.security.core.userdetails.UserDetailsService {
    @Autowired
    private UserRepository repo;
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = repo.findByEmail(email);
        if(user==null){
            throw  new UsernameNotFoundException("E-mail não encontrado");
        }
        return new CustomUserDetails(user);
    }
}
