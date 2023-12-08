package ch01;

// 싱글톤 패턴 만드는 방법
public class CoffeeMaker {

    // 1. 외부에서 생성자를 호출할 수 없도록 코드를 설계한다.
    private CoffeeMaker() {}

    // 2. 자신의 참조 값을 저장할 수 있는 static 변수를 선언한다.
    private static CoffeeMaker instance;

    // 3. 객체를 메모리에 올릴 코드를 작성하고 외부에서 접근할 수 있는 메서드를 만들어 준다.
    // 단, 정적 메서드로 만들어 준다.
    public static CoffeeMaker getInstance(){
        if(instance == null){
            instance = new CoffeeMaker();
        }
        return instance;
    }

    // 커피 만들기
    public void makeCoffee(){
        System.out.println("커피가 만들어졌습니다.");
    }
}