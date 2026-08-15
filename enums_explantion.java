/* 
enum Status{
    Rinning,Failed,Pending,Success;
}
public class enums_explantion {
    public static void main(String[] args) {

        // Status s=Status.Rinning;
        // System.out.println(s.ordinal());

        // prints all the statuses of the enum;
        // Status[] ss=Status.values();
        // for(Status s:ss){
        //     System.out.println(s+" : "+ s.ordinal());
        // }


        // Switch case with enum

        Status s=Status.Rinning;
        switch(s){
            case Rinning:
                System.out.println("all good");
                break;
            case Failed:
                System.out.println("try again");
                break;
            case Pending:
                System.out.println("please wait");
                break;
            default:
                System.out.println("Done");
                break;
        }

    }
}
*/




// Example of enum with constructor and method

enum Laptops{
    Macbook(2000),Dell(1800),Hp(1600),Asus(1500),surface();
    private int price;

    private Laptops(int price) {
        this.price = price;
    }
    private Laptops() {
        this.price = 500;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    


}
public class enums_explantion {
    public static void main(String[] args) {


        // Laptops lap=Laptops.Macbook;
        // System.out.println(lap+" + "+lap.getPrice());


        for(Laptops lap:Laptops.values()){
            System.out.println(lap+" : "+lap.getPrice());
        }
    }
}