import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string you want to remove duplicates from: ");
        String s = scanner.nextLine();

        int n = s.length();
        int[] arr = new int[26];
        StringBuilder result = new StringBuilder();

        for(int i=0 ; i<n ; i++){
            if(arr[s.charAt(i) - 'a'] == 0){
                arr[s.charAt(i) - 'a']++;
                result.append(s.charAt(i));
            }
        }

        System.out.println(result.toString());

        scanner.close();
    }
}