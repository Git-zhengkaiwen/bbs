package com.myproject.blog.mapper;

import com.myproject.blog.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author zhengkaiwen
 * @date 2022/8/16-16:51
 */
@Mapper
public interface DiscussPostMapper {

    List<DiscussPost> selectDiscussPosts(int userId, int offset, int limit, int orderMode);

//使用分页插件
    List<DiscussPost> getDiscussPosts();
    // @Param注解用于给参数取别名,
    // 如果只有一个参数,并且在<if>里使用,则必须加别名.
    int selectDiscussPostRows(@Param("userId") int userId);

    //发布帖子
    int insertDiscussPost(DiscussPost discussPost);
    //帖子详情
    DiscussPost selectDiscussPostById(int id);
    //更新评论的数量
    int updateCommentCount(int id, int commentCount);


    int updateType(int id, int type);

    int updateStatus(int id, int status);

    int updateScore(int id, double score);

}
