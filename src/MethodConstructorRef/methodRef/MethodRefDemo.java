package MethodConstructorRef.methodRef;

public class MethodRefDemo {
    public static void main(String[] args) {
        Work work= Stuff::doTask;  //Referring doTask rather implementation of
        work.doWork();

        Runnable runnable=Stuff::threadTask; //Referring threadTask rather implementation of Run()
        Thread thread=new Thread(runnable);
        thread.start();


        Stuff stuff=new Stuff();
        Work work1=stuff::print15; //Referring instance method
        work1.doWork();

        Work1 works=Stuff::sum; //Referring sum rather than implementation of add()
        System.out.println(works.add(4,5));

    }
}
