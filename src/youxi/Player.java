package youxi;

public class Player {
	private int levelNo;// 玩家当前级别
	private int curScore;// 玩家积分
	private long srartTime;// 开始的时间
	private int elapsedTime;// 结束的时间

	public int getLevelNo() {
		return levelNo;
	}

	public void setLevelNo(int levelNo) {
		this.levelNo = levelNo;
	}

	public int getCurScore() {
		return curScore;
	}

	public void setCurScore(int curScore) {
		this.curScore = curScore;
	}

	public long getSrartTime() {
		return srartTime;
	}

	public void setSrartTime(long srartTime) {
		this.srartTime = srartTime;
	}

	public long getElapsedTime() {
		return elapsedTime;
	}

	public void setElapsedTime(int elapsedTime) {
		this.elapsedTime = elapsedTime;
	}

	public Player() {
		super();
	}

	public Player(int levelNo, int curScore,long srartTime,int elapsedTime) {
		super();
		this.levelNo = levelNo;
		this.curScore = curScore;
		this.srartTime = srartTime;
		this.elapsedTime = elapsedTime;
	}

	// 玩家玩游戏的方法
	public void play() {

	}

}
