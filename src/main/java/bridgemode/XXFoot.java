package bridgemode;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @BelongsProject: designmode
 * @BelongsPackage: bridgemode
 * @Author: ZhangJun
 * @CreateTime: 2019-07-17 17:16
 * @Description: 脚
 */
public class XXFoot implements IFoot {
    private Logger logger=Logger.getLogger(XXFoot.class.getSimpleName());
    @Override
    public Double getMaxRunSpeed() {
        return 300D;
    }

    @Override
    public void startRun() {
        for(;;){
            try {
                Thread.sleep(200);
                logger.log(Level.INFO    ,"我开始走了,我就随便走走");
            } catch (Exception e) {
                logger.info(e.getMessage());
            }
        }
    }

    @Override
    public void printInfo() {
        logger.log(Level.INFO,"这是一个钛合金脚，踢开椰子只要一脚");
    }
}
