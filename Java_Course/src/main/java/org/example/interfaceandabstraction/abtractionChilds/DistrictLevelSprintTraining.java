package org.example.interfaceandabstraction.abtractionChilds;

import org.example.interfaceandabstraction.Explosive;
import org.example.interfaceandabstraction.HighJump;
import org.example.interfaceandabstraction.SprintRoutine;



/**
 * Concrete class, a class becomes concrete once it has implemented all its parent
 * abstract methods.
 */
abstract class DistrictLevelSprintTraining extends SprintRoutine implements Explosive, HighJump{

    /**
     * An abstract class, can implement a method of its choice.
     */
    @Override
    public void negativeSquats(){
        System.out.println("Dfasfdsaf");
    }

    @Override
    public void horseStand(){
        System.out.println("fadsfdsa");
    }
}

class SelectedPlayer extends DistrictLevelSprintTraining{

    /**
     * Since, DistrictLevelSprintTraining have now implemented HighJump as well,
     * now the abstract method inside must be implemented as well, for the
     * SelectedPlayer to become a concrete class.
     */
    @Override
    public void highJump(){
        System.out.println("21 inch jump, static hold de-escalated state for 10sec, and " +
                "then jump again, repeat the process.");
    }

    @Override
    public void polyMetrics() {
        System.out.println("Yeah polyMetrics");
    }

    @Override
    public void polyMetricsJump(){
        System.out.println("Over-ridden the unfinished abstract method in the very last concrete remaining class.");
    }

    public static void main(String[] args) {
       SelectedPlayer selectedPlayer = new SelectedPlayer();
       selectedPlayer.polyMetricsJump();
       selectedPlayer.highJump();
    }


}