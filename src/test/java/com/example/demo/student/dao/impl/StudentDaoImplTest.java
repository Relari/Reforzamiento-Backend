package com.example.demo.student.dao.impl;

import com.example.demo.student.dao.repository.StudentRepository;
import com.example.demo.student.model.business.Student;
import com.example.demo.student.model.entity.StudentEntity;
import io.reactivex.Completable;
import io.reactivex.observers.TestObserver;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collections;

/**
 * <b>Class:</b> StudentDaoImplTest<br/>
 * @author RLR
 * @version 1.0.0
 */
@ExtendWith(MockitoExtension.class)
class StudentDaoImplTest {

  @Mock
  private StudentRepository repository;

  @InjectMocks
  private StudentDaoImpl dao;

  @Test
  void whenFindAllThenReturnStudents() {

    Mockito.when(repository.findAll())
            .thenReturn(Collections.singletonList(studentEntity()));

    TestObserver<Student> testObserver = dao.findAll().test();
    testObserver.awaitTerminalEvent();
    testObserver.assertComplete().assertNoErrors();
  }

  @Test
  void whenSaveStudentThenReturnSuccessful() {

    Mockito.when(repository.save(Mockito.any()))
            .thenReturn(new StudentEntity());

    TestObserver<Void> testObserver = dao.save(student()).test();
    testObserver.awaitTerminalEvent();
    testObserver.assertComplete().assertNoErrors();
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
