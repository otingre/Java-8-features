public class methodreferencing
{
    public static void main(String[] args) 
    {
        System.out.println("This is the main method");

        Interf interref = Stuff::dostuff;
        interref.doTask();

        Runnable r = Stuff::threadimp;
        Thread t = new Thread(r);
        t.start();


        Stuff ob = new Stuff();
        ob.non_stat_method();
    }
}

interface Interf{
    public void doTask();
}


class Stuff
{
    public static void dostuff()
    {
        System.out.println("I am doing stuff");
    }

    public static void threadimp()
    {
        for (int i = 1; i <= 10; i++)
        {
            System.out.println(i*2);
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public void non_stat_method(){

        System.out.println("this is the non-static method");
    }
}

