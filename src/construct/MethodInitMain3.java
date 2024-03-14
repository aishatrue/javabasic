package construct;

public class MethodInitMain3 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();

        //member1은 MemberInit클래스의 인스턴스고, 그 클래스안에 initMember메소드가 있음.
        member1.initMember("user1",15,90);


        MemberInit member2 = new MemberInit();
        member2.initMember("user2",16,80);



        MemberInit[] members = {member1,member2};

        for (MemberInit member : members) {
            System.out.println(member.name+member.age+member.grade);

        }




    }


    // 어차피 MemberInit에 대한 값을 변경하는거면, 해당 클래스로 이 기능을 옮기는게 객체지향적이다.
//    static void initMember(MemberInit member, String name, int age, int grade){
//        member.name = name;
//        member.grade = grade;
//        member.age = age;
//    }
}
