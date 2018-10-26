package com.spring.henallux.demo.service;

import com.spring.henallux.demo.dataAccess.entity.UtilisateurEntity;
import com.spring.henallux.demo.dataAccess.repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImplementation implements UserDetailsService {
    private UtilisateurRepository utilisateurRepository;

    @Autowired
    public UserDetailsServiceImplementation(UtilisateurRepository utilisateurRepository) {
        this.utilisateurRepository = utilisateurRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        UserDetails user = utilisateurRepository.findByUsername(s);

        if (user != null) {
            return user;
        }

        throw new UsernameNotFoundException("User not found !");
    }
}
