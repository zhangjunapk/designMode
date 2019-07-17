package bridgemode;

/**
 * @BelongsProject: designmode
 * @BelongsPackage: bridgemode
 * @Author: ZhangJun
 * @CreateTime: 2019-07-17 17:10
 * @Description: 機器人接口
 */
public interface IRobot {
    void insertHands(IHand hand);
    void insertFoot(IFoot foot);
    void insertHead(IHead head);

    void startMove();
    void startThinking();
    void startHand();
}
