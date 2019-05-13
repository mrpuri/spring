package events;
import org.springframework.context.ApplicationListener;
public class CustomEventHandler implements ApplicationListener<CustomEvent> {
	
		public void onApplicationEvent (CustomEvent event)
		{
			System.out.println(event.toString());
		}
	

	
//	public void onApplicationEvent(CustomEvent arg0) {
//		// TODO Auto-generated method stub
//		
//	}
}


