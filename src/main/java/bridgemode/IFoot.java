package bridgemode;

/**
 * @BelongsProject: designmode
 * @BelongsPackage: bridgemode
 * @Author: ZhangJun
 * @CreateTime: 2019-07-17 17:11
 * @Description: 腿
 */
public interface IFoot extends IPart{
    /**
     * 获得腿的最大跑步速度
     * @return
     */
    Double getMaxRunSpeed();

    /**
     * 开始跑步
     */
    void startRun();
}
