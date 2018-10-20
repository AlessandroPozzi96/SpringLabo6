package com.spring.henallux.demo.dataAccess.dao;

import com.spring.henallux.demo.dataAccess.entity.MagicKeyEntity;
import com.spring.henallux.demo.dataAccess.repository.MagicKeyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class MagicKeyDAO {
    private MagicKeyRepository magicKeyRepository;

    @Autowired
    public MagicKeyDAO(MagicKeyRepository magicKeyRepository) {
        this.magicKeyRepository = magicKeyRepository;
    }

    public ArrayList<String> getMagicKeys() {
        List<MagicKeyEntity> magicKeyEntities = magicKeyRepository.findAll();
        ArrayList<String> strings = new ArrayList<>();
        for (MagicKeyEntity entity : magicKeyEntities) {
            strings.add(entity.getKey());
        }
        return strings;
    }
}
