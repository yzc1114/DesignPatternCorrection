package Scene_KFC.Test;

import Scene_KFC.Class.pack.Packing;
import Scene_KFC.Class.product.BigMac;

import java.lang.reflect.Parameter;
/*
*不变模式的测试类
 */
public class ImmutablePatternTest {
    public static void immutablePatternTest() {
        BigMac bigmac=new BigMac();
        Packing wrapper = bigmac.packing();
        System.out.println("\n" +"----------------------------------------");
        System.out.println("28. 不变模式(Immutable)：");
        System.out.println("\n测试:");
        System.out.println("巨无霸汉堡的包装是："+wrapper.getMaterial());
        wrapper.setMaterial("plastic");
        System.out.println("我现在要把巨无霸汉堡的包装变为：plastic");
        System.out.println("修改之后，巨无霸汉堡的包装是："+wrapper.getMaterial());
        System.out.println("设置失败，因为包装纸采用了不变模式。");
        System.out.println("----------------------------------------" + "\n");






    }
}
