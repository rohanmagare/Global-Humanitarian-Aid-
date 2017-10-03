/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.victim;

/**
 *
 * @author Admin
 */
public class Victim {
    
    private int victimId;
    private static int count = 0;
    private String victimName;
    private int age;
    private boolean maleGender;
    private boolean foodRequired;
    private boolean shelterRequired;
    private boolean medicationRequired;
    private boolean educationRequired;

    public Victim() {
        victimId = ++count;
    }

    public String getVictimName() {
        return victimName;
    }

    public void setVictimName(String victimName) {
        this.victimName = victimName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMaleGender() {
        return maleGender;
    }

    public void setMaleGender(boolean maleGender) {
        this.maleGender = maleGender;
    }

    public boolean isFoodRequired() {
        return foodRequired;
    }

    public void setFoodRequired(boolean foodRequired) {
        this.foodRequired = foodRequired;
    }

    public boolean isShelterRequired() {
        return shelterRequired;
    }

    public void setShelterRequired(boolean shelterRequired) {
        this.shelterRequired = shelterRequired;
    }

    public boolean isMedicationRequired() {
        return medicationRequired;
    }

    public void setMedicationRequired(boolean medicationRequired) {
        this.medicationRequired = medicationRequired;
    }

    public boolean isEducationRequired() {
        return educationRequired;
    }

    public void setEducationRequired(boolean educationRequired) {
        this.educationRequired = educationRequired;
    }
    
    
    
}
