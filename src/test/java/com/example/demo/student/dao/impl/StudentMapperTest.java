package com.example.demo.student.dao.impl;

import com.example.demo.student.model.business.Student;
import com.example.demo.student.model.entity.StudentEntity;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * <b>Class:</b> StudentMapperTest<br/>
 * @author RLR
 * @version 1.0.0
 */

class StudentMapperTest {

  @Test
  void whenMapperEntityThenReturnStudent() {
    StudentEntity studentEntity = studentEntity();

    Student student = StudentMapper.mapStudent(studentEntity);

    Assertions.assertEquals(studentEntity.getFirstName(), student.getFirstName());
    Assertions.assertEquals(studentEntity.getGender(), student.getGender());
    Assertions.assertEquals(studentEntity.getLastName(), student.getLastName());
    Assertions.assertEquals(studentEntity.getMiddleName(), student.getMiddleName());
    Assertions.assertEquals(studentEntity.getOtherStudentDetail(), student.getOtherStudentDetail());
    Assertions.assertEquals(studentEntity.getDateOfBirth(), student.getDateOfBirth());
  }

  @Test
  void whenMapperStudentThenReturnEntity() {
    Student student = student();

    StudentEntity entity = StudentMapper.mapStudentEntity(student);

    Assertions.assertEquals(student.getFirstName(), entity.getFirstName());
    Assertions.assertEquals(student.getGender(), entity.getGender());
    Assertions.assertEquals(student.getLastName(), entity.getLastName());
    Assertions.assertEquals(student.getMiddleName(), entity.getMiddleName());
    Assertions.assertEquals(student.getOtherStudentDetail(), entity.getOtherStudentDetail());
    Assertions.assertEquals(student.getDateOfBirth(), entity.getDateOfBirth());
  }

  private Student student() {
    return Student.builder()
            .firstName("Jose")
            .lastName("Gonzales")
            .middleName("Luis")
            .gender("M")
            .otherStudentDetail("Backend")
            .dateOfBirth("01/01/2020")
            .build();
  }

  private StudentEntity studentEntity() {
    return StudentEntity.builder()
            .firstName("Jose")
            .lastName("Gonzales")
            .middleName("Luis")
            .gender("M")
            .otherStudentDetail("Backend")
            .dateOfBirth("01/01/2020")
            .build();
  }

}
