public class Shopper {
    double cashSpent;
    int itemsBought;

    public double getCashSpent(){
        return cashSpent;
    }
    public int getItemsBought(){
        return itemsBought;
    }
    

    public void addCash(double input){
        cashSpent = cashSpent + input;
    }
    public void addBoughtItem(){
        itemsBought++;
    }

}
