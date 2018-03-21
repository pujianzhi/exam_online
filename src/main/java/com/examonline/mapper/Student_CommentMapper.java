package com.examonline.mapper;

import com.examonline.common.entity.Student_Comment;
import com.examonline.common.entity.Student_CommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Student_CommentMapper {
    long countByExample(Student_CommentExample example);

    int deleteByExample(Student_CommentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Student_Comment record);

    int insertSelective(Student_Comment record);

    List<Student_Comment> selectByExample(Student_CommentExample example);

    Student_Comment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Student_Comment record, @Param("example") Student_CommentExample example);

    int updateByExample(@Param("record") Student_Comment record, @Param("example") Student_CommentExample example);

    int updateByPrimaryKeySelective(Student_Comment record);

    int updateByPrimaryKey(Student_Comment record);
}