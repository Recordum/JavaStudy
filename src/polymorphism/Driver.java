package polymorphism;



public class Driver {
    public static void main(String[] args) {
        Animal pingu = new Penguin(); //암묵적 형변환(Promotion)
        Penguin pororo = new Penguin();
        Animal monkey = new Animal();

        pororo.name = "뽀로로";
        pororo.habitate = "남극";
        monkey.name = "손오공";
        pingu.name = "핑구";
        //pingu.habitate = "EBS";   pingu는 객체 레퍼런스 타입이 Animal이다. Penguin 클래스의 멤버인 habitate 포함안됨.

        pororo.showName();
        pororo.showName("에의");
        pororo.showHabitate();

        pingu.showName(); //  pingu 래퍼런스 타입이 Animal 이어도, Override해 재정의한 매서드가 실행된다.
        monkey.showName();
        /* 객체 레퍼런스 타입을 상위클래스로 지정하여도. 하위클래스에 Overrride된 메소드가 실행됨으로서, 형변환이나
        instanceof 연산자를 써서 하위 클래스가 무엇인지 신경 쓰지 않아도 된다. 깔끔한 코드 유지 가능.
         */
    }
}
