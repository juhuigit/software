
import java.util.*;

abstract public class Pizza {
	String name;
	String dough;
	String sauce;
	List<String> toppings = new ArrayList<String>(); // 선형리스트 : 삽입, 삭제 할 일이 많지 않음(<-> Linked List)

	public String getName() {
		return name;
	}

	public void prepare() {
		System.out.println("Preparing " + name);
	}

	public void bake() {
		System.out.println("Baking " + name);
	}

	public void cut() {
		System.out.println("Cutting " + name);
	}

	public void box() {
		System.out.println("Boxing " + name);
	}

	public String toString() {
		// code to display pizza name and ingredients
		StringBuffer display = new StringBuffer(); // 문자열을 저장하기 위한 임시의 버퍼 공간
		display.append("---- " + name + " ----\n");
		display.append(dough + "\n");
		display.append(sauce + "\n");
		for (String topping : toppings) { // 토핑 여러개 찍어주기
			display.append(topping + "\n");
		}
		return display.toString(); // return type: 문자열 // main에서 sout 이 받아서 처리
	}
}

