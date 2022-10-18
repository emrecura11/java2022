package homeworkWeek3.business;

import homeworkWeek3.dataAccess.CategoryDao;
import homeworkWeek3.entities.Category;
import homeworkWeek3.logging.Logger;

import java.util.ArrayList;

public class CategoryManager {
    private CategoryDao categoryDao;
   private Logger[] loggers ;
    ArrayList<String> nameList=new ArrayList<>();

    public CategoryManager(CategoryDao categoryDao,Logger[] loggers){
        this.categoryDao=categoryDao;
        this.loggers=loggers;
    }


    public void add(Category category) throws Exception{
        for (int i=0;i<nameList.size();i++) {
            if (category.getName() == nameList.get(i)) {
                throw new Exception("Bu isimde kategori zaten var.");
            }
        }
                nameList.add(category.getName());

                categoryDao.add(category);

            for (Logger logger : loggers) {
                logger.log(category.getName());
            }

    }

}
