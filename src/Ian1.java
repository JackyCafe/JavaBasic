public class Ian1 extends  Ian{
    public Ian1(){
        System.out.println("Ian1");
    }

    @Override
    public void method() {
//        super.method();
        System.out.println("Ian1 method");

    }

    public static void main(String[] args) {
        Ian1 ian = new Ian1();
        ian.method();
    }

}
