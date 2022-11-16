public class Product {
    //Egenskaper: Minst tre stycken egenskaper 
    //för att presentera varan korrekt i menyn
    //↓↓↓
    private String name;
    private double price;
    private int amountLeft;
    //↑↑↑

    //------------------------------------getter setters------------------------------------

    //getter setter for name
    public String getName(){
        return name;
    }
    public void setName(String input){
        System.out.println("Error: not able to change name of an already instantiated product");
    }
    //getter setter for name END

    //getter setter for price 
    public double getPrice(){
        return price;
    }
    public void setPrice(int input){
        if(input > 0){
            price = input;
        }else{
            System.out.println("Error: not able to change price to less than zero");
        }
    }
    //getter setter for price END

    //getter setter for amountLeft
    public int getAmountLeft(){
        return amountLeft;
    }
    public void setAmountLeft(int input){
        if(input<0){
            amountLeft = input;
        }else{
            System.out.println("Error: you can't have negative stock of something");
        }
    }
    //getter setter for amountLeft END

    

    //------------------------------------getter setters END--------------------------------

    public void writeOut(){
        System.out.print(name +  ", " + amountLeft + " left" );
        System.out.println(", price: " + price);
    }

    //Metoder:Minst en metod för att uppdatera en av 
    //egenskaperna varje gång en vara köps
    //↓↓↓
    public double buy(){
        if(amountLeft>0){
            amountLeft = amountLeft - 1;
            return price;
        }else{
            return 0;
        }
    }
    //↑↑↑



    public Product(String name, double price, int amountLeft){
        this.name = name;
        this.price = price;
        this.amountLeft = amountLeft;
    }
    
}
