package com.temp.tempproject.repository;

import com.temp.tempproject.entity.PartyDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<PartyDetail, Integer> {
}
