package com.example.bi_backend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.bi_backend.model.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 18599
* @description 针对表【user(用户)】的数据库操作Mapper
* @createDate 2023-06-29 21:22:26
* @Entity com.example.bi_backend.model.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {

}




