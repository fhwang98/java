package com.test.question;

import java.io.File;
import java.util.Scanner;

public class Q112 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("파일 이동을 실행합니다.");
		
		File src = new File("C:\\class\\code\\java\\file\\AAA\\test.txt");
		
		File dest = new File("C:\\class\\code\\java\\file\\BBB\\test.txt");
		
		if (!src.exists()) {
			return;
		}
		if (src.renameTo(dest)) {
			return;
		}
		System.out.print("같은 이름을 가지는 파일이 이미 존재합니다. 덮어쓸까요?(y/n)");
		String overwrite = scan.nextLine();
		if (overwrite.equals("y")) {
			dest.delete();
			src.renameTo(dest);
			System.out.println("y. 파일을 덮어썼습니다.");
		} else if (overwrite.equals("n")) {
			System.out.println("n. 작업을 취소합니다.");
		} else {
			System.out.println("잘못된 입력입니다.");
		}
		
		
	}

}
