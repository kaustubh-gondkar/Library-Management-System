package com.example.librarymanagementsystem.entity;
import com.example.librarymanagementsystem.enums.CardStatus;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Entity
@Table(name="card")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @CreationTimestamp
    Date issueDate;

    @UpdateTimestamp
    private Date updatedON;

    @Enumerated(EnumType.STRING)
    private CardStatus cardStatus;

    private  String validTill;
    @OneToOne
    @JoinColumn
    Student student;

    @OneToMany(mappedBy = "card",cascade = CascadeType.ALL)
    List<Book> bookIssued = new ArrayList<>();

    @OneToMany(mappedBy = "card",cascade = CascadeType.ALL)
    List<Transaction> transactionList = new ArrayList<>();
}
