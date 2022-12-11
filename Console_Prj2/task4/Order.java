package Console_Prj2.task4;

public class Order {
    String order;
    int price ;
    boolean type ;
    void printOrderInfo(){

        String t;
        if(type == true){
            t= "vegeterian";
        }else{
            t = "not vegenerian";
        }
        //System.out.print(Ord + ":"+  Type + ","+Price +":"+t);
        System.out.printf("order: %s, price=%s, type = %s\n",order, price, t);
    }
}
