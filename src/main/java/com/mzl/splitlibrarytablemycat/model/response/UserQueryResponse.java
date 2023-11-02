package com.mzl.splitlibrarytablemycat.model.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import java.util.Date;

/**
 * <p>
 * 用户查询实体类
 * </p>
 *
 * @author mzl
 * @since 2023-11-01
 */
@Data
public class UserQueryResponse {

    private Long id;

    private String name;

    private Integer age;

    private String phone;

    private String address;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

}
