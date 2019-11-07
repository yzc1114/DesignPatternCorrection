package Scene_BuyTickets.Test;
import Scene_BuyTickets.Class.Hotel.*;

public class EasyFactoryPatternTest {
    public static void easyFactoryPatternTest(){
        System.out.println("\n" +"----------------------------------------");
        System.out.println("2. 简单工厂模式(Easy Factory)：");
        System.out.println("\n测试一：");
        System.out.println("Hotel调用addNewRoom函数生产SmallRoom");
        Hotel hotel = Hotel.getInstance();
        hotel.addNewRoom("101","SMALL");
        System.out.println("\n测试二：");
        System.out.println("Hotel调用addNewRoom函数生产MiddleRoom");
        hotel.addNewRoom("202","MIDDLE");
        System.out.println("\n测试三：");
        System.out.println("Hotel调用addNewRoom函数生产LargeRoom");
        hotel.addNewRoom("203","LARGE");
        System.out.println("\n测试四：");
        System.out.println("Hotel调用addNewRoom函数生产重复房间号的LargeRoom");
        hotel.addNewRoom("203","LARGE");
        System.out.println("\n测试五：");
        System.out.println("Hotel调用addNewRoom函数生产不存在的NullRoom");
        hotel.addNewRoom("204","NULL");
        System.out.println("\n测试六：");
        System.out.println("Hotel调用addNewRoom函数时room_type为空");
        hotel.addNewRoom("205",null);
        System.out.println("----------------------------------------" + "\n");
    }
}
