package com.spring.henallux.demo.dataAccess.repository;

import com.spring.henallux.demo.dataAccess.entity.UtilisateurEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface UtilisateurRepository extends JpaRepository<UtilisateurEntity, String> {

}
