public class Main {

    public static void main(String[] args) {

        AlphaBeta ab = new AlphaBeta("output.txt");
        ab.sorting();

        Employees_task etask = new Employees_task("Employees.txt", "EmployeesSorted.txt");
        etask.employeesHadler();

        System.out.println("\nVgadayka");
        Vgadayka gs = new Vgadayka();
        gs.guess();

        System.out.println("\nAlphabetSort");
        AlphabetSort srt = new AlphabetSort("input.txt");
        srt.sorting();

        System.out.println("\nReverse");
        OwnReverse rev = new OwnReverse();
        rev.reverse();
    }
}
