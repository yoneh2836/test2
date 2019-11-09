package com.yyh.student.service;

import com.yyh.student.entity.Grade;
import com.yyh.student.mapper.GradeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * User: 鄢意辉
 * Date: 2019/11/7/007
 * Time: 9:07
 */
@Service
public class GradeService {

    @Autowired
    private GradeMapper gradeMapper;

    public List<Grade> selectAll(){
        return gradeMapper.selectAll();
    }

    public Grade selectGradeById(int id){ return gradeMapper.selectGradeById(id); }

    public int addGrade(Grade grade){ return gradeMapper.addGrade(grade); }

    public int deleteGrade(int id){ return gradeMapper.deleteGrade(id); }

    public int updateGradeById(Grade grade){ return gradeMapper.updateGradeById(grade); }

    public void updateGradeTotal(int id){
        gradeMapper.updateGradeTotal(id);
    }

    public void updateGradeTotal2(int id){
        gradeMapper.updateGradeTotal2(id);
    }
}
