package cncst.edu.cn.TestExtends.a.c;/*
 * Description:
 * date: 2020/7/13 16:23
 * @author LiYue
 */

public class Computer extends ElectronicProducts {
    private String computerBrandName;

    public Computer(String computerBrandName, String electronicName, String brandNames) {
        super(electronicName, brandNames);
        this.computerBrandName = computerBrandName;
        System.out.println("电脑的品牌是：" + computerBrandName);
    }
}
