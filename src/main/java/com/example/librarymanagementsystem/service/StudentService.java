package com.example.librarymanagementsystem.service;

import com.example.librarymanagementsystem.DTO.RequestDto.StudentRequestDto;
import com.example.librarymanagementsystem.DTO.RequestDto.UpdateStudentMobRequestDto;
import com.example.librarymanagementsystem.DTO.ResponseDTO.StudentResponseDto;
import com.example.librarymanagementsystem.DTO.ResponseDTO.UpdateStudentMobResponseDto;
import com.example.librarymanagementsystem.entity.Student;
import com.example.librarymanagementsystem.exception.StudentNotFoundException;

public interface StudentService {


    public  String addStudent(StudentRequestDto studentRequestDto);
    public StudentResponseDto getStudentById(int id);

    public UpdateStudentMobResponseDto updateMobNo(UpdateStudentMobRequestDto updateStudentMobRequestDto) throws StudentNotFoundException;
}
