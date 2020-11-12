public class Mystery {

    /**
     * read file of mysterious phrases
     */

    public void DoSomething() {
        // initialize instance variables
        FileResource someFile = FileResource("phrases.txt");
        for (String phrase : someFile.lines()){
            System.out.println(phrase);
        }
    }
}