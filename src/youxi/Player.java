package youxi;

public class Player {
	private int levelNo;// ��ҵ�ǰ����
	private int curScore;// ��һ���
	private long srartTime;// ��ʼ��ʱ��
	private int elapsedTime;// ������ʱ��

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

	// �������Ϸ�ķ���
	public void play() {

	}

}
