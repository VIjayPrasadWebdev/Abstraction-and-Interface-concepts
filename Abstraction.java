import java.util.Scanner;

 abstract class UBISOFT
{
    String game_name;
    void game_names()
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Game name is : ");
        game_name=s.nextLine();
    }

      abstract void game_engine();
      abstract void game_physics();
}

   abstract class Anvilnext extends UBISOFT
{
    public void game_engine()
    {
        System.out.println(game_name +  " " + "is using Anvilnext Engine \n");
    }
}

class havoc extends  Anvilnext
{
    void game_physics()
    {
        System.out.println(game_name +" "+ "is using Havoc physics");
    }
}




public class Abstraction {
    public static void main(String []ar)
    {
           havoc gamelaunch=new havoc();
           gamelaunch.game_names();
           gamelaunch.game_engine();
           gamelaunch.game_physics();
    }
}
