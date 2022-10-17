import java.util.Scanner;

class Mp2{
    static void clear(){
        System.out.print("\033[H\033[2J");
    }
    static void writeOutAll(Product potato, Product lolipop, Product pasta, Product discountMilk){
        System.out.print("1. ");
        potato.writeOut();
        System.out.print("2. ");
        lolipop.writeOut();
        System.out.print("3. ");
        pasta.writeOut();  
        System.out.print("4. ");
        discountMilk.writeOut();
        System.out.println("5. Quit");
    }
    static String buyIt(Product unknownProduct, Shopper unknownShopper){
        double priceOfProduct = unknownProduct.buy();
        String out;
        if(priceOfProduct == 0){
            out = "Error: not enough remaining products";
        }else{
            unknownShopper.addCash(priceOfProduct);
            unknownShopper.addBoughtItem();
            out = null;
        }
        return out;
    }
    public static void main(String[] args) {
        //kund  == Shopper class
        //vara  == Product class
        //rabbaterad vara  == Product class med en integer på slutet, 
        clear();
        Scanner scan = new Scanner(System.in);
        Shopper hooman = new Shopper();

        Product potato = new Product("Potato",69 , 5);
        Product lolipop = new Product("Lolipop", 6.9, 60);
        Product pasta = new Product("Pasta", 42.0, 15);
        Product discountMilk = new Product("Milk", 20, 2, 25);

        
        Integer input;
        boolean wantsExit = false; 
        String err = null;   
        while(wantsExit == false){            
            writeOutAll(potato, lolipop, pasta, discountMilk);
            if(err != null){
                System.out.println(err);
            }
            
            input = null;
            while(input == null){
                try {
                    input = Integer.parseInt(scan.nextLine());
                } catch (Exception ex) {
                    System.out.println("Error: the only accepted input is numbers in the range of 1-5");
                }
            }
            err = null;
            switch(input){
                case 1:
                err = buyIt(potato, hooman);
                break;

                case 2:
                err = buyIt(lolipop, hooman);
                break;

                case 3:
                err = buyIt(pasta, hooman);
                break;

                case 4:
                err = buyIt(discountMilk, hooman);
                break;

                case 5:
                wantsExit = true;
                break;
                
                default:
                break;
            }
            clear();
        }
        System.out.println("Total money spent: " + hooman.getCashSpent());
        System.out.println("Total amount of items bought: " + hooman.getItemsBought());
        scan.nextLine();
        scan.close();
    }
} 