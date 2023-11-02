package com.mzl.splitlibrarytablemycat.controller;


import com.mzl.splitlibrarytablemycat.model.request.UserSaveRequest;
import com.mzl.splitlibrarytablemycat.model.response.UserQueryResponse;
import com.mzl.splitlibrarytablemycat.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author mzl
 * @since 2023-11-01
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Resource
    private UserService userService;

    /**
     * 新增用户
     * @param userSaveRequest 用户新增请求体
     * @return 操作结果
     */
    @PostMapping("/addUser")
    public String addUser(@RequestBody UserSaveRequest userSaveRequest){
        return userService.addUser(userSaveRequest);
    }

    /**
     * 查询所有用户
     * @return 用户集合
     */
    @GetMapping("/selectAllUser")
    public List<UserQueryResponse> selectUsers(){
        return userService.selectAllUser();
    }

    /**
     * 根据ID查询所有用户
     * @return 用户
     */
    @GetMapping("/selectById")
    public UserQueryResponse selectById(Long id){
        return userService.selectById(id);
    }

    /**
     * 更新用户
     * @param userSaveRequest 用户新增请求体
     * @return 操作结果
     */
    @PostMapping("/updateUser")
    public String updateUser(@RequestBody UserSaveRequest userSaveRequest){
        return userService.updateUser(userSaveRequest);
    }

}

