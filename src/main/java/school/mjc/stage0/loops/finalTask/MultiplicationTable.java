package school.mjc.stage0.loops.finalTask;

public class MultiplicationTable {
    public static void main(String[] args) {
        new MultiplicationTable().printTable(99);
    }
    public void printTable(int numberTableToPrint){

        int i = 1;
        while (i < 11) {
            System.out.printf("%d x %d = %d\n", i, numberTableToPrint, i*numberTableToPrint);
            i++;
        }
    }
}
