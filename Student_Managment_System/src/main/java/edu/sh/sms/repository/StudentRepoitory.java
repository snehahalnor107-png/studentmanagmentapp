package edu.sh.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jakarta.persistence.Id;

@Repository
public interface StudentRepoitory extends JpaRepository<Id, Integer> {

}
