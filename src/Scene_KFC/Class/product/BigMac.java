package Scene_KFC.Class.product;
/*
*巨无霸类继承自食物类，实现了桥接模式
 */


import Scene_KFC.Class.type.Meat_food;
import Scene_KFC.Class.type.Meat_or_veg;

public class BigMac extends Food {

    private float price;
    private float weight;
    public Meat_or_veg am;//桥接模式分类成员

    //只有构造函数初始化了价格与重量，满足不变模式
    public BigMac(){
        this.price=15.0f;
        this.weight=100.0f;
        Meat_or_veg am=new Meat_food();//食物分类
        this.am= am;
    }
    public BigMac clone(){//原型模式，复制食物
        BigMac bigmac=new BigMac();
        return bigmac;
    }

    @Override
    public float getPrice() {
        return this.price;
    }

    @Override
    public String getName() {
        return "BigMac";
    }

}
