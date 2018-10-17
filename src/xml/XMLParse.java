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
		
		Element element = document.getRootElement();
		Element newBardElement = element.addElement("Brad");
		newBardElement.addAttribute("name", "小米");
		Element newTypeElement = newBardElement.addElement("Type");
		newTypeElement.addAttribute("name", "小米Note4");
		Element newTypeElement2 = newBardElement.addElement("Type");
		newTypeElement2.addAttribute("name", "小米Note5");

	}
	// 修改文档
	public void update() {
		Element element = document.getRootElement();
		List<Element> bards = element.elements("Brand");
		aa: for (Element barnd : bards) {
			List<Element> type1 = barnd.elements("Type");
			for (Element types : type1) {
				String newTypeElement = types.attributeValue("name");
				if (newTypeElement.equals("Iphone6")) {
					types.attribute("name").setValue("Iphone10");
					break aa;
				}

			}
		}

	}
	//删除文档
	public void del() {
		Element element = document.getRootElement();
		List<Element> bards = element.elements("Brand");
		for (Element barnd : bards) {
			List<Element> type1 = barnd.elements("Type");
			for (Element types : type1) {
				String newTypeElement = types.attributeValue("name");
				if (newTypeElement.equals("Iphone7")) {
					types.getParent().remove(types);
					break;
				}
			}
		}
	}
	// 保存文档
	public void saveXML() {
		XMLWriter xmlWriter = null;
		OutputFormat format = OutputFormat.createPrettyPrint();
		format.setEncoding("GBK");
		try {
			FileWriter fw = new FileWriter("src/xml/收藏信息2.xml");
			xmlWriter = new XMLWriter(fw, format);
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
		XMLParse xml = new XMLParse();
		xml.loadXml();
		xml.add();
		
		//xml.update();
	//	xml.del();
	//	xml.readXml();
		xml.saveXML();
	}

}
