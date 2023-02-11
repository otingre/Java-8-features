interface I
{
    public void m1();
    public void m2();
    // public void m3();
    default void m3()
    {
        System.out.println("This is the defalt implementation");
    }
}

class D1 implements I
{
    public void m1(){};
    public void m2(){};
    
}

class D2 implements I
{
    public void m1(){};
    public void m2(){};
    
}

class D3 implements I
{
    public void m1(){};
    public void m2(){};
    
}