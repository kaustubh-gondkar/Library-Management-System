package com.example.librarymanagementsystem.service;

import com.example.librarymanagementsystem.DTO.RequestDto.IssueBookRequestDto;
import com.example.librarymanagementsystem.DTO.ResponseDTO.IssueBookResponseDto;

public interface TransactionService {

 public IssueBookResponseDto issueBook(IssueBookRequestDto issueBookRequestDto) throws Exception;

}
