package homeworkWeek3.business;

import homeworkWeek3.dataAccess.InstructorDao;
import homeworkWeek3.entities.Instructor;
import homeworkWeek3.logging.Logger;

import java.util.ArrayList;

public class InstructorManager {
    private InstructorDao instructorDao;
    private Logger[] loggers;

    public InstructorManager(InstructorDao instructorDao,Logger[] loggers){
        this.instructorDao=instructorDao;
        this.loggers=loggers;
    }


    public void add(Instructor instructor) {
            instructorDao.add(instructor);

            for (Logger logger : loggers) {
                logger.log(instructor.getName());
            }

        }
}
