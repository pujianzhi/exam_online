package com.examonline.mapper;

import com.examonline.common.entity.SMD_Questions;
import com.examonline.common.entity.SMD_QuestionsExample;
import java.util.List;

import com.examonline.common.entity.Temp_SMD_Question;
import org.apache.ibatis.annotations.Param;

public interface SMD_QuestionsMapper {
    List<Temp_SMD_Question> getTemp_SMD_Question(@Param("id") Integer id);

    Temp_SMD_Question getTemp_SMD_QuestionBySMD_QuestionsID(@Param("id") Integer id);

    long countByExample(SMD_QuestionsExample example);

    int deleteByExample(SMD_QuestionsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SMD_Questions record);

    int insertSelective(SMD_Questions record);

    List<SMD_Questions> selectByExample(SMD_QuestionsExample example);

    SMD_Questions selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SMD_Questions record, @Param("example") SMD_QuestionsExample example);

    int updateByExample(@Param("record") SMD_Questions record, @Param("example") SMD_QuestionsExample example);

    int updateByPrimaryKeySelective(SMD_Questions record);

    int updateByPrimaryKey(SMD_Questions record);
}