import java.util.ArrayList;

public class WorkTasks implements Container{
    
    ArrayList<String> tasks = new ArrayList<String>();
    public WorkTasks()
    {
        tasks.add("Finish project by Friday");
        tasks.add("Finish financial report");
        tasks.add("Talk to supervisor");
    }

    @Override
    public Iterator getIterator() {
        return new TaskIterator();
    }

    protected class TaskIterator implements Iterator{
        int index;
    
        @Override
        public boolean hasNext() {
            if(index<tasks.size()){
                return true;
            }else{
                return false;
            }
        }

        @Override
        public Object next() {
            if(this.hasNext()){
                return tasks.get(index++);
            }else{
                return null;
            }
        }

    }
    
}
