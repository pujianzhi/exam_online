package com.examonline.mapper;

import com.examonline.common.entity.Teacher_Category;
import com.examonline.common.entity.Teacher_CategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Teacher_CategoryMapper {
    long countByExample(Teacher_CategoryExample example);

    int deleteByExample(Teacher_CategoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Teacher_Category record);

    int insertSelective(Teacher_Category record);

    List<Teacher_Category> selectByExample(Teacher_CategoryExample example);

    Teacher_Category selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Teacher_Category record, @Param("example") Teacher_CategoryExample example);

    int updateByExample(@Param("record") Teacher_Category record, @Param("example") Teacher_CategoryExample example);

    int updateByPrimaryKeySelective(Teacher_Category record);

    int updateByPrimaryKey(Teacher_Category record);
}