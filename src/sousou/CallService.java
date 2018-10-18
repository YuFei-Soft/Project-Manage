package sousou;

//通话服务的接口
public interface CallService {
	// 打电话
	public int call(int minCount, MobileCard card) throws Exception;

}
