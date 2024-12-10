import java.util.ArrayList;

public class Control<objectType> {

    private final ArrayList<objectType> dataList;
    public Control(){
        this.dataList = new ArrayList<>();
    }

    //create method
    public void create (objectType object){
        this.dataList.add(object);
    }
    //read method
    public ArrayList<objectType> read (){
        return this.dataList;
    }

    //update method
    public void update (int id,objectType newObject){
        if (id >= 0 && id < dataList.size()){
           dataList.set(id,newObject);
        }else {
            System.out.print("this is user note found check your information");
        }
    }


    // delete method
    public void delete(int id){
        if(id >= 0 && id < dataList.size()){
            dataList.remove(id);
        }else {
            System.out.print("data note found please check your information");
        }
    }


}
