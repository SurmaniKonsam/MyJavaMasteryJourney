package main.java.org.example.exercise;

public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature){
        if(summer){
            //checking for the temperature range
            if(temperature>=25 && temperature<=45){
                return true;
            }
            return false;
        }else{
            if(temperature>=25 && temperature<=35){
                return true;
            }else{
                return false;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(isCatPlaying(true,34));
        System.out.println(isCatPlaying(true,25));
        System.out.println(isCatPlaying(true,45));
        System.out.println(isCatPlaying(true,46));
        System.out.println(isCatPlaying(false,46));
        System.out.println(isCatPlaying(false,36));
        System.out.println(isCatPlaying(false,35));
        System.out.println(isCatPlaying(false,25));
        System.out.println(isCatPlaying(false,24));
    }
}
