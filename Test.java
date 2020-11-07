/**
*
* @author Fatih OGUZ
 */
public class Test {

   public static  void main(String [] args)
   {

       Systems s = new Systems();
       Administors a = s.getAdministors();

       System.out.println("ADD TO BRANCHES");
       a.addBranches(a.getBranches(),new Branches("branches a"));
       a.addBranches(a.getBranches(),new Branches("branches b"));
       a.addBranches(a.getBranches(),new Branches("branches c"));
       a.addBranches(a.getBranches(),new Branches("branches d"));
       for(int i = 0; i < a.getBranchesSize();i++)
       {
           System.out.println(a.getBranches()[i].getName());
       }
       System.out.println("DELETE TO BRANCHES NAME branches b");
       a.deleteBranches(a.getBranches(),"branches b");
       for(int i = 0; i < a.getBranchesSize();i++)
       {
           System.out.println(a.getBranches()[i].getName());
       }
       System.out.println("ADD TO BRANCHEmployees");
       a.addBrancheEmployees(a.getBranchEmployees(),new BranchEmployees("Fatih","OGUZ","branches a"));
       a.addBrancheEmployees(a.getBranchEmployees(),new BranchEmployees("Mesut","OGUZ","branches a"));
       a.addBrancheEmployees(a.getBranchEmployees(),new BranchEmployees("Anıl","OGUZ","branches a"));
       a.addBrancheEmployees(a.getBranchEmployees(),new BranchEmployees("Selahaddin","OGUZ","branches b"));
       for(int i = 0; i<a.getBrancheEmployeesSize();i++)
       {
           System.out.println(a.getBranchEmployees()[i]);
       }
       System.out.println("delete TO BRANCHEmployees mesut oguz");
       a.deleteBranchEmployees(a.getBranchEmployees(),"Mesut", "OGUZ");
       for(int i = 0; i<a.getBrancheEmployeesSize();i++)
       {
           System.out.println(a.getBranchEmployees()[i]);
       }
       System.out.println("adminoster add tranportation personnel. And " + a.getBranchEmployees()[0] + "manage to they.");
        a.addTransportationPersonnel(a.getBranchEmployees()[0],new TransportationPersonnel("batuhan","karadag",a.getBranchEmployees()[0].getShipments(),a.getBranchEmployees()[0].getShipmentSize()));
       a.addTransportationPersonnel(a.getBranchEmployees()[0],new TransportationPersonnel("ilker selim","ay",a.getBranchEmployees()[0].getShipments(),a.getBranchEmployees()[0].getShipmentSize()));
       a.addTransportationPersonnel(a.getBranchEmployees()[0],new TransportationPersonnel("metin","demirci",a.getBranchEmployees()[2].getShipments(),a.getBranchEmployees()[2].getShipmentSize()));

       for(int i=0; i<a.getBranchEmployees()[0].getTransportationPersonnelSize();i++)
       {
           System.out.println(a.getBranchEmployees()[0].getTransportationPersonnel()[i]);
       }
       System.out.println("DELETE to transportation employee İLKER SELİM AY");
       a.deleteTransportationPersonnel(a.getBranchEmployees()[0],"ilker selim");
       for(int i=0; i<a.getBranchEmployees()[0].getTransportationPersonnelSize();i++)
       {
           System.out.println(a.getBranchEmployees()[0].getTransportationPersonnel()[i]);
       }

    System.out.println("add customer branch employee fatih oguz");

       a.getBranchEmployees()[0].addCustomer(a.getBranchEmployees()[0].getCustomer(),new Customer("Melike","CAKIR"));
       a.getBranchEmployees()[0].addCustomer(a.getBranchEmployees()[0].getCustomer(),new Customer("Esra","ERDINC"));
       a.getBranchEmployees()[0].addCustomer(a.getBranchEmployees()[0].getCustomer(),new Customer("Ahmet","SOGUKPINAR"));
    for(int i=0;i<a.getBranchEmployees()[0].getCustomerSize();i++)
    {
        System.out.println(a.getBranchEmployees()[0].getCustomer()[i]);
    }

       System.out.println("DELETE customer ESRA ERDINC BY branch employee fatih oguz ");
    a.getBranchEmployees()[0].deleteCustomer(a.getBranchEmployees()[0].getCustomer(),"Esra","ERDINC");
       for(int i=0;i<a.getBranchEmployees()[0].getCustomerSize();i++)
       {
           System.out.println(a.getBranchEmployees()[0].getCustomer()[i]);
       }
 System.out.println(a.getBranchEmployees()[0]);

       a.getBranchEmployees()[0].addShipments (a.getBranchEmployees()[0].getShipments(),new Shipments(a.getBranchEmployees()[0].getCustomer()[0].getName(), a.getBranchEmployees()[0].getCustomer()[1].getName(), "845627",a.getBranchEmployees()[0].getBranchName()),a.getBranchEmployees()[0].getTransportationPersonnel()[0]);
        System.out.println(a.getBranchEmployees()[0].getShipments()[0]);
        a.getBranchEmployees()[0].ShippingStatus(s.getAdministors().getBranchEmployees()[0].getShipments(),"845627",a.getBranchEmployees()[2].getBranchName());
       System.out.println(a.getBranchEmployees()[0].getShipments()[0]);

       a.getBranchEmployees()[0].getTransportationPersonnel()[0].DeliveredShipment("84567");
       a.getBranchEmployees()[0].getTransportationPersonnel()[0].DeliveredShipment("845627");
        System.out.println("Customer see information of shipments with tracking number");
       a.getBranchEmployees()[0].getCustomer()[0].SeeingTheSituation(s,"845627");
       System.out.println("Customer see information of shipments with wrong tracking number");
       a.getBranchEmployees()[0].getCustomer()[0].SeeingTheSituation(s,"84627");


   }
}
