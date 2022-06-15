import java.util.HashMap;
import java.util.Scanner;

public class maxrr {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int [n];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            map.put(arr[i], map.getOrDefault(arr[i] , 1)+1);
        }
    }
}
