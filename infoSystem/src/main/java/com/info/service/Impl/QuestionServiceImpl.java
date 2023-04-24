package com.info.service.Impl;

import com.info.dao.QuestionDao;
import com.info.entity.Question;
import com.info.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    QuestionDao questionDao;

    @Override
    public List<Question> queryByYear(String year) {
        return questionDao.queryByYear(year);
    }

    @Override
    public Question queryById(int questionid) {
        return questionDao.queryById(questionid);
    }

    @Override
    public int addUser(Question question) {
        return questionDao.addUser(question);
    }

    @Override
    public int dropUser(int questionid) {
        return questionDao.dropUser(questionid);
    }

    @Override
    public int modifyUser(Question question) {
        return questionDao.modifyUser(question);
    }

    @Override
    public List<Question> queryAllUser() {
        return questionDao.queryAllUser();
    }
}
