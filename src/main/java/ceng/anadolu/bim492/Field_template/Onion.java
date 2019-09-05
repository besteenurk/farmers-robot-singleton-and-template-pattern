package ceng.anadolu.bim492.Field_template;

public class Onion extends Field_process {
    @Override
    public void other_process() {
        System.out.println("--> Disinfection is doing in this field and cleaning from the herb.\n");
    }

    @Override
    public void prepare__for_next_year() {
        System.out.println("!!! Next year will be wheat in this field !!!");

    }
}
