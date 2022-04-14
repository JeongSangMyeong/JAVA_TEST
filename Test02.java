package test;

public class Test02 {
	public static void main(String[] args) {
		int[] rrNum = { 1, 9, 1, 2, 1, 7, 1, 2, 3, 4, 5, 6, 7 };
		if (rrNum[6] == 1) {
			System.out.println("1900년도에 출생하였고, 남자입니다.");
		} else if (rrNum[6] == 2) {
			System.out.println("1900년도에 출생하였고, 여자입니다.");
		} else {
			System.out.println("잘못된 성별입니다.");
		}
		if (rrNum[6] == 3) {
			System.out.println("2000년도에 출생하였고, 남자입니다.");
		} else if (rrNum[6] == 4) {
			System.out.println("2000년도에 출생하였고, 여자입니다.");
		} else {
			System.out.println("잘못된 성별입니다.");
		}
	}
}
