public class Food {
    private String name;
    private double price;
    private boolean veg;
    private String type;
    
    public Food (String food, double cost, boolean vegetarian, String foodType){
        name = food;
        price = cost;
        veg = vegetarian;
        type = foodType;
    }


    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public boolean getVeg(){
        return veg;
    }
    public String getType(){
        return type;
    }
}