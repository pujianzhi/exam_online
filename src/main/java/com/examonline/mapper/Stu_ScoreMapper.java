package com.examonline.mapper;

import com.examonline.common.entity.Stu_Score;
import com.examonline.common.entity.Stu_ScoreExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Stu_ScoreMapper {
    long countByExample(Stu_ScoreExample example);

    int deleteByExample(Stu_ScoreExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Stu_Score record);

    int insertSelective(Stu_Score record);

    List<Stu_Score> selectByExample(Stu_ScoreExample example);

    Stu_Score selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Stu_Score record, @Param("example") Stu_ScoreExample example);

    int updateByExample(@Param("record") Stu_Score record, @Param("example") Stu_ScoreExample example);

    int updateByPrimaryKeySelective(Stu_Score record);

    int updateByPrimaryKey(Stu_Score record);
}