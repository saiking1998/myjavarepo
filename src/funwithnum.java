import java.util.Scanner;


public class funwithnum {
    public static  void swap(int[] arr,int[] arr2){
        int i= arr2[0];
        int k =arr2[1];

        int temp = arr[i];
        arr[i] = arr[k];
        arr[k] = temp;
    }
    public static  int checkrep(int[]arr,int[] arr2, int max ){
        int ans =1;
        swap(arr,arr2);

        int [] temp = new int [max+1];
//        for(int i=0;i<temp.length;i++){
//            temp[i]=0;
//        }
        for(int i=0;i<arr.length;i++){
            temp[arr[i]] =i;
        }
        for(int i=1;i<temp.length;i++){
            if(temp[i-1]>temp[i]){
                ans++;
            }
        }


        return ans;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n =scan.nextInt();
        int k = scan.nextInt();
        int [] arr = new int [n];
        int max =0;
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
            max = Math.max(max,arr[i]);
        }
        int [][] arr2 = new int[k][2];
        for(int i=0;i<k;i++){
            for(int j=0;j<2;j++){
                arr2[i][j] = scan.nextInt()-1;
            }
        }
        int[] ans = new int[k];

        for(int i=0 ;i<k;i++){

            ans[i] = checkrep(arr ,arr2[i],max);

        }
        for(int i=0;i<k;i++){
            System.out.println(ans[i]);
        }

    }
}
