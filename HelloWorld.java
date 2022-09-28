public class HelloWorld
{

    int i=0;
    int k=10;
    int a=5;
    int b=15;
    public void run() {
        while (i<15) {
            System.out.println("i is " + i);
            i= i+1;                
        }
        while (k>5) {
            System.out.println("k is " + k); 
            k= k-1;
        }
        while (a<10 && b<=20){
            System.out.println("a is " + a);
            a= a +1;
            System.out.println("b is " + b);
            b= b +1;
        }
    }

    public static void main(String[] args)
    {        
        HelloWorld hw = new HelloWorld();
        hw.run();
    }
}                     
 