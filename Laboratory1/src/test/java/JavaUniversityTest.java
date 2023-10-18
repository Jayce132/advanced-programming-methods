import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JavaUniversityTest {

    @Test
    void testRoundGradeExpected() {
        // Expected rounding
        assertEquals(85, JavaUniversity.roundGrade(84));
        assertEquals(40, JavaUniversity.roundGrade(38));
        assertEquals(40, JavaUniversity.roundGrade(39));
    }

    @Test
    void testRoundGradeUnexpected() {
        // Unexpected, no rounding
        assertEquals(82, JavaUniversity.roundGrade(82));
        assertEquals(37, JavaUniversity.roundGrade(37));
        assertEquals(0, JavaUniversity.roundGrade(0));
    }

    @Test
    void testInsufficientGradesExpected() {
        int[] grades = {34, 85, 67, 38, 90, 79};
        int[] expected = {34, 38};
        assertArrayEquals(expected, JavaUniversity.insufficientGrades(grades));
    }

    @Test
    void testInsufficientGradesUnexpected() {
        int[] grades = {45, 50, 55};
        int[] expected = {};
        assertArrayEquals(expected, JavaUniversity.insufficientGrades(grades));  // All grades are above 40
    }

    @Test
    void testAverageGradeExpected() {
        int[] grades = {34, 85, 67, 38, 90, 79};
        assertEquals(65.5, JavaUniversity.averageGrade(grades), 0.01);
    }

    @Test
    void testAverageGradeUnexpected() {
        int[] grades = {};
        assertThrows(ArithmeticException.class, () -> JavaUniversity.averageGrade(grades));
    }

    @Test
    void testRoundedGradesExpected() {
        int[] grades = {34, 85, 67, 38, 90, 79};
        int[] expected = {34, 85, 67, 40, 90, 80};
        assertArrayEquals(expected, JavaUniversity.roundedGrades(grades));
    }

    @Test
    void testRoundedGradesUnexpected() {
        int[] grades = {36, 91, 96};
        int[] expected = {36, 91, 96};
        assertArrayEquals(expected, JavaUniversity.roundedGrades(grades));  // No rounding applied
    }

    @Test
    void testHighestRoundedGradeExpected() {
        int[] grades = {34, 85, 67, 38, 90, 79};
        assertEquals(90, JavaUniversity.highestRoundedGrade(grades));
    }

    @Test
    void testHighestRoundedGradeUnexpected() {
        int[] grades = {34, 36, 38};
        assertEquals(40, JavaUniversity.highestRoundedGrade(grades));  // Rounding takes the grade to 40 which is higher than any grade in the array

        grades = new int[]{};
        assertEquals(0, JavaUniversity.highestRoundedGrade(grades));  // Empty array
    }
}
