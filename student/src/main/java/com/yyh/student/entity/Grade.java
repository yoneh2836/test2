package com.yyh.student.entity;

/**
 * User: 鄢意辉
 * Date: 2019/11/7/007
 * Time: 8:57
 */
public class Grade {
    private int id;
    private int gno;
    private String department;
    private int total;          //班级总人数

    public Grade(){}

    public Grade(int id, int gno, String department, int total) {
        this.id = id;
        this.gno = gno;
        this.department = department;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGno() {
        return gno;
    }

    public void setGno(int gno) {
        this.gno = gno;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "id=" + id +
                ", gno=" + gno +
                ", department='" + department + '\'' +
                ", total=" + total +
                '}';
    }
}
