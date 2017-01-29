import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PartitionAndDetect {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input;
		int part1,part2;
		int a,b;
		System.out.println("Enter the number");
		input = br.readLine();
		System.out.println("Enter a:");
		a = Integer.parseInt(br.readLine());
		System.out.println("Enter b:");
		b = Integer.parseInt(br.readLine());
		int l = input.length()-1;
		int n = Integer.parseInt(input),pow10;
		while(l != 0){
			System.out.println("*****************");
			System.out.println((int)(n/Math.pow(10, l)));
			System.out.println((int)(n%Math.pow(10, l)));
			pow10 = (int) Math.pow(10, l);
			if(((int)(n/pow10)%a == 0) && ((int)(n%pow10)%b == 0)){
				System.out.println("YES");
				return;
			}
			l--;
		}
		System.out.println("No");
		// TODO Auto-generated method stub
	}

}
