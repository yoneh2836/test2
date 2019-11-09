package com.yyh.student.service;

import com.yyh.student.entity.Student;
import com.yyh.student.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * User: 鄢意辉
 * Date: 2019/11/6/006
 * Time: 16:58
 */
@Service
public class StudentService {

    @Autowired
    private StudentMapper studentMapper;

    public List<Student> selectAllStudent(){
        return studentMapper.selectAllStudent();
    }

    public Student selectStudentBySno(int sno){ return studentMapper.selectStudentBySno(sno); }

    public List<Student> selectStudentByGrade(int grade_id){ return studentMapper.selectStudentByGrade(grade_id); }

    public int selectStudentGradeId(int sno){ return studentMapper.selectStudentGradeId(sno); }

    public int addStudent(Student student){ return studentMapper.addStudent(student);}

    public int updateStudentBySno(Student student){ return studentMapper.updateStudentBySno(student);}

    public int deleteStudentBySno(int sno){ return studentMapper.deleteStudentBySno(sno);}
}
