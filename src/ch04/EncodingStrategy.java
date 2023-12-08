package ch04;

@FunctionalInterface
public interface EncodingStrategy {
    String encode(String text);
    // String encode1(String text);
}
