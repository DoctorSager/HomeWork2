

public class Cat extends ParentForAll  {

    
    public Cat(){

    }

    public Cat(int endurance,int hightOfJump){
        setEndurance(endurance);
        setHightOfJump(hightOfJump);

    }


    @Override
    public void Run() {
        System.out.println("Кошка бежит");
    }

    @Override
    public void Jump() {
        System.out.println("Кошка прыгает");
    }
   
}