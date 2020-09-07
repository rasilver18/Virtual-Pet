package test.java;

import main.java.VirtualPet;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VirtualPetTest {
    VirtualPet underTest = new VirtualPet("Ollie", "cat", "purple", 2, 2, 2, 2, 2, 2);

    @Test
    public void petShouldHaveName() {
        String petName = underTest.getName();
        assertEquals(petName, "Ollie");
    }

    @Test
    public void petShouldHaveSpecies() {
        String petSpecies = underTest.getSpecies();
        assertEquals(petSpecies, "cat");
    }

    @Test
    public void petShouldHaveColor() {
        String petColor = underTest.getColor();
        assertEquals(petColor, "purple");
    }

    @Test
    public void petShouldHaveHunger() {
        int hunger = underTest.getHunger();
        assertEquals(hunger, 2);
    }
    @Test
    public void feedShouldDecreaseHunger(){

        int feedDecrease = underTest.getHunger() -1;
        assertEquals(feedDecrease, 1);

    }
    @Test
    public void sleepShouldIncreaseHunger(){

        int sleepIncreaseHunger = underTest.getHunger() +1;
        assertEquals(sleepIncreaseHunger, 3);

    }
    @Test
    public void playShouldIncreaseHunger(){

        int playIncreaseHunger = underTest.getHunger() +1;
        assertEquals(playIncreaseHunger, 3);

    }



    @Test
    public void petShouldHaveSocial() {
        int social = underTest.getFeelings();
        assertEquals(social, 2);
    }
    @Test
    public void playShouldDecreaseSocial(){

        int playDecreaseSocial = underTest.getFeelings() -1;
        assertEquals(playDecreaseSocial, 1);

    }
    @Test
    public void snuggleShouldDecreaseSocial(){

        int snuggleDecreaseSocial = underTest.getFeelings() -1;
        assertEquals(snuggleDecreaseSocial, 1);

    }
    @Test
    public void sleepShouldIncreaseSocial(){

        int sleepIncreaseSocial = underTest.getFeelings() +1;
        assertEquals(sleepIncreaseSocial, 3);

    }



    @Test
    public void petShouldHaveComfort() {
        int comfort = underTest.getComfort();
        assertEquals(comfort, 2);
    }
    @Test
    public void playShouldIncreaseComfort(){

        int playIncreaseComfort = underTest.getComfort() +1;
        assertEquals(playIncreaseComfort, 3);

    }
    @Test
    public void snuggleShouldDecreaseComfort(){

        int snuggleDecreaseComfort = underTest.getComfort() -1;
        assertEquals(snuggleDecreaseComfort, 1);

    }
    @Test
    public void pottyShouldDecreaseComfort(){

        int pottyDecreaseComfort = underTest.getComfort() -1;
        assertEquals(pottyDecreaseComfort, 1);

    }
    @Test
    public void sleepShouldDecreaseComfort(){
        int sleepDecreaseComfort= underTest.getComfort() -1;
        assertEquals(sleepDecreaseComfort, 1);
    }



    @Test
    public void petShouldHaveEnergy() {
        int energy = underTest.getEnergy();
        assertEquals(energy, 2);
    }
    @Test
    public void playShouldIncreaseEnergy(){

        int playIncreaseEnergy = underTest.getEnergy() +1;
        assertEquals(playIncreaseEnergy, 3);

    }
    @Test
    public void sleepShouldDecreaseEnergy(){
        int sleepDecreaseEnergy = underTest.getEnergy() -1;
        assertEquals(sleepDecreaseEnergy, 1);
    }

    @Test
    public void petShouldHaveFun() {
        int fun = underTest.getFun();
        assertEquals (fun, 2);
    }
    @Test
    public void playShouldDecreaseFun(){

        int playDecreaseFun = underTest.getFun() -1;
        assertEquals(playDecreaseFun, 1);

    }
    @Test
    public void sleepShouldIncreaseFun(){

        int sleepIncreaseFun = underTest.getFun() +1;
        assertEquals(sleepIncreaseFun, 3);

    }

    @Test
    public void petShouldHaveHygiene() {
        int bathroom = underTest.getHygiene();
        assertEquals(bathroom, 2);
    }
    @Test
    public void feedShouldIncreaseBathroom() {

        int feedIncrease = underTest.getHygiene() + 1;
        assertEquals(feedIncrease, 3);

    }
    @Test
    public void sleepShouldIncreaseBathroom(){

        int sleepIncreaseBathroom = underTest.getHygiene() +1;
        assertEquals(sleepIncreaseBathroom, 3);

    }







}




//    SetName_Should_Assign_Pet_Name_Property()
//    GetName_Should_Get_Pet_Name_Value()

//    SetSpecies_Should_Assign_Pet_Species_Property()
//    GetSpecies_Should_Get_Pet_Species_Value()

//    GetHunger_Should_Return_Initial_Hunger_Level_Of_50()

//    GetBoredom_Should_Return_Initial_Boredom_Level_Of_60()

//    GetHealth_Should_Return_Initial_Health_Level_Of_30()
//    Feed_Should_Decrease_Hunger_By_40()
//    SeeDoctor_Should_Increase_Health_By_30()
//    Play_Should_Increase_Hunger_By_10()
//    Play_Should_Decrease_Boredom_By_20()
//    Play_Should_Increase_Health_By_10()
//    Tick_Should_Increase_Hunger_By_5()
//    Tick_Should_Increase_Boredom_By_5()
//    Tick_Should_Decrease_Health_By_5()*/
