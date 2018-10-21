package sousou;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
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
				new TalkPackage(), 58, 20);
		MobileCard card2 = new MobileCard("13922222222", "�Ŷ�", "123",
				new NetPackage(), 68, 20);
		MobileCard card3 = new MobileCard("13933333333", "����", "123",
				new TalkPackage(), 58, 20);
		MobileCard card4 = new MobileCard("13944444444", "����", "123",
				new SuperPackage(), 78, 20);
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

	public CardUtil() {
		initScene();
		init();
	}

	// �ж��Ƿ���ڴ˿��û�
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

	// �жϿ����Ƿ�ע��

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
	public String[] getNewNumbers(int count) {
		String[] numbers = new String[count];
		for (int i = 0; i < count; i++) {
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

	// �����ײ͵���ŷ����ײ͵Ķ���
	public ServicePackage createPack(int pavkId) {
		ServicePackage pack = null;
		switch (pavkId) {
		case 1:
			pack = new TalkPackage();
			break;
		case 2:
			pack = new NetPackage();
			break;
		case 3:
			pack = new SuperPackage();
			break;
		}
		return pack;
	}

	// չʾÿ���ײ͵� �ײ�����
	public void showPack(ServicePackage pack) {
		if (pack instanceof TalkPackage) {
			System.out
					.print("�����ײͣ�ͨ��ʱ��Ϊ500����/�£���������Ϊ30��/�£���������Ϊ0MB/�£��ʷ�Ϊ58Ԫ/��");

		} else if (pack instanceof NetPackage) {
			System.out
					.print("�����ײͣ�ͨ��ʱ��Ϊ0����/�£���������Ϊ0��/�£���������Ϊ3*1024MB/�£��ʷ�Ϊ68Ԫ/��");
		} else {
			System.out
					.print("�����ײͣ�ͨ��ʱ��Ϊ200����/�£���������Ϊ50��/�£���������Ϊ1*1024MB/�£��ʷ�Ϊ78Ԫ/��");
		}

	}

	// ��������
	public void delCard(String delCard) {
		if (isExists(delCard)) {
			cards.remove(delCard);
			System.out.println("���ţ�" + delCard + "���������ɹ���");
		} else {
			System.out.println("�Բ��𣬸ÿ�δע�ᣬ���ܰ���������");
		}

	}

	// ��ʾ�˵���Ϣ
	// ʹ����

	public void useSoso(String cardNumber) {
		// ��ô˿�����
		MobileCard card = cards.get(cardNumber);
		if (card == null) {
			System.out.println("�˺��벻����");
			return;
		}
		// ��ô˿����������ײ�����
		ServicePackage pack = card.getSerPackage();

		do {
			// ���������
			Random rand = new Random();
			// ��ȡһ��0-5�������
			int randNumber = rand.nextInt(6);
			// ��ȡ���������Ӧ�ĳ���
			Scene scene = scenes.get(randNumber);
			int data = 0;
			switch (randNumber) {
			case 0:
			case 1:
				// ��绰
				// �жϸÿ����ײ��Ƿ���Դ�绰
				// �жϸÿ����ײ��Ƿ�ʵ�ִ�绰�Ľӿ�
				if (pack instanceof CallService) {
					CallService callService = (CallService) pack;
					// ���ô�绰�Ľӿڷ���
					// ��ʾ������Ϣ
					System.out.println(scene.getDescription());
					// ����֮ǰ�����ʵ��ͨ����ʱ��
					// ���ѷ����쳣��ʱ���������㷢���쳣ǰ�ô�ͨ����ʵ��
					int realTalkTime = card.getRealtalktime();
					try {
						data = callService.call(scene.getData(), card);
						// �����������û���쳣
						// �������Ѽ�¼
						ConsumInfo info = new ConsumInfo(cardNumber,
								scene.getType(), data);
						// ��ӵ����Ѽ�¼
						addConsumInfo(cardNumber, info);
					} catch (Exception e) {
						e.printStackTrace();
						try {
							Thread.sleep(10);
						} catch (InterruptedException e1) {
							e.printStackTrace();
						}
						// ��õ�ǰ��ʵ��ͨ��
						int afterTalkTime = card.getRealtalktime();
						// ��ò�ֵ�����һ��ͨ����
						int lastTalkTime = afterTalkTime - realTalkTime;
						// ������һ�ν�����ͨ����������Ѽ�¼
						if (lastTalkTime > 0) {
							// �������Ѽ�¼
							ConsumInfo info = new ConsumInfo(cardNumber,
									scene.getType(), lastTalkTime);
							// ��ӵ����Ѽ�¼�б�
							addConsumInfo(cardNumber, info);
						}
					}
					break;
					/*
					 * // ִ��ͨ������ System.out.println(scene.getDescription());
					 * ConsumInfo info = new ConsumInfo(cardNumber,
					 * scene.getType(), data); addConsumInfo(cardNumber, info);
					 */
				} else {
					// �����д�绰�Ĺ���
					continue;
				}

			case 2:
			case 3:
				// ����Ϣ
				// �жϸÿ����ײ��Ƿ���Է���Ϣ
				// �жϸÿ����ײ��Ƿ�ʵ�ַ���Ϣ�Ľӿ�
				if (pack instanceof SendService) {
					SendService sendService = (SendService) pack;
					// ���÷���Ϣ�Ľӿڷ���
					// ��ʾ������Ϣ
					System.out.println(scene.getDescription());
					// ����֮ǰ�����ʵ�ʵķ���Ϣ������
					// ���ѷ����쳣��ʱ���������㷢���쳣ǰ�ôη���Ϣ�Ĵ���
					int realSMSCount = card.getRealSMSCount();
					try {
						data = sendService.send(scene.getData(), card);
						// �����������û���쳣
						// �������Ѽ�¼
						ConsumInfo info = new ConsumInfo(cardNumber,
								scene.getType(), data);
						// ��ӵ����Ѽ�¼
						addConsumInfo(cardNumber, info);
					} catch (Exception e) {
						e.printStackTrace();
						try {
							Thread.sleep(10);
						} catch (InterruptedException e1) {
							e.printStackTrace();
						}
						// ��õ�ǰ����Ϣ����
						int afterRealSMSCount = card.getRealSMSCount();
						// ��ò�ֵ�����һ�η��˼�����Ϣ��
						int lastSMSCount = afterRealSMSCount - realSMSCount;
						// ������һ�ν����˷���Ϣ��������Ѽ�¼
						if (lastSMSCount > 0) {
							// �������Ѽ�¼
							ConsumInfo info = new ConsumInfo(cardNumber,
									scene.getType(), lastSMSCount);
							// ��ӵ����Ѽ�¼�б�
							addConsumInfo(cardNumber, info);
						}
					}
					break;
				} else {
					// �����з���Ϣ�Ĺ���
					continue;
				}

			case 4:
			case 5:
				// ����
				// �жϸÿ����ײ��Ƿ��������
				// �жϸÿ����ײ��Ƿ�ʵ�������Ľӿ�
				if (pack instanceof NetService) {
					NetService netService = (NetService) pack;
					// ���������Ľӿڷ���
					// ��ʾ ����
					System.out.println(scene.getData());
					// ����֮ǰ�����ʵ�ʵ�������
					// ���ѷ����쳣��ʱ���������㷢���쳣ǰ�ô�����������
					int realFlow = card.getRealFlow();
					try {
						data = netService.netPlay(scene.getData(), card);
						// �����������û�з����쳣
						// �������Ѽ�¼
						ConsumInfo info = new ConsumInfo(cardNumber,
								scene.getType(), data);
						addConsumInfo(cardNumber, info);

					} catch (Exception e) {
						e.printStackTrace();
						try {
							Thread.sleep(10);
						} catch (InterruptedException e1) {
							e.printStackTrace();
						}
						// ��õ�ǰ������
						int afterRealFlow = card.getRealFlow();
						// ��ò�ֵ�����һ��ʹ��������
						int lastRealFlow = afterRealFlow - realFlow;
						// ������һ�ν�����������������Ѽ�¼
						if (lastRealFlow > 0) {
							// �������Ѽ�¼
							ConsumInfo info = new ConsumInfo(cardNumber,
									scene.getType(), lastRealFlow);
							addConsumInfo(cardNumber, info);
						}
					}
					break;
				} else {
					continue;
				}
			}
			break;
		} while (true);

	}

	// ������Ѽ�¼
	public void addConsumInfo(String cardNumber, ConsumInfo info) {
		// ���Ȼ�Ŷ�ĸÿ������Ѽ�¼����
		List<ConsumInfo> list = consumInfos.get(cardNumber);
		// �ж�listʯ��ӪΪ��
		if (list == null) {
			// �ÿ�û�н��й�����
			// ��ӵ�һ�����Ѽ�¼
			list = new ArrayList<ConsumInfo>();
			// ���
			list.add(info);
			consumInfos.put(cardNumber, list);

			System.out.println("�ÿ�û�����Ѽ�¼�����һ��");
		} else {
			// ԭ���������Ѽ�¼
			// ֱ����ӵ�list
			list.add(info);
			// consumInfos.put(cardNumber, list);
			System.out.println("�����һ�����Ѽ�¼");
		}

	}

	// ��ʾ�ʷ���Ϣ

	// ���ײ�
	public void changePack(String cardNumber, String pacckNum) {
		MobileCard card;// ָ���ֻ���
		ServicePackage pack;// �����ײ�
		if (isExists(cardNumber)) {
			card = cards.get(cardNumber);
			// ��ȡҪ�������ײͶ���
			switch (pacckNum) {
			case "1":
				pack = new TalkPackage();
				break;
			case "2":
				pack = new NetPackage();
				break;
			default:
				pack = new SuperPackage();
				break;
			}
			if (!(card.getSerPackage().getClass().getName().equals(pack
					.getClass().getName()))) {
				// �ÿ�����м�ȥ�����ײ��ʷ�
				if (card.getMoney() >= pack.getPrice()) {
					card.setMoney(card.getMoney() - pack.getPrice());
					// ���ײ�
					card.setSerPackage(pack);
					// ����ʵ��ʹ����������
					card.setRealtalktime(0);
					card.setRealFlow(0);
					card.setRealSMSCount(0);
					// �������ѽ������Ϊ���ײ����ʷ�
					card.setConsumAmount(pack.getPrice());
					System.out.println("�����ײͳɹ���");
					pack.showInfo();
				} else {
					System.out.println("�Բ�����������֧���µ��ײͱ����ʷѣ����ֵ���ڰ������ҵ��");
					return;
				}
			} else {
				System.out.println("�Բ������Ѿ��Ǹ��ײ��û���������ģ�");
			}
		} else {
			System.out.println("�Բ��𣬸ÿ�δע�ᣬ���ܸ�����");

		}

	}

	// ��ӡ���Ѽ�¼
	public void printConsumInfos(String cardNumber) {
		// �жϺ����Ƿ����
		if (!isExists(cardNumber)) {
			System.out.println("�˺��벻����");
		} else {
			// ��øú�������Ѽ�¼����
			List<ConsumInfo> list = consumInfos.get(cardNumber);
			// �ж��Ƿ������Ѽ�¼
			if (list == null) {
				System.out.println("�˿���û�����Ѽ�¼");
			} else {
				// ������ļ�
				FileWriter fw = null;
				try {
					fw = new FileWriter(
							"E:/eclipse/workspace/Project-Manage/src/sousou/"
									+ cardNumber + ".txt");
					fw.write("********" + cardNumber + "���Ѽ�¼********\r\n");
					fw.write("���\t����\t����\t��ͨ�������ӣ���/���ţ�����/������MB��\r\n");
					// ѭ��д�����Ѽ�¼
					for (int i = 0; i < list.size(); i++) {
						ConsumInfo consumInfo = list.get(i);
						fw.write(i + 1 + "\t" + consumInfo.getType() + "\t"
								+ consumInfo.getConsumData() + "\r\n");
					}
					System.out.println("���Ѽ�¼��ӡ���");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					if (fw != null) {
						try {
							fw.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}
		}

	}

	// Ϊָ�� ���ֻ�����ֵ
	public void chargeMoney(String cardNumber, double money) {
		MobileCard card;// ָ���ֻ���
		boolean falg = false;
		Scanner input = new Scanner(System.in);
		if (money < 50) {
			System.out.println("�Բ�����ͳ�ֵ���Ϊ50Ԫ��");
			return;

		} else {
			card = cards.get(cardNumber);
			// double oldmoney=card.getMoney();
			card.setMoney(card.getMoney() + money);
			System.out.println("��ֵ�ɹ�����ǰ���Ϊ" + card.getMoney());
		}

	}

	// �ײ��ʷ�˵��
	public void showDescription() {
		FileReader rb = null;
		try {
			rb = new FileReader("d:\\myClass\\�ʷ�˵��.txt");
			char[] content = new char[1024];
			int leng = 0;
			StringBuffer sb = new StringBuffer();
			while ((leng = rb.read(content)) != -1) {
				sb.append(content, 0, leng);
			}
			System.out.println(sb);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				rb.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
