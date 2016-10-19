/**
 * Created by Tyranitarx on 2016/10/19.
 */
import java.util.Scanner;
public class RussiaCube
{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int board[][]=new int[15][10];
        int Cube[][]=new int[4][4];
        int col;
        int line=14;
        int col1=3;
        boolean judge=true;
        for(int i=0;i<15;i++){
            for(int j=0;j<10;j++){
                board[i][j]=in.nextInt();
            }
        }
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                Cube[i][j]=in.nextInt();
            }
        }
        col=in.nextInt()-1;
        for(int i=3;i>=0;i--){
            for(int j=3;j>=0;j--){
                if(Cube[i][j]==1)
                {
                    col1=i;
                    break;
                }
            }
        }
        for(int i=14;i>=3;i--){
            for(int j=col1;j>=0;j--){
                for(int k=0;k<3;k++){
                    if(Cube[i][col]==1){
                        if(Cube[i][col]==board[j][k])
                            judge=false;
                    }
                }
                if(judge==false)
                {
                    judge=true;
                    break;
                }
            }
            if(judge=true){
                line=i;
            }
        }
        for(int i=line;i>line-4;i--){
            for(int j=col;j<col+4;j++){
                board[i][j]=Cube[i+line][j-col];
            }
        }
    }
}
