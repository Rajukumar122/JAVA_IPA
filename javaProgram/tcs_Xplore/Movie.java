import java.util.*;
class Solution
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        Movie [] movie = new Movie [4];
        for(int i=0;i<4;i++)
        {
            String movieName=sc.nextLine();
            String company=sc.nextLine();
            String genre=sc.nextLine();
            int budget=sc.nextInt(); sc.nextLine();
            movie[i]= new Movie(movieName,company,genre,budget);
        }
        String genre=sc.nextLine();
        Movie [] ans = Solution.getMovieByGenre(movie,genre);
        for(int i=0;i<ans.length;i++)
        {
           if(ans[i].getBudget()>80000000)
           {
              System.out.println("High Budget Movie");
           }
           else{
             System.out.println("Low Budget Movie");
           }
        }
    }

    public static Movie [] getMovieByGenre(Movie movie [],String genre)
    {
        Movie [] arr = new Movie [0];
        for(int i=0;i<movie.length;i++)
        {
            if(movie[i].getGenre().equals(genre))
            {
                arr=Arrays.copyOf(arr,arr.length+1);
                arr[arr.length-1]=movie[i];
            }
        }
        return arr;
    }

}
class Movie
{
    private String movieName;
    private String company;
    private String genre;
    private int budget;
    Movie(String movieName, String company, String genre, int budget)
    {
        this.movieName=movieName;
        this.company=company;
        this.genre=genre;
        this.budget=budget;
    }
    public String getMovieName(){return movieName;}
    public String getCompany(){return company;}
    public String getGenre(){return genre;}
    public int getBudget(){return budget;}
}