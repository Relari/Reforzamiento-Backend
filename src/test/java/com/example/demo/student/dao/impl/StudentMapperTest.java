package com.example.demo.student.dao.impl;

import com.example.demo.student.model.business.Student;
import com.example.demo.student.model.entity.StudentEntity;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * <b>Class:</b> StudentMapperTest<br/>
 * @author RLR
 * @version 1.0.0
 */

class StudentMapperTest {

  private StudentMapper studentMapper;

  @BeforeEach
  void init() {
    studentMapper = new StudentMapper();
  }

  @Test
  void whenMapperEntityThenReturnStudent() {
    StudentEntity studentEntity = studentEntity();

    Student student = studentMapper.mapStudent(studentEntity);

    Student studentExpected = student();

    Assertions.assertEquals(studentExpected.getFirstName(), student.getFirstName());
    Assertions.assertEquals(studentExpected.getGender(), student.getGender());
    Assertions.assertEquals(studentExpected.getLastName(), student.getLastName());
    Assertions.assertEquals(studentExpected.getMiddleName(), student.getMiddleName());
    Assertions.assertEquals(studentExpected.getOtherStudentDetail(), student.getOtherStudentDetail());
    Assertions.assertEquals(studentExpected.getDateOfBirth(), student.getDateOfBirth());
  }

  @Test
  void whenMapperStudentThenReturnEntity() {
    Student student = student();

    StudentEntity entity = studentMapper.mapStudentEntity(student);

    StudentEntity studentExpected = studentEntity();

    Assertions.assertEquals(studentExpected.getFirstName(), entity.getFirstName());
    Assertions.assertEquals(studentExpected.getGender(), entity.getGender());
    Assertions.assertEquals(studentExpected.getLastName(), entity.getLastName());
    Assertions.assertEquals(studentExpected.getMiddleName(), entity.getMiddleName());
    Assertions.assertEquals(studentExpected.getOtherStudentDetail(), entity.getOtherStudentDetail());
    Assertions.assertEquals(studentExpected.getDateOfBirth(), entity.getDateOfBirth());
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
