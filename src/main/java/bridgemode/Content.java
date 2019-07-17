package bridgemode;

/**
 * @BelongsProject: designmode
 * @BelongsPackage: bridgemode
 * @Author: ZhangJun
 * @CreateTime: 2019-07-17 17:25
 * @Description: 测试类
 */
public class Content {
    public static void main(String[] args) {
        XXRobot robot=new XXRobot();
        robot.insertFoot(new XXFoot());
        robot.insertHands(new XXHand());
        robot.insertHead(new XXHead());
        robot.startHand();
        robot.startThinking();
        robot.startMove();
    }
}
