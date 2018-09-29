package computer2;

public class Com {
  Cpu cpu;
  Ems ems;
  Capacity capacity;
  
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
public Capacity getCapacity() {
	return capacity;
}
public void setCapacity(Capacity capacity) {
	this.capacity = capacity;
}
  public void print(){
	  System.out.println("请输入计算机品牌");
	  
  }
}
