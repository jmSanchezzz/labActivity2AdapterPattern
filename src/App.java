public class App {

    public static void main(String[] args){

      Laptop laptop = new Laptop();
      LaptopAdapter laptopAdapter = new LaptopAdapter(laptop);

      Refrigerator refrigerator = new Refrigerator();
      RefrigeratorAdapter refrigeratorAdapter = new RefrigeratorAdapter(refrigerator);

      SmartPhoneCharger smartPhoneCharger = new SmartPhoneCharger();
      SmartPhoneAdapter smartPhoneAdapter = new SmartPhoneAdapter(smartPhoneCharger);



        //turn on the appliances
        System.out.println(laptopAdapter.plugIn());
        System.out.println(refrigeratorAdapter.plugIn());
        System.out.println(smartPhoneAdapter.plugIn());

        System.out.println();

      

    }
}