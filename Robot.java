
public class Robot extends ParentForAll {

    public Robot(){

    }

    public Robot(int endurance,int hightOfJump){
        setEndurance(endurance);
        setHightOfJump(hightOfJump);

    }

    @Override
    public void Run() {
        System.out.println("Робот бежит");
    }

    @Override
    public void Jump() {
        System.out.println("Робот прыгает");
    }

    @Override
    public String toString() {
        return "Robot";
    }

    
}