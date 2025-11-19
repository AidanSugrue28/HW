public class MadLib {
    public String city;
    public double decimalBiggerThan1;
    public String miltonTeacher;
    public String miltonDean;
    public char letterGrade;
    public double number1;
    public double number2;
    public String adjective;
    public String noun;
    public String pluralNoun;
    public String pluralAnimal;
    public boolean trueOrFalse;
    public String season;
    public String classmate;
    public int wholeNumberBetween1And4;
    public static void main(String[] args) {
        System.out.println("hi");
        MadLib myStory = new MadLib();

    } // main method

    public MadLib() {
        System.out.println("hi");
        city = "boston";
        decimalBiggerThan1 = 3;
        miltonTeacher = "Mx. Bradford";
        miltonDean = "Ms. Sugrue";
        letterGrade = 'F';
        number1 = 2;
        number2 = 8;
        adjective = "funny";
        noun = "shoe";
        pluralNoun = "bags";
        pluralAnimal = "zebras";
        trueOrFalse = true;
        season = "spring";
        classmate = "Blake";
        wholeNumberBetween1And4 = 3;


        String story = "This weekend I am going camping with "
                +classmate+ ". We are going to a campsite in "
                +city+ ". I packed my "+noun+ " and "
                +pluralNoun + ".  The forecast is calling for a high of "
                +decimalBiggerThan1+ " degrees fahrenheit. So it should be a "
                +adjective+" day! This year, the park rangers have seen "
                +number1+ " " +pluralAnimal + " which seems kind of dangerous. "
                +miltonTeacher+" said it's " + trueOrFalse + " that "+pluralAnimal+ " eat class "
                +wholeNumberBetween1And4+ " students in the " +season+ ". But, "
                +miltonDean+ " said it actually has only happened "
                + number2+" times. Wish us luck! If we survive, we will earn a "
                +letterGrade+ "- in P.E. class.";

//now print story to the dos window
        System.out.println(story);


    } //constructor method

}