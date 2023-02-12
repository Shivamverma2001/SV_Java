class A{
    int i;
}
class B extends A{
    int j;
    void show(){
        super.i=j+1;
        System.out.println(j+" "+i);
    }
}
class Main{

    public static void main(String args[]){
       B o=new B();
       o.i=3;
       o.j=8;
       o.show();
    }
}