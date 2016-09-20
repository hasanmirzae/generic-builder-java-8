package edu.sample;

import java.util.List;

/**
 * @author Hassan Mirzaee
 *
 */
public class Sample {
	int id;
	String name;
	List<Integer> list;

	public int getId() {
	    return id;
	}

	public void setId(int id) {
	    this.id = id;
	}

	public String getName() {
	    return name;
	}

	public void setName(String name) {
	    this.name = name;
	}

	public List<Integer> getList() {
	    return list;
	}

	public void setList(List<Integer> list) {
	    this.list = list;
	}

	@Override
	public String toString() {
	    return String.format("id:%d, name:%s, list:%s", id, name, list);
	}
	

}
