import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxOccur {
	private static int ASCII_SIZE = 256;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int[] count= new int[ASCII_SIZE];
		char maxChar = 0;
		int max = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the string:");
		String input = br.readLine();
		for(int i=0;i<input.length();i++){
			count[input.charAt(i)]++;
			if(count[input.charAt(i)] > max){
				maxChar = input.charAt(i);
				max = count[input.charAt(i)];
			}
		}
		System.out.println(maxChar+":"+max);
	}

}
