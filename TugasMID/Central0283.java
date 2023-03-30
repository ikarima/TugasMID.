//Nama :Ikarima
//Nim :13020210283
interface A {
    public void aaa();
}

interface B extends A {
    
}

class Central0283 implements B {
    public void aaa() {
        System.out.println("aaa");
    }

    public static void main(String arg[]) {
        Central0283 obj = new Central0283();
        System.out.println("main");
        obj.aaa();
    }
}
