package req;

public class StudentInfo <S, R> {
    private S student;
    private R roomNumber;

    public StudentInfo(S student, R roomNumber) {
        this.student = student;
        this.roomNumber = roomNumber;
    }

    //getter and setter
    public S getStudent() {
        return student;
    }

    public void setStudent(S student) {
        this.student = student;
    }

    public R getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(R roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void getDetails() {
        System.out.println("Student " + student + " is assigned room " + roomNumber + ".");
    }
}
