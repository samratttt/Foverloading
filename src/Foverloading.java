public class Foverloading {

    // just using default no args constructor

    int add(int a , int b){
        return a+b;
    }

    int add(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args){
        Foverloading obj1 = new Foverloading();
        System.out.println(obj1.add(1,2));
        System.out.println(obj1.add(1,2,3));
    }
}
