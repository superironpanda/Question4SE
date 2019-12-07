public class Main {
    public static void main(String[] args){
        Employee painter = new Painter();
        Employee welder = new Welder();
        Employee assembler = new Assembler();
        Employee partCollector = new PartCollector();

        partCollector.setNextEmployee(assembler);
        assembler.setNextEmployee(welder);
        welder.setNextEmployee(painter);
        partCollector.doWork(4, "");
    }
}
