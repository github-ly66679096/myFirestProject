package cncst.edu.cn.TestExtends.a.c;/*
 * Description:
 * date: 2020/7/13 16:24
 * @author LiYue
 */

public class MainBoard extends Computer {

    private String mainBrandName;

    public MainBoard(String mainBroadName, String computerBrandName, String electronicName, String brandNames) {
        super(computerBrandName, electronicName, brandNames);
        this.mainBrandName = mainBrandName;
        System.out.println("主板的产品名为：" + mainBroadName);
    }
}
