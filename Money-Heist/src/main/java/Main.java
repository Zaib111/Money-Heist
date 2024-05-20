/*
Shahmeer Khan
June 6, 2023
Purpose: To create a successful escape room game inspired by money heist
*/
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner (System.in);

    //VARIABLES
    int choice;
    String pick;

    //CLEAR RANDOM CODE 
    do{
    do{
    System.out.print("\033[H\033[2J");
    System.out.flush();
    //PRINTING TITLE
  System.out.println("***************************\n\t~~~MONEY HEIST~~~\n***************************\n");
    //OUTPUTTING MENU
    System.out.print("1. Play Game\n2. About the Game\n3. Quit\n\nChoose an option: ");
    choice = input.nextInt();
      if (choice<1||choice>3){
        System.out.print("\n\nInvalid input. Please try again!");
      }
     }while (choice<1||choice>3);
    //IF THEY CHOOSE TO PLAY GAME 
  if (choice == 1){
   // INTRODUCTION
    System.out.print("\n\nInTrO\n\nYour name is Arturo Roman, and you are witnessing the greatest money heist in history! Spain has never seen anything like it, and unfortunately for you, you are a hostage in this situation. Like any other day, you were working at the Royal Mint of Spain when a group of masked villains suddenly barged in and told you to get on your knees. The 8 robbers all seemed to be wearing Dali masks and red jumpsuits, holding weapons of all kinds. Once you are on your knees, they tell you what they plan to do and hope they won’t have to hurt anyone, but will do what is necessary. Their goal is to rob the Royal Mint and print €2.4 billion, all with a meticulous plan that has been in the making for a lifetime. All you can think about is your family and how you hope to make it out alive to see them again. The robber guarding your end of the hallway walks away for a brief moment to help with some uncooperative hostages- and you know that this could be your one and only chance. Escape quickly or face the consequences. ");

      //PRINTING METHODS
    //METHOD 1 - Maharsi
    puzzle1();
    //METHOD 2 - Maharsi
    puzzle2();
    //METHOD 3 - Shahmeer
    puzzle3();
    //METHOD 4 - Shahmeer
    puzzle4();
    //METHOD 5 - Adam
    puzzle5();
    //METHOD 6 - Adam
    puzzle6();
    //METHOD 7 - Emaan
    puzzle7();
    //METHOD 8 - Emaan
    puzzle8();
    //METHOD 9 - CONCLUSION ADAM GOAT CLUTCHED UP
    conclusion();

     //CONCLUSION
    System.out.print("\n\nCoNCluSiON\n\nCongratulations, you have successfully escaped the heist. You have even been able to grab a stack of cash on the way out, just for good measure. People around the world are requesting an interview. However, you are traumatized by what you have witnessed throughout your journey to escape. You quit your job at the Royal Mint and question going out to shop, eat, and grocery as if you are still stuck inside the bank. You stare at the mask you used to escape, with memories flooding into your conscience. Will your life ever be the same Arturo?");

  }//END CHOICE 1 

  else if (choice == 2){
    System.out.println("\nAn escape room is a room in which people are locked in order to play a game requiring them to solve a series of puzzles to accomplish a goal. You will solve a series of puzzles to escape from the villains. These puzzles will require you to use critical thinking and think outside of the box. You have 45 minutes to escape the Royal Mint. NO PHONES! NO OUTSIDE HELP!! Best of luck!");
  }//END CHOICE 2

  else{
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.print("GaMe OvER.");
  }//END CHOICE 3 

      //??
    do{
  System.out.print("\n\nWould you like to return to main menu? (yes/no): ");
  pick=input.next();
  if (!pick.equalsIgnoreCase("yes")&&!pick.equalsIgnoreCase("no")){
    System.out.print("\nInvalid option. Please try again.");
  }//END IF
  }while(!pick.equalsIgnoreCase("yes")&&!pick.equalsIgnoreCase("no"));

  }while(pick.equalsIgnoreCase("yes"));



  }//END MAIN METHOD

