import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLData;
import java.sql.SQLException;
import java.util.Objects;

public class Student  {
    int id;
    String name;

    public Student(){}
    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }




//    @Override
//    public boolean equals(Object obj){
//        if (this == obj) return true;
//        if (!(obj instanceof Student) || obj == null) return false;
//        Student student = (Student) obj;
//        return this.id == student.id && this.name == student.name;
//    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(id, name);
//    }
}
