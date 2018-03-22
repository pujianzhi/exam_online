package com.examonline.service;

import com.examonline.common.entity.SMD_Questions;
import com.examonline.common.entity.Temp_SMD_Question;
import com.examonline.common.entity.User;

import java.util.List;

public interface SMD_QuestionsService {
    List<SMD_Questions> getSMD_Questions(User user);
    List<Temp_SMD_Question>getTemp_SMD_Question(Integer id);
    Temp_SMD_Question getTemp_SMD_QuestionBySMD_QuestionsID(Integer id);
    Integer insertSMD_Questions(SMD_Questions smd_questions);
    Integer updateSMD_Questions(SMD_Questions smd_questions);
    Integer deletSMD_Questions(Integer id);
    List<Temp_SMD_Question> getAllTemp_SMD_Question(Integer id, Integer questionType, Integer courseId, Integer teacherCategoryID);

}
