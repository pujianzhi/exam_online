package com.examonline.controller;


import com.examonline.common.entity.*;
import com.examonline.service.CoursesService;
import com.examonline.service.FSP_QuestionsService;
import com.examonline.service.SMD_QuestionsService;
import com.examonline.service.Teacher_CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;

import javax.servlet.http.HttpSession;
import java.util.*;

@Controller
@RequestMapping("/question")
public class QuestionManageController {

    @Autowired
    FSP_QuestionsService fsp_questionsService;

    @Autowired
    SMD_QuestionsService smd_questionsService;

    @Autowired
    Teacher_CategoryService teacher_categoryService;

    @Autowired
    CoursesService coursesService;

    /*试题管理首页*/
    @RequestMapping("/index")
    public String questionManageIndex(@SessionAttribute User user, Model model){
        List<Temp_SMD_Question> smd_questionsList = new ArrayList<>();
        List<Temp_FSP_Question> fsp_questionsList = new ArrayList<>();
        if(user!=null&&user.getId()!=null){
            fsp_questionsList = fsp_questionsService.getTemp_FSP_Question(user.getId());
            smd_questionsList = smd_questionsService.getTemp_SMD_Question(user.getId());
        }
        System.out.println(fsp_questionsList.size());
        model.addAttribute("coursesList",coursesService.getAllCourses());
        model.addAttribute("fsp_questionsList",fsp_questionsList);
        model.addAttribute("smd_questionsList",smd_questionsList);
        return "/teacher/question_manage";
    }

    /*试题添加页面*/
    @RequestMapping("/showAdd")
    public String showQuestionAdd(Model model) {
        model.addAttribute("coursesList",coursesService.getAllCourses());
        return "/teacher/question_add";
    }

    /*动态选项*/
    @RequestMapping(value = "/selectChange", method = RequestMethod.POST)
    @ResponseBody
    public Object selectChange(Courses courses){
        Map<String,Object> data = new HashMap<>();
        if(courses.getId()!=null){
            data.put("data",teacher_categoryService.getTeacher_CategorysByCourses(courses));
        }
        return data;
    }

    /*创建试题后保存并提交审核*/
    @RequestMapping(value = "/saveSubmitSMD", method = RequestMethod.POST)
    @ResponseBody
    public Object saveSubmitSMD(SMD_Questions smd_questions, HttpSession session){
        Map<String,Object> data = new HashMap<>();
        data.put("isGo",false);
//        1为提交审核
        User user = (User) session.getAttribute("user");
        smd_questions.setUserId(user.getId());
        smd_questions.setState(1);
        smd_questions.setPubdate(new Date());
        Integer i = smd_questionsService.insertSMD_Questions(smd_questions);
        if(i>0){
            data.put("isGo",true);
        }
        System.out.println(smd_questions);
        return data;
    }

