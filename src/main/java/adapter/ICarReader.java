package adapter;

/**
 * @BelongsProject: designmode
 * @BelongsPackage: adapter
 * @Author: ZhangJun
 * @CreateTime: 2019-07-15 10:13
 * @Description: 读卡器
 */
public interface ICarReader extends IUSB{
    void insertFlashMemory(IFlashMemory flashMemory);
    void readData();
}
