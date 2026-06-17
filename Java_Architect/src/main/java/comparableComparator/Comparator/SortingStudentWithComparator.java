package comparableComparator.Comparator;


import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

class StudentPojo{
    String studentName;
    int rollNumber;
    String streams;

    public StudentPojo(String studentName, int rollNumber, String streams) {
        this.studentName = studentName;
        this.rollNumber = rollNumber;
        this.streams = streams;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getStreams() {
        return streams;
    }


    @Override
    public String toString() {
        return "StudentPojo{" +
                "studentName='" + studentName + '\'' +
                ", rollNumber=" + rollNumber +
                ", streams='" + streams + '\'' +
                '}';
    }
}

class CompareStudentRoll implements Comparator<Integer>{
    @Override
    public int compare(Integer r1,Integer r2){
        /**
         * Let's return in descending order
         */
        return r2 - r1;
    }
}


public class SortingStudentWithComparator {
    public static void main(String[] args) {
        StudentPojo studentPojo = new StudentPojo("James",45,"Science");
        StudentPojo studentPojo1 = new StudentPojo("Jina",4,"Arts");
        StudentPojo studentPojo8 = new StudentPojo("Jack",4,"Arts");
        StudentPojo studentPojo2 = new StudentPojo("Kin",2,"Commerce");
        List<StudentPojo> allList = List.of(studentPojo1,studentPojo2,studentPojo,studentPojo8);
        List<StudentPojo> studentPojoList = new ArrayList<>(allList);
        /**
         * If the lambda expression is of one line you don't need to put return or curly braces
         */
        studentPojoList.sort((r1,r2)-> {
            if(r2.rollNumber - r1.rollNumber > 0){
                return 1;
            }else if(r2.rollNumber - r1.rollNumber<0){
                return -1;
            }return 0;
        });


        for (StudentPojo read: studentPojoList) {
            System.out.println(read.toString());
        }



    }
}
