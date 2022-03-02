package com.blackroots.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blackroots.admin.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
