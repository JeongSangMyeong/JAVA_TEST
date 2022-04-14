package test;

public class Test01 {
	public static void main(String[] args) {
		int[] rrNum = { 1, 9, 1, 2, 1, 7, 1, 2, 3, 4, 5, 6, 7 };
		int[] mul = { 2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5 };

		int sum = 0;
		for (int i = 0; i < mul.length; i++) {
			sum += rrNum[i] * mul[i];
		}
		System.out.printf("모두 더하기 : %d\n", sum);
		int div = sum % 11;
		System.out.printf("11로 나눈 나머지 : %d\n", div);
		int minus = 11 - div;
		System.out.printf("11에서 빼기 : %d\n", minus);

		if (minus == rrNum[12] && minus < 10) {
			System.out.println("유효한 주민번호 입니다.");
		} else {
			System.out.println("유효하지 않는 주민번호 입니다.");
		}
	}
}
