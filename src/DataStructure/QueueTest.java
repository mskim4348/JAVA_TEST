package DataStructure;

import java.util.ArrayList;

public class QueueTest {
	private ArrayList<String> arrayQueue =new ArrayList<String>();
	public QueueTest() {
	}
	
	public void enQueue(String data) {
		arrayQueue.add(data);
	}
	
	public String deQueue() {
		int len=arrayQueue.size();
		if(len==0) {
			System.out.println("ť�� ������ϴ�.");
			return null;
		}
		return (arrayQueue.remove(0));
	}
	
}
