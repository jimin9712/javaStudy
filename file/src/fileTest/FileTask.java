package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTask {
	public static void main(String[] args) throws IOException {
//		생선 종류를 출력한 뒤
//		입력받은 내용을 모두 출력한다.
//		현재 경로에 fish.txt 이름의 파일로 생성한다.
//		생선은 3마리 출력한다.
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("fish.txt",true));
//		bufferedWriter.write("연어\n");
//		bufferedWriter.write("참치\n");
//		bufferedWriter.write("고등어");
//		bufferedWriter.close();\

		BufferedReader bufferedReader = null;
		String line = null;

		try {
			bufferedReader = new BufferedReader(new FileReader("fish.txt"));

			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
