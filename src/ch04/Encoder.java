package ch04;

public class Encoder {
    // 포함 관계 - base64, Append
    private EncodingStrategy encodingStrategy;

    // 생성자 의존 주입
    public Encoder(EncodingStrategy encodingStrategy) {
        this.encodingStrategy = encodingStrategy;
    }

    // 메서드 의존 주입 가능
    public void setEndingStragey(EncodingStrategy encodingStrategy) {
        this.encodingStrategy = encodingStrategy;
    }

    public String getMessage(String message) {
        return this.encodingStrategy.encode(message);
    }


}
