package review.data;

public abstract class Business implements Comparable<Business>{
    String name,location;
    Review[] reviews;
    double average;
    public Business(String name,String location,Review[] reviews)
    {
        this.reviews=reviews;
        this.name=name;
        this.location=location;
        this.average=reviewAverage();
    }
    public double reviewAverage()
    {
        double average=0;
        for(int i=0;i<reviews.length;i++)
        {
            average=average+reviews[i].getStars();

        }
        return average;
    }

    public Review[] getReviews()
    {
        return reviews;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String n)
    {
        name=n;
    }
    public String getLocation()
    {
        return location;
    }
    public void setLocation(String l)
    {
        location=l;
    }
    @Override
    public int compareTo(Business r)
    {
        if(r.average>this.average)
        return 1;
        else if(r.average<this.average)
            return -1;
        else
            return 0;
    }

    @Override
    public String toString()
    {
        return name+" ("+location+")";
    }
}
