package ch01;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class LogWriter {

    // 1. 외부에서 접근 불가 생성자 생성
    private LogWriter(){
        try {
            bw = new BufferedWriter(new FileWriter("log.txt", true));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 2. 자신의 참조값을 담을 정적변수 선언
    private static LogWriter instance;
    private static BufferedWriter bw;

    // 3. 외부에서 접근 가능한 정적 메서드 만들어 주기
    public static LogWriter getInstance(){
        if(instance == null){
            instance = new LogWriter();
        }
        return instance;
    }

    // 로그 작성기능
    public void writeLog(String log){
        try {
            bw.write(log);
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
