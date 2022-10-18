package homeworkWeek3.dataAccess;

import homeworkWeek3.entities.Course;

public class JdbcCourseDao implements CourseDao{
    @Override
    public void add(Course course) {
        System.out.println("JDBC ile veritabanına eklendi "+course.getName());

    }
}
