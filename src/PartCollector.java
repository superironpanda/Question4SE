public class PartCollector extends Employee {
    public PartCollector(){
        this.authorityLevel = 4;
    }

    @Override
    protected void write(String message) {
        System.out.println(message + "all parts have been gathered");
    }
}
