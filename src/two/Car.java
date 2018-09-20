package two;

public class Car {
			public  String color;
			public String  name;
			public String brandName;
			public double price;
			public  String manuFacturer;
			public  void  showCar(String name,String manuFactuere){
				System.out.println(name);
				System.out.println(manuFactuere);
			}
			public  double getMoney(double price){
				//System.out.println(price*0.8);
				return  price*0.8;
			}
			public  double getMoeny2(String brandName,double price){
				
				if(brandName.equals("±¼³Û")){
					return   price*0.8;
				}else  if(brandName.equals("±¦Âí")){
					return  price*0.7;
				}else{
					return price;	
				}
			}
			public static void main(String[] args) {
				Car  ab=new Car();
				double price1=0;
				double price2=0;
				ab.showCar("°ÂµÏ", "°ÂµÏ³§¼Ò");
				price1=ab.getMoney(370000);
				System.out.println(price1);
				price2=ab.getMoeny2("±¼³Û", 300000);
				System.out.println(price2);
			}
}
