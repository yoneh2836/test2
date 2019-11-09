package com.yyh.student.controller;

import com.yyh.student.entity.Grade;
import com.yyh.student.entity.Student;
import com.yyh.student.service.GradeService;
import com.yyh.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * User: 鄢意辉
 * Date: 2019/11/6/006
 * Time: 17:10
 */
@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;
    @Autowired
    private GradeService gradeService;

    @RequestMapping("/selectAllStudent")
    public String selectAll(Model model){
        List<Student> emps = studentService.selectAllStudent();
        model.addAttribute("msg","total");
        model.addAttribute("emps",emps);
        return "students";
    }

    @RequestMapping("/selectStudentByGrade")
    public String selectStudentByGrade(int grade_id,Model model){
        List<Student> emps = studentService.selectStudentByGrade(grade_id);
        Grade grade = gradeService.selectGradeById(grade_id);
        String msg =grade.getDepartment()+grade.getGno();
        model.addAttribute("msg",msg);
        model.addAttribute("emps",emps);
        return "students";
    }

    @RequestMapping("/selectStudentBySno")
    @ResponseBody
    public Student selectStudentBySno(){
        return studentService.selectStudentBySno(1002);
    }

    @RequestMapping("/addStudent")
    @ResponseBody
    @Transactional
    public String addStudent(Student student){
        int num = studentService.addStudent(student);
        if(num>0) {
            gradeService.updateGradeTotal(student.getGrade_id());
            return "success";
        }
        else
            return "false";
    }

    @RequestMapping("/deleteStudent")
    @ResponseBody
    @Transactional
    public String deleteStudentBySno(int sno){
        Student student = studentService.selectStudentBySno(sno);
        int num = studentService.deleteStudentBySno(sno);
        if(num>0){
            gradeService.updateGradeTotal2(student.getGrade_id());
            return "success";
        }
        else
            return "false";
    }

    @RequestMapping("/updateStudent")
    @ResponseBody
    @Transactional
    public String updateStudent(Student student){
        if(studentService.selectStudentGradeId(student.getSno())!=student.getGrade_id()) {
            gradeService.updateGradeTotal2(studentService.selectStudentGradeId(student.getSno()));
            gradeService.updateGradeTotal(student.getGrade_id());
        }
        int num = studentService.updateStudentBySno(student);
        if(num>0)
            return "success";
        else
            return "false";

    }

    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}