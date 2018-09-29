package computer2;

public class Com {
  Cpu cpu;
  Ems ems;
  HardDisk type;
  
public Cpu getCpu() {
	return cpu;
}
public void setCpu(Cpu cpu) {
	this.cpu = cpu;
}
public Ems getEms() {
	return ems;
}
public void setEms(Ems ems) {
	this.ems = ems;
}


public HardDisk getType() {
	return type;
}
public void setType(HardDisk type) {
	this.type = type;
}
public void print(){
	  System.out.println("请输入计算机品牌");
	  System.out.println("CPU品牌是:"+cpu.brand()+",主频时3.8HZ");
		System.out.println("硬盘型号是:"+ems.capacity());
		System.out.println("内存容量是:"+type.type());
	  
  }
}