    /*创建试题后保存并提交审核*/
    @RequestMapping(value = "/saveSubmitFSP", method = RequestMethod.POST)
    @ResponseBody
    public Object saveSubmitFSP(FSP_Questions fsp_questions, HttpSession session){
        Map<String,Object> data = new HashMap<>();
        data.put("isGo",false);
//        1为提交审核
        User user = (User) session.getAttribute("user");
        fsp_questions.setUserId(user.getId());
        fsp_questions.setState(1);
        fsp_questions.setPubdate(new Date());
        Integer i = fsp_questionsService.insertFSP_Questions(fsp_questions);
        if(i>0){
            data.put("isGo",true);
        }
        System.out.println(fsp_questions);
        return data;
    }
    /*创建试题后保存草稿*/
    @RequestMapping(value = "/saveSMD", method = RequestMethod.POST)
    @ResponseBody
    public Object saveSMD(SMD_Questions smd_questions, HttpSession session){
        Map<String,Object> data = new HashMap<>();
        data.put("isGo",false);
//        1为提交审核
        User user = (User) session.getAttribute("user");
        smd_questions.setUserId(user.getId());
        smd_questions.setState(0);
        smd_questions.setPubdate(new Date());
        Integer i = smd_questionsService.insertSMD_Questions(smd_questions);
        if(i>0){
            data.put("isGo",true);
        }
        System.out.println(smd_questions);
        return data;
    }
    /*创建试题后保存草稿*/
    @RequestMapping(value = "/saveFSP", method = RequestMethod.POST)
    @ResponseBody
    public Object saveFSP(FSP_Questions fsp_questions, HttpSession session){
        Map<String,Object> data = new HashMap<>();
        data.put("isGo",false);
//        1为提交审核
        User user = (User) session.getAttribute("user");
        fsp_questions.setUserId(user.getId());
        fsp_questions.setState(0);
        fsp_questions.setPubdate(new Date());
        Integer i = fsp_questionsService.insertFSP_Questions(fsp_questions);
        if(i>0){
            data.put("isGo",true);
        }
        System.out.println(fsp_questions);
        return data;
    }
    /*修改后提交*/
    @RequestMapping(value = "/submit", method = RequestMethod.POST)
    @ResponseBody
    public Object submitQuestion(Integer id, Integer questionType){
        Map<String,Object> data = new HashMap<>();
        data.put("isGo",false);
        int i = 0;
        int j = 0;
        if(questionType!=null&&id!=null){
            if (questionType<=2){
                SMD_Questions smd_questions = new SMD_Questions();
                smd_questions.setId(id);
                smd_questions.setState(1);
                i = smd_questionsService.updateSMD_Questions(smd_questions);
            }else if (questionType>=3){
                FSP_Questions fsp_questions = new FSP_Questions();
                fsp_questions.setId(id);
                fsp_questions.setState(1);
                j = fsp_questionsService.updateFSP_Questions(fsp_questions);
            }

            if(i>0||j>0){
                data.put("isGo",true);
            }
        }
        return data;
    }

    /*单个删除*/
    @RequestMapping(value = "/del", method = RequestMethod.POST)
    @ResponseBody
    public Object delQuestion(Integer id, Integer questionType){
        Map<String,Object> data = new HashMap<>();
        data.put("isGo",false);
        int i = 0;
        int j = 0;
        if(questionType!=null&&id!=null){
            if (questionType<=2){
                Temp_SMD_Question temp_smd_question = smd_questionsService.getTemp_SMD_QuestionBySMD_QuestionsID(id);
                SMD_Questions smd_questions = temp_smd_question.getSmd_questions();
                if(smd_questions.getState()>0){
                    smd_questions.setState(4);
                    i = smd_questionsService.updateSMD_Questions(smd_questions);
                }else {
                    i = smd_questionsService.deletSMD_Questions(id);
                }

            }else if (questionType>=3){
                Temp_FSP_Question temp_fsp_question = fsp_questionsService.getTemp_FSP_QuestionByFSP_QuestionsID(id);
                FSP_Questions fsp_questions = temp_fsp_question.getFsp_questions();
                if(fsp_questions.getState()>=0){
                    fsp_questions.setState(4);
                    j = fsp_questionsService.updateFSP_Questions(fsp_questions);
                }else {
                    j = fsp_questionsService.deletFSP_Questions(id);
                }
            }

            if(i>0||j>0){
                data.put("isGo",true);
            }
        }
        return data;
    }

