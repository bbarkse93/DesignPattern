package ch04;

public class MainTest {
    public static void main(String[] args) {
        Base64Strategy base64Strategy = new Base64Strategy();
        AppendStrategy appendStrategy = new AppendStrategy();

        Encoder encoder = new Encoder(base64Strategy);

        String message = "안녕";
        System.out.println(encoder.getMessage(message));

        // 메서드 의존 주입
        encoder.setEndingStragey(appendStrategy);
        System.out.println(encoder.getMessage(message));
    }
}
