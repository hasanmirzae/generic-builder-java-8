package edu.sample;

import java.util.Arrays;
import java.util.List;
import java.util.Properties;

import edu.sample.utils.Builder;

/**
 * @author Hassan Mirzaee
 *
 */
public class Main {

    public static void main(String[] args) {
	List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

	System.out.println("Create only new instance:");

	System.out.println(Builder.build(Sample.class)
				  .get());

	System.out.println("\n\nCreate new instance with setters:");

	System.out.println(Builder.build(Sample.class)
				  .with(s -> s.setId(1))
				  .with(s -> s.setName("Sample object"))
				  .with(s -> s.setList(list))
				  .get());

	System.out.println("\n\nCreate new instance of java standard properties:");

	System.out.println(Builder.build(Properties.class)
				  .with(p -> p.put("one", 1))
				  .If(() -> false)// any expression returning boolean
				  .with(p -> p.put("two", 2))
				  .with(p -> p.put("three", 3))
				  .endIf()
				  .with(p -> p.put("four", 4))
				  .get()

	);

    }

}
