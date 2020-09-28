
public class WorkTasks implements Container{
    
    String[] tasks = {"Finish project by Friday","Finish financial report","Talk to supervisor"};

    @Override
    public Iterator getIterator() {
        return new TaskIterator();
    }

    protected class TaskIterator implements Iterator{
        int index;
    
        @Override
        public boolean hasNext() {
            if(index<tasks.length){
                return true;
            }else{
                return false;
            }
        }

        @Override
        public Object next() {
            if(this.hasNext()){
                return tasks[index++];
            }else{
                return null;
            }
        }

    }
    
}
