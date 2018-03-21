package com.examonline.service;

import com.examonline.common.entity.FSP_Questions;
import com.examonline.common.entity.Temp_FSP_Question;
import com.examonline.common.entity.User;

import java.util.List;

public interface FSP_QuestionsService {
    List<FSP_Questions> getFSP_Question(User user);
    List<Temp_FSP_Question> getTemp_FSP_Question(Integer id);
    Temp_FSP_Question getTemp_FSP_QuestionByFSP_QuestionsID(Integer id);
    Integer insertFSP_Questions(FSP_Questions fsp_questions);
    Integer updateFSP_Questions(FSP_Questions fsp_questions);
    Integer deletFSP_Questions(Integer id);
}
