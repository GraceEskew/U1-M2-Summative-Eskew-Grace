import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class Constable extends Player {



    public Constable (String name, int health, int staminia, int speed, int attackPower, int run, int attack, int heal, int decreaseHealth, int decreaseStamina, int decreaseStrength, int criticalHit) {
        super(name, health, staminia, speed, attackPower, run, attack, heal, decreaseHealth, decreaseStamina, decreaseStrength, criticalHit);
    }

    public void arrest() {
        System.out.println("USED SPECIAL ABILITY: ARREST\n");
        System.out.println("'You're under arrest'");
    }

    public void jurisdiction() {
        System.out.println("USED SPECIAL ABILITY: JURISDICTION\n");
        System.out.println("'As a member of Her Majesty's Constables, in the Kingdom of Generica, I regret to inform you that you have, in fact, broken the law.'");
        System.out.println("              ");
        System.out.println("Your badge of office begins to glow. With a snap of your armored fist, manackles and shackles manifest on the wrists and ankles of your ");
        System.out.println("perpetrators; securing them tightly and safely for transport.");
        System.out.println("              ");

    }



    public static class PathC {

        Player c1 = new Constable("Titus", 60, 60, 20, 1, 3, 1, 3, -2, -2, -2, 5);


        public void printCHeader() {
            System.out.println("-------------------------------------------------");
            System.out.println("|                 GENERICA'S                    |");
            System.out.println("|                     FINEST                    |");
            System.out.println("-------------------------------------------------");
        }
    }
}
