package ch01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cafe {
    public static void main(String[] args) {
        // 커피메이커 인스턴스 얻어서 커피를 만들게 동작 시키기
        System.out.println("- 세상에서 가장 작은 카페 -");

        CoffeeMaker coffeeMaker = CoffeeMaker.getInstance();
        coffeeMaker.makeCoffee();

        LogWriter.getInstance().writeLog("커피1 결제 완료 : " + dateFormatter(new Date()));

        // 다른 파일에서 또 필요함
        CoffeeMaker coffeeMaker2 = CoffeeMaker.getInstance();
        coffeeMaker2.makeCoffee();
        LogWriter.getInstance().writeLog("커피2 결제 완료 : " + dateFormatter(new Date()));

        // 두 인스턴스가 동일한지 확인
        System.out.println("coffeeMaker == coffeeMaker2 : " +
                (coffeeMaker == coffeeMaker2));


    }

    public static String dateFormatter(Date date){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return dateFormat.format(date);
    }
}
