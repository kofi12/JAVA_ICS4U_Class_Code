public class Z extends X{

    public Z() {
        super();
        this.mode = "Z";
    }

    @Override
    public int doSomething(){
        return super.doSomething() + 2;
    }
}
