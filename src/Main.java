public class Main {
    public static void main(String[] args) {
      Stu s1 = new Stu("Rose" , "Nazeri" , "40231423");
      Stu s2 = new Stu("mehdi" , "baseri" , "40231007");
      s1.setgrade(20);
      s2.setgrade(-20);
      s1.printStuInfo();
      s2.printStuInfo();
      Lab lab1 = new Lab("Foroghi" , "Saturday" , 20);
      lab1.printStuInfo0();
    }
}