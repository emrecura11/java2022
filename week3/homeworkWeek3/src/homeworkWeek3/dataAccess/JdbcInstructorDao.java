package homeworkWeek3.dataAccess;

import homeworkWeek3.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao{
    @Override
    public void add(Instructor instructor) {
        System.out.println("JDBC ile veritabanına eklendi "+instructor.getName());

    }
}
