public class PersonalTasks implements Container{

    String[][] tasks = {{"Go Shopping","Do Laundry","Clean up the House"},{"Wednsday","Friday","Saturday"}};;

    @Override
    public Iterator getIterator() {
        return new TaskIterator();
    }

    protected class TaskIterator implements Iterator{
        int indexX;
    
        @Override
        public boolean hasNext() {
            if(indexX<tasks[0].length){
                return true;
            }else{
                return false;
            }
        }

        @Override
        public Object next() {
            if(this.hasNext()){
                return tasks[0][indexX] + " on " + tasks[1][indexX++];
            }else{
                return null;
            }
        }

    }

}
