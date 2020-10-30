package com.antra.dao;

import com.antra.entity.LookupEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LookupRepository extends JpaRepository<LookupEntity, Long>{ // extends interface
    public List<LookupEntity> findByType(String type);
}
