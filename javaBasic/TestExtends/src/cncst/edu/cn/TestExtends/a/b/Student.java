package cncst.edu.cn.TestExtends.a.b;

/*
 * @Description 学生继承 DaoShi (super关键字和this关键字)
 * @Author LiYue
 * @Date 15:30 2020/7/13
 **/
public class Student extends DaoShi {
    private String sname;

    public Student(String sname, String dname, String pname) {
        super(dname, pname);
        System.out.println("Student的值为" + this.sname);
        this.sname = sname;
    }
}
