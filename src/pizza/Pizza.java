package pizza;

public abstract class Pizza {

    public abstract void prepare();

    public void bake(){
        System.out.println("烘烤");
    }

    public void cut(){
        System.out.println("切割");
    }

    public void box(){
        System.out.println("打包");
    }

}
