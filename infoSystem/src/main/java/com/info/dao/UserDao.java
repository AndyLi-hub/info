package com.info.dao;

import com.info.entity.User;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface UserDao {

    // ユーザーで検索
    User findByUserId(String userid);

    //登録
    User loginIn(String userid, String password);

    // すべてのユーザーを照会する
    List<User> queryAllUser();

    User checkUserId(String userid);
}