//PUZZLE 1 (MAHARSI)
  public static void puzzle1(){
    Scanner input = new Scanner (System.in);
    //Variables
    String code;
    //Story
    System.out.print ("\n\nYou silently creep towards the end of the temporarily empty hallway and see a door that needs a numeric code to be unlocked. You look towards the entrance of the bank to see in big, bold letters...THE ROYAL MINT\n\n _____________________________________________\n|.'',       \t THE ROYAL MINT           ,''.|\n|.'.'',                                 ,''.'.|\n|.'.'.'',                             ,''.'.'.|\n|.'.'.'.'',                         ,''.'.'.'.|\n|.'.'.'.'.|                         |.'.'.'.'.|\n|.'.'.'.'.|===;                 ;===|.'.'.'.'.|\n|.'.'.'.'.|:::|',             ,'|:::|.'.'.'.'.|\n|.'.'.'.'.|---|'.|, _______ ,|.'|---|.'.'.'.'.|\n|.'.'.'.'.|:::|'.|'|What   |'|.'|:::|.'.'.'.'.|\n|,',',',',|---|',|'|Is The |'|,'|---|,',',',',|\n|.'.'.'.'.|:::|'.|'|Code???|'|.'|:::|.'.'.'.'.|\n|.'.'.'.'.|---|','   /%%%\\   ','|---|.'.'.'.'.|\n|.'.'.'.'.|===:'    /%%%%%\\    ':===|.'.'.'.'.|\n|.'.'.'.'.         /%%%%%%%\\         .'.'.'.'.|\n|.'.'.'.','       /%%%%%%%%%\\       ','.'.'.'.|\n|.'.'.','        /%%%%%%%%%%%\\        ','.'.'.|\n|.'.','         /%%%%%%%%%%%%%\\         ','.'.|\n|.','          /%%%%%%%%%%%%%%%\\          ','.|\n|;____________/%%%%%%%%%%%%%%%%%\\____________;|\n\n");

    //Getting User Input
    do{
      System.out.print ("\nEnter The Numeric Code To Unlock The Door(#): ");
      code = input.next();
      if (code.equalsIgnoreCase("0")){
        System.out.print ("\n\nInTrO\n\nYour name is Arturo Roman, and you are witnessing the greatest money heist in history! Spain has never seen anything like it, and unfortunately for you, you are a hostage in this situation. Like any other day, you were working at the Royal Mint of Spain when a group of masked villains suddenly barged in and told you to get on your knees. The 8 robbers all seemed to be wearing Dali masks and red jumpsuits, holding weapons of all kinds. Once you are on your knees, they tell you what they plan to do and hope they won’t have to hurt anyone, but will do what is necessary. Their goal is to rob the Royal Mint and print €2.4 billion, all with a meticulous plan that has been in the making for a lifetime. All you can think about is your family and how you hope to make it out alive to see them again. The robber guarding your end of the hallway walks away for a brief moment to help with some uncooperative hostages- and you know that this could be your one and only chance. Escape quickly or face the consequences.\n");
      }//END IF
    }while (!code.equalsIgnoreCase("20851815251121391420"));
  }//END PUZZLE 1

