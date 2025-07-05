package com.example.teh_radar.repository;

import com.example.teh_radar.entity.Status;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusRepository extends JpaRepository<Status, Long> {
}
