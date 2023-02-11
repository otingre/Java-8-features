interface Interf
{
    public void m1();
}

// class Demo implements Interf
// {

//     public void m1()
//     {
//         System.out.println("Hey from child");
//     }

// }

class lamdaandfuntional
{
    public static void main(String[] args)
    {
        {
            Interf i = ()->System.out.println("hey from child");
            i.m1();
        }
    }
}