//PUZZLE 2 (MAHARSI)
  public static void puzzle2(){
    Scanner input = new Scanner (System.in);

      //Variables
      String password;

      //Story
      System.out.print ("\n\nGreat job! You managed to unlock the door and enter another hallway. You must now find a way to distract the criminals in order to evade them. You see a control panel on the side of the wall that’s titled “LIGHTS”. You must type in a code that triggers all lights in the building to turn off so that you can evade the criminals.\n\n          ____\n     ---        ---\n  ---              ---\n --        _         --\n--         |>         --\n--         |<         --\n --        |>        --\n  --       |<       --\n   --      |>      --\n    --     ||-    --\n     --    ||    --\n      --   ||   --\n      |__________|\n      <__________>\n      <__________>\n      <__________>\n\n"); 
      //Getting User Input
      do{
        System.out.print ("\nEnter The Code: ");
        password = input.next();
        if (password.equalsIgnoreCase("0")){
        System.out.print ("\n\nInTrO\n\nYour name is Arturo Roman, and you are witnessing the greatest money heist in history! Spain has never seen anything like it, and unfortunately for you, you are a hostage in this situation. Like any other day, you were working at the Royal Mint of Spain when a group of masked villains suddenly barged in and told you to get on your knees. The 8 robbers all seemed to be wearing Dali masks and red jumpsuits, holding weapons of all kinds. Once you are on your knees, they tell you what they plan to do and hope they won’t have to hurt anyone, but will do what is necessary. Their goal is to rob the Royal Mint and print €2.4 billion, all with a meticulous plan that has been in the making for a lifetime. All you can think about is your family and how you hope to make it out alive to see them again. The robber guarding your end of the hallway walks away for a brief moment to help with some uncooperative hostages- and you know that this could be your one and only chance. Escape quickly or face the consequences.\n");
      }//END IF
      }while (!password.equals("SHUT"));
      //STORY CONTINUED
      System.out.print ("\n\nGreat job! The criminals have become disoriented rushing to get the power back on. You sprint straight, make a left, and open a door that leads you to the elevator room. At that very moment, the criminals manage to turn the lights back on but are stunned to see nobody around them! You also manage to find one of the robbers’ security tags on the floor because it came off as they scurried to get the power back on (*hint hint* this will come in handy)!\n");
  }//END PUZZLE 2

//PUZZLE 3 - Shahmeer
  public static void puzzle3(){
    Scanner input = new Scanner(System.in);

    //Variables
    String securityCode;

    System.out.println("\n\nCongratulations, you have successfully evaded the criminals! The elevator to escape is inches away, but the pin pad on it only allows authorized personnel to enter (those with a security code). What will you do NOW?!?!?!?\n");

    System.out.println("*Presses button to open elevator doors*\n");

    //do while loop to error check and keep running as long as they give the wrong answer
    do{
      System.out.print("\n~*ENTER SECURITY CODE (#)*~: ");
      securityCode = input.next();
      if(!securityCode.equals("8203")&&!securityCode.equals("0")){
        System.out.println("\n~*INCORRECT. ACCESS DENIED*~");
      }
      if (securityCode.equalsIgnoreCase("0")){
        System.out.print ("\n\nInTrO\n\nYour name is Arturo Roman, and you are witnessing the greatest money heist in history! Spain has never seen anything like it, and unfortunately for you, you are a hostage in this situation. Like any other day, you were working at the Royal Mint of Spain when a group of masked villains suddenly barged in and told you to get on your knees. The 8 robbers all seemed to be wearing Dali masks and red jumpsuits, holding weapons of all kinds. Once you are on your knees, they tell you what they plan to do and hope they won’t have to hurt anyone, but will do what is necessary. Their goal is to rob the Royal Mint and print €2.4 billion, all with a meticulous plan that has been in the making for a lifetime. All you can think about is your family and how you hope to make it out alive to see them again. The robber guarding your end of the hallway walks away for a brief moment to help with some uncooperative hostages- and you know that this could be your one and only chance. Escape quickly or face the consequences.\n");
    }
    }while(!securityCode.equals("8203"));

    //Message for correct answer
    System.out.println("\nCongratulations! You guessed it! That security badge did come in handy after all!\n\n~*ACCESS GRANTED*~");      
}


  //PUZZLE 4 - SHAHMEER
  public static void puzzle4(){
    Scanner input = new Scanner(System.in);

    //Variables
    int elevatorButton;

    //Introduction message
    System.out.println("\n\nYou have entered the elevator. Inside the elevator, you realize you are all alone in an empty, enclosed space surrounded by portraits of robbers with different coloured dali masks. You spin around and around, looking for just one clue. You find in small writing, just above the array of buttons, it says “RGB”. In front of you is an array of buttons, ranging from the numerous floors in the Royal Mint. Choose the wrong floor number, and you will meet your demise on the other side of the elevator with the robbers waiting for you.");

    //Elevator keypad
    System.out.println("\n|---------------------------------------|\n|91  92  93  94  95  96  97  98  99  100|\n|81  82  83  84  85  86  87  88  89  90 |\n|71  72  73  74  75  76  77  78  79  80 |\n|61  62  63  64  65  66  67  68  69  70 |\n|51  52  53  54  55  56  57  58  59  60 |\n|41  42  43  44  45  46  47  48  49  50 |\n|31  32  33  34  35  36  37  38  39  40 |\n|21  22  23  24  25  26  27  28  29  30 |\n|11  12  13  14  15  16  17  18  19  20 |\n| 1   2   3   4   5   6   7   8   9  10 |\n|---------------------------------------|");

    //do while loop to error check and keep running as long as they give wrong answer
    do{
      System.out.print("\nEnter elevator button/floor number: ");
      elevatorButton = input.nextInt();
      if(elevatorButton!=422&&elevatorButton!=0){
        System.out.println("\n~*INCORRECT. THINK CAREFULLY!");
      }
      if (elevatorButton==0){
        System.out.print ("\n\nInTrO\n\nYour name is Arturo Roman, and you are witnessing the greatest money heist in history! Spain has never seen anything like it, and unfortunately for you, you are a hostage in this situation. Like any other day, you were working at the Royal Mint of Spain when a group of masked villains suddenly barged in and told you to get on your knees. The 8 robbers all seemed to be wearing Dali masks and red jumpsuits, holding weapons of all kinds. Once you are on your knees, they tell you what they plan to do and hope they won’t have to hurt anyone, but will do what is necessary. Their goal is to rob the Royal Mint and print €2.4 billion, all with a meticulous plan that has been in the making for a lifetime. All you can think about is your family and how you hope to make it out alive to see them again. The robber guarding your end of the hallway walks away for a brief moment to help with some uncooperative hostages- and you know that this could be your one and only chance. Escape quickly or face the consequences.\n");
    }
  }while(elevatorButton!=422);    

    //Message for correct answer
    System.out.println("\n~*ELEVATOR OPENS UP TO UNKNOWN FLOOR*~\n\nWhat a bizarre elevator code! No, this isn't the 422nd floor, but in fact, it is a secret floor only known to the employees here leading to a mysterious hallway. Where in the world did this elevator take us?");
  }

  //puzzle 1 for adam
