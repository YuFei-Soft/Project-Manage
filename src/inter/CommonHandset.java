package inter;

public class CommonHandset extends Handset implements PlayWiring {

	@Override
	public void sendInfo() {
		System.out.println("����Ϣ");
	}

	@Override
	public void call() {
		System.out.println("��绰");
	}

	@Override
	public void info() {
		System.out.println("��Ϣ");
	}

	@Override
	public void play() {
		System.out.println("������Ƶ");

	}

	public static void main(String[] args) {
		CommonHandset b = new CommonHandset();
		b.sendInfo();
		b.call();
		b.info();
		b.play();
	}

}
