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
    public void setCurrentCustomer(int n) {
        if (status == "운행중") {
            if (currentCustomer + n <= maxCustomer) {
                currentCustomer = n + currentCustomer;
                emptyCustomer = maxCustomer - currentCustomer;
                System.out.println("탑승 승객 수 =  " + n);
                System.out.println("잔여 승객 수 =  " + emptyCustomer);
                System.out.println("요금 확인 =  " + 1000 * currentCustomer);
            }else{
                System.out.println("최대 승객 수를 초과했습니다.");
            }
        }
    }

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



}