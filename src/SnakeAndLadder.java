public class SnakeAndLadder {
    public static void main(String[] args) {
		
		System.out.println("Welcome to Snake and Ladder Game");
		int position =0;
		int randomCheck = (int) Math.floor(Math.random ()* 10) % 6+1;
		System.out.println(randomCheck);
	}
}
