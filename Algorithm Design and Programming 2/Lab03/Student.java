public class Student extends Personnel{
    int yearInSchool;
    double gpa;
    String major;
    String minor;

    //yearInSchool 
    public void setYearInSchool(int yearInSchool){
        this.yearInSchool = yearInSchool;
    }

    public int getYearInSchool(){
        return yearInSchool;
    }

    //gpa
    public void setGpa(double gpa){
        this.gpa = gpa;
    }

    public double getGpa(){
        return gpa;
    }

    //major
    public void setMajor(String major){
        this.major = major;
    }

    public String getMajor(){
        return major;
    }

    //minor
    public void setMinor(String minor){
        this.minor = minor;
    }

    public String getMinor(){
        return minor;
    }

    //default constructor
    Student(){
        int yearInSchool = 0;
        double gpa = 0.00;
        String major = "Undecided";
        String minor = "N/A"; 
    }
    //constructor
    Student (String name, String email, int yearInSchool, double gpa, String major, String minor){
        setName(name);
        setEmail(email);
        setYearInSchool(yearInSchool);
        setGpa(gpa);
        setMajor(major);
        setMinor(minor);
    }

    //method "toString()"
    public String toString(){
        String studInfo = "Student: " + name +
                        "\nEmail: " + email +
                        "\nYear in School: " + yearInSchool +
                        "\nGPA: " + gpa +
                        "\nMajor: " + major +
                        "\nMinor: " + minor;
        return studInfo;
    }
}

