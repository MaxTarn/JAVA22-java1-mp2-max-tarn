public class Product {
    private String name;
    private double price;
    private int amountLeft;
    private Integer discount = null;
    private double discountedPrice = 0;

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

    //getter setter for discount 
    public int getDiscount(){
        return discount;
    }
    public void setDiscount(Integer input){
        if(input >= 1 && input < 100){
            discount = input;
        }else{
            System.out.println("Error: invalid amount of discount");
        }
    }
    //getter setter for discount END

    //------------------------------------getter setters END--------------------------------

    public void writeOut(){
        if(discount != null){
            System.out.print("DISCOUNTED PRODUCT: ");
        }
        System.out.print(name +  ", " + amountLeft + " left" );

        if(discount != null){
            double result = price - ((price * discount)/100);
            System.out.println(", old price: " + price +", NEW PRICE: " + result  );
        }else{
            System.out.println(", price: " + price);
        }
        
    }
    public double buy(){
        if(amountLeft>0){
            amountLeft = amountLeft - 1;
            if(discountedPrice > 0){
                return discountedPrice;
            }else{
                return price;
            }
        }else{
            return 0;
        }
    }




    public Product(String name, double price, int amountLeft){
        this.name = name;
        this.price = price;
        this.amountLeft = amountLeft;
    }
    public Product(String name, double price, int amountLeft, Integer discount){
        this.name = name;
        this.price = price;
        this.amountLeft = amountLeft;
        this.discount = discount;
        discountedPrice = price - ((price * discount)/100);
    }
}
