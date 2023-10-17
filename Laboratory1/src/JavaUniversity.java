public class JavaUniversity {

    private static final int MIN_PASSING_GRADE = 40;

    // Method to round the grades
    public static int roundGrade(int grade) {
        // Grades below MIN_PASSING_GRADE can only be rounded up to MIN_PASSING_GRADE
        if (grade < MIN_PASSING_GRADE - 2) return grade;

        int difference = Math.abs(grade % 5 - 5);

        if (difference < 3) return grade + difference;
        else return grade;
    }

    // 1. Method that returns an array of insufficient grades
    public static int[] insufficientGrades(int[] grades) {
        int insufficientGradesArraySize = 0;

        for (int grade : grades) {
            if (grade < MIN_PASSING_GRADE) {
                insufficientGradesArraySize++;
            }
        }

        int[] insufficientGrades = new int[insufficientGradesArraySize];

        int index = 0;
        for (int grade : grades) {
            if (grade < MIN_PASSING_GRADE) {
                insufficientGrades[index++] = grade;
            }
        }

        return insufficientGrades;
    }

    // 2. Method that returns the average value of grades
    public static double averageGrade(int[] grades) {
        int sum = 0;

        for (int grade : grades) {
            sum += grade;
        }

        return (double) sum / grades.length;
    }

    // 3. Method that returns an array of rounded grades
    public static int[] roundedGrades(int[] grades) {
        int[] rounded = new int[grades.length];

        for (int i = 0; i < grades.length; i++) {
            rounded[i] = roundGrade(grades[i]);
        }

        return rounded;
    }

    // 4. Method that returns the highest rounded grade
    public static int highestRoundedGrade(int[] grades) {
        int highest = 0;
        for (int grade : grades) {
            int roundedGrade = roundGrade(grade);


            if (roundedGrade > highest) {
                // Only add grades that have been rounded
                // Ignore grades that are higher but have not been changed
                if (roundedGrade != grade) {
                    highest = roundedGrade;
                }
            }
        }

        return highest;
    }
}
