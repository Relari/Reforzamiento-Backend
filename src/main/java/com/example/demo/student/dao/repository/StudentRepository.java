package com.example.demo.student.dao.repository;

import com.example.demo.student.model.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * <b>Interface:</b> StudentRepository.<br/>
 * @see {@link JpaRepository}
 * @author RLR
 * @version 1.0.0
 */

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {

}
