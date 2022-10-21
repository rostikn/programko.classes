package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Family {
    ArrayList<Human> familyMembers = new ArrayList<>();


    public void addMember(Human human) {
        familyMembers.add(human);
    }

    public void freeTime() {
        for (Human familyMember : familyMembers) {
            familyMember.doSomething();
        }
    }

    public void showAllMembers() {
        for (Human familyMember : familyMembers) {
            System.out.println(familyMember.getRole());
            System.out.println(familyMember.getName());
        }
    }

}



