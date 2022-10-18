package homeworkWeek3.dataAccess;

import homeworkWeek3.entities.Category;

public class JdbcCategoryDao implements CategoryDao {

    @Override
    public void add(Category category) {
        System.out.println("JDBC ile veritabanına eklendi.." +category.getName());
    }

}
