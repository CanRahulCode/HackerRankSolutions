import java.util.*;

class loop2{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int m=0;m<t;m++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for(int j=0;j<n;j++)
        {
            a = a+b;
            System.out.print(a+" ");
            b=b*2;
        }
        System.out.println(" ");
    }
    in.close();
}
}
 

