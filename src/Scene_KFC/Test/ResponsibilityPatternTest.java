package Scene_KFC.Test;


import Scene_KFC.Class.handler.DirectorHandler;
import Scene_KFC.Class.handler.Handler;
import Scene_KFC.Class.handler.ManagerHandler;
import Scene_KFC.Class.handler.WaiterHandler;

import java.util.Scanner;

public class ResponsibilityPatternTest {
    public static void responsibilityPatternTest()
    {
        //初始化责任链成员
        Handler waiter=new WaiterHandler();
        Handler manager=new ManagerHandler();
        Handler director=new DirectorHandler();
        //组装责任链
        waiter.setNext(manager);
        manager.setNext(director);
        //开始测试
        System.out.println("\n" +"----------------------------------------");
        System.out.println("27.责任链模式(Chain of Responsibility)：");
//        System.out.println("模式k 责任链模式(Chain of Responsibility)：");
//        System.out.println("相关类：Handler WaiterHandler ManagerHandler DirectorHandler");
        System.out.println("请输入要提交的事务级别：");
        int level = Integer.parseInt(new Scanner(System.in).nextLine());
        waiter.handleRequest(level);
    }
}
