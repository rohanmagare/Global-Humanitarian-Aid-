/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.victim;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class VictimDirectory {
    private ArrayList<Victim> victimList;
    
    public VictimDirectory(){
    victimList=new ArrayList<>();
    }

    public ArrayList<Victim> getVictimList() {
        return victimList;
    }

    public void setVictimList(ArrayList<Victim> victimList) {
        this.victimList = victimList;
    }
    
    public Victim addVictim(){
        Victim v = new Victim();
        victimList.add(v);
        return v;
    }
}
