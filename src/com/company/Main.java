package com.company;

public class Main {

    public static void main(String[] args) {
        Family family = new Family();
        Woman woman = new Woman("Denisa", 27, "matka");
        Man man = new Man("David", 30, "otec");
        family.addMember(woman);
        family.addMember(man);
        family.freeTime();
    }
}
