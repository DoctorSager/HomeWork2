

public class RunningRoad {

    private int lenght;

    public RunningRoad(int lenght) {
        this.lenght = lenght;
      
    }

    public void pass(Object creature){

        if (creature instanceof Human) {
                if (((Human)creature).getEndurance() >= lenght) {
                System.out.println("Человек успешно пробежал");
                }else{
                System.out.println("Человек не справился с дорожкой");
            }
        }
        else if (creature instanceof Cat){
            if (((Cat)creature).getEndurance() >= lenght){
                System.out.println("Кот успешно пробежал");
            }else{
                System.out.println("Кот не справился с дорожкой"); 
            }
            
        }
        else if (creature instanceof Robot){
            if(((Robot)creature).getEndurance() >= lenght){
                System.out.println("Робот успешно пробежал");
            }else{
                System.out.println("Робот не справился с дорожкой");
            }
        }
    
        

    }



 
    


    
}