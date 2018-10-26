package com.spring.henallux.demo.dataAccess.dao;

import com.spring.henallux.demo.dataAccess.entity.UtilisateurEntity;
import com.spring.henallux.demo.dataAccess.repository.UtilisateurRepository;
import com.spring.henallux.demo.dataAccess.util.ProviderConverter;
import com.spring.henallux.demo.model.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class UtilisateurDAO {
    private UtilisateurRepository utilisateurRepository;
    private ProviderConverter providerConverter;
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    public UtilisateurDAO(UtilisateurRepository utilisateurRepository, ProviderConverter providerConverter) {
        this.utilisateurRepository = utilisateurRepository;
        this.providerConverter = providerConverter;
        this.bCryptPasswordEncoder = new BCryptPasswordEncoder();
    }

    public void saveUtilisateur(Utilisateur utilisateur) {
        UtilisateurEntity utilisateurEntity = providerConverter.utilisateurModelToUtilisateurEntity(utilisateur);
        utilisateurEntity.setPassword(bCryptPasswordEncoder.encode(utilisateurEntity.getPassword()));
        utilisateurRepository.save(utilisateurEntity);
    }
}
