package com.examonline.service;

import com.examonline.common.entity.SMD_Questions;
import com.examonline.common.entity.SMD_QuestionsExample;
import com.examonline.common.entity.Temp_SMD_Question;
import com.examonline.common.entity.User;
import com.examonline.mapper.SMD_QuestionsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SMD_QuestionsServiceImpl implements  SMD_QuestionsService {

    @Autowired
    SMD_QuestionsMapper smd_questionsMapper;


    @Override
    public List<SMD_Questions> getSMD_Questions(User user) {
        SMD_QuestionsExample smd_questionsExample = new SMD_QuestionsExample();
        SMD_QuestionsExample.Criteria criteria = smd_questionsExample.createCriteria();
        criteria.andUserIdEqualTo(user.getId());
        return smd_questionsMapper.selectByExample(smd_questionsExample);
    }

    @Override
    public List<Temp_SMD_Question> getTemp_SMD_Question(Integer id) {
        return smd_questionsMapper.getTemp_SMD_Question(id);
    }

    @Override
    public Temp_SMD_Question getTemp_SMD_QuestionBySMD_QuestionsID(Integer id) {
        return smd_questionsMapper.getTemp_SMD_QuestionBySMD_QuestionsID(id);
    }

    @Override
    public Integer insertSMD_Questions(SMD_Questions smd_questions) {
        return smd_questionsMapper.insert(smd_questions);
    }

    @Override
    public Integer updateSMD_Questions(SMD_Questions smd_questions) {
        return smd_questionsMapper.updateByPrimaryKeySelective(smd_questions);
    }

    @Override
    public Integer deletSMD_Questions(Integer id) {
        return smd_questionsMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<Temp_SMD_Question> getAllTemp_SMD_Question(Integer id, Integer questionType, Integer courseId, Integer teacherCategoryID) {
        return smd_questionsMapper.getAllTemp_SMD_Question(id,questionType,courseId,teacherCategoryID);
    }
}
