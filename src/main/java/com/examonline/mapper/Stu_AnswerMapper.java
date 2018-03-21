package com.examonline.mapper;

import com.examonline.common.entity.Stu_Answer;
import com.examonline.common.entity.Stu_AnswerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Stu_AnswerMapper {
    long countByExample(Stu_AnswerExample example);

    int deleteByExample(Stu_AnswerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Stu_Answer record);

    int insertSelective(Stu_Answer record);

    List<Stu_Answer> selectByExample(Stu_AnswerExample example);

    Stu_Answer selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Stu_Answer record, @Param("example") Stu_AnswerExample example);

    int updateByExample(@Param("record") Stu_Answer record, @Param("example") Stu_AnswerExample example);

    int updateByPrimaryKeySelective(Stu_Answer record);

    int updateByPrimaryKey(Stu_Answer record);
}