    /*题目编辑页面*/
    @RequestMapping("/edit")
    public String QuestionEdit(Model model,Integer id, Integer questionType) {
        if(questionType!=null&&id!=null){
            if (questionType<2){
                Temp_SMD_Question temp_smd_question = smd_questionsService.getTemp_SMD_QuestionBySMD_QuestionsID(id);
                model.addAttribute("question2",temp_smd_question);
                return "/teacher/sm_edit";
            }else if(questionType==2){
                Temp_SMD_Question temp_smd_question = smd_questionsService.getTemp_SMD_QuestionBySMD_QuestionsID(id);
                model.addAttribute("question1",temp_smd_question);
                return "/teacher/d_edit";
            }else if (questionType>=3){
                Temp_FSP_Question temp_fsp_question = fsp_questionsService.getTemp_FSP_QuestionByFSP_QuestionsID(id);
                model.addAttribute("question3",temp_fsp_question);
                return "/teacher/fsp_edit";
            }
        }
        return "/teacher/404";
    }
    /*更新提交*/
    @RequestMapping(value = "/updateSubmitFSP", method = RequestMethod.POST)
    @ResponseBody
    public Object updateSubmitFSP(FSP_Questions fsp_questions){
        Map<String,Object> data = new HashMap<>();
        data.put("isGo",false);
//        3为提交修改审核
        if(fsp_questions.getState()>0){
            fsp_questions.setState(3);
        }
        fsp_questions.setPubdate(new Date());
        Integer i = fsp_questionsService.updateFSP_Questions(fsp_questions);
        if(i>0){
            data.put("isGo",true);
        }
        System.out.println(fsp_questions);
        return data;
    }
    /*更新提交*/
    @RequestMapping(value = "/updateSubmitSMD", method = RequestMethod.POST)
    @ResponseBody
    public Object updateSubmitSMD(SMD_Questions smd_questions){
        Map<String,Object> data = new HashMap<>();
        data.put("isGo",false);
//        3为提交修改审核
        if(smd_questions.getState()>0){
            smd_questions.setState(3);
        }
        smd_questions.setPubdate(new Date());
        Integer i = smd_questionsService.updateSMD_Questions(smd_questions);
        if(i>0){
            data.put("isGo",true);
        }
        System.out.println(smd_questions);
        return data;
    }

    /*批量删除*/
    @RequestMapping(value = "/dels", method = RequestMethod.POST)
    @ResponseBody
    public Object dels(String smdids,String fspids){
        Map<String,Object> data = new HashMap<>();
        String[] smdList = smdids.split(",");
        String[] fspList = fspids.split(",");
        List<String> smdListDel = new ArrayList<>();
        List<String> smdListSubmitDel = new ArrayList<>();
        List<String> fspListDel = new ArrayList<>();
        List<String> fspListSubmitDel = new ArrayList<>();
        for (int i = 0; i < smdList.length&&!smdList[i].equals(""); i++) {
            Temp_SMD_Question temp_smd_question = smd_questionsService.getTemp_SMD_QuestionBySMD_QuestionsID(Integer.valueOf(smdList[i]));
            SMD_Questions smd_questions = temp_smd_question.getSmd_questions();
            if(smd_questions!=null&&smd_questions.getState()==2){
                smd_questions.setState(4);
                if(smd_questionsService.updateSMD_Questions(smd_questions)>0){
                    smdListSubmitDel.add(smdList[i]);
                }
            }else if(smd_questions!=null&&smd_questions.getState()==0){
                if(smd_questionsService.deletSMD_Questions(Integer.valueOf(smdList[i]))>0){
                    smdListDel.add(smdList[i]);
                }
            }
        }

        for (int j = 0; j < fspList.length&&!fspList[j].equals(""); j++) {
            Temp_FSP_Question temp_fsp_question = fsp_questionsService.getTemp_FSP_QuestionByFSP_QuestionsID(Integer.valueOf(fspList[j]));
            FSP_Questions fsp_questions = temp_fsp_question.getFsp_questions();
            if(fsp_questions!=null&&fsp_questions.getState()==2){
                fsp_questions.setState(4);
                if(fsp_questionsService.updateFSP_Questions(fsp_questions)>0){
                    fspListSubmitDel.add(fspList[j]);
                }
            }else if(fsp_questions!=null&&fsp_questions.getState()==0){
                if(fsp_questionsService.deletFSP_Questions(Integer.valueOf(fspList[j]))>0){
                    fspListDel.add(fspList[j]);
                }
            }
        }
        data.put("msg","选中"+(smdList.length+fspList.length)+"条数据,提交删除申请"+(smdListSubmitDel.size()+fspListSubmitDel.size())+"条,实际删除"+(smdListDel.size()+fspListDel.size())+"条");
        return data;
    }

    /*更新提交*/
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @ResponseBody
    public Object search(Integer va1,Integer va2,Integer va3){
        Map<String,Object> data = new HashMap<>();
        data.put("smdList",null);
        data.put("fspList",null);
        if(va1==null){
            if(va2==null){

            }
        }else{

        }
        return data;
    }


}
