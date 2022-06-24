public class Main {
    public static void main(String[] args) {
        {
            int[][] snail = SnailLogic.snail(10, 9);

            for (int i = 0; i < snail.length; i++) {
                for (int j = 0; j < snail[i].length; j++) {
                    System.out.print(String.format("%4s", snail[i][j]));
                }
                System.out.println();
            }
        }
    }
}
