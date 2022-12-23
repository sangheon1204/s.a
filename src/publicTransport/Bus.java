package publicTransport;

public class Bus extends PublicTransport {
    //필드
    private int currentCustomer = 0;  //현재 승객수
    private int emptyCustomer = 0; // 남은 자리


    //생성자
    public  Bus(int num) {
        this.num = num;
        this.price = 0;
        this.status = "운행중";
        this.maxCustomer = 30;
    }

    //메소드
    public void setCurrentCustomer(int n) {     //운행중인 상태에서만 승객 탑승 가능
        if (status == "운행중") {
            if (currentCustomer + n <= maxCustomer) {
                currentCustomer = n + currentCustomer;
                emptyCustomer = maxCustomer - currentCustomer;
                System.out.println("탑승 승객 수 =  " + n);
                System.out.println("잔여 승객 수 =  " + emptyCustomer);
                System.out.println("요금 확인 =  " + 1000 * currentCustomer);
            }else{          // 최대 승객 수를 초과했을 시에는 경고메세지
                System.out.println("최대 승객 수를 초과했습니다.");
            }
        }
    }
    /*
    버스의 상태를 바꾸는 함수의 오버로딩
    1. gas량 + 상태
    2. gas량 만
    3. 상태만
     */
    public void changeBusStatus(String status, int n) {
        this.status = status;
        gas += n;
        System.out.println("주유량 = " + gas);
        if(gas == 0) {
            this.status= "차고지행";
        }else if(gas < 10) {
            System.out.println("주유가 필요합니다.");
        }
        System.out.println("상태: " + this.status);
    }

    public void changeBusStatus(int n) {
        gas += n;
        System.out.println("주유량 = " + gas);
        if(gas == 0) {
            status = "차고지행";
        }else if(gas < 10) {
            System.out.println("주유가 필요합니다.");
            System.out.println("상태: " + status);
        }
    }

    public void changeBusStatus(String status) {
        this.status =status;
    }

    public void changeSpeed(int speed) {
        if(gas < 10) {
            System.out.println("주유량을 확인해주세요!!");
        }
        if(speed < 0 && speed > 200) {            // 0보다 작은 값이나 200보다 큰 값으로 주어지면 속도 0
            this.speed = 0;
        } else {
            this.speed = speed;
        }
        System.out.println("현재 속도: " + this.speed);
    }



}