package DataStructure;

import java.util.ArrayList;

public class StackTest {
	private ArrayList<String> arrayStack=new ArrayList<String>();
	public StackTest() {
	}
	public void push(String data) {
		arrayStack.add(data);
	}
	public String pop() {
		int len =arrayStack.size();
		if (len==0) {
			System.out.println("������ ������ϴ�.");
			return null;
		}
		return (arrayStack.remove(len-1));
	}
}
