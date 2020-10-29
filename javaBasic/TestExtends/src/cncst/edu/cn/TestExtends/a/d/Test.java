package cncst.edu.cn.TestExtends.a.d;
/*
 * Description:  测试类=====使用继承的方法输出 Dog类和Penguins类的内容
 * date: 2020/7/13 17:17
 * @author LiYue
 */

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog("楠楠", 100, 0);

        Penguin penguin = new Penguin("欧欧", 100, 99);

        Pet pet=new Dog();
        pet.Readme();

    }
}
