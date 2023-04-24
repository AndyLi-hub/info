package com.info.controller;

import com.info.entity.User;
import com.info.service.UserService;
import com.info.util.DecodeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegeditController {

    //注入userServics
    @Autowired
    UserService userService;

    @RequestMapping("/regedit")
    public ModelAndView regeditHandler(User user, String conpassword){
        user.setPassword(DecodeUtil.getMD5(user.getPassword()));
        conpassword=DecodeUtil.getMD5(conpassword);
        ModelAndView mav=new ModelAndView("regedit");
        if(!user.getPassword().equals(conpassword)){
            mav.addObject("errinfo","パスワードが一致しません。もう一度確認してください。");
        }else{
            boolean ok=userService.regeditOK(user);
            if(ok){
                mav=new ModelAndView("index");
                mav.addObject("info","新規が完了しました。ログインしてください");
            }else{
                mav.addObject("errinfo","新規に失敗しました");
            }
        }
        return mav;
    }


}
