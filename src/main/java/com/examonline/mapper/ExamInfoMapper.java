package com.examonline.mapper;

import com.examonline.common.entity.ExamInfo;
import com.examonline.common.entity.ExamInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExamInfoMapper {
    long countByExample(ExamInfoExample example);

    int deleteByExample(ExamInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ExamInfo record);

    int insertSelective(ExamInfo record);

    List<ExamInfo> selectByExample(ExamInfoExample example);

    ExamInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ExamInfo record, @Param("example") ExamInfoExample example);

    int updateByExample(@Param("record") ExamInfo record, @Param("example") ExamInfoExample example);

    int updateByPrimaryKeySelective(ExamInfo record);

    int updateByPrimaryKey(ExamInfo record);
}