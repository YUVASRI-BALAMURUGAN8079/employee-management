package com.example.repository;

import com.example.entity.Details;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface DetailsRepository extends JpaRepository<Details,Long> {

    Details findByEmployeeId(Long id);
    Details findByWorkEmail(String mail);
}
