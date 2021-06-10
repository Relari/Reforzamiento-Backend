package com.example.demo.student.dao.impl;

import com.example.demo.student.model.business.Student;
import com.example.demo.student.model.entity.StudentEntity;
import org.springframework.stereotype.Component;

/**
 * <b>Class:</b> StudentMapper.<br/>
 *
 * @author RLR
 * @version 1.0.0
 */

@Component
class StudentMapper {

  public Student mapStudent(StudentEntity entity) {
    return Student.builder()
        .dateOfBirth(entity.getDateOfBirth())
        .firstName(entity.getFirstName())
        .gender(entity.getGender())
        .lastName(entity.getLastName())
        .middleName(entity.getMiddleName())
        .otherStudentDetail(entity.getOtherStudentDetail())
        .build();
  }

  public StudentEntity mapStudentEntity(Student student) {
    return StudentEntity.builder()
        .dateOfBirth(student.getDateOfBirth())
        .firstName(student.getFirstName())
        .gender(student.getGender())
        .lastName(student.getLastName())
        .middleName(student.getMiddleName())
        .otherStudentDetail(student.getOtherStudentDetail())
        .build();
  }
}