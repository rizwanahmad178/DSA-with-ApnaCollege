package OOPS;

public class StaticKeyword {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolName = "ABC";
        System.out.println(s1.schoolName+" For S1");
        Student s2 = new Student();
        System.out.println(s1.schoolName+" For S2");
        System.out.println(s2.schoolName+" For S2");
        Student s3 = new Student();
        s3.schoolName = "XYZ";
        System.out.println(s1.schoolName+" For S3");
        System.out.println(s2.schoolName+" For S3");
        System.out.println(s3.schoolName+" For S3");
    }    
}
class Student{
    static int returnPercentage(int math, int phy, int chem){
        return (math+phy+chem)/3;
    }
    String name;
    int roll;
    static String schoolName;
    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }
}