package com.td.NongbuTD.repository;


import com.td.NongbuTD.domain.Games;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface GamesRepository extends JpaRepository<Games, UUID> {
}
