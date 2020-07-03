package pk23;

import java.util.StringTokenizer;

public class StTokenizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Have a Nice DAy";

		StringTokenizer obj = new StringTokenizer(str, " ", false);
		// StringTokenizer(자르고 싶은 문자열, 자르는 기준문자의 집함, 자르는 기준을 넣을지 말지)

		// StringTokenizer.hasMoreTokens()-Token이 저장되어 있는 배열
		while (obj.hasMoreTokens()) {
			String t = obj.nextToken();
			System.out.println(t);
		}
	}
}
