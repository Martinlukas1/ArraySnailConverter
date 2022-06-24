class SnailLogic {

    static int[][] snail(int rows, int columns) {
        int[][] arr = new int[rows][columns];
        int tempNum = 1;  // value in every next step (continuously incrementing)
        innerCircle(rows, columns, arr, tempNum); //method which iterate array in spiral way
        return arr;
    }

    private static void innerCircle(int rows, int columns, int[][] arr, int tempNum) {
        //non recursive part

        //increasing move
        for (int i = arr[0].length - columns; i < columns; i++) {
            if (i == columns - 1) { //checking if iteration meet end of the row
                for (int j = arr.length - rows; j < rows; j++) {
                    if (arr[j][columns - 1] == 0) {
                        arr[j][columns - 1] = tempNum++;
                    }
                }
            } else {
                if (arr[arr.length - rows][i] == 0) {
                    arr[arr.length - rows][i] = tempNum++;
                }
            }
        }
        //decreasing move, analogical to increasing one
        for (int i = columns - 2; i >= 0; i--) {
            if (i == arr[0].length - columns) {
                for (int j = rows - 1; j > 0; j--) {
                    if (arr[j][arr[0].length - columns] == 0) {
                        arr[j][arr[0].length - columns] = tempNum++;
                    }
                }
            } else {
                if (arr[rows - 1][i] == 0) {
                    arr[rows - 1][i] = tempNum++;
                }
            }
        }

        //recursive part
        if (rows > 1 && columns > 1) {
            innerCircle(rows - 1, columns - 1, arr, tempNum);
        }
    }
}
