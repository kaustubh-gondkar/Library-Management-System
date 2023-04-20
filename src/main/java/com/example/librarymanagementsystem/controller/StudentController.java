package com.example.librarymanagementsystem.controller;

import com.example.librarymanagementsystem.DTO.RequestDto.StudentRequestDto;
import com.example.librarymanagementsystem.DTO.RequestDto.UpdateStudentMobRequestDto;
import com.example.librarymanagementsystem.DTO.ResponseDTO.StudentResponseDto;
import com.example.librarymanagementsystem.DTO.ResponseDTO.UpdateStudentMobResponseDto;
import com.example.librarymanagementsystem.exception.StudentNotFoundException;
import com.example.librarymanagementsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/add")
    public String addStudent(@RequestBody StudentRequestDto studentRequestDto){

        return studentService.addStudent(studentRequestDto);
    }

    @PutMapping("/update_mobile")
    public UpdateStudentMobResponseDto updateMobNo(@RequestBody UpdateStudentMobRequestDto updateStudentMobRequestDto) throws StudentNotFoundException {

         //   UpdateStudentMobResponseDto updateStudentMobResponseDto = studentService.updateMobNo(updateStudentMobRequestDto);

        return studentService.updateMobNo(updateStudentMobRequestDto);
    }

    @GetMapping("/get_student")
    public StudentResponseDto getStudent(@RequestParam("id")int id){

        return studentService.getStudentById(id);
    }
}
