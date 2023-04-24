package com.info.service;

import com.info.entity.User;

import java.util.List;

public interface UserService {
    // ユーザーで検索
    User findByUserId(String userid);

    //登録
    User loginIn(String userid, String password);

    // すべてのユーザーを照会する
    List<User> queryAllUser();

    User checkUserId(String userid);

    //新規
    boolean regeditOK(User user);
}
