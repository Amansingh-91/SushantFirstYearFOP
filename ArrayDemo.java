public class ArrayDemo {
    public static void main(String[] args) {
//        double aman = 12;
//        double divya = 13;
//        double dharam = 11;
//        double joy = 12.5;
//        double john = 12;
//        double mario = 12;
//        double julie = 13;
//        double jack = 11;
//        double rohit = 10;
//        double rohan = 12;

        //1-D Array declaration begin
        //int marks[];
        int[] marks;
        // Array defining dynamically
        marks = new int[5];

        // assign values
        marks[0] = 12;
        marks[1] = 13;
        marks[2] = 12;
        marks[3] = 13;
        marks[4] = 15;
//        marks[5] = 16;

        // access value
        System.out.println(marks[0]);

        // statically define array
        long mobile[] = {1234,2345,3456,4567,5678};
        System.out.println(mobile.length);

        // access value
        System.out.println(mobile[3]);

        String names [] ;
        names = new String[4];
        // updating the value
        names[0] = " soniya" ;
        System.out.println(names[0]);
        names[0] = " tannu" ;
        System.out.println(names[0]);
        names[0] = " riya" ;
        System.out.println(names[0]);
        names[0] = " raghav";
        System.out.println(names[0]);

        // 2-d arrays
        // Array defining dynamically
        int studentMarks[][];
        // Array declaration dynamically
        studentMarks = new int[2][2];

        // assign value
        studentMarks[0][0] = 12;
        studentMarks[0][1] = 13;
        studentMarks[1][0] = 14;
        studentMarks[1][1] = 15;


        // access
        System.out.println(studentMarks[0][1]);

        // multidimensional array 3-d
        int sectionMarks[][][] = new int[2][5][3];
        /*
        Multi line
        comment

         */





    }
}
