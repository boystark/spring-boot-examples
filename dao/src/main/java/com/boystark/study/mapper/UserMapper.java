package com.boystark.study.mapper;

import com.boystark.study.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author boystark
 * @since 2022-09-11
 */
public interface UserMapper extends BaseMapper<User> {
    public User findUserById(Long id);
}
