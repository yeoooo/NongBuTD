package com.td.NongbuTD.repository;

import com.td.NongbuTD.domain.Tower;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TowerRepository extends JpaRepository<Tower, Long> {
}
