package ch03;

// Adapter 패턴 활용
public class ElectronicAdapter implements IElectronic220v {

    // 1. 변환하고자 하는 스펙을 포함관계로 만들어 준다.
    private IElectronic110v electronic110v;

    // 2. 생성자를 통해서 의존 주입 받을 수 있도록 설계한다.
    public ElectronicAdapter(IElectronic110v electronic110v){
        this.electronic110v = electronic110v;
    }

    @Override
    public void connect() {
        // 220v의 connect 메서드를 호출하는데 실제로 연결된 전압은 110v connect() 메서드이다.
        electronic110v.connect();
    }
}
