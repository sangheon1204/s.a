package publicTransport;

public class PublicTransportExample {
    public static void main(String[] args) {
        //1. bus 2대 생성
        Bus bus1 = new Bus(1);
        Bus bus2 = new Bus(2);
        //2. 번호 다른 것 확인
        System.out.println(bus1.num +"번 버스객체 만들어짐!");
        System.out.println(bus2.num +"번 버스객체 만들어짐!");

        //1.bus1의 승객수 +2
        bus1.setCurrentCustomer(2);

        //2. bus1의 주유량 -50
        bus1.changeBusStatus("차고지행",-50);

        //3. 상태 변경
        bus1.changeBusStatus(10);

        bus1.changeBusStatus("운행중");

        //운행 중인 상태로 다시 변경
        bus1.setCurrentCustomer(45);

        // 승객 5명 추가
        bus1.setCurrentCustomer(5);

        //주유량 -55
        bus1.changeBusStatus(-55);
    }
}
