package com.davis.mapper;

import com.davis.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class UserDaoImpl implements UserMapper{


    //    sqlSession不用自己创建，Spring来管理
    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public List<User> selectUser() {
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
        return mapper.selectUser();
    }
}
