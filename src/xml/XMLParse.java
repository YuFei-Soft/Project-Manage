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
	//����xml�ĵ�
	Document document;
	//�����ĵ�
	public void loadXml() {
		//����SAXReader
		SAXReader reader = new SAXReader();
		//��ȡxml�ļ�����ĵ�����
		try {
			//��ȡ��Ԫ�أ�PhoneInfo��
			document = reader.read(new File("src/xml/�ղ���Ϣ.xml"));
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//�������xml����
	public void readXml() {
		//��ȡ��Ԫ�أ�PhoneInfo��
		Element element = document.getRootElement();
		//�������Ԫ�صļ��ϣ�bards��
		List<Element> bards = element.elements();
		//��������Ʒ��
		for (Element bard : bards) {
			//���Ʒ�Ƶģ�name��������
			String bardname = bard.attributeValue("name");
			//��ӡ���
			System.out.println("bard=" + bardname);
			//��ø�Ʒ���µģ�types������Ԫ��
			List<Element> types = bard.elements();
			//����types�ļ���
			for (Element type : types) {
				//��ȡtype�µ�name����
				String typename = type.attributeValue("name");
				System.out.println("type=" + typename);
			}
			System.out.println("**********************************");
		}
	}
	//����xml�Ľڵ㣨Ԫ�أ�
	public void add() {
		
		Element element = document.getRootElement();
		Element newBardElement = element.addElement("Brad");
		newBardElement.addAttribute("name", "С��");
		Element newTypeElement = newBardElement.addElement("Type");
		newTypeElement.addAttribute("name", "С��Note4");
		Element newTypeElement2 = newBardElement.addElement("Type");
		newTypeElement2.addAttribute("name", "С��Note5");

	}
	// �޸��ĵ�
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
	//ɾ���ĵ�
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
	// �����ĵ�
	public void saveXML() {
		XMLWriter xmlWriter = null;
		OutputFormat format = OutputFormat.createPrettyPrint();
		format.setEncoding("GBK");
		try {
			FileWriter fw = new FileWriter("src/xml/�ղ���Ϣ2.xml");
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
	//����
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
