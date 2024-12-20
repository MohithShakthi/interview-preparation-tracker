import java.util.Scanner;

public class LookAndSay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String current = "1";
        System.out.println(current);
        for(int i=1;i<n;i++){
            StringBuilder next = new StringBuilder();
            int count =1;
            for(int j=1;j<current.length();j++){
                if(current.charAt(j) == current.charAt(j-1)) count++;
                else{
                    next.append(count).append(current.charAt(j-1));
                    count = 1;
                }
            }
            next.append(count).append(current.charAt(current.length()-1));
            current = next.toString();
            System.out.println(current);
        }
        sc.close();
    }
}
