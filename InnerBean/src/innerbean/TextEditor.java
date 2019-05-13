package innerbean;

public class TextEditor {
	 private SpellChecker spellChecker;
	   
	 TextEditor()
	 {
		 System.out.println("Initializing TextEditor.");
	 }
	   
	   public void setSpellChecker(SpellChecker spellChecker) {
	      System.out.println("Inside setSpellChecker." );
	      this.spellChecker = spellChecker;
	   }
	   
	  
	   public SpellChecker getSpellChecker() {
	      return spellChecker;
	   }
	   public void spellCheck() {
	      spellChecker.checkSpelling();
	   }
}
