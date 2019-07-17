public class Player {

    //locals
    private String name;
    private int strength;
    private int health;
    private int stamina;
    private int speed;
    private int attackPower;
    private int run;
    private int attack;
    private int heal;
    private int decreaseHealth;
    private int decreaseStamina;
    private int decreaseStrength;
    private int criticalHit;


    //constructor
    public Player (String name, int health, int staminia, int speed, int attackPower, int run, int attack, int heal, int decreaseHealth, int decreaseStamina, int decreaseStrength, int criticalHit) {
        this.name = name;
        this.health = health;
        this.stamina = staminia;
        this.speed = speed;
        this.attackPower = attackPower;
        this.run = run;
        this.attack = attack;
        this.heal = heal;
        this.decreaseHealth = decreaseHealth;
        this.decreaseStrength  = decreaseStrength;
        this.criticalHit = criticalHit;
    }

    //methods

    public void search() {
        System.out.println("You search around you.");
    }

    public void dash() {
        System.out.println("You dash");
        speed *= run;
    }

    public void ATK() {
        System.out.println("You attack");
        attack *= 1;
    }

    public void CRIT() {
        System.out.println("USED SPECIAL ATTACK: TIMBER\n");
        System.out.println("TIIIIIMMMMMMMMMMMMMMMMMMMBEEEEEEEEEEEEEEEEEEEEEEEER");
        attack *= 4;
    }


    public void healing() {
        System.out.println("You've healed up a bit.");
        health += health;
    }

    public void hit(){
        System.out.println("You've taken damage");
        health -= decreaseHealth;
    }

    public void tired() {
        System.out.println("You're getting tired");
        stamina -= decreaseStamina;
    }

    public void weak() {
        System.out.println("Your strength is leaving you.");
        strength -= decreaseStrength;
    }



    //getset

    // This one's my own doing. I know I could probably just set up an IncreasedAttack, but this feels more in the spirit of the game.
    public int getCriticalHit() {return this.criticalHit;}
    public void setCriticalHit(int criticalHit) {this.criticalHit = criticalHit;}


    public String getName() { return this.name;}
    public void setName(String name) { this.name = name;}

    public int getStrength() { return this.strength;}
    public void setStrength(int strength) { this.strength = strength;}

    public int getHealth() { return this.health;}
    public void setHealth(int health) { this.health = health;}

    public int getStamina() { return this.stamina;}
    public void setStamina(int stamina) {this.stamina = stamina;}

    public int getSpeed() { return this.speed;}
    public void setSpeed(int speed) {this.speed = speed;}

    public int getAttackPower() {return this.attackPower;}
    public void setAttackPower(int attackPower) {this.attackPower = attackPower;}

    public int getRun() {return this.run;}
    public void setRun(int run) {this.run = run;}

    public int getAttack() {return this.attack;}
    public void setAttack(int attack) {this.attack = attack;}

    public int getHeal() {return this.heal;}
    public void setHeal(int heal) {this.heal = heal;}

    public int getDecreaseHealth() {return this.decreaseHealth;}
    public void setDecreaseHealth(int decreaseHealth) {this.decreaseHealth = decreaseHealth;}

    public int getDecreaseStamina() {return this.decreaseStamina;}
    public void setDecreaseStamina(int decreaseStamina) {this.decreaseStamina = decreaseStamina;}

    public int getDecreaseStrength() {return this.decreaseStrength;}
    public void setDecreaseStrength(int decreaseStrength) {this.decreaseStrength = decreaseStrength;}

}
