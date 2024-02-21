import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int find = sc.nextInt();
        
        for(int j = 0; j < n; j++) {
            if(arr[j] == find)
                cnt++;
        }
        
        System.out.println(cnt);
    }
}