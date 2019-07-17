package bridgemode;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @BelongsProject: designmode
 * @BelongsPackage: bridgemode
 * @Author: ZhangJun
 * @CreateTime: 2019-07-17 17:23
 * @Description: 头
 */
public class XXHead implements IHead {
    private Logger logger=Logger.getLogger(XXHead.class.getSimpleName());

    @Override
    public void printInfo() {
        logger.log(Level.INFO,"我是一个头，我有自我意识");
    }

    @Override
    public void doThinking() {
        logger.log(Level.INFO,"我在考虑怎么毁灭地球");
    }
}
