package Scene_InPark.Test;

import Scene_InPark.Class.Broadcast.Broadcast;
import Scene_InPark.Class.Facilitie.Tourist;

import java.util.Scanner;

//通过输入A来改变游园状态，游园状态改变会广播通知所有游客，使得所有游客改变行为
public class ObserverPatternTest {
    public static void observerPatternTest() {

        //实例化广播类
        Broadcast broadcast = new Broadcast();

        //实例化两个游客
        Tourist tourist1 = new Tourist("张三");
        Tourist tourist2 = new Tourist("李四");

        //注册这两个游客
        broadcast.addList(tourist1);
        broadcast.addList(tourist2);

        //方便测试
        System.out.println("\n" +"----------------------------------------");
        System.out.println("14. 观察者模式(ObserverPattern)：");
        System.out.print("游园现在为开放状态");

        broadcast.changeGardenState(false);

        broadcast.changeGardenState(true);

        }
}