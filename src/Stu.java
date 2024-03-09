public class Stu {
    private String stuNum ;
    private String firstName ;
    private String lastName ;
    private double grade ;
    public Stu(String Fname , String Lname , String id){
        this.stuNum = id ;
        this.firstName = Fname ;
        this.lastName = Lname ;
        grade = 0 ;

    }

    public String getStuNum() {
        return stuNum;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getGrade() {
        return grade;
    }

    public void setgrade(double grade) {
        this.grade = grade;

    }
    public void printStuInfo(){
        System.out.println(firstName +" " + lastName + "\nID ="+ stuNum + "\nGrade = " + grade + "\n");
    }
    public void enrollStudent(Stu student){
         System.out.println(firstName + " ") ;
    }
}
