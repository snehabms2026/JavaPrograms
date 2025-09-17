// in the source folder create a hippo class file : save it as hippo.java

public class Hippo
{
  int size;
public void sing()
{
  SOP("i sing haha");
}
}

// create .java file write and create a class having main method here and using the hippo class inside of it created previously

public class HippoTest
  {
    public static void main(String[] args)
    {
      Hippo h1 = new Hippo():
      h1.size = 10;
      SOP("h1.size" + h1.size); // 10
      h1.size = 20;
      SOP("h1.size" + h1.size); // 20
      Hippo h2 = h1;
      SOP("h2.size" + h2.size); // 20
      h2.size = 0;
      SOP("h1.size" + h1.size); // 0
      h1 = new Hippo();
      h1.size = 25;
      SOP("h1.size" + h1.size); // 25
      SOP("h2.size" + h2.size); // 0
     h1.sing(); // hippo sings 
      h2.sing(); // hippo sings sop will be printed from hippo class method
    }
  }
