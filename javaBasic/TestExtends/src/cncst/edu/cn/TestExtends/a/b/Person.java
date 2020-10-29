package cncst.edu.cn.TestExtends.a.b;

/*
 * @Description //TODO
 * @Author LiYue
 * @Date 15:31 2020/7/13
 **/
public class Person extends Object {
    private String pname;

    //请问我 在学生类能不能调用 Person的方法
    public Person(String pname) {
        super();
        System.out.println("Person的值为" + this.pname);
        this.pname = pname;
    }
}
