public class Main {
    public static void main(String[] args) {
        int[] grades = {34, 38, 39, 85, 67, 68, 69, 90, 79};

        for (int grade : JavaUniversity.insufficientGrades(grades)) {
            System.out.print(grade + " ");
        }

        System.out.println("\n" + JavaUniversity.averageGrade(grades));

        for (int grade : JavaUniversity.roundedGrades(grades)) {
            System.out.print(grade + " ");
        }

        System.out.println("\n" + JavaUniversity.highestRoundedGrade(grades));
    }
}