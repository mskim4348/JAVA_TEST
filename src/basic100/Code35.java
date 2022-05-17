package basic100;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

//1090 : [기초-종합] 수 나열하기2 
public class Code35 {
	public static void main(String[] args) {
		try {
//			StringTokenizer st = new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
			BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
			String[] data =buff.readLine().split(" ");
//			BigInteger a=new BigInteger(data[0]);
//			BigInteger b=new BigInteger(data[1]);
			int a=Integer.parseInt(data[0]);
			int b=Integer.parseInt(data[1]);
			int c=Integer.parseInt(data[2])-1;
			
			
			System.out.printf("%1.0f", a*(Math.pow(b, c)));
			
			for(int i=1;i<Integer.parseInt(data[2]);i++) {
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
