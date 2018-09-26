package first;

public class Demo {
	public static void main(String[] args) {
		// int x=3;
		// x=x+5;
		// byte b=3;
		// b=(byte)(b+200);//强制类型转换
		// System.out.println((char)'a'+1);
		// System.out.println('他'+0);
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
		// 算术运算符。+ — * / % (取余，模运算）+（连接符
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
		 * 比较运算符，运算结果必须是true或者false
		 */
		// System.out.println(3>2);//true
		// System.out.println(3==2);//false
		// 2<x<5 x>2 x<5
		/*
		 * 逻辑运算符：用于连接 两个boolean类型的表达式。 &:与 |：或
		 * 
		 * &（与）:符号的运算特点： true & true =true; true & false =false; false & true =
		 * false; false & false =false; &:运算规律：&运算的两边只有一个是false，结果肯定是false。
		 * 只有两边都是true，结果才是tree。
		 * 
		 * |(或：）运算特点： true | true = true; true | false=true; false | true =true;
		 * false | false= false； |:运算规律： |运算的两边只要有一个是true，结果肯定是true；
		 * 只有两边都是false。结果才是false。。
		 * 
		 * ^:异或：和或有点不一样。 ^:运算特点。 true ^ true = false; true ^ false=true; false ^
		 * true =true; false ^ false= false； ^：亦或的运算规律： ^符号的两边结果如果相同，结果是false;
		 * 两边的结果不同，结果是true；
		 * 
		 * !：非运算：判断事物的另一面。 !true = false; !false = true; !!true = true;
		 * 
		 * &:与 |：或
		 * 
		 * &（与）:符号的运算特点： true & true =true; true & false =false; false & true =
		 * false; false & false =false; &:运算规律：&运算的两边只有一个是false，结果肯定是false。
		 * 只有两边都是true，结果才是tree。
		 * 
		 * |(或：）运算特点： true | true = true; true | false=true; false | true =true;
		 * false | false= false； |:运算规律： |运算的两边只要有一个是true，结果肯定是true；
		 * 只有两边都是false。结果才是false。。
		 * 
		 * 面试题： &&:和&运算的结果相同是一样的。但是运算过程有点小区别。 &：无论左边的运算结果是什么，右边都参与运算。
		 * &&：当左边为false时，右边不参与运算的。
		 * 
		 * 
		 * ||：和|运算的结果相同是一样的。但是运算过程有点小区别。 |：无论左边的运算结果是什么，右边都参与运算。
		 * ||：当左边为true时，右边不参与运算的。
		 */

		// System.out.println(3<<2);//3左移两位。
		// 左移几位其实就是该数据乘以2的几次幂。
		// <<:可以完成2的次幂运算。

		// System.out.println(3>>2);//3右移两位。
		// 右移几位其实就是该数据除以2的几次幂。
		// >>:对于高位出现的空位，原来高位是什么就用什么补这个空位。

		// >>>:无符号右移：数据进行右移时，高位出现的空位，无论原高位是什么，空位都用0补位。

		// 获取两个整数中较大的整数
		// int a,b;
		// int max=a>b?a:b;

		// 获取三个整数中较大的整数
		// int q,w,e;
		// int temp =q>w?q:w;
		// int max2 =temp>e?temp:e;

		/*
		 * if语句的第一种格式： 1， if(条件表达式） { 执行语句； }
		 */

		// 例子：
		// int x=1;
		// if(x>1)
		// {
		// System.out.println("yes");
		// }
		// System.out.println("over");
		/*
		 * if语句的第二种格式： 2， if(条件表达式） { 执行语句； }
		 */

		// 例子(1):
		// int x=1;
		// if(x>1)
		// {
		// System.out.println("yes");
		// }
		// else
		// {
		// System.out.println("over");
		// }

		// 例子(2):
		// int a=3,b;
		// if(a>1)
		// {
		// b=100;
		// }
		// else
		// {
		// b=200;
		// }

		// 或：
		// b=a>1?100:200; //三元运算符就是if else 语句的简写格式。

		// 简写格式什么时候用？
		// 当if else运算后，有一个具体的结果时，可以简化写成三元运算符。
		// System.out.println("b="+b);
	}
}
