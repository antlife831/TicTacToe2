/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package tictactoe;
import java.util.Scanner;
/**
 *
 * @author mildredmiqueo
 */
public class TicTacToe {
        static Boolean player=false;
        public static String player1="x";
        public static String player2="0";
        public static String name;
        public static boolean winner=true;
        public static int R;
        public static int C;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String [][] board=new String[3][3];
        System.out.println("player 1 what is your name?");
        Scanner input=new Scanner(System.in);
        String name1=input.nextLine();
      System.out.println("player 2 what is your name?");
        Scanner input2=new Scanner(System.in);
        String name2=input2.nextLine();
        fillboard(board);
        printboard(board);
        
      while(winner) {
      playerturn(player,name1,name2);
      if(name1.equals("RandomBot"))
      { R=RandomBot(); C=RandomBot();move(board, R, C);move(board, R, C);}
      else{System.out.println(name1+ " Select a row");
      Scanner Row=new Scanner(System.in);
        R=Row.nextInt();
         System.out.println(name+" Select a column");
      Scanner Column=new Scanner(System.in);
        C=Column.nextInt();}
       move(board, R, C);
       printboard(board);
       winner=endgame(board);
         if(name2=="RandomBot")
      { R=RandomBot(); C=RandomBot();move(board, R, C);move(board, R, C);}
      else{System.out.println(name2+ " Select a row");
      Scanner Row=new Scanner(System.in);
        R=Row.nextInt();
         System.out.println(name2+" Select a column");
      Scanner Column=new Scanner(System.in);
        C=Column.nextInt();}
       move(board, R, C);
       printboard(board);
       winner=endgame(board);
      }
    }
   
    public static void fillboard(String [][] board){
    for(int i=0;i<3;i++)
        for(int j=0;j<3;j++)
            board[i][j]="*";
   
    }
    public static void printboard(String [][] board){
    for(int i=0;i<board.length;i++){
        for(int j=0;j<board.length;j++)
        { System.out.print(board[i][j]);}
    System.out.println();}}
    public static void playerturn(boolean p,String name1,String name2){
    player=!p;
    if(player){name=name1;}
    else name=name2;
   
    }
   public static boolean tiegame(String[][] board){
    boolean test=true;
       for(int i=0;i<3;i++)
   {for(int j=0;j<3;j++)
            if(board[i][j]=="*"){
            test=false;}
   }
  
   return test;}
   public static boolean endgame(String[][] board){
     for(int k=0;k<3;k++){
       if(board[0][k]==board[1][k]&&board[1][k]==board[2][k]&&board[1][k]!="*")
       {System.out.println(name+ " has won the game"); return false;}
      
   }
   for(int k=0;k<3;k++){
       if(board[k][0]==board[k][1]&&board[k][1]==board[k][2]&&board[k][1]!="*")
       {System.out.println(name+ " has won the game"); return false;}
      
   }
   
   if(board[2][0].equals(board[1][1])&&board[1][1].equals(board[0][2])&&board[2][0]!="*"||
           board[0][0]==board[1][1]&&board[1][1]==board[2][2]&&board[0][0]!="*")
           {
   System.out.println(name+ " has won the game"); return false;}
   
   else if(tiegame(board)){System.out.println("no one has won the game");return false;} 
   else return true;
  
   }
  
   public static int RandomBot(){
   int num=(int)(Math.random()*3);
   return num;}
   
   public static void move(String[][]board, int R, int C){
        if (player&&board[R][C]=="*")board[R][C]="x";
        else if(!player&&board[R][C]=="*") board[R][C]="0";
        else {System.out.println("that space is taken, choose another row");
              Scanner input3=new Scanner(System.in);
              int r1=input3.nextInt();
              System.out.println("select another row");
              int c1=input3.nextInt();
              move( board, r1,c1);}
        }
       
   }
