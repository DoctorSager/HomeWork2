

public class Main {

  public static void main(String[] args) {

    Object[] creatures = {
      new Human(102,4),
      new Cat(20,35),
      new Robot(150,3)
    };

    Object[] obstacles = {
      new RunningRoad(100),
      new Wall(5)
    };

    for (Object creature : creatures) {
      for (Object object : obstacles) {
        
        if (object instanceof RunningRoad){
          if(creature instanceof Human){
            ((RunningRoad) object).pass((Human) creature);
          }
          else if(creature instanceof Cat){
            ((RunningRoad) object).pass((Cat) creature);
          }
          else if(creature instanceof Robot){
            ((RunningRoad) object).pass((Robot) creature);
          }

        }else if (object instanceof Wall){
            if(creature instanceof Human){
              ((Wall) object).pass((Human) creature);
            }
            else if(creature instanceof Cat){
              ((Wall) object).pass((Cat) creature);
            }
            else if(creature instanceof Robot){
              ((Wall) object).pass((Robot) creature);
            }
          }
        
        }
      }
      
    }

    // for (Object creature : creatures) {

    //    for (Object obstacle : obstacles) {

    //      if (obstacle instanceof RunningRoad) {

    //        ((RunningRoad) obstacle).pass((Human) creature);
    //        ((RunningRoad) obstacle).pass((Cat) creature);
    //        ((RunningRoad) obstacle).pass((Robot) creature);
          
    //      } else if (obstacle instanceof Wall){

    //        ((Wall) obstacle).pass((Human) creature);
    //       ((Wall) obstacle).pass((Cat) creature);
    //        ((Wall) obstacle).pass((Robot) creature);

    //     }
        
    //   }
      
    // }


 
  }
    



