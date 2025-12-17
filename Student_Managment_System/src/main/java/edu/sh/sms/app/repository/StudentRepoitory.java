package edu.sh.sms.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.sh.sms.app.model.Student;


@Repository
public interface StudentRepoitory extends JpaRepository<Student, Integer> {

}
