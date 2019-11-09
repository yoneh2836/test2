package com.yyh.student.mapper;

import com.yyh.student.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * User: 鄢意辉
 * Date: 2019/11/6/006
 * Time: 16:57
 */
@Mapper
@Component
public interface StudentMapper {
    //查询所有学生
    public List<Student> selectAllStudent();

    //根据sno查询学生
    public Student selectStudentBySno(int sno);

    //查询某班所有学生
    public List<Student> selectStudentByGrade(int grade_id);

    //查询学生班级编号
    public int selectStudentGradeId(int sno);
    //添加学生
    public int addStudent(Student student);

    //修改学生信息
    public int updateStudentBySno(Student student);

    //删除学生信息
    public int deleteStudentBySno(int sno);
}
