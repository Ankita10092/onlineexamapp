package com.example.OnlineExam.Model;

import javax.persistence.*;

@Entity
@Table(name="QuestionPaper")
public class QuestionPaper {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long TestId;

    @Column(name="Question")
    private String question;

    @Column(name="Option1")
    private String option1;

    @Column(name="Option2")
    private String option2;

    @Column(name="Option3")
    private String option3;

    @Column(name="Option4")
    private String option4;



    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "Question_Answer", joinColumns = { @JoinColumn(name = "TestId") }, inverseJoinColumns = { @JoinColumn(name = "AnsId") })
    public long getAnswer() {
        return this.TestId;
    }


    public QuestionPaper(String question, String option1, String option2, String option3, String option4) {
        this.question = question;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
    }


    public long getTestId() {
        return TestId;
    }

    public void setTestId(long testId) {
        TestId = testId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getOption1() {
        return option1;
    }

    public void setOption1(String option1) {
        this.option1 = option1;
    }

    public String getOption2() {
        return option2;
    }

    public void setOption2(String option2) {
        this.option2 = option2;
    }

    public String getOption3() {
        return option3;
    }

    public void setOption3(String option3) {
        this.option3 = option3;
    }

    public String getOption4() {
        return option4;
    }

    public void setOption4(String option4) {
        this.option4 = option4;
    }


    @Override
    public String toString() {
        return "QuestionPaper{" +
                "TestId=" + TestId +
                ", question='" + question + '\'' +
                ", option1='" + option1 + '\'' +
                ", option2='" + option2 + '\'' +
                ", option3='" + option3 + '\'' +
                ", option4='" + option4 + '\'' +
                '}';
    }
}
