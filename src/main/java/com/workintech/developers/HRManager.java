package com.workintech.developers;

public class HRManager extends Employee {
    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    // Constructor
    public HRManager(int id, String name, double salary) {
        super(id, name, salary);
        this.juniorDevelopers = new JuniorDeveloper[5];
        this.midDevelopers = new MidDeveloper[5];
        this.seniorDevelopers = new SeniorDeveloper[5];
    }

    public void addEmployee(JuniorDeveloper junior) {
        for (int i = 0; i < juniorDevelopers.length; i++) {
            if (juniorDevelopers[i] == null) {
                juniorDevelopers[i] = junior;
                System.out.println(junior.getName() + " added as Junior Developer.");
                return;
            }
        }
        System.out.println("JuniorDeveloper array is full.");
    }

    public void addEmployee(MidDeveloper mid) {
        for (int i = 0; i < midDevelopers.length; i++) {
            if (midDevelopers[i] == null) {
                midDevelopers[i] = mid;
                System.out.println(mid.getName() + " added as Mid Developer.");
                return;
            }
        }
        System.out.println("MidDeveloper array is full.");
    }

    public void addEmployee(SeniorDeveloper senior) {
        for (int i = 0; i < seniorDevelopers.length; i++) {
            if (seniorDevelopers[i] == null) {
                seniorDevelopers[i] = senior;
                System.out.println(senior.getName() + " added as Senior Developer.");
                return;
            }
        }
        System.out.println("SeniorDeveloper array is full.");
    }
}



