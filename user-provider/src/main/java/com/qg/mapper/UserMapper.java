package com.qg.mapper;
import com.qg.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

/***
 * 操作User表的Mapper
 */
@Mapper
public interface UserMapper {

    public List<User> querUserList();

}
