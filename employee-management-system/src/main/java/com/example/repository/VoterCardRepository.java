package com.example.repository;

import com.example.entity.VoterCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoterCardRepository extends JpaRepository<VoterCard,Long> {

    VoterCard findByEmployeeId(Long id);

}
