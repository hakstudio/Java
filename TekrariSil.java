import java.util.ArrayList;
public class TekrariSil {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        arrayList.add("b");
        arrayList.add("c");
        System.out.println(arrayList);
        System.out.println(tekrariSil(arrayList));
    }
    static ArrayList<String> tekrariSil(ArrayList<String> arrayList){
        for (int i=0; i<arrayList.size(); i++){
            String anaEleman=arrayList.get(i);
            for (int j=i+1; j< arrayList.size(); j++){
                String eleman=arrayList.get(j);
                if(anaEleman.equals(eleman)){
                    arrayList.remove(j);
                }
            }
        }
        return arrayList;
    }
}

/*Çıktı:
[a, b, c, b, c]
[a, b, c]
*/
