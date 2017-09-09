import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CalculateQueue {

    public static void main(String args[]){

        ToSort person = new ToSort(new Float(3), "3");
        ToSort person1 = new ToSort(new Float(6), "6");
        ToSort person2 = new ToSort(new Float(9), "9");
        ToSort person3 = new ToSort(new Float(1), "1");

        List<ToSort> sortList = new ArrayList<ToSort>();
        sortList.add(person);
        sortList.add(person1);
        sortList.add(person2);
        sortList.add(person3);


        Collections.sort(sortList);

        for(ToSort toSort : sortList){
            System.out.println(toSort.toString());
        }
    }

}

public class ToSort implements CalculateQueue<ToSort> {

    private Float val;
    private String id;

    public ToSort(Float val, String id){
        this.val = val;
        this.id = id;
    }

    @Override
    public int compareTo(ToSort f) {

        if (val.floatValue() > f.val.floatValue()) {
            return 1;
        }
        else if (val.floatValue() <  f.val.floatValue()) {
            return -1;
        }
        else {
            return 0;
        }

    }

    @Override
    public String toString(){
        return this.id;
    }
}