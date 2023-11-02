package com.mzl.splitlibrarytablemycat.mapper;

import com.mzl.splitlibrarytablemycat.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author mzl
 * @since 2023-11-01
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

    /**
     * 查询所有用户
     * @return 用户集合
     */
    @Select("select * from user")
    List<User> selectAllUser();

}
