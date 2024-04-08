package com.company;
import java.io.*;
import java.util.*;

//    class players {
//    private String name;
//    private double Strikerate;
//    private int id;
//    private int jerseynumber;
//
//        public players(String name, int id, double strikerate, int jerseynumber) {
//            this.name=name;
//            this.id=id;
//            this.Strikerate=Strikerate;
//            this.jerseynumber=jerseynumber;
//        }
//
//        public void Players(String name, double Strikerate, int id, int jerseynumber) {
//       // super();
//        this.name = name;
//        this.Strikerate = Strikerate;
//        this.id= id;
//        this.jerseynumber = jerseynumber;
//
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public double getStrikerate() {
//        return Strikerate;
//    }
//
//    public void setStrikerate(double strikerate) {
//        Strikerate = strikerate;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public int getJerseynumber() {
//        return jerseynumber;
//    }
//
//    public void setJerseynumber(int jerseynumber) {
//        this.jerseynumber = jerseynumber;
//    }


//}
public class Main {

    public static void main(String[] args)  {

//        Set<String> set1 = new HashSet<String>();
//
//
//        FileReader a = new FileReader("dictionary.txt");
//        BufferedReader b = new BufferedReader(a);
//        String sr;
//
//
//        while ((sr = b.readLine()) != null) {
//            set1.add(sr);
//
//        }
//        Set<String> set2 = new HashSet<String>();
//
//
//        FileReader c = new FileReader("words.txt");
//        BufferedReader d = new BufferedReader(c);
//        String src;
//        while ((src = d.readLine()) != null) {
//            set2.add(src);
//
//        }
//        set2.removeAll(set1);
//        System.out.println(set2);

///practice ques 7
        Map<String,String> map1=new TreeMap<>();
        map1.put("Carl","B+");
        map1.put("Joe","C");
        map1.put("Sarah","A+");
        System.out.println("students with their grades are:"+map1);

        //Adding a student

        map1.put("Krisha","B");
        System.out.println("adding one more:"+map1);

        //removing a student

        map1.remove("Carl","B+");
        System.out.println("removing one student:"+map1);


        System.out.println(map1);
        map1.entrySet();
        Iterator<Map.Entry<String,String>> itr= map1.entrySet().iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

//        Map<String,Integer> map1 = new HashMap<>();
//        FileReader a = new FileReader(" alice_in_wonderland.txt");
//        BufferedReader b = new BufferedReader(a);
//        String sr;
//
//
//      int count=1;
//      while(sr=b.readline)
//      if(map1.containsKey()){
//          count++;
//          map.setValue(count);
//      }else{
//          map1.keySet();
//
//      }

//   Scanner sc=new Scanner(System.in);
//       String name= sc.next();
//      int id=sc.nextInt();
//      double Strikerate=sc.nextDouble();
//      int jerseynumber=sc.nextInt();
//
//        List<players> PlayersList = new ArrayList<players>();
//        players pl = new players(name,id,Strikerate,jerseynumber);
//        PlayersList.add(pl);
//        Collections.sort(PlayersList, new Comparator<players>() {
//            @Override
//            public int compare(players p1, players p2) {
//                if(p2.getStrikerate()>p1.getStrikerate()){
//                    return 1;
//                }else if(p2.getJerseynumber()<p1.getJerseynumber()){
//                    return -1;
//                }
//                return p1.getName().compareTo(p2.getName());
//            }
//        });
//        for(players ply: PlayersList){
//            System.out.println(ply.getName());
//        }

    }
}
