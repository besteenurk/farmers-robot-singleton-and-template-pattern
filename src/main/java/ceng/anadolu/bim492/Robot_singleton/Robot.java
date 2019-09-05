package ceng.anadolu.bim492.Robot_singleton;

import ceng.anadolu.bim492.Field_template.Field_process;

public class Robot {

    private static Robot uniqueInstance;
    private boolean running;

    public Robot() {
        running = true;
    }
    public static Robot getInstance() {
        if (uniqueInstance == null) {
            System.out.println("\n-----------\nFarmer's Robot is running.. \nYour processes are starting this year!\n.\n.\n.");
            uniqueInstance = new Robot();
        }
        return uniqueInstance;
    }
    public void run() {

        if (field_process.completed()) {
            System.out.println(".\n.\n.\n-----------\nFarmer's Robot has being stopped.\nRobot will start next year again.\n-----------\n\n");
        } else {
            System.out.println("\n\n\n-----------\nFarmer's Robot is starting.\n-----------");
        }
    }

    public boolean isRunning() { return running; }

    Field_process field_process = new Field_process() {
        @Override
        public void other_process() { }

        @Override
        public void prepare__for_next_year() { }
        @Override
        public boolean completed() {
            return super.completed();
        }
    };
}
