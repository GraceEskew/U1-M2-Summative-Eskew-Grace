public class Warrior extends Player {
    private int shieldstrength;
    private int decreasedShieldStrength;

    public Warrior (String name, int health, int staminia, int speed, int attackPower, int run, int attack, int heal, int decreaseHealth, int decreaseStamina, int decreaseStrength, int criticalHit, int decreasedShieldStrength, int shieldstrength) {
        super(name, health, staminia, speed, attackPower, run, attack, heal, decreaseHealth, decreaseStamina, decreaseStrength, criticalHit);
    }

    //method;
    public void shieldHit() {
        System.out.println("USED SPECIAL DEFENSE: SHIELD\n");
        System.out.println("You may not be taking damage, but your shield sure is.");
        shieldstrength -= decreasedShieldStrength;
    }

    public int getShieldstrength() {return this.shieldstrength;}
    public void setShieldstrength(int shieldstrength) {this.shieldstrength = shieldstrength;}

    public int getDecreasedShieldStrength() {return this.decreasedShieldStrength;}
    public void setDecreasedShieldStrength(int decreasedShieldStrength) {this.decreasedShieldStrength = decreasedShieldStrength;}

    public static class PathW {

        Warrior w1 = new Warrior("Orf", 75, 100, 50, 1, 2, 1, 5, -1, -3, -2, +2, -2, 100);


        public void printWHeader() {
            System.out.println("-------------------------------------------------");
            System.out.println("|                 ORF'S                         |");
            System.out.println("|                    ERRAND                     |");
            System.out.println("-------------------------------------------------");
        }


    }
}

