package streamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class main {
public static void main(String args[])
{
	ArrayList<Fruit> f1=new ArrayList<Fruit>();
	f1.add(new Fruit("grapes",120,90,"black"));
	f1.add(new Fruit("strawberry",220,290,"red"));
	f1.add(new Fruit("apple",160,200,"red"));
	f1.add(new Fruit("mango",70,80,"orange"));
	f1.add(new Fruit("cherry",50,150,"red"));
	
	List<Fruit>fr=f1.stream().filter(f->f.getCalories()<100)
	.sorted((Comparator.comparingInt(Fruit::getCalories).reversed())).collect(Collectors.toList());
	fr.forEach(f->System.out.println(f.getName()));
	System.out.println(".................");
	
	f1.stream().sorted((Comparator.comparing(Fruit::getColor))).forEach(f->System.out.println(f.getColor()+" "+f.name));
	System.out.println(".................");
	
	f1.stream().filter(f->f.getColor()=="red").forEach(f->System.out.println(f.getColor()+"-"+f.getPrice()));
	System.out.println(".................");
	
	
	
	ArrayList<News> n1=new ArrayList<News>();
	n1.add(new News(1,"ramesh","harish","bitcoin scam in karnataka"));
	n1.add(new News(2,"venu","hari","india budget"));
	n1.add(new News(1,"suresh","vishnu","IT companies are ending workfrom home"));
	n1.add(new News(3,"ravi","krishna","low budget"));
	
//	n1.stream().filter(n->n.getComment()>1).forEach(n->System.out.println(n.getNewsid()));
	
	
	
	ArrayList<Trader>t1=new ArrayList<Trader>();
	t1.add(new Trader("raju","bangalore"));
	t1.add(new Trader("manu","kolar"));
	t1.add(new Trader("deepak","kolar"));
	t1.add(new Trader("mohan","hosur"));
	t1.add(new Trader("veda","ballari"));
	
	t1.stream().map(t->t.city).distinct().forEach(t->System.out.println(t));
	
	System.out.println("...................");
	
	t1.stream().filter(t->t.city.contains("kolar")).forEach(t->System.out.println(t.name));
	
//	System.out.println("transactions");
	System.out.println("...................");
	
	ArrayList<Transaction>t2=new ArrayList<Transaction>();
	t2.add(new Transaction(new Trader("raju","bangalore"),2010,7000));
	t2.add(new Transaction(new Trader("manu","kolar"),2009,90000));
	t2.add(new Transaction(new Trader("deepak","kolar"),2008,88000));
	t2.add(new Transaction(new Trader("mohan","delhi"),2012,120000));
	t2.add(new Transaction(new Trader("veda","indore"),2010,75000));
	
	t2.stream().filter(tr->tr.year==2010).map(tr->tr.value).sorted()
	.forEach(tr->System.out.println(tr));
	
	System.out.println("...................");
	
	
	t2.stream().filter(tr->tr.trader.city.contains("delhi"))
	.forEach(tr->System.out.println(tr));
	
	
	System.out.println("...................");
	
	
	
	t2.stream().map(tr->tr.trader.name)
	.sorted().forEach(tr->System.out.println(tr));
	
	System.out.println("...................");
	
	Optional<Integer> maxvalue=t2.stream()
	.map(tr->tr.value).max((i,j)->i.compareTo(j));
	System.out.println(maxvalue);
	
	
	System.out.println("...................");
	
	
	
	Optional<Integer> minvalue=t2.stream().map(tr->tr.value).min((i,j)->i.compareTo(j));
	System.out.println(minvalue);
	
}
}
