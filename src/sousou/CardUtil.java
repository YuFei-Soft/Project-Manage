package sousou;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class CardUtil {
	// �����ֻ������б�
	Map<String, MobileCard> cards = new HashMap<String, MobileCard>();
	// �����ֻ������ѵļ�¼
	Map<String, List<ConsumInfo>> consumInfos = new HashMap<String, List<ConsumInfo>>();
	// �������ͼ���
	List<Scene> scenes = new ArrayList<Scene>();

	// ��ʼ��Card�û�����
	public void init() {
		/*
		 * (String cardNumber, String userName, String passWord, ServicePackage
		 * serPackage, double consumAmount, double money, int realtalktime, int
		 * realSMSCount, int realFlow
		 */
		MobileCard card1 = new MobileCard("13911111111", "��һ", "123",
				new TalkPackage(), 58, 20, 500, 30, 0);
		MobileCard card2 = new MobileCard("13922222222", "�Ŷ�", "123",
				new NetPackage(), 68, 20, 0, 0, 03 * 1024);
		MobileCard card3 = new MobileCard("13933333333", "����", "123",
				new TalkPackage(), 58, 20, 500, 30, 0);
		MobileCard card4 = new MobileCard("13944444444", "����", "123",
				new SuperPackage(), 78, 20, 200, 50, 1024);
		cards.put("13911111111", card1);
		cards.put("13922222222", card2);
		cards.put("13933333333", card3);
		cards.put("13944444444", card4);
	}

	// ������ʼ��
	public void initScene() {
		scenes.add(new Scene("ͨ��", 90, "�ʺ�ͻ���˭֪������Ѳ� ͨ��90����"));
		scenes.add(new Scene("ͨ��", 30, "ѯ����������״�� ����ͨ��30����"));
		scenes.add(new Scene("����", 5, "���뻷������ʵʩ�����ʾ���� ���Ͷ���5��"));
		scenes.add(new Scene("����", 50, "֪ͨ�����ֻ����ţ����Ͷ���50��"));
		scenes.add(new Scene("����", 1 * 1024, "��Ů��΢����Ƶ����   ʹ������1G"));
		scenes.add(new Scene("����", 2 * 1024, "�����ֻ����߿����磬������˯������ ʹ������ 2G"));

	}

	// �ж��ֻ����Ƿ����
	public boolean isExistCard(String number, String passWord) {
		Set<String> numbers = cards.keySet();
		for (String num : numbers) {
			if (num.equals(number)
					&& cards.get(num).getPassWord().equals(passWord)) {
				return true;
			}
		}
		return false;
	}

	// ������ɺ���
	public String createNumber() {
		Random rand = new Random();
		// ��¼�����û����Ƿ���ڴ˿����û����Ǿ�true�����false
		boolean isExist = false;
		String number = "";
		int temp = 0;
		do {
			// ��־λ����Ϊfalse,���ڿ������ѭ��
			isExist = false;
			// ���ɵ��������8λ�ģ�����С��10000000��������������
			temp = rand.nextInt(89999999) + 10000000;
			number = "139" + temp;
			// �����еĿ��Ž��бȽϣ������ظ�
			Set<String> cardNumbers = cards.keySet();
			// Object cardNumbers;
			for (String cardNumber : cardNumbers) {
				if (number.equals(cardNumber)) {
					isExist = true;
					break;
				}

			}

		} while (isExist);
		return number;

	}

	// ����ָ���������¿��б�
	public String[] getNewNumbers() {
		String[] numbers = new String[6];
		for (int i = 0; i < 6; i++) {
			String newNo = null;
			do {

				newNo = createNumber();
			} while (isExists(numbers, newNo));
			numbers[i] = newNo;
		}
		return numbers;

	}

	// ��Ӻ���
	public void addCardNo(MobileCard card) {
		cards.put(card.getCardNumber(), card);

	}

	// �������Ƿ���������
	public boolean isExists(String[] nums, String num) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != null && nums[i].equals(num)) {
				return true;
			}
		}
		return false;
	}

	// �������ַ����
	public boolean isExists(String cardNo) {
		return cards.containsKey(cardNo);
	}

	// ��½����
	public boolean login(String cardNo, String pwd) {
		MobileCard card = cards.get(cardNo);
		if (card != null) {
			if (card.getPassWord().equals(pwd)) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

}
