class Main {
  public static void main(String[] args) {
    int[] input = {1, 2, 5, 3, 8, 10, 9, 7, 12};
    int fromLeft = 0;
    int fromRight = input.length - 1;

    while (fromLeft < input.length && input[fromLeft] < input[fromLeft+1]) {
      ++fromLeft;
    }

    while (fromRight > 0 && input[fromRight] > input[fromRight-1]) {
      --fromRight;
    }

    System.out.println(fromRight-fromLeft+1);
  }
}
