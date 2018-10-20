package com.spring.henallux.demo.dataAccess.repository;

import com.spring.henallux.demo.dataAccess.entity.MagicKeyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface MagicKeyRepository extends JpaRepository<MagicKeyEntity, String> {

}
