package first;

public class Demo {
	public static void main(String[] args) {
		// int x=3;
		// x=x+5;
		// byte b=3;
		// b=(byte)(b+200);//ǿ������ת��
		// System.out.println((char)'a'+1);
		// System.out.println('��'+0);
		// byte b=4;
		// b=3+7;
		// byte b1=3;
		// b1=120;
		// byte b2=7;
		// b2=120;
		// x=b1+b2;
		// int x;
		// int x1=Integer.MAX_VALUE;
		// int x2=2;
		// x=x1+x2;
		// System.out.println(x);
		// byte b=4;
		// b =3+7;
		// �����������+ �� * / % (ȡ�࣬ģ���㣩+�����ӷ�
		// int x= 6370;
		// x=x/1000*100
		// System.out.println(3+"2" );
		// System.out.println("5+5="+(5+5));
		// int a=4,b=5;
		// System.out.println("a="+a+",b="+b);
		// int a=3,b;
		// b=a++;
		// System.out.println("a="+a+",b="+b);
		// int i=3;
		// i=i++;
		// System.out.println("i="+i);
		// int a=4;
		// a+=2;//a=a+2
		// a-=2;
		// System.out.println(a);
		// short s=3;
		// s+=4;//s=s+4
		// s =(short)( s+4);
		// System.out.println("s="+s);
		/*
		 * �Ƚ��������������������true����false
		 */
		// System.out.println(3>2);//true
		// System.out.println(3==2);//false
		// 2<x<5 x>2 x<5
		/*
		 * �߼���������������� ����boolean���͵ı��ʽ�� &:�� |����
		 * 
		 * &���룩:���ŵ������ص㣺 true & true =true; true & false =false; false & true =
		 * false; false & false =false; &:������ɣ�&���������ֻ��һ����false������϶���false��
		 * ֻ�����߶���true���������tree��
		 * 
		 * |(�򣺣������ص㣺 true | true = true; true | false=true; false | true =true;
		 * false | false= false�� |:������ɣ� |���������ֻҪ��һ����true������϶���true��
		 * ֻ�����߶���false���������false����
		 * 
		 * ^:��򣺺ͻ��е㲻һ���� ^:�����ص㡣 true ^ true = false; true ^ false=true; false ^
		 * true =true; false ^ false= false�� ^������������ɣ� ^���ŵ����߽�������ͬ�������false;
		 * ���ߵĽ����ͬ�������true��
		 * 
		 * !�������㣺�ж��������һ�档 !true = false; !false = true; !!true = true;
		 * 
		 * &:�� |����
		 * 
		 * &���룩:���ŵ������ص㣺 true & true =true; true & false =false; false & true =
		 * false; false & false =false; &:������ɣ�&���������ֻ��һ����false������϶���false��
		 * ֻ�����߶���true���������tree��
		 * 
		 * |(�򣺣������ص㣺 true | true = true; true | false=true; false | true =true;
		 * false | false= false�� |:������ɣ� |���������ֻҪ��һ����true������϶���true��
		 * ֻ�����߶���false���������false����
		 * 
		 * �����⣺ &&:��&����Ľ����ͬ��һ���ġ�������������е�С���� &��������ߵ���������ʲô���ұ߶��������㡣
		 * &&�������Ϊfalseʱ���ұ߲���������ġ�
		 * 
		 * 
		 * ||����|����Ľ����ͬ��һ���ġ�������������е�С���� |��������ߵ���������ʲô���ұ߶��������㡣
		 * ||�������Ϊtrueʱ���ұ߲���������ġ�
		 */

		// System.out.println(3<<2);//3������λ��
		// ���Ƽ�λ��ʵ���Ǹ����ݳ���2�ļ����ݡ�
		// <<:�������2�Ĵ������㡣

		// System.out.println(3>>2);//3������λ��
		// ���Ƽ�λ��ʵ���Ǹ����ݳ���2�ļ����ݡ�
		// >>:���ڸ�λ���ֵĿ�λ��ԭ����λ��ʲô����ʲô�������λ��

		// >>>:�޷������ƣ����ݽ�������ʱ����λ���ֵĿ�λ������ԭ��λ��ʲô����λ����0��λ��

		// ��ȡ���������нϴ������
		// int a,b;
		// int max=a>b?a:b;

		// ��ȡ���������нϴ������
		// int q,w,e;
		// int temp =q>w?q:w;
		// int max2 =temp>e?temp:e;

		/*
		 * if���ĵ�һ�ָ�ʽ�� 1�� if(�������ʽ�� { ִ����䣻 }
		 */

		// ���ӣ�
		// int x=1;
		// if(x>1)
		// {
		// System.out.println("yes");
		// }
		// System.out.println("over");
		/*
		 * if���ĵڶ��ָ�ʽ�� 2�� if(�������ʽ�� { ִ����䣻 }
		 */

		// ����(1):
		// int x=1;
		// if(x>1)
		// {
		// System.out.println("yes");
		// }
		// else
		// {
		// System.out.println("over");
		// }

		// ����(2):
		// int a=3,b;
		// if(a>1)
		// {
		// b=100;
		// }
		// else
		// {
		// b=200;
		// }

		// ��
		// b=a>1?100:200; //��Ԫ���������if else ���ļ�д��ʽ��

		// ��д��ʽʲôʱ���ã�
		// ��if else�������һ������Ľ��ʱ�����Լ�д����Ԫ�������
		// System.out.println("b="+b);
	}
}
