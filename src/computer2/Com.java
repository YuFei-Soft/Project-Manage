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
	  System.out.println("����������Ʒ��");
	  System.out.println("CPUƷ����:"+cpu.brand()+",��Ƶʱ3.8HZ");
		System.out.println("Ӳ���ͺ���:"+ems.capacity());
		System.out.println("�ڴ�������:"+type.type());
	  
  }
}
