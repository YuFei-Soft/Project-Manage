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
				new TalkPackage(), 58, 20);
		MobileCard card2 = new MobileCard("13922222222", "张二", "123",
				new NetPackage(), 68, 20);
		MobileCard card3 = new MobileCard("13933333333", "张三", "123",
				new TalkPackage(), 58, 20);
		MobileCard card4 = new MobileCard("13944444444", "张四", "123",
				new SuperPackage(), 78, 20);
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

	public CardUtil() {
		initScene();
		init();
	}

	// 判断是否存在此卡用户
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

	// 判断卡号是否注册

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

	// 根据套餐的序号返回套餐的对象
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

	// 展示每个套餐的 套餐类型
	public void showPack(ServicePackage pack) {
		if (pack instanceof TalkPackage) {
			System.out
					.print("话痨套餐：通话时长为500分钟/月，短信条数为30条/月，上网流量为0MB/月，资费为58元/月");

		} else if (pack instanceof NetPackage) {
			System.out
					.print("网虫套餐：通话时长为0分钟/月，短信条数为0条/月，上网流量为3*1024MB/月，资费为68元/月");
		} else {
			System.out
					.print("超人套餐：通话时长为200分钟/月，短信条数为50条/月，上网流量为1*1024MB/月，资费为78元/月");
		}

	}

	// 办理退网
	public void delCard(String delCard) {
		if (isExists(delCard)) {
			cards.remove(delCard);
			System.out.println("卡号：" + delCard + "办理退网成功！");
		} else {
			System.out.println("对不起，该卡未注册，不能办理退网！");
		}

	}

	// 显示账单信息
	// 使用嗖嗖

	public void useSoso(String cardNumber) {
		// 获得此卡对象
		MobileCard card = cards.get(cardNumber);
		if (card == null) {
			System.out.println("此号码不存在");
			return;
		}
		// 获得此卡的所属的套餐类型
		ServicePackage pack = card.getSerPackage();

		do {
			// 产生随机数
			Random rand = new Random();
			// 获取一个0-5的随机数
			int randNumber = rand.nextInt(6);
			// 获取该序号所对应的场景
			Scene scene = scenes.get(randNumber);
			int data = 0;
			switch (randNumber) {
			case 0:
			case 1:
				// 打电话
				// 判断该卡的套餐是否可以打电话
				// 判断该卡的套餐是否实现打电话的接口
				if (pack instanceof CallService) {
					CallService callService = (CallService) pack;
					// 调用打电话的接口方法
					// 显示场景信息
					System.out.println(scene.getDescription());
					// 消费之前，获得实际通话的时间
					// 消费发生异常的时候，用来结算发生异常前该次通话的实际
					int realTalkTime = card.getRealtalktime();
					try {
						data = callService.call(scene.getData(), card);
						// 场景消费完毕没有异常
						// 创建消费记录
						ConsumInfo info = new ConsumInfo(cardNumber,
								scene.getType(), data);
						// 添加到消费记录
						addConsumInfo(cardNumber, info);
					} catch (Exception e) {
						e.printStackTrace();
						try {
							Thread.sleep(10);
						} catch (InterruptedException e1) {
							e.printStackTrace();
						}
						// 获得当前的实际通话
						int afterTalkTime = card.getRealtalktime();
						// 获得差值（最后一次通话）
						int lastTalkTime = afterTalkTime - realTalkTime;
						// 如果最后一次进行了通话，添加消费记录
						if (lastTalkTime > 0) {
							// 创建消费记录
							ConsumInfo info = new ConsumInfo(cardNumber,
									scene.getType(), lastTalkTime);
							// 添加到消费记录列表
							addConsumInfo(cardNumber, info);
						}
					}
					break;
					/*
					 * // 执行通话功能 System.out.println(scene.getDescription());
					 * ConsumInfo info = new ConsumInfo(cardNumber,
					 * scene.getType(), data); addConsumInfo(cardNumber, info);
					 */
				} else {
					// 不具有打电话的功能
					continue;
				}

			case 2:
			case 3:
				// 发消息
				// 判断该卡的套餐是否可以发消息
				// 判断该卡的套餐是否实现发消息的接口
				if (pack instanceof SendService) {
					SendService sendService = (SendService) pack;
					// 调用发消息的接口方法
					// 显示场景信息
					System.out.println(scene.getDescription());
					// 消费之前，获得实际的发消息的条数
					// 消费发生异常的时候，用来结算发生异常前该次发消息的次数
					int realSMSCount = card.getRealSMSCount();
					try {
						data = sendService.send(scene.getData(), card);
						// 场景消费完毕没有异常
						// 创建消费记录
						ConsumInfo info = new ConsumInfo(cardNumber,
								scene.getType(), data);
						// 添加到消费记录
						addConsumInfo(cardNumber, info);
					} catch (Exception e) {
						e.printStackTrace();
						try {
							Thread.sleep(10);
						} catch (InterruptedException e1) {
							e.printStackTrace();
						}
						// 获得当前的信息条数
						int afterRealSMSCount = card.getRealSMSCount();
						// 获得差值（最后一次发了几条信息）
						int lastSMSCount = afterRealSMSCount - realSMSCount;
						// 如果最后一次进行了发信息，添加消费记录
						if (lastSMSCount > 0) {
							// 创建消费记录
							ConsumInfo info = new ConsumInfo(cardNumber,
									scene.getType(), lastSMSCount);
							// 添加到消费记录列表
							addConsumInfo(cardNumber, info);
						}
					}
					break;
				} else {
					// 不具有发消息的功能
					continue;
				}

			case 4:
			case 5:
				// 上网
				// 判断该卡的套餐是否可以上网
				// 判断该卡的套餐是否实现上网的接口
				if (pack instanceof NetService) {
					NetService netService = (NetService) pack;
					// 调用上网的接口方法
					// 显示 场景
					System.out.println(scene.getData());
					// 消费之前，获得实际的上网的
					// 消费发生异常的时候，用来结算发生异常前该次上网的流量
					int realFlow = card.getRealFlow();
					try {
						data = netService.netPlay(scene.getData(), card);
						// 场景消费完毕没有发生异常
						// 创建消费记录
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
						// 获得当前的流量
						int afterRealFlow = card.getRealFlow();
						// 获得插值（最后一次使用流量）
						int lastRealFlow = afterRealFlow - realFlow;
						// 如果最后一次进行了上网，添加消费记录
						if (lastRealFlow > 0) {
							// 创建消费记录
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

	// 添加消费记录
	public void addConsumInfo(String cardNumber, ConsumInfo info) {
		// 首先会哦的该卡的消费记录集合
		List<ConsumInfo> list = consumInfos.get(cardNumber);
		// 判断list石佛营为空
		if (list == null) {
			// 该卡没有进行过消费
			// 添加第一条消费记录
			list = new ArrayList<ConsumInfo>();
			// 添加
			list.add(info);
			consumInfos.put(cardNumber, list);

			System.out.println("该卡没有消费记录，添加一条");
		} else {
			// 原来就有消费记录
			// 直接添加到list
			list.add(info);
			// consumInfos.put(cardNumber, list);
			System.out.println("已添加一条消费记录");
		}

	}

	// 显示资费信息

	// 改套餐
	public void changePack(String cardNumber, String pacckNum) {
		MobileCard card;// 指定手机卡
		ServicePackage pack;// 更换套餐
		if (isExists(cardNumber)) {
			card = cards.get(cardNumber);
			// 获取要更换的套餐对象
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
				// 该卡余额中减去当月套餐资费
				if (card.getMoney() >= pack.getPrice()) {
					card.setMoney(card.getMoney() - pack.getPrice());
					// 换套餐
					card.setSerPackage(pack);
					// 当月实际使用数据清零
					card.setRealtalktime(0);
					card.setRealFlow(0);
					card.setRealSMSCount(0);
					// 当月消费金额设置为新套餐月资费
					card.setConsumAmount(pack.getPrice());
					System.out.println("更换套餐成功！");
					pack.showInfo();
				} else {
					System.out.println("对不起，您的余额不足支付新的套餐本月资费，请充值后在办理更换业务！");
					return;
				}
			} else {
				System.out.println("对不起，您已经是该套餐用户，无需更改！");
			}
		} else {
			System.out.println("对不起，该卡未注册，不能更换！");

		}

	}

	// 打印消费记录
	public void printConsumInfos(String cardNumber) {
		// 判断号码是否存在
		if (!isExists(cardNumber)) {
			System.out.println("此号码不存在");
		} else {
			// 获得该号码的消费记录集合
			List<ConsumInfo> list = consumInfos.get(cardNumber);
			// 判断是否有消费记录
			if (list == null) {
				System.out.println("此卡还没有消费记录");
			} else {
				// 输出到文件
				FileWriter fw = null;
				try {
					fw = new FileWriter(
							"E:/eclipse/workspace/Project-Manage/src/sousou/"
									+ cardNumber + ".txt");
					fw.write("********" + cardNumber + "消费记录********\r\n");
					fw.write("序号\t类型\t数据\t（通话（分钟））/短信（条）/上网（MB）\r\n");
					// 循环写入消费记录
					for (int i = 0; i < list.size(); i++) {
						ConsumInfo consumInfo = list.get(i);
						fw.write(i + 1 + "\t" + consumInfo.getType() + "\t"
								+ consumInfo.getConsumData() + "\r\n");
					}
					System.out.println("消费记录打印完成");
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

	// 为指定 的手机卡充值
	public void chargeMoney(String cardNumber, double money) {
		MobileCard card;// 指定手机卡
		boolean falg = false;
		Scanner input = new Scanner(System.in);
		if (money < 50) {
			System.out.println("对不起，最低充值金额为50元！");
			return;

		} else {
			card = cards.get(cardNumber);
			// double oldmoney=card.getMoney();
			card.setMoney(card.getMoney() + money);
			System.out.println("充值成功！当前余额为" + card.getMoney());
		}

	}

	// 套餐资费说明
	public void showDescription() {
		FileReader rb = null;
		try {
			rb = new FileReader("d:\\myClass\\资费说明.txt");
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
