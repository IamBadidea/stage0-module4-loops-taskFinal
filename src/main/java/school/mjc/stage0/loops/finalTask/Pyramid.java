package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {


        for (int i = 0; i < cathetusLength; i++) {
            for (int j = 0; j < cathetusLength * 2 - 1; j++) {

                if (cathetusLength - j <= i + 1 && j < cathetusLength) {
                    System.out.print(cathetusLength - j);
                }

                if (j >= cathetusLength && j - cathetusLength + 2 <= i + 1) {
                    System.out.print(j - cathetusLength + 2);
                }

                if (j < cathetusLength && cathetusLength - j > i + 1) {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(4);
    }
}
