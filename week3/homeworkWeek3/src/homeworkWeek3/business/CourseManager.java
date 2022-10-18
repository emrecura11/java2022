package homeworkWeek3.business;

import homeworkWeek3.dataAccess.CourseDao;
import homeworkWeek3.entities.Course;
import homeworkWeek3.logging.Logger;

import java.util.ArrayList;

public class CourseManager {
    private CourseDao courseDao;
    private Logger[] loggers ;
    ArrayList<String> nameList=new ArrayList<>();

    public CourseManager(CourseDao courseDao,Logger[] loggers){
        this.courseDao=courseDao;
        this.loggers=loggers;
    }


    public void add(Course course) throws Exception{
        for (int i=0;i<nameList.size();i++) {
            if (course.getName() == nameList.get(i)) {
                throw new Exception("Bu isimde kategori zaten var.");
            }

            nameList.add(course.getName());
            courseDao.add(course);
        }

            for (Logger logger : loggers) {
                logger.log(course.getName());
            }

    }


}
