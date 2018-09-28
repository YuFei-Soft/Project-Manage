package inter;

public class AptitudeHandset extends Handset implements Network,
		TheakePictures, PlayWiring {

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
	public void network() {
		System.out.println("连接网络");
	}

	@Override
	public void takePictures() {
		System.out.println("照相");
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
		System.out.println("播放视频");
	}

}
