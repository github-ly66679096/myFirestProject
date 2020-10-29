package cncst.edu.cn.TestExtends.a.d;

/*
 * @Description声明一个抽象类  使其用来具体宠物类的继承
 * @Author LiYue
 * @Date 17:20 2020/7/13
 **/

public class Pet {

    private String petName = "狗剩子";
    private int petHealth;
    private int petLove;

    public Pet(String name, int health, int love) {
        this.petHealth = health;
        this.petLove = love;
        this.petName = name;
    }

    public Pet() {
    }

    /*
     * @Author LiYue
     * @Description 声明一个普通方法用来输出宠物的信息
     * @Date 17:19 2020/7/13
     **/
    public void Readme() {
        System.out.println("宠物的自白");
        System.out.println("我的名字叫" + petName + "，我的健康值值是" + petHealth + "，" +
                "我和主人的亲密程度是" + petLove);
    }
}
