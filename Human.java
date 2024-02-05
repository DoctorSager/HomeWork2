
public class Human extends ParentForAll {

    public Human(){

    }
    
    public Human(int endurance,int hightOfJump){
        setEndurance(endurance);
        setHightOfJump(hightOfJump);

    }

    @Override
    public void Run() {
        System.out.println("Человек бежит");
    }

    @Override
    public void Jump() {
       
        System.out.println("Человек прыгает");
    }

    @Override
    public String toString() {
        return "Human";
    }

 
}