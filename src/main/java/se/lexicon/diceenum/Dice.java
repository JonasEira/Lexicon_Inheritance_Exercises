package se.lexicon.diceenum;

public enum Dice {
    DICE6(6), DICE10(10), DICE20(20), DICE100(100);

    int value;
    Dice(int n){
        this.value = n;
    }

    public void roll(){
        System.out.println("Rolling the number " + (int) (Math.random()*value) +  " on a " + value + " face dice." );
    }

}
