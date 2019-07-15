package adapter;

/**
 * @BelongsProject: designmode
 * @BelongsPackage: adapter
 * @Author: ZhangJun
 * @CreateTime: 2019-07-15 09:51
 * @Description: 电脑接口
 */
public interface IComputer {
    /**
     * 供电
     * @param
     */
    boolean powerOn();

    /**
     * 获得电脑可用的usb数量
     * @return
     */
    int getAvailableUsbs();

    /**
     * 往指定索引插上usb索引
     * @param index
     * @param iusb
     */
    void insertUsb(int index,IUSB iusb);

    /**
     * 获得这个电脑上插入的usb设备
     * @param index
     * @return
     */
    IUSB getUserDevice(int index);

    /**
     * 给电脑设置电源适配器
     * @param adapter
     */
    void setPowerAdapter(IPowerAdapter adapter);

    /**
     * 获得usb的电压
     * @return
     */
    Double getUsbVoltage();
}
