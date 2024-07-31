package arrayTest;

public class ArrTask {
	public static void main(String[] args) {
//		2차원: 헹 열
//		3차원: 면 행 열
//		4차원: 의 면 행 열
		int[][] arrData = { { 3, 4, 5 }, { 7, 8, 9 } };
		
		
		for (int i = 0; i < arrData.length; i++) {
			for (int j = 0; j < arrData[i].length; j++) {
				System.out.print(arrData[i][j]);
			}
			System.out.println();
		}

//		int length = arrData.length * arrData[0].length;
//		각 값을 순서대로 출력
//	for(int i = 0; i<length; i++) {
//		System.out.println(arrData[i/3][i%3]);
//		
//	}

	}

}
