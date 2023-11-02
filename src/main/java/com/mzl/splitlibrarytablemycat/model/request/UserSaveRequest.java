package com.mzl.splitlibrarytablemycat.model.request;

import lombok.Data;
import java.util.Date;

/**
 * <p>
 * 用户保存请求类
 * </p>
 *
 * @author mzl
 * @since 2023-11-01
 */
@Data
public class UserSaveRequest {

    private Long id;

    private String name;

    private Integer age;

    private String phone;

    private String address;

    private Date createTime;

    private Date updateTime;

}
