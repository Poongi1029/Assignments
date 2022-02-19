import java.util.Scanner;

class Student {
    int subjectA,subjectB,subjectC;

    public Student(){}

    public Student(int a,int b,int c){
        this.subjectA = a;
        this.subjectB = b;
        this.subjectC = c;
    }

    public int [] subjectWiseMarks(Student[] student,String sub){
        int [] arr = new int[3];
        if(sub.equals("A")){
            for(int i=0;i<student.length;i++)
                arr[i]=student[i].subjectA;
        }
        else if(sub.equals("B")){
            for(int i=0;i<student.length;i++)
                arr[i]=student[i].subjectB;
        }
        else{
            for(int i=0;i<student.length;i++)
                arr[i]=student[i].subjectC;
        }
        return arr;
    }

    public int subjectTotalByStudents(int [] marks){
        int sum =0;
        for(int i=0;i<marks.length;i++){
            sum+=marks[i];
        }
        return sum;
    }

    public double subjectAverageByStudents(int [] marks){
        double sum =0.0;
        for(int i=0;i<marks.length;i++){
            sum+=marks[i];
        }
        return sum/3;
    }

    public int studentsTotalMarksInAllSubjects(Student[] students) {

        int total=0;
        for(int i=0;i<students.length;i++){
            total = total+students[i].subjectA+students[i].subjectB+students[i].subjectC;


        }
        return  total;
    }

    public double studentsAverageMarksInAllSubjects(Student[] students) {
        int total=0;
        for(int i=0;i<students.length;i++){
            total = total+students[i].subjectA+students[i].subjectB+students[i].subjectC;


        }
        return  total/3;
    }

    public int subjectATotalByStudents(int[] marks) {
        int total = 0;
        for(int i=0;i<marks.length;i++){
            total+=marks[i];
        }
        return total;
    }
    public int subjectBTotalByStudents(int[] marks) {
        int total = 0;
        for(int i=0;i<marks.length;i++){
            total+=marks[i];
        }
        return total;
    }
    public int subjectCTotalByStudents(int[] marks) {
        int total = 0;
        for(int i=0;i<marks.length;i++){
            total+=marks[i];
        }
        return total;
    }


    public double subjectAAverageByStudents(int[] marks) {
        int total = 0;
        for(int i=0;i<marks.length;i++){
            total+=marks[i];
        }
        return total/3;
    }
    public double subjectBAverageByStudents(int[] marks) {
        int total = 0;
        for(int i=0;i<marks.length;i++){
            total+=marks[i];
        }
        return total/3;
    }
    public double subjectCAverageByStudents(int[] marks) {
        int total = 0;
        for(int i=0;i<marks.length;i++){
            total+=marks[i];
        }
        return total/3;
    }

    public int getSubjectA() {
        return subjectA;
    }

    public void setSubjectA(int subjectA) {
        this.subjectA = subjectA;
    }

    public int getSubjectB() {
        return subjectB;
    }

    public void setSubjectB(int subjectB) {
        this.subjectB = subjectB;
    }

    public int getSubjectC() {
        return subjectC;
    }

    public void setSubjectC(int subjectC) {
        this.subjectC = subjectC;
    }

}

public class q9 {

	public static void main(String[] args) {
		Student s1 = new Student(10,20,30);


        Student s2 = new Student(10,20,30);


        Student s3 = new Student(10,20,30);


        Student [] students = {s1,s2,s3};

        Student student = new Student();

        int [] marksA = new int[3];
        for(int i=0;i<students.length;i++){
            marksA[i]=10;
        }

        int [] marksB = new int[3];
        for(int i=0;i<students.length;i++){
            marksB[i]= 20;
        }

        int [] marksC = new int[3];
        for(int i=0;i<students.length;i++){
            marksC[i]= 30;
        }

        System.out.println(student.studentsTotalMarksInAllSubjects(students));
        System.out.println(student.studentsAverageMarksInAllSubjects(students));
        System.out.println(student.subjectATotalByStudents(marksA));
        System.out.println(student.subjectAAverageByStudents(marksA));
        System.out.println(student.subjectBTotalByStudents(marksB));
        System.out.println(student.subjectBAverageByStudents(marksB));
        System.out.println(student.subjectCTotalByStudents(marksC));
    }
}
