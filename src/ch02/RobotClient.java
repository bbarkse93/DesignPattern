package ch02;

public class RobotClient {

    public static void main(String[] args) {

        Robot robot = new Robot.Builder()
                .head("메탈 헤드")
                .torso("강철 몸통")
                .arms("티타늄 팔")
                .legs("시멘트 다리")
                .build();

        System.out.println(robot.toString());

    }

}
