package exp1;
import java.util.Hashtable;
import java.util.Map;
public class HashTable {


public static void main(String args[]){
 Hashtable<Integer,String> hm=new Hashtable<Integer,String>();
 hm.put(1218,"Prathyusha");
 hm.put(1219,"Prabha");
 hm.put(1220,"Supriya");
 hm.put(1221,"Sanjana");
 for(Map.Entry m:hm.entrySet()){
 System.out.println(m.getKey()+" "+m.getValue());
 }
 }
}