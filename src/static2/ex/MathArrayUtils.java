package static2.ex;

public class MathArrayUtils {

    private MathArrayUtils(){
       //기본 생성자를 프라이빗으로 만들어 인스턴스 생성을 못하게 막기.
    }

    public static int sum(int[] array){
        int result =0;
        for (int i : array) {
            result = result +i;
        }
        return result;
    }

    public static double average(int[] array){

        return (double) sum(array)/array.length;
    }

    public static int  min(int[] array){
        int min=array[0];
        for(int i=1;i<array.length-1;i++){
            if(array[i+1]<array[i]){
                min = array[i+1];
            }
        }
        return min;

    }

    public static int  max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length-1; i++) {
            if (array[i + 1] > array[i]) {
                max = array[i + 1];
            }



        }
        return max;
    }

}
