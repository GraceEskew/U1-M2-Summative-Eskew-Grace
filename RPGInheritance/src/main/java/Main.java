import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Scanner;
import java.util.stream.StreamSupport;

/*A QUICK NOTE TO WHOMEVER IS GRADING THIS: I formatted this so it would run on a full window below, not just the bottom footer we usually do in class (where we see
the code). There is a fair amount of text (storytelling), because I tried to take the RPG context seriously without going outrageously overboard. I just wanted to let
 you know so you could adjust for easier reading if need be. Thank you & please enjoy!*/

public class Main {
    public static void main(String[] args) {

        //Object Creation
        //NPC ENEMEY
        RatOgre r1 = new RatOgre("Venerable", 60,40, 10, 8, 2, 3,1,5,5,5, 4 );



        //*********************** OPENING MENU *******************************


        Scanner wChoice1 = new Scanner(System.in);

        System.out.println("Welcome to the world of Generica!\n");
        System.out.println("The Queen is still working on the name. But here in Generica, we are but plain and simple folk.");
        System.out.println("Nothing ever happens here in Generica. We lead boring lives, doing mundane things, and we're okay with that. Truly.");
        System.out.println("But every once in awhile, someone likes you comes along and gives the bards something all to chatter about. I suppose you can't");
        System.out.println("help it. You ARE an RPG player after all. ALRIGHT! So, what's yer profession then? C'mon. Out with it. I have paint to watch dry.");
        System.out.println("                                                                                                                                       ");
        System.out.println("                                                                                                                                       ");
        System.out.println("1 - I am a Warrior, coming into town for an errand (QUICK ROUTE)");
        System.out.println("2 - I am a Constable. I was in here last week. Y-You truly don't remember? (MED ROUTE)");
        System.out.println("3 - I am a humble farmer, in town for my day off to live it up in the wildest city I know. (LONGER ROUTE)");
        System.out.println("4 - Oops. Wrong shop. I'll be going now (Exit)");
        System.out.print("Your choice: ");
        int wInput1 = wChoice1.nextInt();



        switch (wInput1) { // **********************WARRIOR ROUTE******************************
            case 1:
                Warrior w1 = new Warrior("Orf", 75, 100, 50, 1, 2, 1, 5, -1, -3, -2, +2, -2, 100);

                Warrior.PathW pathW = new Warrior.PathW();
                pathW.printWHeader();

                Scanner wChoice2 = new Scanner(System.in);
                System.out.println("*********************************************************************************************************************************");
                System.out.println("You're Orf, a half orc on a mission from your friend Rhyme to purchase goods in Generica.");
                System.out.println("The satchel of coin rustles quietly with each step. You figured you'd make the purchases for Rhyme, and after spending a little time");
                System.out.println("at the local Tavern, you'd head home. \n");
                System.out.println("Suddenly, a shout has you peering further down the road.\n");
                System.out.println("There stands a mousy looking man, with big round spectacles, waving his arms frantically in an effort to get you to see him & stop");
                System.out.println("He dashes up to you, explaining hurriedly that his sister is too sick to move, and that he help to get her to a healer.");
                System.out.println("When you ask him about his neighbors or family, he just shakes his head and says everyone is at the festival, and no one is willing");
                System.out.println("to help");
                System.out.println("                                                                                                                                 ");
                System.out.println("*********************************************************************************************************************************");
                System.out.println("                                                                                                                                 ");
                System.out.println("Do you agree to help?\n");

                System.out.println(" 1 Yes, I will help.");
                System.out.println(" 2 No, this is too suspicious");
                System.out.print("Your choice: ");
                int wInput2 = wChoice2.nextInt();


                //INITAL MEET DECISION
                switch (wInput2) {
                    case 1:
                        System.out.println("You decide to help the man. \n");
                        System.out.println("The man looks relieved when you agree to help. 'Thank you! Thank you so much! My home's not far from here. Please");
                        System.out.println(" follow me!' The pair of you sprint down the main road.\n ");

                        w1.dash();
                        w1.tired();

                        System.out.println("                                                                                                                  ");
                        System.out.println("Press ANY KEY to continue");
                        Scanner wChoice9 = new Scanner(System.in);
                        String wInput9 = wChoice9.nextLine();

                        System.out.println("                                                                                                                        ");
                        System.out.println("************************************************************************************************************************");
                        System.out.println("                                                                                                                        ");

                        System.out.print("It's not long before Generica is in sight. You stop to catch your breath. You've been running a while and your whole body\n");
                        System.out.println(" shakes with exertion. In truth, you don't feel like you can take another step.\n");
                        System.out.println("Suddenly, something heavy hits your head. Your vision goes dark and you hit the ground with a loud thud.");
                        break;

                    case 2:
                        System.out.println("You decided to not help the man.\n");
                        System.out.println("Something about this man is not sitting well with you. Why come out THIS far when Generica has plenty of people to ask for help?");
                        System.out.println("'I'm sorry,' you sigh, 'But I must be on my way.' The man tries to stop you, but you shrug him off as you make your way ");
                        System.out.println("down the road.\n");
                        System.out.println("Suddenly, something heavy hits your head. Your vision goes dark and you hit the ground with a loud thud.");
                        break;

                    default:
                        while (wInput2 == 0|| wInput2 > 2)
                            wInput2 = wChoice2.nextInt();
                            System.out.println("Invalid, please either the number 1 or 2");

                        break;

                }
                System.out.println("                                                                                                                                 ");
                System.out.println("*********************************************************************************************************************************");
                System.out.println("                                                                                                                                 ");

                System.out.println("When you come around, your head is throbbing. The room your in feels cold, dark, & damp. As your vision clears, you see ");
                System.out.println("boxes and crates lining the walls. A stairwell is dimly lit with a single oil lamp, leaving most of the room in darkness.");
                System.out.println("As you struggle to your feet, you find all your belongings are still on your person. Strange. You expected to be robbed.\n");

                System.out.println("Something large from the corner stirs and moves towards you. It's slick fur shines in the dim light, bright red eyes grow in shock");
                System.out.println("as it takes in your much, much taller form. Aside from the now trembling Rat Ogre, you see bones and peasant clothing lying about it. ");
                System.out.println("And that's when it dawns on you: \n");
                System.out.println("You were supposed to be this things next meal.");
                System.out.println("Looks like you're playing exterminator for the sake of the city.");
                System.out.println("                                                                                                                                 ");
                System.out.println("*********************************************************************************************************************************");
                System.out.println("                                                                                                                                 ");

                System.out.println("You may have size advantage, but don't let your guard down...");

                System.out.println("1 FIGHT");
                System.out.println("2 SEARCH");
                System.out.print("Your choice: ");
                Scanner wChoice3 = new Scanner(System.in);
                int wInput3 = wChoice3.nextInt();

                switch (wInput3) {
                    case 1:
                        System.out.println("The Rat Ogre charges forward, ebony claws outstretched, ready to snatch and tear.\n");
                        w1.shieldHit();
                        System.out.println("\n");
                        System.out.println("As the beast claws uselessly at your shield, you unhook your mace from your belt and arc it forth at the beast's side");
                        System.out.println("                                                                                                                                 ");
                        w1.ATK();
                        System.out.println("                                                                                                                                 ");
                        System.out.println("The Rat Ogre screeches.");
                        System.out.println("Seeing a warrior as big as you has really put it on the defensive. It staggers back, leaving itself open");
                        System.out.println("for a follow up attack, which you quickly take advantage of!");
                        System.out.println("                                                                                                                                 ");
                        w1.ATK();
                        w1.ATK();
                        System.out.println("                                                                                                                                 ");
                        System.out.println("Successful hits! The beast staggers back further, snarling, with its tail whipping around, crashing into the boxes and");
                        System.out.println("crates surrounding you both. A barrel topples over and hits a post, and its then you notice a shower of dust and grit from");
                        System.out.println("the ceiling above as a loose beam rattles precariously above the Rat Ogre.\n");
                        System.out.println("You grin at the doomed creature. You have an idea.");
                        System.out.println("                                                                                                                                 ");
                        System.out.println("UNLOCKED SPECIAL ATTACK: TIMBER!");



                        break;

                    case 2:

                        w1.search();
                        System.out.println("...");
                        w1.search();
                        System.out.println("... ...");
                        w1.search();
                        System.out.println("... ... ...");
                        System.out.println("                                                     ");

                        System.out.println("You take a second to view further view your surroundings. You definitely appear to be a cellar of some kind.");
                        System.out.println("Dust and sand pepper down from above, and you hear muffled voices and footsteps from above you.");
                        System.out.println("Suddenly, the creature lurches forward. In a flash your shield is out, and battering the beast back in one explosive");
                        System.out.println("blow\n");
                        w1.shieldHit();
                        System.out.println("                                    ");
                        System.out.println("Your shield vibrates from the impact. The Rat Ogre is sent flying, its body hitting the wall beside ");
                        System.out.println("the staircase. More dust and sand fall from the rafters above.");
                        System.out.println("Movement catches your eye, you can't help but notice something that makes you grin, even in these dire circumstances");
                        System.out.println("There's very loose wooden beam above the Rat Ogre's head. \n");
                        System.out.println("                                                                                                                                 ");
                        System.out.println("UNLOCKED SPECIAL ATTACK: TIMBER!");
                        break;


                    default:
                        System.out.println("No, no, warrior, please, tell us how it really went. Did you attack (press 1 & enter) or did you search (press 2 & enter)");
                        wInput3 = wChoice3.nextInt(); // need to figure out the loop with this.
                        break;
                }
                System.out.println("\n");

                System.out.println("With the plan in place, you grip your mace and ready yourself to spring forward and end the wretched creature's life. This is the");
                System.out.println("last day Generica's citizens will share their city with this vermin\n");
                System.out.println("                                              ");
                System.out.println("Press ANY KEY to use the special attack: TIMBER");

                Scanner wChoice4 = new Scanner(System.in);
                String wInput4 = wChoice4.nextLine();

                System.out.println("                                                                                                                                 ");
                System.out.println("*********************************************************************************************************************************");
                System.out.println("                                                                                                                                 ");

                System.out.println("                                                                                                                                 ");
                System.out.println("The Rat Ogre tries to charge forward, but with the disciplined movements of a Warmaster, you throw your mace at the beam above\n");
                w1.CRIT();
                System.out.println("                           ");
                System.out.println("and tuck as much of yourself as possible under your shield. You can feel the Ogre pounce on its surface, clawing and screaming, until");
                System.out.println("its drowned out by the sound of crashing wood. Your mace falls back to its prey with a heavy THUNK, and the beast falls to the ground");
                System.out.println("still.");
                System.out.println("                                                                                                                                 ");
                System.out.println("You hear commotion above you, and the telltale click of a lock being undone. Heavy footfalls clamber down the stairs as you pick");
                System.out.println("yourself up, shrugging off the rubble and plucking your mace from the ground");
                System.out.println("The stairway is crowded with robed men all bearing the mark of The Cult of the Venerable Rodent of Unusual Size, and are staring");
                System.out.println("slack jawed at the dead body of their icon.\n");
                System.out.println("You huff. Rhyme was not going to be happy about the damage done to the shield she had made for your birthday, but she'd be pleased");
                System.out.println("with its performance. The same could not be said for you being late. And considering you now had to deal with more than a few");
                System.out.println("dozen cultists... maybe The Tavern would have to wait until next time. Perhaps buy Rhyme gift as well to make amends for being late.\n");
                System.out.println("You grip your mace and shake the dust off your shield, 'Next.'");
                System.out.println("                                                                                                                                 ");

                System.out.println("The End.");
                break;



                // CONSTABLE
            case 2:// **********************CONSTABLE ROUTE******************************
                Player c1 = new Constable("Titus", 60, 60, 20, 1, 3, 1, 3, -2, -2, -2, 5);


                Constable.PathC pathC = new Constable.PathC();
                pathC.printCHeader();

                System.out.println("You've lived in Generica all your life under Her Majesty's careful watch. You lost both your mother and your brother when you");
                System.out.println("were young, and your father, a General in Generica's Army, was constantly needed on campaign. And so, The Queen brought you into");
                System.out.println("her household, saw to your tutoring. and training, and now you feel as though you are returning the favor, as one of her favored");
                System.out.println("Constables.");
                System.out.println("                                                                                                                                 ");
                System.out.println("*********************************************************************************************************************************");
                System.out.println("                                                                                                                                 ");


                System.out.println("There had been reports of people starting to go missing after dark. It was highly unusual of Generica, as the city, despite its size");
                System.out.println("wasn't know for its crime. As such, The Queen dispatched you personally to see that it would be taken care of, and you DO have a ");
                System.out.println("rather impressive record of closed cases. Aside from duty to Queen and Country, you do have some pride in your work.");

                System.out.println("You arrive at the spot of the last known victim, Bob Bobwyn the Lesser, Second of his name. Do you look around before knocking?");

                System.out.println("                                                                                                                                 ");
                Scanner ConsChoice1 = new Scanner(System.in);

                System.out.println("1 Of course. Its my duty for Queen and Country!");
                System.out.println("1 Eh. I'm good. Probably nothing anyway?");
                System.out.println("Your Choice: ");
                int cInput1 = ConsChoice1.nextInt();

                if (cInput1 == 1) {
                    System.out.println("*********************************************************************************************************************************");

                    c1.search();
                    System.out.println(".........");
                    c1.search();
                    System.out.println(".........");
                    c1.search();
                    System.out.println(".........");
                    System.out.println("You found some scraps of cloth half buried in dirt near the back door. Also, something smells foul, not unlike a sewer");
                    System.out.println("pipe that has backed up. You also notice multiple footprints in the dirt. Not unheard of for multiple people to live in a");
                    System.out.println("mansion, but the deed is registered to only one person who was the only known member of his family in the area. And he ");
                    System.out.println("was still missing. Family wouldn't have come to reclaim his belongings so soon.");
                    System.out.println("                                                                                                                          ");
                    System.out.println("You walk up to the front door, lifting the heavy metal door knocker; a gaudy rat head made of tarnished brass and faux rubies for eyes");
                    System.out.println("                                                                                                                          ");
                } else if (cInput1 == 2){
                    System.out.println("You walk up to the front door, lifting the heavy metal door knocker; a gaudy rat head made of tarnished brass and faux rubies for eyes");
                } else {
                    System.out.println("Invalid entry. Please try again. "); // still working on the loops
                }

                System.out.println("Press ENTER to continue");
                Scanner ConsChoice3 = new Scanner(System.in);
                String cInput3 = ConsChoice3.nextLine();

                System.out.println("                                                                                                                                 ");
                System.out.println("*********************************************************************************************************************************");
                System.out.println("                                                                                                                                 ");

                System.out.println("The door opens just slightly and you instantly recognize... Bob Bobwyn? Bob is equally shocked to see you on his doorstep, and");
                System.out.println("can do little but stutter for a few moments.");
                System.out.println("You recover your wits, and ask Bob where he's been. \n");
                System.out.println("\n");
                System.out.println("Bob: I-Ive been here all this time, Constable. I just caught a wee bit o' plague a week or so ago, and hadn't been out in a while.");
                System.out.println("Bob: Sorry to make you worry!\n");
                System.out.println("\n");
                System.out.println("Bob quickly tries to shut the door, but you jam your boot in the entry way before the door can close, demanding a better explanation.");
                System.out.println("Bob goes back to stammering, and you can tell this is going be a very long night.");
                System.out.println("                                     ");
                System.out.println("Just then, you hear the scrape of a boot behind you, but before you can turn, something heavy slams into the back of your head,");
                System.out.println("and your vision goes dark");
                System.out.println("\n");
                c1.hit();
                c1.weak();
                System.out.println("\n");
                System.out.println("A very long night, indeed");
                System.out.println("                                                                                                                                 ");
                System.out.println("*********************************************************************************************************************************");
                System.out.println("                                                                                                                                 ");
                System.out.println("Press ENTER to continue");
                Scanner ConsChoice5 = new Scanner(System.in);
                String cInput5 = ConsChoice5.nextLine();


                System.out.println("                                                                                                                                 ");
                System.out.println("*********************************************************************************************************************************");
                System.out.println("                                                                                                                                 ");
                System.out.println("When you come around, your head is throbbing. The room your in feels cold, dark, & damp. As your vision clears, you see ");
                System.out.println("boxes and crates lining the walls. A stairwell is dimly lit with a single oil lamp, leaving most of the room in darkness.");
                System.out.println("As you struggle to your feet, you find all your belongings are still on your person. Strange. You expected to be robbed.\n");
                System.out.println("                                                                                                                                 ");

                System.out.println("You grab a potion from your pack and uncork it to take a long sip.\n");
                c1.healing();
                System.out.println("                                                   ");
                System.out.println("Something large from the corner stirs and moves towards you. It's slick fur shines in the dim light, bright red eyes narrowing on your form");
                System.out.println("Around the creature lies the scattered remains of bones and shredded peasantry clothing.\n ");
                System.out.println("That's when it dawns on you: \n");
                System.out.println("You were supposed to be this things next meal. This ... thing... is very likely the culprit behind the disappearances.");
                System.out.println("Looks like you're playing exterminator for the sake of the city.");
                System.out.println("                                                                                                                                 ");
                System.out.println("*********************************************************************************************************************************");
                System.out.println("                                                                                                                                 ");


                System.out.println("1 FIGHT");
                System.out.println("2 SEARCH");
                System.out.print("Your choice: ");
                Scanner ConsChoice2 = new Scanner(System.in);
                int cInput2 = ConsChoice2.nextInt();

                switch (cInput2) {
                    case 1:
                        System.out.println("The Rat Ogre charges forward, ebony claws outstretched, ready to snatch and tear.");
                        c1.ATK();
                        System.out.println("But you were ready for the fiend and lash out with your enchanted mace. The electricity pops and crackles through the air");
                        System.out.println("casting an eerie glow on the beast's looming form.");
                        System.out.println("                                                                                                                                 ");

                        c1.ATK();

                        System.out.println("                                                                                                                                 ");
                        System.out.println("The Rat Ogre screeches, and lashes out angrily.");

                        c1.hit();

                        System.out.println("You felt the blow, but your armor took most of the damage. The Rat Ogre leans forward to snap at your arm, but you're already");
                        System.out.println("moving to press the advantage.");
                        System.out.println("                                                                                                                                 ");

                        c1.ATK();
                        c1.ATK();

                        System.out.println("                                                                                                                                 ");
                        System.out.println("Successful hits! The beast staggers back further, snarling, with its tail whipping around, crashing into the boxes and");
                        System.out.println("crates surrounding you both. A barrel topples over and hits a post, and its then you notice a shower of dust and grit from");
                        System.out.println("the ceiling above as a loose beam rattles precariously above the Rat Ogre.\n");
                        System.out.println("You grin at the doomed creature. You have an idea.");
                        System.out.println("                                                                                                                                 ");
                        System.out.println("UNLOCKED SPECIAL ATTACK: TIMBER!");



                        break;

                    case 2:
                        c1.search();
                        System.out.println("...");
                        c1.search();
                        System.out.println("... ...");
                        c1.search();
                        System.out.println("... ... ...\n");
                        System.out.println("You take a second to view further view your surroundings. You definitely appear to be a cellar of some kind.");
                        System.out.println("Dust and sand pepper down from above, and you hear muffled voices and footsteps from above you.");
                        System.out.println("Suddenly, the creature lurches forward. In a flash your enchanted mace is out, electricity arcing from its points.");
                        System.out.println("You swing to push the beast back\n");

                        c1.ATK();

                        System.out.println("                                                     ");
                        System.out.println("The Rat Ogre screams as its sent flying back, its back slamming into the wall; the force of the blow sending more");
                        System.out.println("dust and debris raining down on your head. And then, you see it. Something that gives you the best idea you'll have all evening");
                        System.out.println("                       ");
                        System.out.println(" You see... a very loose wooden beam above the Rat Ogre's head. \n");
                        System.out.println("                                                                                                                                 ");
                        System.out.println("UNLOCKED SPECIAL ATTACK: TIMBER!");
                        break;


                    default:
                        System.out.println("No, no, Constable, please, tell us how it really went. Did you attack (press 1 & enter) or did you search (press 2 & enter)");
                        break;
                }

                System.out.println("                                                                                                                                 ");
                System.out.println("With the plan in place, you grip your mace and ready yourself to spring forward and end the wretched creature's life. This is the");
                System.out.println("last day Generica's citizens will share their city with this vermin\n");
                System.out.println("Press ANY KEY to use the special attack: TIMBER");
                Scanner ConsChoice4 = new Scanner(System.in);
                String cInput4 = ConsChoice3.nextLine();
                System.out.println("                                                                                                                                 ");
                System.out.println("*********************************************************************************************************************************");
                System.out.println("                                                                                                                                 ");
                System.out.println("The Rat Ogre tries to charge forward, but with the disciplined movements of a member of The Queen's Guard, you throw your mace at the beam above");
                System.out.println("and lock hands to grapple with the beast. The Ogre pushes, its jaws snapping wildly in the air until\n");

                c1.CRIT();

                System.out.println("                                                       ");
                System.out.println("The falling beam slams into its back. Your mace falls back to its prey with a heavy THUNK, and the beast with it.");
                System.out.println("For a moment, all is still and quiet.");

                c1.tired();

                System.out.println("                                                                                                                                 ");
                System.out.println("*********************************************************************************************************************************");
                System.out.println("                                                                                                                                 ");

                System.out.println("Press ENTER to continue");
                Scanner ConsChoice6 = new Scanner(System.in);
                String cInput6 = ConsChoice6.nextLine();
                System.out.println("*********************************************************************************************************************************");

                System.out.println("You hear commotion above you, and the telltale click of a lock being undone. Heavy footfalls clamber down the stairs as you pick");
                System.out.println("yourself up, shrugging off the rubble and plucking your mace from the ground");
                System.out.println("The stairway is crowded with robed men all bearing the mark of The Cult of the Venerable Rodent of Unusual Size, and are staring");
                System.out.println("slack jawed at the still body of their icon.\n");
                System.out.println("You turn to face the crowd, jamming a finger in at the heap of rat at your feet.");
                System.out.println("                                                                                                                                 ");
                System.out.println("'WHICH ONE OF YOU HAS THE PERMIT TO KEEP THIS EXOTIC CREATURE IN HER MAJESTY'S KINGDOM?!' you bellow.");
                System.out.println("                                                                                                                                 ");
                System.out.println("The figures look flabbergasted, each looking at each other and whispering amongst one another.\n");
                System.out.println("You sigh. This was going to be a mess of paperwork. 'I assume you're a cult operating under Article 7?'");
                System.out.println("                                                                                                                                 ");
                System.out.println("The hooded figures all nodded once, in unison.\n");
                System.out.println("                                                                                                                                 ");
                System.out.println("The Rat Ogre gives a rather pitiful groan from beneath the rubble.");
                System.out.println("'Then, I need to see your Venerable Beasts license and your Cult Registration scrolls,' You recite.");
                System.out.println("Every cultist on the staircase eyes Bob Bobwyn, who pats his robes down in a panic");
                System.out.println("'I uh.... I must have left it in my other robes,' he chuckles nervously.\n");

                System.out.println("Press ENTER to continue");
                Scanner ConsChoice7 = new Scanner(System.in);
                String cInput7 = ConsChoice7.nextLine();
                System.out.println("                                                                                                                                 ");
                System.out.println("*********************************************************************************************************************************");
                System.out.println("                                                                                                                                 ");


                System.out.println("                                                                                                                                 ");

                c1.tired();
                System.out.println("                                                                                                                                 ");
                System.out.println("You can already feel your hand aching from the amount of paperwork you'll need to work up. How many quills is this going to take?");
                System.out.println("                         ");
                System.out.println("'Alright,' you call, 'everyone line up. Single file. Hands out.'\n");
                System.out.println("The cultists (all rather conveniently named Bob 1, Bob 2, and so forth) line up, single file, looking rather sheepish and worried.");
                System.out.println("Bob 22 helps the Rat Ogre to his feet, who now is whimpering pitifully, but nibbling contently on a piece of Bob 22's jerky stash.");
                System.out.println("\n");
                c1.hit();
                System.out.println("                         ");
                System.out.println("At least, emotionally...\n");

                System.out.println("Maybe you went a LITTLE overboard with the critical attack.\n");
                System.out.println(".......It is a bit cute when its not trying to eat you.");
                System.out.println("Let's just assume the jerky is beef, shall we?");
                System.out.println("                                                                                                                                 ");

                System.out.println("Press ENTER to continue");
                Scanner ConsChoice8 = new Scanner(System.in);
                String cInput8 = ConsChoice8.nextLine();
                System.out.println("                                                                                                                                 ");
                System.out.println("*********************************************************************************************************************************");
                System.out.println("                                                                                                                                 ");




                //Trying to figure out why I was unable to call the methods from the subclasses into main (though Warrior's worked)
                //Using casting right now as a means to keep my code running while I investigate the issue.

                ((Constable) c1).jurisdiction();

                System.out.println("               ");
                System.out.println("The cult gives a sad 'oh' in unison.\n");

                ((Constable) c1).arrest();
                System.out.println("                                                                                                                                 ");

                System.out.println("Everyone in the cult hangs their head as they file out neat and orderly.");
                System.out.println("This includes the Rat Ogre. Oh, I'm sorry, I meant the 'Venerable Icon of a Most Unusual Size.'");
                System.out.println("                                                                                                                                 ");
                System.out.println("                                                                                                                                 ");

                System.out.println("The End");











                break;


                // FARMER
            case 3: // **********************FARMER ROUTE******************************

                Player f1 = new Farmer("Sam", 100, 75, 10, 1, 2, 2, 1, -5, -1, -1, 5);

                // can't get the 2 child classes to work. nd to resolve later.


                //Input
                Scanner fChoice1 = new Scanner(System.in);

                // Header Print
                Farmer.PathF pathF = new Farmer.PathF();
                pathF.printHeader();


                // 1st Body of Text
                System.out.println("You are Sam, a hardworking farmer with a mysterious past and a (literal) heart of gold (don't ask).\n");
                System.out.println("And today is the best day of the season: Your. Day. Off.\n");
                System.out.println("Like any reasonable well adjusted hardworking farmer with a mysterious past and a (literal) heart of gold,");
                System.out.println("you've taken a small satchel of your hard earned coin, and headed into town of Generica.\n");


                System.out.println("What do you do, Sam?\n");
                System.out.println(" 1 Tavern sounds good.");
                System.out.println(" 2 Hit the General Goods store.");
                System.out.println(" 3 There's a cat. I need to pet it.");
                System.out.println(" 4 (SPECIAL: Fourth Wall Break) Generica? Really?");
                System.out.print("Your choice: ");

                int fInput1 = fChoice1.nextInt();

                System.out.println("                                                                                                                                 ");
                System.out.println("*********************************************************************************************************************************");
                System.out.println("                                                                                                                                 ");


                switch (fInput1) {
                    case 1:
                        System.out.println("You swagger (as only farmers can) down to Generica's best and only Tavern: The Brooding Elf; .");
                        System.out.println("Home of the finest generic spirits, ghosts, and mostly edible stuffs.");
                        System.out.println("You realize there was a reason you saw no traffic on the main road today. Its the Feast of ");
                        System.out.println("Saint WhatsHisFace the Perplexed, Patron saint of confused students, who's feasting day is exclusively and conveniently ");
                        System.out.println("celebrated in small, generic taverns.\n");
                        System.out.println("Taverns like the very, very packed Brooding Elf.\n");
                        System.out.println("Still, you attempt to elbow your way in. After spending 15 minutes trying to navigate around a spanish swordsman, ");
                        System.out.println("a kindly giant, & a masked man in black being pushed around in a wheelbarrow, you decided to call it quits.");
                        break;


                    case 2:
                        System.out.println("You come across the only Ma's Marvelous Impor  s.... closed. The 't' that once hung proudly at the end of Import ");
                        System.out.println("has a note hastily scribbled on it. Kneeling down, you read:");
                        System.out.println("'Gone to the Festival of WhatsHisFace the Perplexed. Be back in 2 days. 3 if its a good Festival.' ");
                        System.out.println("Well. That was anticlimactic.");
                        break;


                    case 3:
                        System.out.println("You spot the world's best cat. You know this because of the sign affixed to its collar tells you so. Well. You won't let this opportunity ");
                        System.out.println("pass you by. You kneel and gently scratch the mouser's head and chin.");
                        System.out.println("The cat purrs and in a sudden PUFF of blue smoke (and glitter?) There stands the town mage, Asha.\n");
                        System.out.println("                                                                                                                                 ");

                        System.out.println("Asha: Oh my heavens, thank you! A spell went sideways, and I've been stuck in that form for weeks now!");
                        System.out.println("Asha: As a token of my thanks, allow me to divine some advice for your future\n");
                        System.out.println("                                                                                                                                 ");

                        System.out.println("Leaning in, Asha stares deep into your eyes. It becomes... eh... a bit awkward");
                        System.out.println("Finally she blinks. Snapping back into reality, she smooths down her clothes and adjusts her hood with a grin.\n");
                        System.out.println("                                                                                                                                 ");
                        System.out.println("Asha: When the time comes: Run. Also, a good friend will help you out in an unexpected way today. \n");
                        System.out.println("Asha disappears in a PUFF of blue smoke (and more glitter), leaving you standing in the middle of the road, looking more");
                        System.out.println("perplexed than Saint WhatsHisFace.");
                        break;


                    case 4:
                        System.out.println("If you haven't graded the Car Inventory, just note that I learned many valuable lessons. And that it might have");
                        System.out.println("temporarily driven me up the wall. Generica is the best I got right now.");
                        break;


                    default:
                        while (fInput1 == 0 || fInput1 > 4) ;
                        System.out.println("You vanish in a puff of smoke. Narrator hasn't created the loop to keep you alive yet.");
                        System.out.println("Just kidding. Pick a number between 1 and 4, Sam.");
                        Scanner fChoice9 = new Scanner(System.in);
                        fChoice9.nextLine();
                }


                System.out.println("                                                                                                                                 ");
                System.out.println("*********************************************************************************************************************************");
                System.out.println("                                                                                                                                 ");
                System.out.println("Press ENTER to continue, Sam");

                Scanner fChoice2 = new Scanner(System.in);
                fChoice2.nextLine();

                System.out.println("*********************************************************************************************************************************");
                System.out.println("You wander about the near empty town, trying to figure out what to do next, when a squirrely man, with large round spectacles runs");
                System.out.println("up to you in a panic:\n");
                System.out.println("Man: Oh thank The Maker, I thought everyone had gone to the festival. Please! Please come quickly I need your help.\n");
                System.out.println("The man, named Bob, pulls you along the road, down the lane, and into the wealthier side of Generica. As you stumble up to a grand");
                System.out.println("looking, though slightly shabby mansion, he explains that's there's an infestation of rats in his basement that he needs to be rid of");
                System.out.println("before his weekly bookclub. You stumble through the entryway, and have just enough time to glance at the equally shabby interior");
                System.out.println("before Bob unceremoniously shoves you through the basement door. /n");
                System.out.println("                         ");
                System.out.println("You hear the basement door lock with an ominous click.");

                System.out.println("                                                                                                                                 ");
                System.out.println("*********************************************************************************************************************************");
                System.out.println("                                                                                                                                 ");
                System.out.println("Huh. Well, press ENTER to continue, Sam");
                fChoice2.nextLine();

                System.out.println("*********************************************************************************************************************************");
                System.out.println("                                                                                                                                 ");

                System.out.println("You descend down into the basement, the small fiery sconces dotting the wall your only source of light. ");
                System.out.println("You suddenly hear something rather large let out a raspy growl, and as you near the base of the stairs, something large, hulking ");
                System.out.println("and furry moves into view:");
                System.out.println("As it shuffles about the basement, you can be sure of two things, Sam: \n");
                System.out.println("First: This IS, by definition, a rat, but...");
                System.out.println(" Second:  Its a good 2 feet taller than you, walking on its hind quarters, and just looked at you like you were lunch.");

                System.out.println("                                                                                                                                 ");
                System.out.println("*********************************************************************************************************************************");
                System.out.println("                                                                                                                                 ");
                System.out.println("Type to survive, Sam!");
                fChoice2.nextLine();
                System.out.println("                                                                                                                                 ");
                System.out.println("*********************************************************************************************************************************");
                System.out.println("                                                                                                                                 ");

                Scanner fChoice3 = new Scanner(System.in);

                System.out.println(" 1 Attack");
                System.out.println(" 2 Heal");
                System.out.println(" 3 Harvest"); // Still working on this
                System.out.println(" 4 Plow"); // and this one too
                System.out.println(" 5 RUN, RUN, RUN, RUN, RUN, RUN");
                System.out.print("Your choice: ");


                int fInput2 = fChoice3.nextInt();


                System.out.println("                                                                                                                                 ");
                System.out.println("*********************************************************************************************************************************");
                System.out.println("                                                                                                                                 ");

                switch (fInput2) {
                    case 1: // ATTACK
                        System.out.println("                                                                                                                                 ");
                        System.out.println("*********************************************************************************************************************************");
                        System.out.println("                                                                                                                                 ");
                        System.out.println("Wait. WHAT? But you're a... but your Attack power... well.. alright. You reach for your belt to your trusty gardening");
                        System.out.println("shears. With a flick of your wrist, you separate the two blades at the joint, and turn into a dual knife wielding warrior... \n ");
                        System.out.println("...er Farmer. Either way, you look cool in a fight. Narrator approves. \n");

                        f1.ATK(); // overidden in Farmer Class for Dual Wield.
                        break;

                    case 2: //HEAL
                        System.out.println("                                                                                                                                 ");
                        System.out.println("*********************************************************************************************************************************");
                        System.out.println("                                                                                                                                 ");
                        System.out.println("Look, Sam, I just checked the command line. At no point did you get physically hurt. That is what a healing does; it");
                        System.out.println("cures PHYSICAL wounds. I realized you're a bit put out with Bob shoving you down here with the Rat Ogre. I agree, it was");
                        System.out.println("the height of rudeness. But your potion won't help.");
                        System.out.println("                                                                                                                                 ");
                        System.out.println("............. oh fine. This one is on me.");
                        System.out.println("                                                                                                                                 ");
                        f1.healing();
                        f1.healing();
                        f1.healing();
                        System.out.println("                                                ");
                        break;

                    case 3:
                        System.out.println("                                                                                                                                 ");
                        System.out.println("*********************************************************************************************************************************");
                        System.out.println("                                                                                                                                 ");
                        System.out.println("Only the foolish think harvesting is for crops only.\n ");
                        f1.search(); // Override in Farmer class with HARVEST.
                        System.out.println("You find a pointy stick, an extra potion, Waldo, and a newfound sense of courage!");
                        System.out.println("Well done, Same! Enjoy!\n");
                        System.out.println("GAINED WEAPON: THE EPIC POINTY STICK KNOWN AS: 'SO MY POINT IS'\n");
                        System.out.println("GAINED POTION: 'ONE FOR THE ROAD' (No idea what it does, but maybe Asha the Mage would know...)\n");
                        System.out.println("GAINED VALUABLE DISTRACTION: WAL- wait....where'd he go?\n");
                        System.out.println("                                                  ");
                        System.out.println("GAINED A NEWFOUND SENSE OF COURAGE. YOU ARE NOT TRAPPED IN HERE WITH ");
                        System.out.println("THE RAT OGRE! RAT OGRE IS OFFICIALLY TRAPPED IN HERE WI- oh no, he's charging!");
                        break;

                    case 4:
                        System.out.println("                                                                                                                                 ");
                        System.out.println("*********************************************************************************************************************************");
                        System.out.println("                                                                                                                                 ");
                        System.out.println("Sorry, Sam. You have to be outside to use SPECIAL ABILITY: PLOW");
                        System.out.println("Its called a Plot Device. Its fun. Promise.");
                        break;

                    case 5:
                        System.out.println("                                                                                                                                 ");
                        System.out.println("*********************************************************************************************************************************");
                        System.out.println("                                                                                                                                 ");
                        System.out.println("Great idea, Sam! You are the very model of pragmatism.\n");
                        System.out.println("Whenever the programmer makes an experience points system - I'm giving you 200xp for that!\n");
                        break;

                    default:
                        System.out.println("                                                                                                                                 ");
                        System.out.println("*********************************************************************************************************************************");
                        System.out.println("                                                                                                                                 ");

                        System.out.println("You do absolutely nothing. Nada. You skipped that awesome menu of action, excitement, and suspense for... nada.");
                }
                System.out.println("                                                                                                                                 ");
                System.out.println("*********************************************************************************************************************************");
                System.out.println("                                                                                                                                 ");
                System.out.println("Unfortunately, the Rat Ogre took charges towards you as you made your first decision. You quickly dodge out of the reach of, ");
                System.out.println("its ebony claws, but now the Rat Ogre stands between you... and the exit.\n");
                System.out.println("Press ENTER to continue");
                Scanner fChoice9 = new Scanner(System.in);
                fChoice9.nextLine();
                System.out.println("                                                                                                                                 ");
                System.out.println("*********************************************************************************************************************************");


                System.out.println("What now, Sam?\n");
                System.out.println(" 1 I attack!");
                System.out.println(" 2 I look around!");
                System.out.println(" 3 I skip my turn, and wait for the Rat Ogre to go first");
                System.out.print("Your choice: ");
                int fInput3 = fChoice3.nextInt();


                //VARIABLE SET UP FOR F1 - Playing around with numbers if I had the time to work on the battle system.
                int hlth = 100;
                int stm = 75;
                int spd = 10;
                int atkpwr = 6;


                //VARIABLE SET UP FOR RAT OGRE
                int rOgerHealth = 88;
                int rOgerStamina = 100;
                int rOgerSpeed = 50;
                int rOgerAP = 10;

                switch (fInput3) {
                    case 1: //Attack
                        System.out.println("You go on the offensive! As the Rat Ogre steps forward, you lash out with your only weapon, gardening shears, separated");
                        System.out.println("out into a pair of dual wielding knives. Hey, you do what you have to do to get by.\n");
                        f1.ATK();
                        System.out.println("                                                                                                   ");
                        System.out.println("And give the creature several deep gashs across it's chest. It scrambles back with a screech, body hitting the wall beside ");
                        System.out.println("the staircase. You feel dust and sand fall from the rafters above, and hear muffled laughter");
                        System.out.println("from above. With the creaking of the upstairs floorboards, you can't help");
                        System.out.println(" but notice... a very loose wooden beam above the Rat Ogre's head. \n");
                        System.out.println("UNLOCKED SPECIAL ATTACK: TIMBER!");

                        break;

                    case 2:
                        f1.search();
                        System.out.println("OH LOOK! \n A conveniently loose, and really really heavy wooden beam is RIGHT above");
                        System.out.println(" our hungry friend's head.\n");
                        System.out.println("UNLOCKED SPECIAL ATTACK: TIMBER!");
                        break;

                    case 3:
                        System.out.println("You decide to wait it out. The Rat Ogre, not one for tactics, lunges forward\n");
                        System.out.println("You try to rush past him, but the beast whips its body around, bring its tail crashing into your side.");
                        System.out.println("You're sent sprawling back, crashing into several boxes and barrels. ");
                        System.out.println("You barely have a chance to scramble to your feet, before the creature is baring down on your again.\n");
                        System.out.println("You still have your trusty garden shears turned dual wielding knives. You lash out when the beast draws near");
                        System.out.println(", leaving a deep wound across the vermin's chest. A Critical Hit for 2X the damage.\n");
                        System.out.println("It scrambles back for the stairs... leaving you exactly where you started, but with a little less life in you\n");
                        System.out.println("As you gripped your side, certain of perhaps a few broken bones, dust and sand fall from the rafters above.");
                        System.out.println("You hear muffled laughter from above, and with the creaking of the upstairs floorboards, you can't help");
                        System.out.println(" but notice... a very loose wooden beam above the Rat Ogre's head.\n");
                        System.out.println("UNLOCKED SPECIAL ATTACK: TIMBER!");

                        int newhlth3 = hlth - rOgerAP;
                        System.out.println("Your current Life" + " " + newhlth3);

                        int newStm3 = stm - (spd * 3);
                        System.out.println("Your current Stamina: " + " " + newStm3);

                    /*Oger stats would normally be hidden from the players, as there is no way for their characters to know, unless they
                    have some special ability or talent
                        int newROgerHealth = rOgerHealth - (atkpwr * 2);
                        int newROgerStamina = rOgerStamina - (spd * 3); */

                }

                System.out.println("                                                                                                                                 ");
                System.out.println("*********************************************************************************************************************************");
                System.out.println("                                                                                                                                 ");


                System.out.println("What now, Sam?\n");
                System.out.println(" 1 TIMBER.");
                System.out.println(" 2 TIMBER TIMBER");
                System.out.println(" 3 TIMBER TIMBER TIMBER TIMBER SAM, I CAN ONLY DO SO MANY HINTS AS A NARRATOR");
                System.out.print("Your choice: ");
                int fInput4 = fChoice3.nextInt();

                System.out.println("                                                                                                                                 ");
                System.out.println("*********************************************************************************************************************************");
                System.out.println("                                                                                                                                 ");


                System.out.println("You feel something hit your foot, and a quick glance down reveals a heavy iron idol of some forgotten Rat God");
                System.out.println("You snatch up the idol, chucking it at the beam. While physics may argue otherwise, the beam cracks, ");
                System.out.println("falling in a shower of dust and wood atop of the Rat Ogre.");
                f1.CRIT();
                System.out.println("As the debris settles, the Rat Ogre lies still...\n");

                System.out.println("                                                                                                                                 ");
                System.out.println("*********************************************************************************************************************************");
                System.out.println("                                                                                                                                 ");


                System.out.println("Should we... I don't know... check to see if it's still breathing?");
                System.out.println("1 Yeah.");
                System.out.println("2 Are you nuts? I want up those stairs!");
                System.out.println("Your choice:");
                int fInput5 = fChoice3.nextInt();

                System.out.println("                                                                                                                                 ");
                System.out.println("*********************************************************************************************************************************");
                System.out.println("                                                                                                                                 ");


                if (fInput5 == 1) {
                    System.out.println("You, being the type of character to survive horror stories, check the Rat Ogre to see if its still breathing. ");
                    System.out.println("...");
                    System.out.println(".......");
                    System.out.println("..............");
                    System.out.println("Yep! Still breathing. And it smells terrible too. Ugh.");
                } else {
                    System.out.println("Fine! Not one for suspense, are you?");
                }

                System.out.println("                                                                                                                                 ");
                System.out.println("*********************************************************************************************************************************");
                System.out.println("                                                                                                                                 ");


                System.out.println("You scramble up the stairs, and try the door. Its rattles, but doesn't open. You listen and can hear the dull murmur of  ");
                System.out.println("activity somwewhere in the house. You need a way past this door though... ");

                System.out.println(" Press ENTER to use SPECIAL ABILITY: HARVEST ");

                Scanner fChoice = new Scanner(System.in);
                fChoice.nextLine();
                System.out.println("                                                                                                                                 ");
                System.out.println("*********************************************************************************************************************************");
                System.out.println("                                                                                                                                 ");
                f1.search();
                System.out.println(" You spot hidden latch, just above the door frame.");
                System.out.println("The dust covering it tells you it hasn't been used in YEARS, and has you turn the heavy bar sideways, you hear the lock CLINK");
                System.out.println("and the door quietly opens... ");
                System.out.println("                                                                                                                                 ");
                System.out.println("*********************************************************************************************************************************");
                System.out.println("                                                                                                                                 ");
                System.out.println("As you quickly rush through the shabby mansion, you accidentally enter a room with... a lot of people. ");
                System.out.println("A lot of people in spooky cult attire");
                System.out.println("You see icons of your hungry basement friend all over the room and you can't help but let out a frustrated groan:\n");
                System.out.println("Its the Cult of The Venerable Rodent of a Highly Unusual Size.\n");
                System.out.println("You thought they'd been chased out after the copyright claim, but apparently not.\n");
                System.out.println("50 robed figures stare back at you in shock. Bob stands at the head of the room with his latest copy of ");
                System.out.println("J Smith's Domina: Surviving the Rat Race and Coming Out on Top. Apparently, he wasn't lying about the book club");
                System.out.println("'GET HIM!' Bob screams, and you dash out the front door as fast as your legs can carry you.");
                System.out.println("                                                                                                                                 ");
                System.out.println("*********************************************************************************************************************************");
                System.out.println("                                                                                                                                 ");
                System.out.println("Press ENTER to continue");
                Scanner fChoice5 = new Scanner(System.in);
                fChoice5.nextLine();

                Scanner scan = new Scanner(System.in);
                System.out.println("Down the road you rush. A angry roar tells you that your friend as woken up from his nap, and has joined the cult in chasing after ");
                System.out.println("you. You pass the front gate, putting more distance between you and the angry mob. Your body feels like its on fire as you struggle to");
                System.out.println("lose them off the main road. Finally, your legs give out and you collapse. The mob is getting closer, and it is there, Sam, in your");
                System.out.println("darkest moment, that you are faced with the ultimate decision:\n");
                System.out.println("1 USE SPECIAL ABILITY PLOW");
                System.out.println("2 GIVE UP");
                System.out.print("Your choice: ");
                int number = Integer.parseInt(scan.nextLine());

                System.out.println("                                                                                                                                 ");
                System.out.println("*********************************************************************************************************************************");
                System.out.println("                                                                                                                                 ");


                while (number > 1) {
                    System.out.println("Sam, farmers don't give up. If they did none of use would have the lives we do today. You are from a long line of farmers,");
                    System.out.println("each generation stronger than the last. Call upon every ancestory you need to, but DO NOT GIVE UP. Also, plowing is fun. Press");
                    System.out.println("1 to use PLOW.");
                    number = Integer.parseInt(scan.nextLine());
                }

                System.out.println("                                                                                                                                 ");
                System.out.println("*********************************************************************************************************************************");
                System.out.println("                                                                                                                                 ");


                ((Farmer) f1).Plow(); // cast used as workaround to get subclass method to run.

                System.out.println("Well, if you're going out, then out you go like a proud farmer. If you're going to plow though, you need your horse.");
                System.out.println("Cupping your hands you let out a long, rather sad sounding yodel. It was such a sound that its echoes were heard in the ");
                System.out.println("valleys leagues off, touching even the hardest of livestock's heart. Farmers near and far would speak of this day, that they");
                System.out.println("heard such a song.\n");
                System.out.println("                                                                                                                                 ");
                System.out.println("*********************************************************************************************************************************");
                System.out.println("                                                                                                                                 ");

                System.out.println("You feel the ground tremble, and assume the angry mob has found you. But their voices are still far off. The shaking gets");
                System.out.println("stronger and stronger, and a new burst of panic sends you scrambling up a tree. You see your horse, Nip, pulling his blow at");
                System.out.println("breakneck speeds. He was flanked by horses you didn't know doing the same, their plows churning up the dirt around them like ");
                System.out.println("a wooden spoon churning silky cake batter. Following behind them was... more cows that you could count, stamping down the freshly");
                System.out.println("churned earth with their hooves, until a tightly packed pathway remained.\n");

                System.out.println("                                                                                                                                 ");
                System.out.println("*********************************************************************************************************************************");
                System.out.println("                                                                                                                                 ");


                System.out.println("All you could do was hang on to the branch and stare at the new wide road. It was actually nice enough to rival the main one into ");
                System.out.println("Generica. Up ahead the herd stampeded towards the angry mob, who in their panic merely ran straight back to Generica. Well... at least");
                System.out.println("The Queen would have another road to utilize, and the constables could take care of the cult. \n");
                System.out.println("A friendly 'Moo!' from below has you dropping back down to earth with a shout. You land with a solid thud on your backside, and are ");
                System.out.println("greeted with a friendly lick from 'Rosie' your favorite cow who thinks she's a dog, and best farm friend. Rosie happily wags her tail ");
                System.out.println("the best she can, and even allows you to lie down on her back and as she slowly meanders her way up to Generica's Main Gate\n");
                System.out.println("Next Day Off, you'll just stay home. Maybe catch a sunset.");
                System.out.println("                                                                                                                                 ");
                System.out.println("A week later you received a lovely letter from The Queen's Secretary, advising you that the Cult had been properly brought to justice,");
                System.out.println("and that the road you created by accidentally summoning a cattle drive would be named after you. Enclosed was 50 gold for your trouble, ");
                System.out.println("and several handy single use spells for crop creation. All in all, not bad. I'm proud of you, Sam. Well done!");
                System.out.println("                                                                                                                                 ");
                System.out.println("The End.");

                System.out.println("                                                                                                                                 ");
                System.out.println("*********************************************************************************************************************************");
                System.out.println("                                                                                                                                 ");

                break;

            case 4:
                System.out.println("No problem. Happens a lot, actually. Take care.");
                break;

            default:
                System.out.println("So you're just gonna sit there, huh? Alright. But I'm going to charge you to watch the paint dry.");
                break;
        }


        //***********************************************************************************************************************************************************
        //***********************************************************************************************************************************************************
        //***********************************************************************************************************************************************************
    }
}
