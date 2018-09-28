package inter;

public class CommonHandset extends Handset implements PlayWiring {

	@Override
	public void sendInfo() {
		System.out.println("发信息");
	}

	@Override
	public void call() {
		System.out.println("打电话");
	}

	@Override
	public void info() {
		System.out.println("信息");
	}

	@Override
	public void play() {
		System.out.println("播放音频");

	}

	public static void main(String[] args) {
		CommonHandset b = new CommonHandset();
		b.sendInfo();
		b.call();
		b.info();
		b.play();
	}

}
