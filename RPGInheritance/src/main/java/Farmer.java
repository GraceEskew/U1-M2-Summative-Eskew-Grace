public class Farmer extends Player {

    public Farmer(String name, int health, int staminia, int speed, int attackPower, int run, int attack, int heal, int decreaseHealth, int decreaseStamina, int decreaseStrength, int criticalHit) {
        super(name, health, staminia, speed, attackPower, run, attack, heal, decreaseHealth, decreaseStamina, decreaseStrength, criticalHit);
    }


    public void Plow() {
        System.out.println("USED SPECIAL ABILITY: PLOW\n");
        System.out.println("You summon your horse and plow to the field.");
    }

    private void Harvest() {
    }

    private void DualWield() {

    }

    @Override
    public void ATK() {
        System.out.println("Dual Wielding has its advantages. Like getting to attack TWICE!");
        DualWield();
        super.ATK();
        super.ATK();
    }

    @Override
    public void search() {
        System.out.println("                                                                                          ");
        System.out.println("USED SPECIAL ABILITY: HARVEST\n");
        System.out.println("Years of pulling the best produce in Generica has made you adept at spotting quality quickly.");
        System.out.println("You scan the entire area in mere seconds to find what you need most in your current situation.");
        System.out.println("                                                                                          ");
        Harvest();
        super.search();
    }

    public static class PathF {

        //Object Creation


        public void printHeader() {
            System.out.println("-------------------------------------------------");
            System.out.println("|                 HARVEST                       |");
            System.out.println("|                    HAVOC                      |");
            System.out.println("-------------------------------------------------");
        }
    }
}

      //   public void printBody()