package ceng.anadolu.bim492.Field_template;

public abstract class Field_process {


    public final void field_process() {
        watering();
        cultivate();
        other_process();
        watering();
        fallowing();
        prepare__for_next_year();
        plant();
        if (completed()) {
            System.out.println("\nThis year processes are completed in this field.");
        }
    }

    public abstract void other_process();
    public abstract void prepare__for_next_year();

    void watering() { System.out.println("Field is watering now..");
    }

    void fallowing() {
        System.out.println("\nIn fall term;\nField is fallowing now..\n");
    }

    void cultivate() {
        System.out.println("\nIn summer term;\nField is cultivating now..\n");
    }
    void plant() {
        System.out.println("\nField is planting now..");
    }

    public boolean completed() {
        return true;
    }


}
