package xml;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

public class XMLParse {
	//加载xml文档
	Document document;
	//加载文档
	public void loadXml() {
		//创建SAXReader
		SAXReader reader = new SAXReader();
		//读取xml文件获得文档对象
		try {
			//获取根元素（PhoneInfo）
			document = reader.read(new File("src/xml/收藏信息.xml"));
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//解析获得xml内容
	public void readXml() {
		//获取根元素（PhoneInfo）
		Element element = document.getRootElement();
		//获得其子元素的集合（bards）
		List<Element> bards = element.elements();
		//遍历集合品牌
		for (Element bard : bards) {
			//获得品牌的（name）的属性
			String bardname = bard.attributeValue("name");
			//打印输出
			System.out.println("bard=" + bardname);
			//获得该品牌下的（types）的子元素
			List<Element> types = bard.elements();
			//遍历types的集合
			for (Element type : types) {
				//获取type下的name属性
				String typename = type.attributeValue("name");
				System.out.println("type=" + typename);
			}
			System.out.println("**********************************");
		}
	}
	//新增xml的节点（元素）
	public void add() {
		//获得根元素
		Element element = document.getRootElement();
		//添加（name）为小米的品牌
		Element newBardElement = element.addElement("Brad");
		//设置新的节点为name的属性
		newBardElement.addAttribute("name", "小米");
		//newBardElement下面在新加type的元素
		Element newTypeElement = newBardElement.addElement("Type");
		//设置type下的新节点为name的属性
		newTypeElement.addAttribute("name", "小米Note4");
		//newBardElement下在新加type的属性元素
		Element newTypeElement2 = newBardElement.addElement("Type");
		//设置新的节点为name的属性
		newTypeElement2.addAttribute("name", "小米Note5");

	}
	// 修改文档
	public void update() {
		//把type为Iphone6修改为Iphone10
		//先要查找到Iphone6的位置，在来修改
		//获得根元素
		Element element = document.getRootElement();
		//获得所有品牌元素的集合
		List<Element> bards = element.elements("Brand");
		//设置标识
		aa:
		//遍历获得类型	
		 for (Element barnd : bards) {
			 //获得品牌下的类型的集合
			List<Element> type1 = barnd.elements("Type");
			//遍历类型
			for (Element types : type1) {
				//获得类型为name 的属性值
				String newTypeElement = types.attributeValue("name");
				//判断Iphone6出现的位置把Iphone10替换为Iphone6
				if (newTypeElement.equals("Iphone6")) {
					types.attribute("name").setValue("Iphone10");
					break aa;
				}

			}
		}

	}
	//删除文档
	//删除Iphone6的类型
	//要查找到Iphone6的位置做删除处理
	public void del() {
		//获得根元素
		Element element = document.getRootElement();
		//获得所有品牌元素的集合
		List<Element> bards = element.elements("Brand");
		//遍历获得类型
		for (Element barnd : bards) {
			//获得品牌下的类型的集合
			List<Element> type1 = barnd.elements("Type");
			//遍历获得类型
			for (Element types : type1) {
				//获得类型为name的属性值
				String newTypeElement = types.attributeValue("name");
				//判断Iphone6出现的位置做删除处理
				if (newTypeElement.equals("Iphone7")) {
					types.getParent().remove(types);
					break;
				}
			}
		}
	}
	// 保存文档绣花该后的文档内容
	public void saveXML() {
		XMLWriter xmlWriter = null;
		//对XML文件进行格式控制
		OutputFormat format = OutputFormat.createPrettyPrint();
		format.setEncoding("GBK");
		//设置文档声明下面的不需要换行
		format.setNewLineAfterDeclaration(false);
		try {
			FileWriter fw = new FileWriter("src/xml/收藏信息2.xml");
			xmlWriter = new XMLWriter(fw, format);
			//写入文件
			xmlWriter.write(document);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				xmlWriter.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	//测试
	public static void main(String[] args) {
		//创建对象
		XMLParse xml = new XMLParse();
		//加载XML文档
		xml.loadXml();
		//新增文件
		xml.add();
		//修改元素
		//xml.update();
		//删除元素
		//xml.del();
		//解析获得XML的内容
		xml.readXml();
		//保存修改过的XML文件
		xml.saveXML();
	}

}
