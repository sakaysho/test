public class JavaTextPractice {
	
	public static void main(String[] args) {
		
// 三時間目（Javaの出力）
		
	System.out.println("こんにちは！！\r\n");
	System.out.println(123);
	System.out.println("おはよう\r\n");
	System.out.println(0);
	System.out.println("例外が");
	System.out.println("発生しました。\r\n");
	System.out.println("例外が\r\n発生しました。");
	
//四時間目(変数と代入)
	
	//Stringクラスによる代入
	String name1 = "高橋";
	System.out.println("\r\n" + name1);
	
	//文字列の代入
	String str1 = "鈴木";
	System.out.println("\r\n" + str1);
	
	//アルファベットの代入
	String str2= "Tanaka";
	System.out.println("\r\n" + str2);
	
	//数列の代入
	String tel = "090-1234-5678";
	System.out.println("\r\n" + tel);
	
	//charクラスによる代入
	char char1 = 'A';
	System.out.println("\r\n" + char1);
	
	//intクラスによる代入
	int num1 = 12345;
	System.out.println("\r\n" + num1);
	
	//booleanクラスによる代入
	boolean boo = true;
	System.out.println("\r\n" + boo);
	
	//+による文字列の連結
	String abc = "山田";
	System.out.println("\r\n" + abc + "さん");
	
//五時間目（四則演算、剰余）
	
	//四則演算を実行
	int a = 3+3;
	System.out.println("\r\n" + a);
	
	//足し算(intクラス)
	int a1 = 4+3;
	System.out.println("\r\n" + a1);
	
	//引き算(intクラス)
	int a2 = -8-3;
	System.out.println("\r\n" + a2);
	
	//掛け算(varクラス)
	int a3 = -5*3;
	
	System.out.println("\r\n" + a3);
	
	//割り算(varクラス)
	int a4 = 4/2;
	
	System.out.println("\r\n" + a4);
	
	//さまざまな割り算
	//小数点の表示
	float fl1 = 5/2;
	
	System.out.println("\r\n" + fl1);
	
	float fl2 = (float)5/2;
	System.out.println("\r\n" + fl2);

	float fl3 = (float)10/3;
	System.out.println("\r\n" + fl3);
	
	double fl4 = (double)10/3;
	System.out.println("\r\n" + fl4);
	
	//割り算の余りを表示（剰余の表示）
	int p = 7%3;
	
	System.out.println("\r\n" + p);
	
	//様々な剰余
	System.out.println("\r\n" + 5%3);
	
	System.out.println("\r\n" + 6%3);
	
//六時間目（加算子、減算子）
	
	//前置加算子
	int b1 = 10;
	
	System.out.println("\r\n" + ++b1);
	
	//さらに１ずつ加える
	int b2 = 10;
	
	System.out.println("\r\n" + ++b2);
	System.out.println(++b2);
	System.out.println(++b2);
	System.out.println(++b2);
	
	//後置加算子
	int b3 = 5;
	
	System.out.println("\r\n" + b3++);
	
	//さらに１ずつ加える
	int b4 = 5;
	
	System.out.println("\r\n" + b4++);
	System.out.println(b4++);
	System.out.println(b4++);
	System.out.println(b4++);
	
	//前置減算子
	int b5 = 10;
	
	System.out.println("\r\n" + --b5);
	
	//さらに１ずつ減らす
	int b6 = 10;
	
	System.out.println("\r\n" + --b6);
	System.out.println(--b6);
	System.out.println(--b6);
	System.out.println(--b6);
	
	//後置減算子
	int b7 = 10;
	
	System.out.println("\r\n" + b7--);

	//さらに１ずつ減らす
	int b8 = 10;
	
	System.out.println("\r\n" + b8--);
	System.out.println(b8--);
	System.out.println(b8--);
	System.out.println(b8--);
	
//七時間目（if文(判定)の基礎）
	
	//if文
	//～より小さい場合
	int C1 = 10;
	
	if(C1 < 20) {
		System.out.println("\r\n" + C1);
	}
	
	//～以下の場合
	int C2 = 20;
	
	if(C2 <= 30) {
		System.out.println("\r\n" + C2);
	}
	
	//if文の例
	String C3 = "山田";
	
	if(C3.equals("山田")) {
		System.out.println("\r\n" + C3 + "さん");
	}
	
	//～かつ～の場合
	int C4 = 5;
	
	if(C4 < 10 && 3 < C4) {
		System.out.println("\r\n" + "A");
	}	
		
	//～または～の場合
	int C5 = 5;
	
	if(C5 >= 5 || C5 <= 0) {
		System.out.println("\r\n" + "B");
	}
	
	//elseif文
	int C6 = 7;
	
	if(C6 > 8) {
		System.out.println("\r\n" + "A");
	}else if(C6 < 10) {
		System.out.println("\r\n" + "B");	
	}
	
	int C7 = 11;
	
	if(C7 > 8) {
		System.out.println("\r\n" + "A");
	}else if(C7 < 10) {
		System.out.println("\r\n" + "B");	
	}
	
	//else文
	//～である場合～を、～でない場合～を表示
	int C8 = 3;
	
	if(C8 > 5) {
		System.out.println("\r\n" + "A");
	}else{
		System.out.println("\r\n" + "Z");	
	}
	
	//～である場合～を、～でない場合～、
	//さらに～でない場合～を表示
	int C9 = 20;
	
	if(C9 < 8) {
		System.out.println("\r\n" + "A");
	}else if(C9 == 8){
		System.out.println("\r\n" + "B");
	}else {
		System.out.println("\r\n" + "C");
	}
	
	//特定の文字列の表示
	int C10 = 18;
	
	if(C10 >= 20) {
		System.out.println("\r\n" + "成人");
	}else {
		System.out.println("\r\n" + "未成年");
	}
		
	int age = 35;
	
	if(age < 20) {
		System.out.println("\r\n" + "未成年");
	}else if(age > 80){
		System.out.println("\r\n" + "高齢者");
	}else {
		System.out.println("\r\n" + "成人");
	}
		
	//奇数と偶数の使い分け
	int num2 = 5;
	
	if(num2 % 2 ==0) {
		System.out.println("\r\n" + "偶数");
	}else {
		System.out.println("\r\n" + "奇数");
	}
	
//八時間（if文(判定)の応用）
	
	//入れ子(＝ネスト)
	int ns1 = 20;
	
	if(ns1 > 10) {
		if(ns1 < 30) {
			System.out.println("\r\n" + "A");
		}
	}
	
	int ns2 = 7;
	
	if(ns2 > 3) {
		if(ns2 < 10) {
			System.out.println("\r\n" + "A");
		}
	}
	
	int ns3 = 7;
	
	if(ns3 > 10) {
		if(ns3 < 30) {
			System.out.println("\r\n" + "A");
		}
	}
	
	//if文+else(else if)+ネストの組合わせ
	//ABCの表示
	int nst4 = 10;
	
	if(nst4 > 0) {
		if(nst4 == 2) {
			System.out.println("\r\n" + "A");
		}else if(nst4 == 3) {
			System.out.println("\r\n" + "B");
		}else {
			System.out.println("\r\n" + "C");
		}
	}
	
	//文字列の表示
	int AG1 = 36;
	
	if(AG1 <= 100) {
		if(AG1 < 20) {
			System.out.println("\r\n" + "未成年");
		}else if(AG1 == 77) {
			System.out.println("\r\n" + "喜寿");
		}else if(AG1 == 88) {
			System.out.println("\r\n" + "米寿");
		}else {
			System.out.println("\r\n" + "成人");
		}
	}
	
//九時間目（switch文）
	
	//激闘！！　switch文vsif文
	//if文の場合
	int if1 = 1;
	
	if(if1 ==0) {
		System.out.println("\r\n" + "aは0に等しい");
	}else if(if1 ==1) {
		System.out.println("\r\n" + "aは1に等しい");
	}
	
	//switch文の場合
	int sw1 = 1;
	
	switch(sw1){
		case 0:
			System.out.println("\r\n" + "aは0に等しい");
			break;
		case 1:
			System.out.println("\r\n" + "aは1に等しい");
			break;
	}
	
	int sw2 = 5;
	
	switch(sw2){
		case 0:
			System.out.println("\r\n" + "aは0に等しい");
			break;
		case 1:
			System.out.println("\r\n" + "aは1に等しい");
			break;
		default:
			System.out.println("\r\n" + "aは0でも1でもない");
	}
	
	//赤組VS白組
	String st1 = "赤";
	
	switch(st1) {
		case "赤":
			System.out.println("\r\n" + "赤組です");
			break;
		case "白":
			System.out.println("\r\n" + "白組です");
			break;
	}
	
	//VSエラー表示
	String st2 = "青";
		
	switch(st2) {
		case "赤":
			System.out.println("\r\n" + "赤組です");
			break;
		case "白":
			System.out.println("\r\n" + "白組です");
			break;
		default:
			System.out.println("\r\n" + "エラーです");
	}
	
//十時間目（配列の基礎）
	
	//配列の書き方
	
	//書き方１
	//String[] name = new String[3];
	
	//name[0] = "田中";
	//name[1] = "高橋";
	//name[2] = "斎藤";
	
	//書き方２
	//String[] name = {"田中", "高橋", "斎藤"};
	
	//実際に使用する
	
	String[] name2 = new String[3];
	
	name2[0] = "田中";
	name2[1] = "高橋";
	name2[2] = "斎藤";
	
	System.out.println("\r\n" + name2[0]);
	
	String[] name3 = {"田中", "高橋", "斎藤"};
	
	System.out.println("\r\n" + name3[0]);
	
	//char文
	char[] c = {'x', 'y', 'z'};
	
	System.out.println("\r\n" + c[0]);
	
	System.out.println("\r\n" + c[1]);
	
	System.out.println("\r\n" + c[2]);
	
	//int文
	int[] i = {1,5,10};
	
	System.out.println("\r\n" + i[0]);
	
	System.out.println("\r\n" + i[1]);
	
	//データの更新
	String[] name4 = {"田中", "高橋", "斎藤"};
	
	name4[0] = "加藤";
	
	System.out.println("\r\n" + name4[0]);
	
//十一時間目（多次元配列）
	
	//例文１
	String[][] country1 = 
		{
				{"日本", "タイ"},
				{"アメリカ", "ブラジル"},
				{"フランス", "ロシア"}
		};
	
	System.out.println("\r\n" + country1[0][0]);
	
	System.out.println("\r\n" + country1[0][1]);
	
	System.out.println("\r\n" + country1[1][0]);
	
	System.out.println("\r\n" + country1[2][1]);
	
	//例文２
	String[][] country2 = new String[3][2];
	
	country2[0][0] = "日本";
	country2[0][1] = "タイ";
	country2[1][0] = "アメリカ";
	country2[1][1] = "ブラジル";
	country2[2][0] = "フランス";
	country2[2][1] = "ロシア";
	
	System.out.println("\r\n" + country2[0][0]);
	
	System.out.println("\r\n" + country2[1][1]);
	
//十二時間目（for文の基礎）
	
	//例文1
	System.out.println("\r\n");
	for(int f1 = 0; f1 < 3; f1++) {
		System.out.println(f1);
	}

	//例文2
	System.out.println("\r\n");
	for(int f2 = 1; f2 < 10; f2++) {
		System.out.println(f2);
	}
	
	//例文3
	System.out.println("\r\n");
	for(int f3 = 3; f3 <= 10; f3++) {
		System.out.println(f3);
	}
	
	//例文4
	System.out.println("\r\n");
	for(int f4 = 10; f4 > 5; f4--) {
		System.out.println(f4);
	}
	
	//例文5
	System.out.println("\r\n");
	for(int f5 = 10; f5 >= 5; f5--) {
		System.out.println(f5);
	}
	
	//例文6
	System.out.println("\r\n");
	for(int f6 = 1; f6 < 10; f6 += 2) {
		System.out.println(f6);
	}
	
	//例文7
	System.out.println("\r\n");
	for(int f7 = 1; f7 < 10; f7 += 3) {
		System.out.println(f7);
	}
	
	//例文8
	System.out.println("\r\n");
	for(int f8 = 10; f8 > 1; f8 -= 2) {
		System.out.println(f8);
	}
	
	//例文9
	System.out.println("\r\n");
	for(int f9 = 10; f9 > 1; f9 -= 3) {
		System.out.println(f9);
	}
	
	//例文10(★)
	System.out.println("\r\n");
	for(int s = 1; s <= 5; s ++) {
		System.out.println("★");
	}
	
//十三時間目（for文の応用）
	
	//例）ある数（t）が０以上だった場合プラス、
	//０未満だった場合マイナスと表示する
	System.out.println("\r\n");
	int t = 10;
	String q = t >= 0 ? "プラス":"マイナス";
	System.out.println(q);
	
	//例）ある数（u）が偶数か奇数かを判別して表示する
	System.out.println("\r\n");
	int u = 2;
	String v = u % 2 == 0 ? "偶数":"奇数";
	System.out.println(v);
	
	//例）ある数（）が偶数の場合「☆」、奇数の場合「★」を表示する
	//これをある数（）が０以上５以上の間、繰り返す
	System.out.println("\r\n");
	for(int w = 0; w <= 5; w++) {
		String x = w % 2 == 0? "☆":"★";
		System.out.println(x);
	}
	
//十四時間目（while文の基礎）
	
	//例）1～100までの数字を表示し、各数字の後ろに‐(ハイフン)
	//をいれて表示したいとき
	System.out.println("\r\n");
	int while1 = 0;
	while (while1 <= 100) {
		System.out.println(while1 + "-");
		while1++;
	}
	
	//例）
	System.out.println("\r\n");
	int while2 = 1; 
	while (while2 <= 5) {
		System.out.println(while2);
		while2++;
	}
	
	//例）
	System.out.println("\r\n");
	int while3 = 0;
	while(while3 < 10) {
		System.out.println(while3);
		while3++;
	}
	
	//例）
	System.out.println("\r\n");
	int while4 = 5;
	while(while4 < 10) {
		System.out.println(while4);
		while4++;
	}
	
	//例）初期値が5で、1ずつ減る場合
	System.out.println("\r\n");
	int while5 = 5;
	while(while5 > 0){
		System.out.println(while5);
		while5--;
	}
	
	//例）初期値が10で、1ずつ減る場合
	System.out.println("\r\n");
	int while6 = 10;
	while(while6 >= 5) {
		System.out.println(while6);
		while6--;
	}
	
	//例）初期値が1で、2ずつ増える場合
	System.out.println("\r\n");
	int while7 = 1;
	while(while7 <= 10) {
		System.out.println(while7);
		while7+=2;
	}
	
	//例）初期値が1で、3ずつ増える場合
	System.out.println("\r\n");
	int while8 = 1;
	while(while8 <= 10) {
		System.out.println(while8);
		while8+=3;
	}
	
	//例）初期値が10で、2ずつ減る場合
	System.out.println("\r\n");
	int while9 = 10;
	while(while9 >= 1) {
		System.out.println(while9);
		while9-=2;
	}

	//例）初期値が10で、3ずつ減る場合
	System.out.println("\r\n");
	int while10 = 10;
	while(while10 >= 1) {
		System.out.println(while10);
		while10-=3;
	}	
		
//十五時間目（while文の応用）	
	
	//do while文は
	//必ず一度は実行させたい処理が
	//ある場合に使用します。
	
	//例）初期値が1で、ｘ>1の間をループさせる場合
	System.out.println("\r\n");
	int do1 = 1;
	do {
		System.out.println(do1);
		do1--;
	} while(do1 > 1);
		
	//例）初期値が0で、ｘ<10の間を表示させる場合
	System.out.println("\r\n");
	int do2 = 0;
	do {
		System.out.println(do2);
		do2++;
	} while(do2 < 10);	
		
	//例）初期値が5で、ｘ<10の間を表示さえる場合
	System.out.println("\r\n");
	int do3 = 5;
	do {
		System.out.println(do3);
		do3++;
	} while(do3 < 10);	
		
	//例）初期値が5で、１ずつ減るさえる場合
	System.out.println("\r\n");
	int do4 = 5;
	do {
		System.out.println(do4);
		do4--;
	} while(do4 > 0);	
		
	//初期値が1で、２ずつ増える場合
	System.out.println("\r\n");
	int do5 = 1;
	do {
		System.out.println(do5);
		do5 += 2;
	} while(do5 <= 10);
	
	//初期値が10で、3ずつ減る場合
	System.out.println("\r\n");
	int do6 = 10;
	do {
		System.out.println(do6);
		do6 -= 3;
	} while(do6 >= 1);
		System.out.println("\r\n");

//十六時間目(eclipseの使い方とクラスの基礎)（関数）
		
	//関数とは、
	//あらかじめ何らかの処理をまとめておくことで
	//効率よくプログラミングをする手法
		
	//果物の値段を消費税8％でと配送料を加えて計算した場合
	
		System.out.println(totalPrice(300)+"\r\n");
		System.out.println(totalPrice(450)+"\r\n");
		System.out.println(totalPrice(400)+"\r\n");
		System.out.println(totalPrice(350)+"\r\n");
		
	//引数を引かなくていい
		
		System.out.println("山田さん。"+hello()+"\r\n");
		System.out.println("山田さん。"+hello()+"\r\n");
		System.out.println("山田さん。"+hello()+"\r\n");
		System.out.println("山田さん。"+hello()+"\r\n");
			
//十七時間目（参照型の構造とメソッド作成）
		
	//Javaの特徴であるオブジェクト指向を理解するには
	//Stringなどのデータ型を深く理解する必要がある
	
	//いくつかメソッドの事例を見てみる。
		
	//２つの数の合計値①
	
		System.out.println(gokei1(2,3)+"\r\n");
		
	//２つの数の合計値②
		
		System.out.println(gokei2(5,7)+"\r\n");

	//円の面積
		
		System.out.println(circle(5)+"\r\n");
		
	//複数のメソッド
		
		System.out.println(hikizan(10,10)+"\r\n");
		System.out.println(kakezan(10,10)+"\r\n");
		System.out.println(warizan(10,10)+"\r\n");


	
	}	

//--他のメソッド--
	
	//果物の値段を消費税8％でと配送料を加えて計算した場合
	public static int totalPrice(int fruitprice) {
		double tax = 1.08;
		int haiso =350;
		return (int)(fruitprice*tax)+haiso;
		}
	
	//引数を引かなくていい
	public static String hello(){
		return "こんにちは";
	}
	
	//２つの数の合計値①
	public static int gokei1(int number1, int number2) {
			return number1 + number2;
			}
	
	//２つの数の合計値①
	public static int gokei2(int number1, int number2) {
			return number1 + number2;
			}
	
	//円の面積
	public static int circle(int hankei) {
		return (int)(hankei * hankei * 3.14);
		}
	
	//複数のメソッド
	public static int hikizan(int number1, int number2) {
		return (int)(number1 - number2);
		}
	
	public static int kakezan(int number1, int number2) {
		return (int)(number1 * number2);
		}
	
	public static int warizan(int number1, int number2) {
		return (int)(number1 / number2);
		
//十七時間目（調べてみよう）
		
	//main関数にあった「public static」の意味
		
		//クラスプロパティもしくはメソッドを 
		//static として宣言することで、 
		//クラスのインスタンス化の必要なしに
		//アクセスすることができます。 
		//static なプロパティは、
		//インスタンス化されたクラスオブジェクトから 
		//アクセスすることはできません 
		//(static なメソッドにはアクセスできます)。
		
	//アクセス修飾子（public/private/protectedの違い）
		
		//public
			//どこからでもアクセス可能とする修飾子です。
		
		//private
			//クラス内部からのみ、アクセスが可能です。

		//protected
			//同じパッケージ内のクラスや違うパッケージでも、
			//そのクラスを継承したサブクラス内部から
			//アクセスすることを可能とします。

	//例外処理（try catch文）の使い方
		//tryブロック（try節）には「例外発生の可能性がある処理」を記載し、
		//catchブロック（catch節）には「例外発生後の処理（例外処理）」を記載します。
		
	//インポート（import文）の使い方
		//完全修飾名で記述すればクラスを利用することができますが、
		//パッケージ名を含めた名前を毎回入力するのは大変です。
		//そこで import 文を使用します。 
		//import 文を使ってクラスをインポート宣言すると、
		//パッケージ名を省略してクラス名だけでプログラムの中に記述できるようになります。
		//import 宣言は次のように行います。
		
		//import パッケージ名.クラス名
		
	}
}

	
	
