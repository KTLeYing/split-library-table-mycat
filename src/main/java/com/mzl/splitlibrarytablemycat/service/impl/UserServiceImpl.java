package com.mzl.splitlibrarytablemycat.service.impl;

import com.mzl.splitlibrarytablemycat.entity.User;
import com.mzl.splitlibrarytablemycat.mapper.UserMapper;
import com.mzl.splitlibrarytablemycat.model.request.UserSaveRequest;
import com.mzl.splitlibrarytablemycat.model.response.UserQueryResponse;
import com.mzl.splitlibrarytablemycat.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author mzl
 * @since 2023-11-01
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public String addUser(UserSaveRequest userSaveRequest) {
        User user = new User();
        BeanUtils.copyProperties(userSaveRequest, user);
        userMapper.insert(user);

        return "成功";
    }

    @Override
    public List<UserQueryResponse> selectAllUser() {
        List<User> userList = userMapper.selectAllUser();
        List<UserQueryResponse> userQueryResponseList = new ArrayList<>();
        userList.forEach(user -> {
            UserQueryResponse userQueryResponse = new UserQueryResponse();
            BeanUtils.copyProperties(user, userQueryResponse);
            userQueryResponseList.add(userQueryResponse);
        });

        return userQueryResponseList;
    }

    @Override
    public UserQueryResponse selectById(Long id) {
        User user = userMapper.selectById(id);
        UserQueryResponse userQueryResponse = new UserQueryResponse();
        BeanUtils.copyProperties(user, userQueryResponse);

        return userQueryResponse;
    }

    @Override
    public String updateUser(UserSaveRequest userSaveRequest) {
        User user = new User();
        BeanUtils.copyProperties(userSaveRequest, user);
        userMapper.updateById(user);

        return "成功";
    }

}
