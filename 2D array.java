import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();             // n = row  , m = column // when n = m,then any one (n or m) is enough //
		int m = sc.nextInt();
		int a[][]= new int[n][m];
		int i , j, sum= 0, sum1 =0;
		for( i =0;i<n;i++)
		{
		    for( j=0;j<m;j++){
		        a[i][j] = sc.nextInt();
		    }
		    }
	    for( i =0;i<n;i++)
		{
		    for( j=0;j<m;j++)
		    {
		       if(i == j){
		           sum= sum + a[i][j];
		       }
		       if((i+j) == (n-1)){
		           sum1 = sum1 + a[i][j];
		       }
		    }
		}
		System.out.print(sum + sum1);
	}
}
		           
		           
		           
		           
		           
		           
		           
		           
		           
		           
		           
		           
		           
		           
		           
		      