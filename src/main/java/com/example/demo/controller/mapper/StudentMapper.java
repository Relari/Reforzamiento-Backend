package com.example.demo.controller.mapper;

import com.example.demo.student.model.api.request.StudentRequest;
import com.example.demo.student.model.api.response.StudentResponse;
import com.example.demo.student.model.business.Student;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StudentMapper {

  Student mapStudent(StudentRequest studentRequest);

  StudentResponse mapStudentResponse(Student student);

}
