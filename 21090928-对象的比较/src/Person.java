import java.util.Comparator;

class PersonNameComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.name.compareTo(o2.name);
    }
}

class PersonHeightComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return (int)((o1.height - o2.height)*100);
    }
}

class PersonComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        if(o1.height != o2.height) {
            return (int)((o1.height - o2.height)*100);
        } else if(o1.height == o2.height){
            if(o1.weight != o2.weight) {
                return (int)(o1.weight - o2.weight);
            } else if(o1.weight == o2.weight) {
                if(o1.name != o2.name){
                    return o1.name.compareTo(o2.name);
                } else if(o1.name == o2.name){
                    if(o1.age != o2.age){
                        return o1.age - o2.age;
                    }
                }
            }
        }
        return 0;
    }
}

public class Person implements Comparable<Person> {
     String name;
     int age;
     double height;
     double weight;
    @Override
    public int compareTo(Person o) {
       /*if(age < o.age) {
           return -1;
       }else if(age == o.age) {
           return 0;
       }else{
           return 1;
       }*/
       return age - o.age;
    }
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "Jame"; p.age = 20; p.height = 1.85;p.weight = 120;
        Person q = new Person();
        q.name = "Jame"; q.age = 20;q.height = 1.85;q.weight = 120;

        System.out.println("按照年龄比较");
        int r = p.compareTo(q);
        if(r < 0){
            System.out.println("p小于q");
        }else if(r == 0){
            System.out.println("p等于q");
        }else{
            System.out.println("p大于q");
        }

        System.out.println("===============");

        Comparator<Person> comparator = new PersonNameComparator();
        System.out.println("按照姓名比较");
        int s = comparator.compare(p,q);
        if(s < 0){
            System.out.println("p小于q");
        }else if(s == 0){
            System.out.println("p等于q");
        }else{
            System.out.println("p大于q");
        }

        System.out.println("==========");

        comparator = new PersonHeightComparator();
        System.out.println("按照身高比较");
        int e = comparator.compare(p,q);
        if(e < 0){
            System.out.println("p小于q");
        }else if(e == 0){
            System.out.println("p等于q");
        }else{
            System.out.println("p大于q");
        }

        System.out.println("==========");

        comparator = new PersonComparator();
        System.out.println("按照自定义顺序比较");
        int v = comparator.compare(p,q);
        if(v < 0){
            System.out.println("p小于q");
        }else if(v == 0){
            System.out.println("p等于q");
        }else{
            System.out.println("p大于q");
        }
    }
}