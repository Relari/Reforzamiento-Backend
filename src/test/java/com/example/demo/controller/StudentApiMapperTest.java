package com.example.demo.controller;

import com.example.demo.student.model.api.request.StudentRequest;
import com.example.demo.student.model.api.response.StudentResponse;
import com.example.demo.student.model.business.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * <b>Class:</b> StudentMapperTest<br/>
 * @author RLR
 * @version 1.0.0
 */
class StudentApiMapperTest {

  private StudentApiMapper studentApiMapper;

  @BeforeEach
  void init() {
    studentApiMapper = new StudentApiMapper();
  }

  @Test
  void whenMapperEntityThenReturnStudent() {
    StudentRequest request = studentRequest();

    Student student = studentApiMapper.mapStudent(request);

    Assertions.assertEquals(request.getFirstName(), student.getFirstName());
    Assertions.assertEquals(request.getGender(), student.getGender());
    Assertions.assertEquals(request.getLastName(), student.getLastName());
    Assertions.assertEquals(request.getMiddleName(), student.getMiddleName());
    Assertions.assertEquals(request.getOtherStudentDetail(), student.getOtherStudentDetail());
    Assertions.assertEquals(request.getDateOfBirth(), student.getDateOfBirth());
  }

  @Test
  void whenMapperStudentThenReturnEntity() {
    Student student = student();

    StudentResponse studentResponse = studentApiMapper.mapStudentResponse(student);

    Assertions.assertEquals(student.getFirstName(), studentResponse.getFirstName());
    Assertions.assertEquals(student.getGender(), studentResponse.getGender());
    Assertions.assertEquals(student.getLastName(), studentResponse.getLastName());
    Assertions.assertEquals(student.getMiddleName(), studentResponse.getMiddleName());
    Assertions.assertEquals(student.getOtherStudentDetail(), studentResponse.getOtherStudentDetail());
    Assertions.assertEquals(student.getDateOfBirth(), studentResponse.getDateOfBirth());
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

  private StudentRequest studentRequest() {
    return StudentRequest.builder()
            .firstName("Jose")
            .lastName("Gonzales")
            .middleName("Luis")
            .gender("M")
            .otherStudentDetail("Backend")
            .dateOfBirth("01/01/2020")
            .build();
  }

  private StudentResponse studentResponse() {
    return StudentResponse.builder()
            .firstName("Jose")
            .lastName("Gonzales")
            .middleName("Luis")
            .gender("M")
            .otherStudentDetail("Backend")
            .dateOfBirth("01/01/2020")
            .build();
  }
}
