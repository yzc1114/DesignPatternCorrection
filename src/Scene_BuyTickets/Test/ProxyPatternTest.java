package Scene_BuyTickets.Test;

import Scene_BuyTickets.Class.Tickets.*;

public class ProxyPatternTest {

    //System.out.println("\n测试一:");

    public static void main(String[] args) {
        proxyPatternTest();
    }
    public static void proxyPatternTest(){
        System.out.println("测试");
        System.out.println("\n" +"----------------------------------------");
        System.out.println("6. 代理模式(ProxyPattern):");
        //System.out.println("代理函数测试");
        TicketsBuyer ticketsBuyer = new TicketsBuyer("XX");
        CtripProxy ctripProxy = new CtripProxy(ticketsBuyer);
        System.out.println("XX选择使用XX代理购买迪士尼乐园门票");
        ctripProxy.validate();
        ctripProxy.select("标准门票————成人票");
        ctripProxy.pay();
        System.out.println("----------------------------------------" + "\n");
    }
}
