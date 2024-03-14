package class1;



public class ClassStart1 {
    public static void main(String[] args) {
        String students[] = {"학생1","학생2"} ;
        int ages[] = {15,16};
        int scores[] ={90,80};

        for(int i=0;i<2;i++){
            System.out.println("이름: "+students[i]+"나이:"+ages[i]+"성적: "+scores[i]);
        }
    }
}
