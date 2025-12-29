
// Created a compact source class
void main() {
    String line = "-".repeat(50);
    String intro = "Dice Roller";

    IO.println(line);
    IO.println(intro);
    IO.println(line);
    IO.println();

    //Did not add validation, this code is meant to be simple, I am aware that entering a letter will break the code
    Scanner input = new Scanner(System.in);
    IO.println("How many dice would you like to roll?");
    int dice = input.nextInt();
    if (dice <= 1) {
        IO.println("You want to roll " + dice + " die.");
    } else {
        IO.println("You want to roll " + dice + " dice.");
    }

    roll(dice);

    input.close();

}

// Simple range randomizer, using lightweight technique
public static void roll(int dices) {

    int sum = 0;

    for (int i = 0; i < dices; i++) {
        int num = (int) (Math.random() * 6) + 1;
        IO.println("Dice " + (i + 1) + " is " + num);
        sum += num;
    }

    IO.println("You rolled " + sum);
}
