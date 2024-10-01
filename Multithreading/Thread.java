package Multithreading;

class CQ extends Thread 
{
  public void run()
  {
    System.out.println("CodeQuotient");
  }
}
class Main
{
  public static void main(String[] args)
  {
    CQ t = new CQ();
    t.start();
  }
}