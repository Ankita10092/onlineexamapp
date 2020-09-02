package com.example.OnlineExam.Model;


import javax.persistence.*;

@Entity
@Table(name="AnswerSheet")
public class AnswerSheet {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long AnsId;

    @Column(name="QuestionCode")
    private String questionCode;


    @OneToMany
    @JoinColumn(name="Question")
    private QuestionPaper  Question;

}
