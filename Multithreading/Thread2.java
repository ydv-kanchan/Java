package Multithreading;

class CQ implements Runnable
{
  public void run()
  {
    System.out.print("Code ");
    System.out.print("Quotient ");
  }
  public static void main(String[] args)
  {
    CQ cq1 = new CQ();
    Thread thread = new Thread(cq1);
    thread.start();
    System.out.print("Get better at ");
    try
    {
      thread.join();
    } 
    catch (InterruptedException e) 
    {
      e.printStackTrace();
    }
    System.out.println("Coding.");
  }
}