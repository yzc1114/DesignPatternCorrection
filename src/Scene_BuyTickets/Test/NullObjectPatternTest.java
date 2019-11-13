package Scene_BuyTickets.Test;
import Scene_BuyTickets.Class.Hotel.*;

public class NullObjectPatternTest {
    public static void nullObjectPatternTest(){

        System.out.println("4. 空对象模式(Null Object)测试：");
        Hotel hotel = Hotel.getInstance();
        System.out.println("\n测试一:查找id为null的房间（该房间不存在）");
        hotel.printRoomInfo(null);

        System.out.println("\n测试二:查找id为\"0\"的房间（该房间不存在）");
        System.out.println("控制器Hotel调用printRoomInfo");
        hotel.printRoomInfo("0");
    }
}
