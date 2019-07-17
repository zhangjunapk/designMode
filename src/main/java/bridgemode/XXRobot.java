package bridgemode;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @BelongsProject: designmode
 * @BelongsPackage: bridgemode
 * @Author: ZhangJun
 * @CreateTime: 2019-07-17 17:24
 * @Description: 机器人
 */
public class XXRobot implements IRobot {
    private Logger logger=Logger.getLogger(XXRobot.class.getSimpleName());
    private IHand hand;
    private IFoot foot;
    private IHead head;

    @Override
    public void insertHands(IHand hand) {
        this.hand=hand;
    }

    @Override
    public void insertFoot(IFoot foot) {
        this.foot=foot;
    }

    @Override
    public void insertHead(IHead head) {
        this.head=head;
    }

    @Override
    public void startMove() {
        if(foot!=null){
            Double maxRunSpeed = foot.getMaxRunSpeed();
            logger.log(Level.INFO,"最大速度:->"+maxRunSpeed);
            foot.startRun();
        }
    }

    @Override
    public void startThinking() {
        if(head!=null){
            head.doThinking();
        }
    }

    @Override
    public void startHand() {
        if(hand!=null){
            hand.wigglingFingers();
        }
    }
}
