import java.util.ArrayList;
import java.util.List;

public class College extends OrganizationComponent{
    private List<OrganizationComponent> components = new ArrayList<>();

    public College(String name){
        super(name);
    }

    @Override
    public void add(OrganizationComponent component){
        components.add(component);
    }
    @Override
    public void remove(OrganizationComponent component){
        components.remove(component);
    }
    @Override
    public void displayDetails(String indent){
        System.out.println(indent + "College: " + name);
        for (OrganizationComponent component : components){
            component.displayDetails(indent + "  ");
        }
    }
    @Override
    public int getStudentCount(){
        int total = 0;
        for (OrganizationComponent component : components){
            total += component.getStudentCount();
        }
        return total;
    }
    @Override
    public double getBudget(){
        double total = 0;
        for (OrganizationComponent component : components){
            total += component.getBudget();
        }
        return total;
    }
}
