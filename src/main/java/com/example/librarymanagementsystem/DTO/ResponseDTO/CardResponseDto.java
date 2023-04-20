package com.example.librarymanagementsystem.DTO.ResponseDTO;

import com.example.librarymanagementsystem.enums.CardStatus;
import com.example.librarymanagementsystem.enums.TransactionStatus;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CardResponseDto {

    private int id;

    private Date issueDate;

    private Date updatedON;

    private CardStatus cardStatus;

    private  String validTill;

   // CardResponseDto cardResponseDto;
}
