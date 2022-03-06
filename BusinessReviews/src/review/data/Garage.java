package review.data;

public class Garage extends Business{
    float price;

    public Garage(String name,String location, Review[] reviews,float price)
    {
        super(name,location,reviews);
        this.price=price;
    }
    public float getPrice()
    {
        return price;
    }
    public void setPrice(float price)
    {
        this.price=price;
    }

    @Override
    public String toString()
    {
        return super.toString()+" - "+price+" eur/h"+"\nReview average: "+reviewAverage();
    }
}
