package com.examonline.mapper;

import com.examonline.common.entity.FSP_Questions;
import com.examonline.common.entity.FSP_QuestionsExample;
import java.util.List;

import com.examonline.common.entity.Temp_FSP_Question;
import com.examonline.common.entity.Temp_SMD_Question;
import org.apache.ibatis.annotations.Param;

public interface FSP_QuestionsMapper {
    List<Temp_FSP_Question> getTemp_FSP_Question(@Param("id") Integer id);

    Temp_FSP_Question getTemp_FSP_QuestionByFSP_QuestionsID(@Param("id")Integer id);

    long countByExample(FSP_QuestionsExample example);

    int deleteByExample(FSP_QuestionsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FSP_Questions record);

    int insertSelective(FSP_Questions record);

    List<FSP_Questions> selectByExample(FSP_QuestionsExample example);

    FSP_Questions selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FSP_Questions record, @Param("example") FSP_QuestionsExample example);

    int updateByExample(@Param("record") FSP_Questions record, @Param("example") FSP_QuestionsExample example);

    int updateByPrimaryKeySelective(FSP_Questions record);

    int updateByPrimaryKey(FSP_Questions record);
}