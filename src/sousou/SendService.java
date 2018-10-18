package sousou;

//短信服务的接口
public interface SendService {
	// 发短信
	public int send(int count, MobileCard card);

}
