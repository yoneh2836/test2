package com.yyh.student.controller;

import com.yyh.student.entity.Grade;
import com.yyh.student.service.GradeService;
import com.yyh.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * User: 鄢意辉
 * Date: 2019/11/7/007
 * Time: 9:09
 */
@Controller
public class GradeController {

    @Autowired
    private GradeService gradeService;
    @Autowired
    private StudentService studentService;

    @RequestMapping("/selectAllGrade")
    public String selectAll(Model model){
        List<Grade> gradeList = gradeService.selectAll();
        model.addAttribute("emps",gradeList);
        return "grade";
    }

    @RequestMapping("/addGrade")
    @ResponseBody
    public String addGrade(Grade grade){
        int num = gradeService.addGrade(grade);
        if(num>0)
            return "success";
        else
            return "false";
    }

    @RequestMapping("/deleteGrade")
    @ResponseBody
    public String deleteGrade(int id){
        if(studentService.selectStudentByGrade(id)!=null)
            return "msg";
        else {
            int num = gradeService.deleteGrade(id);
            if (num > 0)
                return "success";
            else
                return "false";
        }
    }

    @RequestMapping("/updateGrade")
    @ResponseBody
    public String updateGrade(Grade grade){
        int num = gradeService.updateGradeById(grade);
        if(num>0)
            return "success";
        else
            return "false";
    }
}