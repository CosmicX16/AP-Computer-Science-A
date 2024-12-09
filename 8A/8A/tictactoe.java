import java.util.*;
/**
 * Write a description of class tictactoe here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class tictactoe
{
    // instance variables - replace the example below with your own
    
    public tictactoe()
    {
       
    }

    public void ticTacToe()
    {
        Scanner scn = new Scanner(System.in);
        boolean gameEnd = false;
        String[][] board = new String[3][3];
        int turn = 1;
        int winner = 0;
        board = initBoard(board);
        while(!gameEnd){
            display(board);
            if(turn == 1){
                System.out.println("X Player move (row,column):");
                String[] temp = scn.nextLine().split(",");
                int xX = Integer.parseInt(temp[0]);
                int xY = Integer.parseInt(temp[1]);
                if(xX > 3 || xY > 3|| xX < 1 || xY < 1){
                    System.out.println("Error: out of bounds");
                    break;
                }
                board = editBoard(board,xX,xY,"X");
                if((boolean)winCheck(board).get(0) == true) gameEnd = true;
                turn = -1;
            }else if(turn == -1){
                System.out.println("O Player move (row,column):");
                String[] temp = scn.nextLine().split(",");
                int oX = Integer.parseInt(temp[0]);
                int oY = Integer.parseInt(temp[1]);
                if(oX > 3 || oY > 3 || oX < 1 || oY < 1){
                    System.out.println("Error: out of bounds");
                    break;
                }
                board = editBoard(board,oX,oY,"O");
                if((boolean)winCheck(board).get(0) == true) gameEnd = true;
                turn = 1;
            }
        }
        if(gameEnd){
            winner = (int)winCheck(board).get(1);
            if(winner == 1){
                System.out.println("Congrats, player of X wins!");
                
            }else if(winner == -1){
                System.out.println("Congrats, player of O wins!");
            }else System.out.println("Error: win w/o winner");
        }
    }
    public String[][] initBoard(String[][] b){
        for(int i = 0; i < b.length; i++){
            for(int j = 0; j < b.length; j++){
                b[i][j] = " ";
            }

        }
        return b;
    }
    public void display(String[][] b ){
        for(int i = 0; i < b.length; i++){
            for(int j = 0; j < b.length; j++){
                System.out.print("["+b[i][j]+"]");
            }
            System.out.println();
        }
 
    }
    public String[][] editBoard(String[][] b, int x, int y, String s){
        b[y-1][x-1] = s;
        return b;
        
    }
    public ArrayList winCheck(String[][] b){
        ArrayList values = new ArrayList<>();
        int w = 0;
        boolean bool = false;
        for(int i = 0; i < b.length; i++){
            if(b[0][i] == b[1][i] && b[1][i] == b[2][i] && b[0][i] != " "){
                bool = true;
                values.add(bool);
                if(b[0][i].equals("X")) w = 1;
                else if(b[0][i].equals("O")) w = -1;
                values.add(w);
                return values;
            }else if(b[i][0] == b[i][1] && b[i][1] == b[i][2] && b[i][0] != " "){
                bool = true;
                values.add(bool);
                if(b[i][0].equals("X")) w = 1;
                else if(b[i][0].equals("O")) w = -1;
                values.add(w);
                return values;
            }
        }
        if(((b[0][0] == b[1][1]&& b[1][1] == b[2][2])||(b[2][0] == b[1][1]&& b[1][1] == b[0][2])) && b[1][1] != " "){
            bool = true;
            values.add(bool);
            if(b[1][1].equals("X")) w = 1;
            else if(b[1][1].equals("O")) w = -1;
            values.add(w);
            return values;
        }
        values.add(bool);
        values.add(w);
        return values;
    }
}
