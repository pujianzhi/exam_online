package com.examonline.service;

import com.examonline.common.entity.FSP_Questions;
import com.examonline.common.entity.FSP_QuestionsExample;
import com.examonline.common.entity.Temp_FSP_Question;
import com.examonline.common.entity.User;
import com.examonline.mapper.FSP_QuestionsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FSP_QuestionsServiceImpl implements FSP_QuestionsService {

    @Autowired
    FSP_QuestionsMapper fsp_questionsMapper;

    @Override
    public List<FSP_Questions> getFSP_Question(User user) {
        FSP_QuestionsExample fsp_questionsExample = new FSP_QuestionsExample();
        FSP_QuestionsExample.Criteria criteria = fsp_questionsExample.createCriteria();
        criteria.andUserIdEqualTo(user.getId());
        return fsp_questionsMapper.selectByExample(fsp_questionsExample);
    }

    @Override
    public List<Temp_FSP_Question> getTemp_FSP_Question(Integer id) {
        return fsp_questionsMapper.getTemp_FSP_Question(id);
    }

    @Override
    public Temp_FSP_Question getTemp_FSP_QuestionByFSP_QuestionsID(Integer id) {
        return fsp_questionsMapper.getTemp_FSP_QuestionByFSP_QuestionsID(id);
    }

    @Override
    public Integer insertFSP_Questions(FSP_Questions fsp_questions) {
        return fsp_questionsMapper.insert(fsp_questions);
    }

    @Override
    public Integer updateFSP_Questions(FSP_Questions fsp_questions) {
        return fsp_questionsMapper.updateByPrimaryKeySelective(fsp_questions);
    }

    @Override
    public Integer deletFSP_Questions(Integer id) {
        return fsp_questionsMapper.deleteByPrimaryKey(id);
    }
}
