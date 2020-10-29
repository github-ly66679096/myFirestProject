package cncst.edu.cn.TestExtends.a.b;

/**
 * describe
 * 作者：曾昭武
 */
//导师继承  Person
public class DaoShi extends Person {
    private  String dname;
    public  int num;
    public  DaoShi(String dname,String pname){
        super(pname);
        this.dname=dname;
        System.out.println("DaoShi的值为"+this.dname);
    }
}