public static void puzzle5(){
    Scanner input = new Scanner (System.in);
    int counter5 = 0;
    String code5;
    //pause will be used to slow the user down because who likes someone completing an escape room fast. i just need to figure it out!
    System.out.print("\n\nCongratulations! You have chosen the correct method of transport and have reached a dark luminescent hallway. You stare at the hallway with the feeling that the hallway is staring back. But you have the feeling this is it. The last door to your freedom.");

    System.out.print("\n\nYou approach the wooden door. It can only AsCenD from here. Below the door you find carvings into the wall. The carvings are listed as: ");

    System.out.print("\n\nOctAGON\nTRIangle\nHeXagon\n\nThe keypad requires a 3 digit-code.");
    do{
      System.out.print("\n\nENTER A 3 DIGIT-CODE: ");
      code5=input.next();
      counter5++;
      if (!code5.equalsIgnoreCase("368")&&!code5.equalsIgnoreCase("0")){
        System.out.print("\nIncorrect Password! Try again. ");
      }
      if (code5.equalsIgnoreCase("0")){
        System.out.print("\n\nInTrO\n\nYour name is Arturo Roman, and you are witnessing the greatest money heist in history! Spain has never seen anything like it, and unfortunately for you, you are a hostage in this situation. Like any other day, you were working at the Royal Mint of Spain when a group of masked villains suddenly barged in and told you to get on your knees. The 8 robbers all seemed to be wearing Dali masks and red jumpsuits, holding weapons of all kinds. Once you are on your knees, they tell you what they plan to do and hope they won’t have to hurt anyone, but will do what is necessary. Their goal is to rob the Royal Mint and print €2.4 billion, all with a meticulous plan that has been in the making for a lifetime. All you can think about is your family and how you hope to make it out alive to see them again. The robber guarding your end of the hallway walks away for a brief moment to help with some uncooperative hostages- and you know that this could be your one and only chance. Escape quickly or face the consequences. ");
      }
      if (counter5==5){
        System.out.print("\nONE TIME HINT: FOCUS ON PREFIXES!");
      }
    }while(!code5.equalsIgnoreCase("368"));
  }//end puzzle 5
  //puzzle 6
  public static void puzzle6(){
    Scanner input = new Scanner (System.in);
    String code6;
    int counter6=0;
    System.out.print("\n\nThe door opens with a loud beep! You jump in joy and make sure no robber is lurking behind you. You open the door expecting to see police officers that have been waiting to rescue you. But to your surprise, it is another hallway. The joy slowly turns to despair. In front of you lies the bank of the Royal Mint of Spain. The country's national gold reserve is 5ft away from you. However, you are stopped by a keypad on a Ψall. The safedoor is equipped with a digital panel that requires a binary code. The keypad requires a 25 digit-code.");
    do{
      System.out.print("\n\nENTER A 25 DIGIT CODE (no spaces): ");
      code6=input.next();
      counter6++;
      if (!code6.equals("1100110010111000110110111")){
        System.out.print("\nIncorrect Code! Try again.");
      }
      if (code6.equalsIgnoreCase("0")){
        System.out.print("\n\nInTrO\n\nYour name is Arturo Roman, and you are witnessing the greatest money heist in history! Spain has never seen anything like it, and unfortunately for you, you are a hostage in this situation. Like any other day, you were working at the Royal Mint of Spain when a group of masked villains suddenly barged in and told you to get on your knees. The 8 robbers all seemed to be wearing Dali masks and red jumpsuits, holding weapons of all kinds. Once you are on your knees, they tell you what they plan to do and hope they won’t have to hurt anyone, but will do what is necessary. Their goal is to rob the Royal Mint and print €2.4 billion, all with a meticulous plan that has been in the making for a lifetime. All you can think about is your family and how you hope to make it out alive to see them again. The robber guarding your end of the hallway walks away for a brief moment to help with some uncooperative hostages- and you know that this could be your one and only chance. Escape quickly or face the consequences. ");
      }
      //hint
      if (counter6==5){
        System.out.print("\nONE TIME HINT: Walls.");
      }
    }while(!code6.equals("1100110010111000110110111"));
    System.out.print("\n\nCongratulations! You have opened the safe. ");
  }//end puzzzle 6

  //puzzle 7-Emaan
  public static void puzzle7(){
    Scanner input = new Scanner (System.in);
  //variables
    String code7;
    int tries=0;
  //output explanation
    System.out.println("\n\nThese robbers really messed with the wrong person huh Arturo? You open the safe to find just a singular maze and uv light. Find your way through the maze in ORDER to get to your next destination- the briefcase. On the way there, decipher the code to unlock the briefcase, which holds a vital part to your escape!");
    //repeat until correct code is entered 
    do{
      System.out.print("\n\nEnter the code: ");
      code7=input.next();
    //tell user to try again if code is incorrect
      if (!code7.equals("2455769")){
        System.out.print("CODE INVALID! TRY AGAIN! \n");
        tries+=1;
      }
    //tell user to hurry up if there have been more than 3 attempts 
      if (tries>3&&!code7.equals("2455769")){
        System.out.print("Hurry! The robbers are catching up!");
      }
      //if input equals 0
       if (code7.equalsIgnoreCase("0")){
        System.out.print("\n\nInTrO\n\nYour name is Arturo Roman, and you are witnessing the greatest money heist in history! Spain has never seen anything like it, and unfortunately for you, you are a hostage in this situation. Like any other day, you were working at the Royal Mint of Spain when a group of masked villains suddenly barged in and told you to get on your knees. The 8 robbers all seemed to be wearing Dali masks and red jumpsuits, holding weapons of all kinds. Once you are on your knees, they tell you what they plan to do and hope they won’t have to hurt anyone, but will do what is necessary. Their goal is to rob the Royal Mint and print €2.4 billion, all with a meticulous plan that has been in the making for a lifetime. All you can think about is your family and how you hope to make it out alive to see them again. The robber guarding your end of the hallway walks away for a brief moment to help with some uncooperative hostages- and you know that this could be your one and only chance. Escape quickly or face the consequences. ");
      }
    }while(!code7.equals("2455769"));
    //tell user that code is correct 
    System.out.print("\nCODE SUCCESSFUL!\n\n");
  }//end puzzle 7

  //puzzle 8-Emaan
  public static void puzzle8(){
    Scanner input = new Scanner (System.in);
    //variables
    String code8;
    //output explanation
    System.out.print("Good Job! You were able to open the briefcase! Inside, you find three things, ID cards of 4 of the robbers, a cipher, and dali masks- the same one that all the robbers are wearing. It’s perfect, now you blend right in, and your chance of escaping is in hand reach.You move the briefcase to find the exit waiting for you. You think this is finally your chance to go back to your family, only one problem… the exit only unlocks with the correct ID card code. FIRST decipher the code, in order to escape back to your family! \n**HINT: A=H**");
    //repeat until correct code is entered 
    do{
      System.out.print("\n\nENTER EXIT CODE: ");
      code8=input.next();
    //tell user to try again if code is invalid 
      if (!code8.equals("IVUK")){
        System.out.print("\nCODE INVALID! TRY AGAIN!\n");
      }
    //if input is 0
       if (code8.equalsIgnoreCase("0")){
        System.out.print("\n\nInTrO\n\nYour name is Arturo Roman, and you are witnessing the greatest money heist in history! Spain has never seen anything like it, and unfortunately for you, you are a hostage in this situation. Like any other day, you were working at the Royal Mint of Spain when a group of masked villains suddenly barged in and told you to get on your knees. The 8 robbers all seemed to be wearing Dali masks and red jumpsuits, holding weapons of all kinds. Once you are on your knees, they tell you what they plan to do and hope they won’t have to hurt anyone, but will do what is necessary. Their goal is to rob the Royal Mint and print €2.4 billion, all with a meticulous plan that has been in the making for a lifetime. All you can think about is your family and how you hope to make it out alive to see them again. The robber guarding your end of the hallway walks away for a brief moment to help with some uncooperative hostages- and you know that this could be your one and only chance. Escape quickly or face the consequences. ");
      }
    }while(!code8.equals("IVUK"));
    //tell user code is correct 
    System.out.print("\nCODE SUCCESSFUL!");
  }//end puzzle 8
