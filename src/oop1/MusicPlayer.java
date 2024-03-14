package oop1;

//우리가 볼륨을 높이는 버튼을 누르면, 라디오 내부에서 자신의 볼륨을 높이고 낮추는 느낌.
// 멤버변수랑 기능이 분리되있을때는 각자 다른 변수라는 느낌을 줬다면.
public class MusicPlayer {
    int volume=0;
    boolean isOn = false;

    void on(){
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다");


    }
    void off(){
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다");


    }
    void volumeUp(){
        volume++;
        System.out.println("음악 플레이어 볼륨:"+volume);
    }

    void volumeDown(){
        volume--;
        System.out.println("음악 플레이어 볼륨:"+volume);
    }

    void showStatus(){
        System.out.println("음악 플레이어 상태 확인");

        if (isOn){
            System.out.println("음악 플레이어 ON, 볼륨"+volume);

        }else{
            System.out.println("음악 플레이어 OFF, 볼륨"+volume);

        }

    }
}
