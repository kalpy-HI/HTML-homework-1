import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] argc){
		Scanner sc = new Scanner(System.in);
		
		for(;;){
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a==0&&b==0)break;
			
			String something = sc.nextLine();
			String[] array = new String[a];
			int[] answer = new int[a][b];
			
			for(int i=0;i<3;i++){
				array = sc.nextLine();
			}
			
			for(int i =0;i<a;i++){
				for(int j =0;j<b;j++){
					if('*'==array.charAt[i][j]){
						answer[i][j]= -1;
					}
					else if('.'==array.charAt[i][j]){
						answer[i][j]= 0;
					}
				}
			}
			
			for(int i =0;i<a;i++){
				for(int j =0;j<b;j++){
					if(-1==answer.[i][j]){
						for(int k=i-1;k<=i+1;k++){
							for(int l=j-1;l<=j+1;l++){
								if(k>=0&&l>=0){	
								   if(answer[k][l]!=-1){
								      answer[k][l]++;
								   }
								}
							}
						}
					}
				}
			}
		}
	}
}
