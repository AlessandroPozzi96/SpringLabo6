package com.spring.henallux.demo.dataAccess.dao;

import com.spring.henallux.demo.dataAccess.entity.UserEntity;
import com.spring.henallux.demo.dataAccess.repository.UserRepository;
import com.spring.henallux.demo.dataAccess.util.ProviderConverter;
import com.spring.henallux.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class UserDAO {

    private UserRepository userRepository;
    private ProviderConverter providerConverter;

    @Autowired
    public UserDAO(UserRepository userRepository, ProviderConverter providerConverter) {
        this.userRepository = userRepository;
        this.providerConverter = providerConverter;
    }

    public void saveUser(User user) {
        UserEntity userEntity = providerConverter.userModelToUserEntity(user);
        userRepository.save(userEntity);
    }
}
