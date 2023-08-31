public class WorkOrder implements Comparable<WorkOrder>{

   private int priority;
   private String description;

   public WorkOrder(int priority, String description)
   {
      this.priority = priority;
      this.description = description;
   }

   public String toString()
   {
      return "priority=" + priority + ", description=" + description;
   }
   
    @Override
    public int compareTo(WorkOrder otherObject) {
        WorkOrder other = (WorkOrder) otherObject;
        if (priority < other.priority) { return -1; }
        else if (priority > other.priority) { return 1; }
        else { return 0; }    
    }
}
