package com.info.controller;

import com.info.entity.Question;
import com.info.service.QuestionService;
import com.info.service.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class QuestionController {

    @Autowired
    QuestionService questionService;

    ResultService resultService;

    // queryAll
    @GetMapping("/userQuestion")
    public String showUsers(ModelMap modelMap) {
        List<Question> question = questionService.queryAllUser();
        modelMap.addAttribute("userQuestion", question);
        return "question";
    }







    //根据年度查询
    @GetMapping("/queryYear")
    public String queryYear(String Year, ModelMap modelMap) {

        List<Question> question = questionService.queryByYear(Year);

        System.out.println(question);
        modelMap.addAttribute("question", question);
        return "question";
    }

    // delete
    @RequestMapping(value = "/deleteUserQuestion+{id}")
    public String dropUser(@PathVariable("id") Integer id, ModelMap modelMap) {
        int flag = questionService.dropUser(id);
        List<Question> question = questionService.queryAllUser();
        modelMap.addAttribute("question", question);
        if (flag == 1) {
            return "question";
        } else {

            return "error";
        }
    }

    // queryById
    @RequestMapping("/userQuestionUpdate+{id}")
    public String queryUser(@PathVariable("id") Integer id, ModelMap modelMap) {
        Question question = questionService.queryById(id);
        modelMap.addAttribute("question", question);
        return "questionUpdate";
    }

    // queryById
    @RequestMapping("/userQuestionAdd+{id}")
    public String queryUserQuestionAdd(@PathVariable("id") Integer id, ModelMap modelMap) {
        Question question = questionService.queryById(id);
        modelMap.addAttribute("question", question);
        return "questionAddPage";
    }

    // add

    @RequestMapping("/addUserQuestion")
    @ResponseBody
    public Map addUser(Question question) {
        int flag = questionService.addUser(question);
        Map<String, Object> map = new HashMap<String, Object>();
        if (flag == 1) {
            // map.put("msg", "新規出来だ");
            return map;
        } else {
            // map.put("msg", "新規失敗した");
            return map;
        }
    }

    // update

    @RequestMapping("/modifyUserQuestion")
    @ResponseBody
    public Map modifyUser(Question question) {
        int flag = questionService.modifyUser(question);
        Map<String, Object> map = new HashMap<>();
        if (flag == 1) {
            map.put("msg", "編集出来た");
            return map;
        } else {
            map.put("msg", "編集失敗した");
            return map;
        }
    }

}
