package main.java;

public class VirtualPet {
    private int hungerLevel;
    private int socialLevel;
    private int comfortLevel;
    private int energyLevel;
    private int funLevel;
    private int bathroomLevel;
    private String petName;
    private String petSpecies;
    private String petColor;





    public VirtualPet (String petName, String petSpecies, String petColor, int hungerLevel, int socialLevel, int comfortLevel, int energyLevel, int funLevel, int bathroomLevel){
    this.petName = petName;
    this.petSpecies = petSpecies;
    this.petColor = petColor;
    this.hungerLevel = hungerLevel;
    this.socialLevel = socialLevel;
    this.comfortLevel = comfortLevel;
    this.energyLevel = energyLevel;
    this.funLevel = funLevel;
    this.bathroomLevel = bathroomLevel;
}

    public VirtualPet() {

    }

    public int getHunger() {
        return hungerLevel;
    }

    public void feed() {
        hungerLevel --;
        bathroomLevel ++;

    }


    public int getFeelings() {
        return socialLevel;


    }
    public int getComfort(){
        return comfortLevel;
    }

    public int getFun(){
        return funLevel;
    }

    public void play() {
        funLevel --;
        socialLevel --;
        energyLevel ++;
        hungerLevel ++;
        comfortLevel ++;
    }

    public void snuggle() {
        socialLevel --;
        comfortLevel --;
    }


    public int getHygiene() {
        return bathroomLevel;
    }

    public void pottyTime() {
        bathroomLevel --;
        comfortLevel --;
    }


    public int getEnergy() {
        return energyLevel;
    }

    public void sleep() {
        energyLevel --;
        comfortLevel --;
        socialLevel ++;
        funLevel ++;
        bathroomLevel ++;
        hungerLevel ++;
    }
    public void tick() {
        checkHunger();
        checkEnergy();
        checkBathroom();
        socialLevel++;
        funLevel++;
        comfortLevel ++;
        energyLevel ++;
    }

    private void checkHunger(){
        if(hungerLevel ==30){
            System.out.println("You let me starve. :'( ");
            System.exit(0);
        }
    }
    private void checkEnergy(){
        if(energyLevel ==20){
            System.out.println("I am experiencing sleep deprivation. System has crashed. Goodbye");
            System.exit(0);
        }
    }
    private void checkBathroom(){
        if(bathroomLevel ==25){
            System.out.println("There is too much poop!!!");
            System.exit(0);
        }
    }

    public String getName() {return petName;
    }

    public String getSpecies() { return petSpecies;
    }

    public String getColor() { return petColor;
    }

//    @Override
//    public String toString() {
//        return "VirtualPet{" +
//                "hunger=" + hunger +
//                ", social=" + social +
//                ", comfort=" + comfort +
//                ", energy=" + energy +
//                ", fun=" + fun +
//                ", bathroom=" + bathroom +
//                '}';
//    }
}
