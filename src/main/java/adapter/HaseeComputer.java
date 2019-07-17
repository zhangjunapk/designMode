package adapter;

import java.util.ArrayList;
import java.util.List;

/**
 * @BelongsProject: designmode
 * @BelongsPackage: adapter
 * @Author: ZhangJun
 * @CreateTime: 2019-07-15 10:00
 * @Description: HaseeComputer
 */
public class HaseeComputer implements IComputer{

    private List<IUSB> usbDevices=new ArrayList<>();

    private IPowerAdapter adapter;

    private boolean isPowerOn=false;
    @Override
    public boolean powerOn() {
        if(adapter==null){
            System.out.println("没有适配器");
            return false;
        }

        if(Math.abs(adapter.output()-19)<=3){
            //给所有usb供电
            for(IUSB iusb:usbDevices){
                iusb.powerOn(getUsbVoltage());
            }
            System.out.println("好了，电脑正在供电");
            isPowerOn=true;
            return true;
        }else{
            System.out.println("电源适配器输出有问题，无法正常供电,需要19v电压");
            isPowerOn=false;
            return false;
        }
    }

    @Override
    public int getAvailableUsbs() {
        return 5;
    }

    @Override
    public void insertUsb(int index, IUSB iusb) {
        if(index>getAvailableUsbs()-1){
            System.out.println("当前电脑只有"+getAvailableUsbs()+"个usb设备，不能往"+index+"索引插入usb设备");
            return;
        }
        System.out.println("已经往电脑"+index+"索引插入usb设备");
        usbDevices.add(index,iusb);
    }

    @Override
    public IUSB getUsbDevice(int index) {
        if(!isPowerOn){
            System.out.println("电脑未开机");
            return null;
        }
        if(index>getAvailableUsbs()-1){
            System.out.println("当前电脑只有"+getAvailableUsbs()+"个usb设备，不能往"+index+"索引插入usb设备");
            return null;
        }
        return usbDevices.get(index);
    }

    @Override
    public void setPowerAdapter(IPowerAdapter adapter) {
        this.adapter=adapter;
    }

    @Override
    public Double getUsbVoltage() {
        return 5D;
    }
}
