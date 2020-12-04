package com.nowcoder.community.dao;

import com.nowcoder.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface DiscussPostMapper {

    //查询帖子，动态sql <if>，有时需要用到userid（个人帖子），有时用不到,如首页，此时传入userid为0
    List<DiscussPost> selectDiscussPosts(int userId, int offset, int limit);

    //查询帖子行数，动态sql  @Param("userId")给参数起别名，用于拼接到sql
    //如果需要动态拼接sql，并且方法只有一个参数，则参数必须起别名
    int selectDiscussPostRows(@Param("userId") int userId);
}
