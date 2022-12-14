package polymorphism;

class Animal {
    public String name;

    public void showName(){
        System.out.println("내이름은" + name + ". 반가워");
    }
}
class Penguin extends Animal{
    public String habitate;

    public void showHabitate(){
        System.out.println(habitate + "에 살아");

    }

    @Override
    public void showName(){
        System.out.println("내이름을 알아서 뭐하게요");
    }

    public void showName(String manner){
        System.out.println("안녕 내이름은" + name );
    }
}


