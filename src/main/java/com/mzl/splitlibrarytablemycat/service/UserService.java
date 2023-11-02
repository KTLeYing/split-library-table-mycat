package com.mzl.splitlibrarytablemycat.service;

import com.mzl.splitlibrarytablemycat.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.mzl.splitlibrarytablemycat.model.request.UserSaveRequest;
import com.mzl.splitlibrarytablemycat.model.response.UserQueryResponse;
import java.util.List;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author mzl
 * @since 2023-11-01
 */
public interface UserService extends IService<User> {

    /**
     * 新增用户
     * @param userSaveRequest 用户新增请求体
     * @return 操作结果
     */
    String addUser(UserSaveRequest userSaveRequest);

    /**
     * 查询所有用户
     * @return 用户集合
     */
    List<UserQueryResponse> selectAllUser();

    /**
     * 根据ID查询所有用户
     * @param id 用户id
     * @return 用户
     */
    UserQueryResponse selectById(Long id);

    /**
     * 更新用户
     * @param userSaveRequest 用户新增请求体
     * @return 操作结果
     */
    String updateUser(UserSaveRequest userSaveRequest);

}
