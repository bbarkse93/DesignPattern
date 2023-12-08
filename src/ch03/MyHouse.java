package ch03;

public class MyHouse {
    public static void homeConnect(IElectronic220v electronic220v) {
        electronic220v.connect();
    }

    public static void main(String[] args) {
        // 전압 220v
    AirConditioner airConditioner = new AirConditioner();
    HairDryer dryer = new HairDryer();
    Cleaner cleaner = new Cleaner();

    // 사용해보기
        homeConnect(airConditioner); // 에어컨 바로 연결 가능
        // homeConnect(dryer); // 연결 불가능
        // homeConnect(cleaner); // 연결 불가능

        // 어댑터 가져오기
        ElectronicAdapter dryerAdapter = new ElectronicAdapter(dryer);
        ElectronicAdapter cleanerAdapter = new ElectronicAdapter(cleaner);
        homeConnect(dryerAdapter);
        homeConnect(cleanerAdapter);

    }
}
