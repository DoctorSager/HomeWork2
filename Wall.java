

public class Wall {

    int hight;

    public Wall(int hight) {
        this.hight = hight;
    }

    public void pass(Object creature){

        if (creature instanceof Human) {
            if (((Human)creature).getEndurance() >= hight) {
                System.out.println("Человек успешно перепрыгнул");
            }else{
                System.out.println("Человек не перепрыгнул");
            }
        }
        else if (creature instanceof Cat){
            if (((Cat)creature).getEndurance() >= hight){
                System.out.println("Кот успешно перепрыгнул");
            }else{
                System.out.println("Кот не перепрыгнул");
            }
        }
        else if (creature instanceof Robot){
            if(((Robot)creature).getEndurance() >= hight){
                System.out.println("Робот успешно перепрыгнул");
            }else{
                System.out.println("Робот не перепрыгнул");
            }
        }
        }

 
    }

  
 
