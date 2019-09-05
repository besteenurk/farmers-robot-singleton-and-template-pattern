package ceng.anadolu.bim492;

import ceng.anadolu.bim492.Field_template.Corn;
import ceng.anadolu.bim492.Field_template.Onion;
import ceng.anadolu.bim492.Field_template.SunFlower;
import ceng.anadolu.bim492.Robot_singleton.Robot;

public class App {
    public static void main(String[] args) {

        Robot robot = Robot.getInstance();
        Corn corn = new Corn();
        SunFlower sunFlower = new SunFlower();
        Onion onion = new Onion();

        if (robot.isRunning()) {

            System.out.println("\n---------------------------------------\n" +
                    "****** SUNFLOWER'S FIELD PROCESS ******\n" +
                    "---------------------------------------\n");
            robot.isRunning();
            sunFlower.field_process();

            System.out.println("\n-----------------------------------\n" +
                    "n****** CORN'S FIELD PROCESS ******\n-----------------------------------\n");
            robot.isRunning();
            corn.field_process();

            System.out.println("\n-----------------------------------\n****** ONION'S FIELD PROCESS ******\n-----------------------------------\n");
            robot.isRunning();
            onion.field_process();
        }
        robot.run();
    }
}
