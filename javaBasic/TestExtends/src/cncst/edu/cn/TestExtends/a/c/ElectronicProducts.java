package cncst.edu.cn.TestExtends.a.c;/*
 * Description:
 * date: 2020/7/13 16:14
 * @author LiYue
 */

public class ElectronicProducts extends Brand {

    private String electronicName;

    public ElectronicProducts(String electronicName,String brandNames) {
        super(brandNames);
        this.electronicName = electronicName;
        System.out.println("电子产品的品牌名为：" + this.electronicName);
    }

    public void printElectronicInfo() {
        System.out.println("这个是ElectronicProducts类中的方法，由于使用" +
                "的是public访问修饰符进行修饰，可以在其子类中进行访问");
    }
}
