package review.data;

public class Restaurants extends Business {
    String foodType;
    public Restaurants(String name,String location,Review[] reviews,String foodType){
        super(name,location,reviews);
        this.foodType=foodType;
    }

    public String getFoodType()
    {
        return foodType;
    }
    public void setFoodType(String f)
    {
        foodType=f;
    }

    @Override
    public String toString()
    {
        return "Restaurant "+super.toString()+" - "+foodType+"\nReview average: "+reviewAverage();
    }
}
