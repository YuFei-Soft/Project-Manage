package sousou;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class CardUtil {
	// 所以手机卡的列表
	Map<String, MobileCard> cards = new HashMap<String, MobileCard>();
	// 所有手机卡消费的记录
	Map<String, List<ConsumInfo>> consumInfos = new HashMap<String, List<ConsumInfo>>();
	// 场景类型集合
	List<Scene> scenes = new ArrayList<Scene>();

	// 初始化Card用户对象
	public void init() {
		/*
		 * (String cardNumber, String userName, String passWord, ServicePackage
		 * serPackage, double consumAmount, double money, int realtalktime, int
		 * realSMSCount, int realFlow
		 */
		MobileCard card1 = new MobileCard("13911111111", "张一", "123",
				new TalkPackage(), 58, 20, 500, 30, 0);
		MobileCard card2 = new MobileCard("13922222222", "张二", "123",
				new NetPackage(), 68, 20, 0, 0, 03 * 1024);
		MobileCard card3 = new MobileCard("13933333333", "张三", "123",
				new TalkPackage(), 58, 20, 500, 30, 0);
		MobileCard card4 = new MobileCard("13944444444", "张四", "123",
				new SuperPackage(), 78, 20, 200, 50, 1024);
		cards.put("13911111111", card1);
		cards.put("13922222222", card2);
		cards.put("13933333333", card3);
		cards.put("13944444444", card4);
	}

	// 场景初始化
	public void initScene() {
		scenes.add(new Scene("通话", 90, "问候客户，谁知其如此难缠 通话90分钟"));
		scenes.add(new Scene("通话", 30, "询问妈妈身体状况 本地通话30分钟"));
		scenes.add(new Scene("短信", 5, "参与环境保护实施方案问卷调查 发送短信5条"));
		scenes.add(new Scene("短信", 50, "通知朋友手机换号，发送短信50条"));
		scenes.add(new Scene("上网", 1 * 1024, "和女友微信视频聊天   使用流量1G"));
		scenes.add(new Scene("上网", 2 * 1024, "晚上手机在线看韩剧，不留神睡着啦！ 使用流量 2G"));

	}

	// 判断手机号是否存在
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

	// 随机生成号码
	public String createNumber() {
		Random rand = new Random();
		// 记录现有用户中是否存在此卡的用户。是就true。否就false
		boolean isExist = false;
		String number = "";
		int temp = 0;
		do {
			// 标志位重置为false,用于控制外层循环
			isExist = false;
			// 生成的随机数是8位的，不能小于10000000，否则重新生成
			temp = rand.nextInt(89999999) + 10000000;
			number = "139" + temp;
			// 和现有的卡号进行比较，不能重复
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

	// 生成指定个数的新卡列表
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

	// 添加号码
	public void addCardNo(MobileCard card) {
		cards.put(card.getCardNumber(), card);

	}

	// 检测号码是否在数组中
	public boolean isExists(String[] nums, String num) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != null && nums[i].equals(num)) {
				return true;
			}
		}
		return false;
	}

	// 检测号码手否存在
	public boolean isExists(String cardNo) {
		return cards.containsKey(cardNo);
	}

	// 登陆界面
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
