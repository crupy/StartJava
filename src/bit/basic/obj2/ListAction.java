package bit.basic.obj2;

public class ListAction extends Action{
    private String path;
    private boolean redirect;


    public ListAction(String path, boolean redirect) {
        this.path = path;
        this.redirect = redirect;
    }

    @Override
    public ActionForward excute() {
        System.out.println("ListAction");
        return new ActionForward(path, redirect);
    }
}
