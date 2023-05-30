import req.StudentInfo;

public class StudentRoomInfo {
    public static void main(String[] args) {
        StudentInfo<String, Integer> s1 = new StudentInfo<>("Vivek", 319);
        StudentInfo<String, Integer> s2 = new StudentInfo<>("", 0);

        s2.setStudent("Abhi");
        s2.setRoomNumber(100);

        s1.getDetails();
        s2.getDetails();
    }    
}