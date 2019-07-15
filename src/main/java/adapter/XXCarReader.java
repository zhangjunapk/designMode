package adapter;

/**
 * @BelongsProject: designmode
 * @BelongsPackage: adapter
 * @Author: ZhangJun
 * @CreateTime: 2019-07-15 10:15
 * @Description: 读卡器
 */
public class XXCarReader implements ICarReader{
    private IFlashMemory flashMemory;
    boolean isPowerOn=false;
    @Override
    public void insertFlashMemory(IFlashMemory flashMemory) {
        this.flashMemory=flashMemory;
    }

    @Override
    public void powerOn(Double voltage) {
        if(Math.abs(voltage-5)<=1){
            System.out.println("好的，usb正常供电");
            isPowerOn=true;
        }else{
            System.out.println("供电错误");
            isPowerOn=false;
        }
    }

    @Override
    public void readData() {
        if(isPowerOn){
            System.out.println(flashMemory.getRawData());
        }else{
            System.out.println("读卡器没能正常供电");
        }
    }
}
