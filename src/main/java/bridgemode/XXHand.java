package bridgemode;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @BelongsProject: designmode
 * @BelongsPackage: bridgemode
 * @Author: ZhangJun
 * @CreateTime: 2019-07-17 17:20
 * @Description: 手臂
 */
public class XXHand implements IHand {
    private Logger logger=Logger.getLogger(XXHand.class.getSimpleName());
    @Override
    public void wigglingFingers() {
        logger.info("我开始扭动我的手指");
    }

    @Override
    public void printInfo() {
        logger.log(Level.INFO,"我是一个机械臂，我很灵活");
    }
}
