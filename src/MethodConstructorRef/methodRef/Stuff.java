package MethodConstructorRef.methodRef;

public class Stuff {

   public static void doTask(){
       System.out.println("i am doing task");

   }

   public static void threadTask()
   {
       for (int i = 0; i<10 ;i++) {
           System.out.println(i*3);
           try {
               Thread.sleep(1000);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }


       }
   }

   public void print15(){
       for (int i = 1; i <=15 ; i++) {
           System.out.println(i);

       }
   }

   public static int sum(int a,int b){
       return a+b;
   }
}
