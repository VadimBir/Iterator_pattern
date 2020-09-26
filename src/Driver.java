
public class Driver {	
   public static void main(String[] args) {
      WorkTasks workTasks = new WorkTasks();
      PersonalTasks personalTasks = new PersonalTasks();

      System.out.println("Work Tasks:");
      for(Iterator iter = workTasks.getIterator(); iter.hasNext();){
         String task = (String)iter.next();
         System.out.println("Todo: " + task);
      } 	
      System.out.println("\n");
      System.out.println("Personal Tasks:");
      for(Iterator iter = personalTasks.getIterator(); iter.hasNext();){
         String task2 = (String)iter.next();
         System.out.println("Todo: " + task2);
	  } 	
	}
}
