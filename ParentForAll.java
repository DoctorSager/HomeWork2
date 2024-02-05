
public abstract class ParentForAll {

    private Integer endurance;
    private Integer hightOfJump;

    
    
    public abstract void Run();
    public abstract void Jump();
    
    public ParentForAll() {
    }

    public ParentForAll(int endurance, int hightOfJump) {
        this.endurance = endurance;
        this.hightOfJump = hightOfJump;
    }
    
    
    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }

    public void setHightOfJump(int hightOfJump) {
        this.hightOfJump = hightOfJump;
    }
    public int getEndurance() {
        return endurance;
    }
    public int getHightOfJump() {
        return hightOfJump;
    }
   
}