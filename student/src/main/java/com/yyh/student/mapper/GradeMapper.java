package com.yyh.student.mapper;

import com.yyh.student.entity.Grade;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * User: 鄢意辉
 * Date: 2019/11/7/007
 * Time: 9:05
 */
@Mapper
@Component
public interface GradeMapper {
    //查询所有班级
    public List<Grade> selectAll();

    //Id查询grade
    public Grade selectGradeById(int id);

    //添加班级
    public int addGrade(Grade grade);

    //删除班级
    public int deleteGrade(int id);

    //修改班级信息
    public int updateGradeById(Grade grade);

    //添加学生total+1
    public int updateGradeTotal(int id);

    //删除学生total-1
    public int updateGradeTotal2(int id);
}
