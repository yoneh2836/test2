package com.yyh.student.entity;

/**
 * User: 鄢意辉
 * Date: 2019/11/6/006
 * Time: 15:22
 */
public class Student {
    private int sno;
    private String name;
    private String sex;
    private int grade_id;

    public Student() {}

    public Student(int sno, String name, String sex, int grade_id) {
        this.sno = sno;
        this.name = name;
        this.sex = sex;
        this.grade_id = grade_id;
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getGrade_id() {
        return grade_id;
    }

    public void setGrade_id(int grade_id) {
        this.grade_id = grade_id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sno=" + sno +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", grade_id=" + grade_id +
                '}';
    }
}
