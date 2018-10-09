package youxi;

public class Level {
	private int levelNo;// ������ĺ�
	private int strLength;// ������һ������ַ����ĳ���
	private int strTimes;// ����������ַ����Ĵ���
	private int timeLimit;// �����𴳹ص�ʱ������
	private int perScore;// ��������ȷ����һ�ε÷�

	public int getLevelNo() {
		return levelNo;
	}

	public void setLevelNo(int levelNo) {
		this.levelNo = levelNo;
	}

	public int getStrLength() {
		return strLength;
	}

	public void setStrLength(int strLength) {
		this.strLength = strLength;
	}

	public int getStrTimes() {
		return strTimes;
	}

	public void setStrTimes(int strTimes) {
		this.strTimes = strTimes;
	}

	public int getTimeLimit() {
		return timeLimit;
	}

	public void setTimeLimit(int timeLimit) {
		this.timeLimit = timeLimit;
	}

	public int getPerScore() {
		return perScore;
	}

	public void setPerScore(int perScore) {
		this.perScore = perScore;
	}

	public Level(int levelNo, int strLength, int strTimes, int timeLimit,
			int perScore) {
		super();
		this.levelNo = levelNo;
		this.strLength = strLength;
		this.strTimes = strTimes;
		this.timeLimit = timeLimit;
		this.perScore = perScore;
	}

	public Level() {
		super();
	}

}
