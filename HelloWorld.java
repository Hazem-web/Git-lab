class HelloJava{
    public void printHelloWorld(){
        System.out.println("Hello World!");
        this.sum_method(10, 1);
    }

    public static int sum_method(int a, int b){
        return a + b;
    }
}