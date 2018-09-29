package computer2;

public class Test {
public static void main(String[] args) {
	Com com=new Com();
	Cpu cpu=new Brand();
	Ems ems=new Capacity2();
	HardDisk hardDisk=new Type();
	com.setCpu(cpu);
	com.setEms(ems);
	com.setType(hardDisk);
	com.print();
}
}
