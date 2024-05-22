package jp.co.diworks.action;
//十八時間目（クラスとオブジェクト指向）
	
	//クラスとクラスの連動

public class Human {
	
	public static void main(String[] args) {
		
		HumanName abc = new HumanName();
		System.out.println(abc.getName());
		
		HumanAge efg = new HumanAge();
		System.out.println(efg.getAge());
		
		HumanAddress hij = new HumanAddress();
		System.out.println(hij.getAddress());
	}
}
