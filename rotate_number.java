import java.util.Scanner;
public class rotate_number {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nod=0;
        int k = sc.nextInt();
        int temp=n;
        while(temp !=0){
            temp= temp/10;
            nod++;
        }
        k=k%nod;//for larger numbers
        if(k<0){//for negative rotations
            k=k+nod;
        }
        int div=1;
        int mul=1;
        for(int i=1;i<=nod;i++){
            if(i<=k){
                div=div*10;
            }else{
                mul=mul *10;
            }
        }
        int q= n/div;
        int r= n%div;
        int rot = r*mul+q;
        System.out.print(rot);

    }
    
}
