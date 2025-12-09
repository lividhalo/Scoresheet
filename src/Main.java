import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // ===== INPUT SCHOOL DETAILS =====
        System.out.print("Enter School Name: ");
        String schoolName = scanner.nextLine();

        System.out.print("Enter Teacher Name: ");
        String teacherName = scanner.nextLine();

        System.out.print("Enter Grade: ");
        String grade = scanner.nextLine();

        System.out.print("Enter Year: ");
        String year = scanner.nextLine();

        System.out.println("enter student count");
        int studentCount = scanner.nextInt();

        String[] names = new String[studentCount];
        double[] english = new double[studentCount];
        double[] maths = new double[studentCount];
        double[] hist = new double[studentCount];
        double[] geo = new double[studentCount];
        double[] sci = new double[studentCount];
        double[] prog = new double[studentCount];
        double[] total = new double[studentCount];
        char[] rank = new char[studentCount];

        // ===== INPUT LOOP =====
        for (int i = 0; i < studentCount; i++) {

            System.out.println("\nEnter details for Student " + (i + 1));

            System.out.print("Student Name: ");
            scanner.nextLine(); // clear buffer
            names[i] = scanner.nextLine();

            System.out.print("English: ");
            english[i] = scanner.nextDouble();

            System.out.print("mathematics: ");
            maths[i] = scanner.nextDouble();

            System.out.print("history: ");
            hist[i] = scanner.nextDouble();

            System.out.print("geography: ");
            geo[i] = scanner.nextDouble();

            System.out.print("Science: ");
            sci[i] = scanner.nextDouble();

            System.out.print("programming: ");
            prog[i] = scanner.nextDouble();

            // compute total
            total[i] = english[i] + maths[i] + hist[i] +
                    geo[i] + sci[i] + prog[i];

            // assign rank
            if (total[i] >= 540) rank[i] = 'A';
            else if (total[i] >= 480) rank[i] = 'B';
            else if (total[i] >= 420) rank[i] = 'C';
            else if (total[i] >= 360) rank[i] = 'D';
            else rank[i] = 'F';
        }

        // ===== CLASS STATISTICS =====
        double sum1 = 0, sum2 = 0, sum3 = 0, sum4 = 0, sum5 = 0, sum6 = 0,sum7 = 0;
        int countA = 0, countB = 0, countC = 0, countD = 0, countF = 0;

        for (int i = 0; i < studentCount; i++) {
            sum1 += english[i];
            sum2 += maths[i];
            sum3 += hist[i];
            sum4 += geo[i];
            sum5 += sci[i];
            sum6 += prog[i];
            sum7 += total[i];

            switch (rank[i]) {
                case 'A': countA++; break;
                case 'B': countB++; break;
                case 'C': countC++; break;
                case 'D': countD++; break;
                case 'F': countF++; break;
            }
        }

        double avg1 = sum1 / studentCount;
        double avg2 = sum2 / studentCount;
        double avg3 = sum3 / studentCount;
        double avg4 = sum4 / studentCount;
        double avg5 = sum5 / studentCount;
        double avg6 = sum6 / studentCount;
        double avg7 = sum7 / studentCount;

        // ===== OUTPUT REPORT =====
        System.out.println("\n====================================================================================================");
        System.out.println("\t\t\t\t\t\tSchool Name: " + schoolName);
        System.out.println("\t\t\t\t\t\tTeacher: " + teacherName);
        System.out.println("\t\t\t\t\t\tGrade: " + grade);
          System.out.println("\t\t\t\t\t\tYear:" + year);
        System.out.println("======================================================================================================");

        System.out.println("Student Name \t English \t Math \t history \t geography \t science \t programming \t Total \tRank");
        System.out.println("------------------------------------------------------------------------------------------------------");


        for (int i = 0; i < studentCount; i++) {
            System.out.println(names[i]+"\t\t"+english[i]+"\t\t"+maths[i]+"\t\t"+hist[i]+"\t\t"+geo[i]+"\t\t"+sci[i]+"\t\t"+prog[i]+"\t\t"+total[i]+"\t\t"+rank[i]);
        }

        System.out.println("------------------------------------------------------------------------------------------------------");

        System.out.println("\t\t\t\t"+sum1+"\t\t"+sum2+"\t\t"+sum3+"\t\t"+sum4+"\t\t"+sum5+"\t\t"+sum6+"\t\t"+sum7);

        System.out.println("\t\t\t\t"+avg1+"\t\t"+avg2+"\t\t"+avg3+"\t\t"+avg4+"\t\t"+avg5+"\t\t"+avg6+"\t\t"+avg7);


        System.out.println("======================================================================================================");
        System.out.println("END OF REPORT");
    }
}





 