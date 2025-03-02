public abstract class writeComposition {
    private void head(){
        System.out.println("这是开头");
    }
    private  void end(){
        System.out.println("这是结尾");
    }
    public abstract void context();
    public void write(){
        head();
        context();
        end();
    }
}
