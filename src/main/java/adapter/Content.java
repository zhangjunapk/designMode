package adapter;

/**
 * @BelongsProject: designmode
 * @BelongsPackage: adapter
 * @Author: ZhangJun
 * @CreateTime: 2019-07-15 10:10
 * @Description: 测试类
 */
public class Content {
    public static void main(String[] args) {
        HaseeComputer haseeComputer = new HaseeComputer();
        XXCardReader xxCardReader = new XXCardReader();
        xxCardReader.insertFlashMemory(new IFlashMemory() {
            @Override
            public String getRawData() {
                return "我是存储卡，原始数据";
            }
        });
        haseeComputer.insertUsb(0, xxCardReader);
        haseeComputer.setPowerAdapter(new IPowerAdapter() {
            @Override
            public Double input() {
                return 220D;
            }

            @Override
            public Double output() {
                return 19D;
            }
        });
        haseeComputer.powerOn();
        IUSB userDevice = haseeComputer.getUsbDevice(0);
        userDevice.readData();
    }
}
