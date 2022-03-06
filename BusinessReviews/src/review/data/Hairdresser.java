package review.data;

public class Hairdresser extends Business{
    boolean unisex;
    public Hairdresser(String name,String location,Review[] reviews,boolean unisex)
    {
        super(name,location,reviews);
        this.unisex=unisex;
    }

    public boolean getUnisex()
    {
        return unisex;
    }
    public void setUnisex(boolean u)
    {
        unisex=u;
    }

    @Override
    public String toString()
    {
         if(unisex)
         {
             return super.toString()+" - unisex"+"\nReview average: "+reviewAverage();
         }
         else{
             return super.toString()+" - not unisex"+"\nReview average: "+reviewAverage();
         }

    }
}
