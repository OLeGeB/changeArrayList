package Main;


public class Main {
	public static void main(String[] args) {
		ArrayList<Object> list = new ArrayList<Object>();
		list.add(10);
		list.add(20);
		
		list.add(new Person(10, "Jack"));
		list.add(new Person(10, "Jack"));
		list.add(new Person(10, "Jack"));
		list.add(new Person(10, "Jack"));
		list.add(new Person(10, "Jack"));
		
		list.add(new Person(10, "Jack"));
		list.add(new Person(10, "Jack"));
		list.add(new Person(10, "Jack"));
		list.add(new Person(10, "Jack"));
		list.add(new Person(10, "Jack"));
		list.add(new Person(10, "Jack"));
		
		
		System.out.print(list.size());
	}
}
