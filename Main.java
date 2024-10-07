import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 6 marks:");
        int[] marks = new int[6];
        for (int i = 0; i < 6; i++) {
            marks[i] = scanner.nextInt();
        }
        System.out.println("Marks:");
        for (int mark : marks) {
            System.out.println(mark);
        }

        int fail = 0, pass = 0, twoTwo = 0, twoOne = 0, first = 0;
        for (int mark : marks) {
            if (mark < 40) {
                fail++;
            } else if (mark < 50) {
                pass++;
            } else if (mark < 60) {
                twoTwo++;
            } else if (mark < 70) {
                twoOne++;
            } else {
                first++;
            }
        }
        System.out.println("Pass :" + pass);
        System.out.println("Fail :" + fail);
        System.out.println("2:2 :" + twoTwo);
        System.out.println("2:1 :" + twoOne);
        System.out.println("Above 70 :" + first);

        double average = averageCal(marks);
        System.out.println("Average = " + average);

        int maxMark = maxCal(marks);
        System.out.println("Max mark = " + maxMark);

        int minMark = minCal(marks);
        System.out.println("Minimum Mark = " + minMark);

        int[] sortedMarks = sortMarks(marks);
        System.out.println("Sorted Marks ");
        for (int mark : sortedMarks){
            System.out.println(mark);
        }
    }

        public static double averageCal(int[] marks){
            int sum =0;
            for(int mark : marks) {
                sum += mark;
            }
                return (double)sum/marks.length;

        }

        public static int maxCal(int[] marks){
            int max = marks[0];
            for(int mark:marks){
                if(mark > max){
                    max = mark;
                }
            }
            return max;
        }

    public static int minCal(int[] marks){
        int min = marks[0];
        for(int mark:marks){
            if(mark > min){
                min = mark;
            }
        }
        return min;
    }

    public static int[] sortMarks(int[] marks){
        for(int i=0;i<marks.length;i++){
            for(int j = i+1; j<marks.length;j++){
                if (marks[i]>marks[j]){
                    int temp = marks[i];
                    marks[i]=marks[j];
                    marks[j]=temp;
                }
            }
        }
        return marks;
    }
}