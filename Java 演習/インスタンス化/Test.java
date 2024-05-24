
public class Test {
	public static void main(String[] args) {
	Person taro = new Person();
		taro.name = "山田太郎";
		taro.age = 20;
		taro.phoneNumber = "090-0000-0001";
		taro.address = "東京";
	
	Person jiro = new Person();
		jiro.name = "木村次郎";
		jiro.age = 18;
		jiro.phoneNumber = "090-0000-0002";
		jiro.address = "茨城";
	
	Person hanako = new Person();
		hanako.name = "鈴木花子";
		hanako.age = 16;
		hanako.phoneNumber = "090-0000-0003";
		hanako.address = "群馬";
	
	Person me = new Person();
		me.name = "境庄太郎";
		me.age = 29;
		me.phoneNumber = "090-0000-00004";
		me.address = "愛知";
	
	Robot aibo = new Robot();
		aibo.name = "aibo";
		
	Robot asimo = new Robot();
		asimo.name = "asimo";
		
	Robot pepper = new Robot();
		pepper.name = "pepper";
		
	System.out.println(taro.name);
	System.out.println(taro.age);
	System.out.println(taro.phoneNumber);
	System.out.println(taro.address);
	taro.talk();
	taro.walk();
	taro.run();
	
	System.out.println(jiro.name);
	System.out.println(jiro.age);
	System.out.println(jiro.phoneNumber);
	System.out.println(jiro.address);
	jiro.talk();
	jiro.walk();
	jiro.run();
	
	System.out.println(hanako.name);
	System.out.println(hanako.age);
	System.out.println(hanako.phoneNumber);
	System.out.println(hanako.address);
	hanako.talk();
	hanako.walk();
	hanako.run();
	
	System.out.println(me.name);
	System.out.println(me.age);
	System.out.println(me.phoneNumber);
	System.out.println(me.address);
	me.talk();
	me.walk();
	me.run();
	
	System.out.println(aibo.name);
	aibo.talk();
	aibo.walk();
	aibo.run();
	
	System.out.println(asimo.name);
	asimo.talk();
	asimo.walk();
	asimo.run();
	
	System.out.println(pepper.name);
	pepper.talk();
	pepper.walk();
	pepper.run();
	
	}
}
