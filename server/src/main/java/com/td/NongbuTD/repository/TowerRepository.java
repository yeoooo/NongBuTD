package com.td.NongbuTD.repository;

import com.td.NongbuTD.domain.Item;
import com.td.NongbuTD.domain.Tower;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TowerRepository extends JpaRepository<Tower, Long> {
}
