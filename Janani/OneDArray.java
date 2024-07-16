import java.util.*;
public class OneDArray{
public static void main(String[] args){
Scanner read= new Scanner(System.in);
int counts[]=new int[10];
Arrays.fill(counts,0);
for(int i=0;i<10;i++)
{
System.out.print(counts[i]);
}
System.out.println();
int arr[]=new int[15];
for(int i=0;i<15;i++){
arr[i]=read.nextInt();
arr[i]+=1;
System.out.print(arr[i]);
}
System.out.println();
int bestScores[]=new int[5];
for(int i=0;i<5;i++){
bestScores[i]=read.nextInt();
System.out.println(bestScores[i]);
}
}
}