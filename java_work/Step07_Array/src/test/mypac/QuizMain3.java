package test.mypac;

import java.util.Random;

public class QuizMain3 {
	public static void main(String[] args) {
		/*
		 * 3.우연히 3개가 모두 같게 나왔을 때는 "당첨됐습니다!"를 출력하고 
		 * 하나라도 다르면 "꽝"을 출력하도록 프로그래밍 해 보세요.
		 * 
		 * apple | apple | cherry
		 * 꽝
		 * 
		 * apple | apple | apple
		 * 당첨됐습니다!
		 */
		
		String[] items = {"cherry", "apple", "banana", "melon", "7"};
		Random ran = new Random();
		// 1번
		//정수 3개를 저장할 배열 미리 준비하기
		int[] nums = new int[3];

		for(int i = 0; i < 3; i++) {
			//0~4 사이의 랜덤한 숫자를 하나 얻어내서
			int ranNum = ran.nextInt(5);
			//배열의 인덱스로 활용해서 문자열 출력하기
//			System.out.print(items[ranNum]);
			
			//2번 
			//얻어낸 숫자를 배열의 i번째 방에 저장하기
			nums[i] = ranNum;
			//배열의 인덱스로 활용해서 문자열 출력하기
			System.out.print(items[ranNum]);
			
			if(i<2) {
				System.out.print(" | ");
			}
			
			System.out.println(); // 이렇게 하면 개행기호만 출력
			
			//만일 랜덤한 숫자가 모두 같으면
			if(nums[0] == nums[1] && nums[1] == nums[2] ) {
				System.out.println
				
				("당첨됐습니다!");
			} else {
				System.out.println("꽝");
			}
			
			//이 값으로 배열 만들기 --> 배열은 1번 위치에 미리 준비해야함.
//			String[] selected = {"items[ranNum]", "items[ranNum]", "items[ranNum]"};
//			if("selected[0]" = "selected[1]" = "selected[2]") {
//				System.out.println("당첨됐습니다!");} 
//			else {System.out.println("꽝");};
//			}
//		

	}
	}
}


