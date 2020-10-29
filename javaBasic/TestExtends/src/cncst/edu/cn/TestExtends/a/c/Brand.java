package cncst.edu.cn.TestExtends.a.c;
/*
 * Description: 品牌类--是其他类的基类
 * date: 2020/7/13 16:07
 * @author LiYue
 */

public class Brand extends Object {
    private String brandName;

    public Brand(String brandNames) {
        this.brandName = brandNames;
        System.out.println("Brand类是其他类的基类=====品牌名称是：" + brandNames);
    }
}
