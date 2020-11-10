package Game;

public class Player {

    private int hp;
    private final String name;

    public Player( String name, int hp ){
        this.name = name;
        this.hp = hp;

    }

    public void display(){
        System.out.println(this.name);
        System.out.println(this.hp + "\n");
    }

    public int getHp(){
        return this.hp;
    }
    public void hitHp(int hit){
        if (this.hp > 0)
            this.hp -= hit;
    }
    public String getName(){
        return this.name;
    }

}
