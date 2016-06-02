import java.util.Scanner;

/**
 * Created by 晓辉 on 2016/6/1.
 */
public class Board {
    public static boolean chenkWon(int[][] board) {
        if (board[0][0]+board[1][1]+board[2][2]==3)
            return true;
        if (board[0][2]+board[1][1]+board[2][0]==3)
            return true;
        for (int i = 0; i <3 ; i++) {
            if (board[i][0]+board[i][1]+board[i][2]==3)
                return true;
            if (board[0][i]+board[1][i]+board[2][1]==3)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] board=new int[3][3];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                board[i][j]=sc.nextInt();

            }
        }
        System.out.println(chenkWon(board));
    }
}
