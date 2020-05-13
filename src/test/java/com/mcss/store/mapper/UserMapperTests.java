package com.mcss.store.mapper;

import com.mcss.store.pojo.UserDO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTests {

    @Autowired
    private IUserMapper userMapper;

    @Test
    public void findAll() {
        List<UserDO> list = userMapper.selectList(null);
        list.forEach(userDO -> System.err.println("user = " + userDO));
    }
}
