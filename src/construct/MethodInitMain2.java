package construct;

public class MethodInitMain2 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        initMember(member1,"user1",15,90);


        MemberInit member2 = new MemberInit();
        initMember(member2,"user2",16,80);



        MemberInit[] members = {member1,member2};

        for (MemberInit member : members) {
            System.out.println(member.name+member.age+member.grade);

        }




    }


    // 어차피 MemberInit에 대한 값을 변경하는거면, 해당 클래스로 이 기능을 옮기는게 객체지향적이다.
    static void initMember(MemberInit member, String name, int age, int grade){
        member.name = name;
        member.grade = grade;
        member.age = age;
    }
}
