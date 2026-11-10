package org.example.interfaceandabstraction.abtractionChilds;

import org.example.interfaceandabstraction.SprintRoutine;


/**
 * Concrete class, a class becomes concrete once it has implemented all its parent
 * abstract methods.
 */
abstract class DistrictLevelSprintTraining extends SprintRoutine {

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
    @Override
    public void polyMetricsJump(){
        System.out.println("Overriden the unfinished abstract method in the very last concrete remaining class.");
    }

    public static void main(String[] args) {
       SelectedPlayer selectedPlayer = new SelectedPlayer();
       selectedPlayer.polyMetricsJump();
    }
}