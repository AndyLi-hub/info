package com.info.service;

import com.info.entity.Question;

import java.util.List;

public interface QuestionService {

    List<Question> queryByYear(String year);

    Question queryById(int questionid);

    int addUser(Question question);

    int dropUser(int questionid);

    int modifyUser(Question question);

    List<Question> queryAllUser();

}
