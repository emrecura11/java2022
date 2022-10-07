package firstHomework;
public class Main {

    public static void main(String[] args) {
        /*CreditManager creditManager=new CreditManager();
        creditManager.Calculate();
        creditManager.Calculate();
        creditManager.Save();

        Customer customer = new Customer();
        customer.setId(1);
        customer.setCity("Antalya");




        CustomerManager customerManager = new CustomerManager(customer);
        customerManager.Save();
        customerManager.Delete();

        Company company = new Company();
        company.setTaxNumber("100000");
        company.setCompanyName("Arçelilk");
        company.setId(100);

        CustomerManager customerManager2=new CustomerManager(company);

        Person person = new Person();
        person.setNationalIdentity("123456");

        Customer c1=new Customer();
        Customer c2=new Person();
        Customer c3=new Company();
*/

CustomerManager customerManager=new CustomerManager(new Customer(),
        new TeacherCreditManger());
customerManager.giveCredit();


















    }
}
