public class Main {
    public static void main(String[] args){

        Student student1 = new Student();
        student1.setName("Your Name");
        student1.setEmail("Your Email");
        student1.setYearInSchool(1);
        student1.setGpa(3.5);
        student1.setMajor("Computer Science");
        student1.setMinor("Math");

        System.out.println(student1);

        Student student2 = new Student("Your name2","Your email2", 2, 3.5, "CS", "Math");
  
        System.out.println(student2);

    }
}
