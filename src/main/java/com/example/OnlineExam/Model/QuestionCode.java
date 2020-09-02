package com.example.OnlineExam.Model;

import javax.persistence.*;

@Entity
@Table(name="AnswerSheet")
public class QuestionCode {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long QuestionCode;


    @ManyToMany
    @JoinColumn(name="Question")
    private QuestionPaper Question;
}
