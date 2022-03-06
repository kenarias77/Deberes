package review.data;

public class Review{
    String comment;
    int stars;
    Users user;
    public Review(Users user,String comment,int stars)
    {
        this.user=user;
        this.comment=comment;
        if(stars<=5&&stars>=0)
            this.stars=stars;
    }
    public Users getUser()
    {
        return user;
    }
    public void setUser(Users u)
    {
        user=u;
    }
    public String getComment()
    {
        return comment;
    }
    public void setComment(String c)
    {
        comment=c;
    }
    public int getStars()
    {
        return stars;
    }
    public void setStars(int s)
    {
        if(s<=5&&s>=0)
            stars=s;
    }
    @Override
    public String toString()
    {
        return user+"\n"+comment+"\n"+stars+"/5";
    }
}
