package extends1.ex;

public class Movie extends Item{
    private String director;
    private String actor;

    public Movie(String name,int price,String director, String actor){
        super(name,price);
        //상속받은 부모클래스 생성자에서 공통 필드 초기화 해주면 쓸데없는 코드 반복을 막을 수 있음.
//        this.name = name;
//        this.price = price;
        this.director = director;
        this.actor = actor;

    }

    @Override
    public void print() {
        super.print();
        System.out.println("-감독: "+director+", 배우: "+actor);
    }

}
