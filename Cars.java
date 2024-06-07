public class Cars
{
    int speed;
    int rpm;
    int mileage;
    int tankcapacity;

    void Race()
    {
       System.out.println("Car is in 2nd lap");
    }
    public static void main(String[] args)
    {
        Cars Ford = new Cars();
        Ford.speed = 210;
        Ford.rpm = 4500;
        Ford.mileage = 9;
        Ford.tankcapacity = 30;
        Ford.Race();
        System.out.println("car running speed "+Ford.speed+" Kmph");

    }
}