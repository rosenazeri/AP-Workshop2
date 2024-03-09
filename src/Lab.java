public class Lab {
private Stu[] students ;
private String teacherName ;
private String dayOfWeek ;
private int maxSize ;
private int currentSize ;
private double avgGrade ;
public Lab(String teacherName , String dayOfWeek , int maxSize ){
    this.teacherName = teacherName ;
    this.dayOfWeek = dayOfWeek ;
    this.maxSize = maxSize ;
    students = new Stu[maxSize];
}
 public void enrollStudent(Stu student){
    students[currentSize] = student ;
 }
    public void printStuInfo0(){
        System.out.println( "teacher name =" + teacherName + "\nday of weeek ="+ dayOfWeek + "\nnumber of classmates = " + maxSize + "\n");
    }
}
