import java.util.Scanner;
public class AprintNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row");
        int r = sc.nextInt();

        for(int i=1;i<=r;i++) {
            for(int j=1;j<=r-i;j++) {
                System.out.print(" ");
            }
            for(int k =1;k<=i;k++) {
                System.out.print(k);
                
            }
            System.out.println();
            for(int l = i-1;l>=1;l--) {
                System.out.print(l);
            }
        }
        sc.close();
    }    
}
