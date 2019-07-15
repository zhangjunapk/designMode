package adapter;

/**
 * @BelongsProject: designmode
 * @BelongsPackage: adapter
 * @Author: ZhangJun
 * @CreateTime: 2019-07-15 09:51
 * @Description: USB接口
 */
public interface IUSB {
    /**
     * usb供电
     * @param voltage
     */
    void powerOn(Double voltage);

    void readData();
}
