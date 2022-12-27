//  На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга


import java.util.ArrayList;

public class task5_4 {
    public static void main(String[] args) {
        String[][] arena = new String[8][8];
        for (int i = 0; i < 8; i ++) {
            for (int j = 0; j < 8; j ++) {
                arena[i][j] = " ";
            }
        }
        arena[1][0] = "Q";
        arena[4][1] = "Q";
        arena[6][2] = "Q";
        arena[0][3] = "Q";
        arena[2][4] = "Q";
        arena[7][5] = "Q";
        arena[5][6] = "Q";
        arena[3][7] = "Q";
        out(arena);
    }

 
        public static void out(String[][] arena){
            System.out.println("       Шахматная арена    ");
            System.out.println("   a  b  c  d  e  f  g  h ");
            System.out.println("8 "+"["+arena[0][0]+"]"+"["+arena[0][1]+"]"+"["+arena[0][2]+"]"+"["+arena[0][3]+"]"+"["+arena[0][4]+"]"+"["+arena[0][5]+"]"+"["+arena[0][6]+"]"+"["+arena[0][7]+"]"+" 8");
            System.out.println("7 "+"["+arena[1][0]+"]"+"["+arena[1][1]+"]"+"["+arena[1][2]+"]"+"["+arena[1][3]+"]"+"["+arena[1][4]+"]"+"["+arena[1][5]+"]"+"["+arena[1][6]+"]"+"["+arena[1][7]+"]"+" 7");
            System.out.println("6 "+"["+arena[2][0]+"]"+"["+arena[2][1]+"]"+"["+arena[2][2]+"]"+"["+arena[2][3]+"]"+"["+arena[2][4]+"]"+"["+arena[2][5]+"]"+"["+arena[2][6]+"]"+"["+arena[2][7]+"]"+" 6");
            System.out.println("5 "+"["+arena[3][0]+"]"+"["+arena[3][1]+"]"+"["+arena[3][2]+"]"+"["+arena[3][3]+"]"+"["+arena[3][4]+"]"+"["+arena[3][5]+"]"+"["+arena[3][6]+"]"+"["+arena[3][7]+"]"+" 5");
            System.out.println("4 "+"["+arena[4][0]+"]"+"["+arena[4][1]+"]"+"["+arena[4][2]+"]"+"["+arena[4][3]+"]"+"["+arena[4][4]+"]"+"["+arena[4][5]+"]"+"["+arena[4][6]+"]"+"["+arena[4][7]+"]"+" 4");
            System.out.println("3 "+"["+arena[5][0]+"]"+"["+arena[5][1]+"]"+"["+arena[5][2]+"]"+"["+arena[5][3]+"]"+"["+arena[5][4]+"]"+"["+arena[5][5]+"]"+"["+arena[5][6]+"]"+"["+arena[5][7]+"]"+" 3");
            System.out.println("2 "+"["+arena[6][0]+"]"+"["+arena[6][1]+"]"+"["+arena[6][2]+"]"+"["+arena[6][3]+"]"+"["+arena[6][4]+"]"+"["+arena[6][5]+"]"+"["+arena[6][6]+"]"+"["+arena[6][7]+"]"+" 2");
            System.out.println("1 "+"["+arena[7][0]+"]"+"["+arena[7][1]+"]"+"["+arena[7][2]+"]"+"["+arena[7][3]+"]"+"["+arena[7][4]+"]"+"["+arena[7][5]+"]"+"["+arena[7][6]+"]"+"["+arena[7][7]+"]"+" 1");
            System.out.println("   a  b  c  d  e  f  g  h ");
            System.out.println("Q - ферзь");
        }   
}
