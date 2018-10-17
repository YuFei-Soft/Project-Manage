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
		//��ø�Ԫ��
		Element element = document.getRootElement();
		//��ӣ�name��ΪС�׵�Ʒ��
		Element newBardElement = element.addElement("Brad");
		//�����µĽڵ�Ϊname������
		newBardElement.addAttribute("name", "С��");
		//newBardElement�������¼�type��Ԫ��
		Element newTypeElement = newBardElement.addElement("Type");
		//����type�µ��½ڵ�Ϊname������
		newTypeElement.addAttribute("name", "С��Note4");
		//newBardElement�����¼�type������Ԫ��
		Element newTypeElement2 = newBardElement.addElement("Type");
		//�����µĽڵ�Ϊname������
		newTypeElement2.addAttribute("name", "С��Note5");

	}
	// �޸��ĵ�
	public void update() {
		//��typeΪIphone6�޸�ΪIphone10
		//��Ҫ���ҵ�Iphone6��λ�ã������޸�
		//��ø�Ԫ��
		Element element = document.getRootElement();
		//�������Ʒ��Ԫ�صļ���
		List<Element> bards = element.elements("Brand");
		//���ñ�ʶ
		aa:
		//�����������	
		 for (Element barnd : bards) {
			 //���Ʒ���µ����͵ļ���
			List<Element> type1 = barnd.elements("Type");
			//��������
			for (Element types : type1) {
				//�������Ϊname ������ֵ
				String newTypeElement = types.attributeValue("name");
				//�ж�Iphone6���ֵ�λ�ð�Iphone10�滻ΪIphone6
				if (newTypeElement.equals("Iphone6")) {
					types.attribute("name").setValue("Iphone10");
					break aa;
				}

			}
		}

	}
	//ɾ���ĵ�
	//ɾ��Iphone6������
	//Ҫ���ҵ�Iphone6��λ����ɾ������
	public void del() {
		//��ø�Ԫ��
		Element element = document.getRootElement();
		//�������Ʒ��Ԫ�صļ���
		List<Element> bards = element.elements("Brand");
		//�����������
		for (Element barnd : bards) {
			//���Ʒ���µ����͵ļ���
			List<Element> type1 = barnd.elements("Type");
			//�����������
			for (Element types : type1) {
				//�������Ϊname������ֵ
				String newTypeElement = types.attributeValue("name");
				//�ж�Iphone6���ֵ�λ����ɾ������
				if (newTypeElement.equals("Iphone7")) {
					types.getParent().remove(types);
					break;
				}
			}
		}
	}
	// �����ĵ��廨�ú���ĵ�����
	public void saveXML() {
		XMLWriter xmlWriter = null;
		//��XML�ļ����и�ʽ����
		OutputFormat format = OutputFormat.createPrettyPrint();
		format.setEncoding("GBK");
		//�����ĵ���������Ĳ���Ҫ����
		format.setNewLineAfterDeclaration(false);
		try {
			FileWriter fw = new FileWriter("src/xml/�ղ���Ϣ2.xml");
			xmlWriter = new XMLWriter(fw, format);
			//д���ļ�
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
		//��������
		XMLParse xml = new XMLParse();
		//����XML�ĵ�
		xml.loadXml();
		//�����ļ�
		xml.add();
		//�޸�Ԫ��
		//xml.update();
		//ɾ��Ԫ��
		//xml.del();
		//�������XML������
		xml.readXml();
		//�����޸Ĺ���XML�ļ�
		xml.saveXML();
	}

}
