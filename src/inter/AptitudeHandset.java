package inter;

public class AptitudeHandset extends Handset implements Network,
		TheakePictures, PlayWiring {

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
	public void network() {
		System.out.println("��������");
	}

	@Override
	public void takePictures() {
		System.out.println("����");
	}

	public static void main(String[] args) {
		AptitudeHandset a = new AptitudeHandset();
		a.sendInfo();
		a.call();
		a.info();
		a.network();
		a.takePictures();
		a.play();
	}

	@Override
	public void play() {
		System.out.println("������Ƶ");
	}

}