public static void conclusion(){
  Scanner input = new Scanner (System.in);
    String code;
    System.out.print("\n\nBefore you go, you see a stack of cash hidden inside a vent near the exit. The cash is secured with some sort of AI, it requires a code to be inputted or else the alarm will go off when you touch the money. It gives you one hint as to what the code could be: Press 0");
      do{
      System.out.print("\n\nEnter a 3 digit-code: ");
      code = input.next();
      if (!code.equalsIgnoreCase("333")&&!code.equalsIgnoreCase("0")){
        System.out.print("Incorrect! Please try again.");
      }
      if (code.equalsIgnoreCase("0")){
        System.out.print("/n/nInTrO/n/nYour name is Arturo Roman, and you are witnessing the greatest money heist in history! Spain has never seen anything like it, and unfortunately for you, you are a hostage in this situation. Like any other day, you were working at the Royal Mint of Spain when a group of masked villains suddenly barged in and told you to get on your knees. The 3 robbers all seemed to be wearing Dali masks and red jumpsuits, holding weapons of all kinds. Once you are on your knees, they tell you what they plan to do and hope they won’t have to hurt anyone, but will do what is necessary. Their goal is to rob the Royal Mint and print €___ billion, all with a meticulous plan that has been in the making for a lifetime. All you can think about is your family and how you hope to make it out alive to see them again. The robber guarding your end of the hallway walks away for a brief moment to help with some uncooperative hostages- and you know that this could be your one and only chance. 3scape quickly or face the consequenc3s.");
      }
    }while(!code.equalsIgnoreCase("333"));
}
}//END PROGRAM 