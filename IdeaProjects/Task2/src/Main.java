public class Main {
    public static void main(String[] args) {

        // نتاكد ان فيه 2 باراميتر
        if (args.length < 2) {
            System.out.println("Please enter student name and score.");
            return;
        }
        String name = args[0];
        // عشان لو اليوزر دخل الدرجة احوله للانتجر
        int score = Integer.parseInt(args[1]);
        String grade;
        // نحدد القريد حسب الدرجه
        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.println("Student " + name + " your grade: " + grade);
    }
}
