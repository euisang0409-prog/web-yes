import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class MemberExample {
	public static void main(String[] args) {

		try (
			BufferedReader br = new BufferedReader(new FileReader("members.csv"));
			BufferedWriter bw = new BufferedWriter(new FileWriter("senior_members.txt"));
		) {

			String line;

			while ((line = br.readLine()) != null) {

				String[] parts = line.split(",");
				int age = Integer.parseInt(parts[2]);

				if (age >= 30) {
					bw.write(line);
					bw.newLine();
				}
			}

			System.out.println("저장 완료");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}