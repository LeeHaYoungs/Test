package pk23;

import java.util.StringTokenizer;

public class StTokenizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Have a Nice DAy";

		StringTokenizer obj = new StringTokenizer(str, " ", false);
		// StringTokenizer(�ڸ��� ���� ���ڿ�, �ڸ��� ���ع����� ����, �ڸ��� ������ ������ ����)

		// StringTokenizer.hasMoreTokens()-Token�� ����Ǿ� �ִ� �迭
		while (obj.hasMoreTokens()) {
			String t = obj.nextToken();
			System.out.println(t);
		}
	}
}
