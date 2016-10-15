/**
 * Created by Tyranitarx on 2016/10/15.
 */
import java.util.Scanner;
public class Delete {
        public static void main(String[] args){
            Scanner in=new Scanner(System.in);
            int m,n;
            m=in.nextInt();
            n=in.nextInt();
            int[][] area=new int[m][n];
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    area[i][j]=in.nextInt();
                }
            }
                String str="";
            for(int i=0;i<m-2;i++){
                for(int j=0;j<n-2;j++){
                    if(area[i][j]==area[i][j+1]&&area[i][j+1]==area[i][j+2]){
                        str=str+i+j+";"+i+(j+1)+";"+i+(j+2)+";";

                    }
                    if(area[i][j]==area[i+1][j]&&area[i+1][j]==area[i+2][j]){
                        str=str+i+j+";"+(i+1)+j+";"+(i+2)+j+";";
                    }
                }
            }
            String[] pos=str.split(";");
            for(int i=0;i<pos.length;i++){
                String[] pos1=pos[i].split("");
                area[Integer.parseInt(pos1[0])][Integer.parseInt(pos1[1])]=0;
            }
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    System.out.print(area[i][j]+" ");
                }
                System.out.println();
            }
        }
}
