public class UserDefinedDataType {
    public static class Student{
        String name;
        int rno;
        double cgpa;

    }
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "Priti";
        s1.rno = 23;

         Student s2 = new Student();
        s2.name = "Anu";
        s2.rno = 24;

         Student s3 = new Student();
        s3.name = "Madhu";
        s3.rno = 25;

         Student s4 = new Student();
        s4.name = "Utkarsh";
        s4.rno = 26;

         Student s5 = new Student();
        s5.name = "Adarsh";
        s5.rno = 27;

        System.out.println(s1.name+" "+s1.rno);
        System.out.println(s2.name+" "+s2.rno);
        System.out.println(s3.name+" "+s3.rno);
        System.out.println(s4.name+" "+s4.rno);
        System.out.println(s5.name+" "+s5.rno);

    }
}
