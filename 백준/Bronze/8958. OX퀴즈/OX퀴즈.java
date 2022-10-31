import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);

		String[] arr = new String[scanner.nextInt()];

		for(int i=0; i<arr.length; i++) {
			arr[i] = scanner.next();
		}

		scanner.close();

		for(int i=0; i<arr.length; i++) {

			int sw = 0;
			int result = 0;

			for(int j=0; j<arr[i].length(); j++) {

				if(arr[i].charAt(j)=='O') {
					sw++;
				}else {
					sw=0;
				}
				result = result+sw;
			}
			System.out.println(result);
		}
	}
}