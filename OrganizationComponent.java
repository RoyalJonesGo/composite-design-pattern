public abstract class OrganizationComponent{
    protected String name;
  
    public OrganizationComponent(String name){
        this.name = name;
    }
    public void add(OrganizationComponent component){
        throw new UnsupportedOperationException();
    }
    public void remove(OrganizationComponent component){
        throw new UnsupportedOperationException();
    }
    public void displayDetails(String indent){
        throw new UnsupportedOperationException();
    }
    public int getStudentCount(){
        return 0;
    }
    public double getBudget(){
        return 0.0;
    }
}
