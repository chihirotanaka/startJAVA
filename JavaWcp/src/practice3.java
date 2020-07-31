
public class Human02 {
	public String name;
	public int age;

	public Human02() {
		name = "山田";
		age = 20;
	}
	public Human02(String name, int age) {
		this.name =name;
		this.age = age;
	}
}

public class ClassMethod02 {
	public static void main(String[] args) {
		Human02 yamada =new Human02();
		System.out.println("名前は" + yamada.name + "で、年齢は" + yamada.age + "です。");

		Human02 sato = new Human02("佐藤", 25);
		System.out.println("名前は" + sato.name + "で、年齢は" + sato.age + "です。");
	}
}