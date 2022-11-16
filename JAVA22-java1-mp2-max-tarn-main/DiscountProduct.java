class DiscountProduct extends Product{
    //Egenskaper: Utöver egenskaperna i Vara behövs 
    //egenskapen Rabatt i procent. (Alltså 0.01 = 1%)
    //↓↓↓
    private Integer discount = null;
    //↑↑↑

    
    private double discountedPrice = 0;
    private int oldPrice;

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


    //Metoder: Räkna ut och returnera nya priset utifrån rabatten så att endast 
    //det rabatterade priset visas i menyn för en av varorna
    //↓↓↓
    @Override
    public void writeOut(){
        System.out.print("DISCOUNTED PRODUCT: ");
        System.out.print(getName() +  ", " + getAmountLeft() + " left" );

        //det nya priset skrivs ut, samt det gammla, med en distinkt skillnad mellan priserna
        System.out.println(", old price: " + oldPrice +", NEW PRICE: " + discountedPrice  );
    }
   //↑↑↑

    public DiscountProduct(String name, double price, int amountLeft, Integer discount){
        super(name, price, amountLeft);
        oldPrice = (int)price;
        this.discount = discount;
        discountedPrice = price - ((price * discount)/100);
        
        setPrice((int)discountedPrice);
    }
    
}