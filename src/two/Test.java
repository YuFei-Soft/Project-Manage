package two;

public class Test {

	public static void main(String[] args) {
		// ����Ч�ʵķ�ʽ���2����8���ڼ���
		// System.out.println(2<<3);
		// ����������������ֵ���л�����(����Ҫ��������������
		// int a=3,b=5;
		// System.out.println("a="+b+",b="+a);
		/*
		 * ����ʱ��ʹ�õ�����������ʽ����Ϊ�Ķ���ǿ�� int c; c=a; a=b; b=c;
		 */

		// ���ַ�ʽ��Ҫ�ã����������������ֵ���󣬻ᳬ��int��Χ����ǿ��ת�������ݱ仯��
		/*
		 * a=a+b;//a=3 + 5;a=8; b=a-b;//3+5-5=3;b=3; a=a-b;//3+5-3=5;a=5;
		 */
		/*
		 * ���Ե�ʱ���á� a=a^b;//a=3^5; b=a^b;//b=(3^5)^5;b=3; a=a^b;//a=(3^5)^3;a=5;
		 */

		// ��ȡ���������нϴ������
		// int a,b;
		// int max=a>b?a:b;

		// ��ȡ���������нϴ������
		// int q,w,e;
		// int temp =q>w?q:w;
		// int max2 =temp>e?temp:e;

		int x = 3, y = 4, z;
		z = (x > y) ? x : y;
		System.out.println("z=" + z);

	}

}
