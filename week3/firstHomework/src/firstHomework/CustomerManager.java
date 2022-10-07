package firstHomework;

public class CustomerManager {
    Customer customer;
    ICreditManager iCreditManager;

    public CustomerManager(Customer customer,ICreditManager iCreditManager){
        this.customer=customer;
        this.iCreditManager=iCreditManager;
    }


    public void Save(){

        System.out.println("Müşteri kaydedildi "+this.customer.getId());
    }
    public void Delete(){

        System.out.println("Müşteri silindi "+this.customer.getId());
    }
    public void giveCredit(){
        iCreditManager.Calculate();
        System.out.println("Kredi verildi..");

    }
}
