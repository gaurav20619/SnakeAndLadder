public class SnakeAndLadder {
    public static void main(String[] args) {
        //UC3-randomly checking for option no play, ladder or snake
                
                System.out.println("Welcome to Snake and Ladder Game");
                int position =0;
                int randomCheck = (int) Math.floor(Math.random ()* 10) % 6+1;
                int randomCheck2 = (int) (Math.random()* 10 )% 3;
                switch (randomCheck2) {
                    case 0:
                        System.out.println("No Play");
                        position +=0;
                        break;
                    case 1:
                        System.out.println("Ladder");
                        position +=randomCheck;
                        break;
                    case 2:
                        System.out.println("Snake");
                        position -=randomCheck;
                        break;
                }
            }
}
