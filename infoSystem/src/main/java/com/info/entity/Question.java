package com.info.entity;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
@Data
public class Question {
    private String year;

    private int questionid;

    private String result;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date commitdate;

    private int score;

    private int disp_flg;

    private int disp_sort;

    private String question;

}
