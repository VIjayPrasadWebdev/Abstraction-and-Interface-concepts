interface EA
{
    abstract void game_publish();
}

interface Pandemic_studios
{
    abstract void game_engine();
}


 class game implements EA, Pandemic_studios
{
    void game_name()
    {
        System.out.println("Game name is Saboteur\n");
    }
    @Override
    public void game_publish() {
        System.out.println("10 - 12 - 2009\n");
    }
    public void game_engine()
    {
        System.out.println("Unreal Engine");
    }
    }



public class Interface_program {
    public  static void main(String []ar)
    {
              game g=new game();
              g.game_name();
              g.game_publish();
              g.game_engine();
    }

}
