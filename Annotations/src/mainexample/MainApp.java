package mainexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;


public class MainApp {
   public static void main(String[] args) {
	   System.out.println("hello MainApp");
     ApplicationContext ctx = new AnnotationConfigApplicationContext(TextEditorConfig.class);

      TextEditor te = ctx.getBean(TextEditor.class);
      te.spellCheck();
     
   }
}