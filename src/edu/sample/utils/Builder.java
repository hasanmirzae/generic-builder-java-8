package edu.sample.utils;

import java.util.function.Consumer;

/**
 * Universal builder class.
 * @author Hassan Mirzaee
 *
 * @param <T>
 */
public class Builder<T> {

    T instance;
    public Builder(Class<T> clazz){
	try {
	    instance = clazz.newInstance();
	} catch (InstantiationException | IllegalAccessException e) {
	    e.printStackTrace();
	} 
    }
    
    public Builder<T> with(Consumer<T> setter){
	setter.accept(instance);
	return this;
    }
    
    public T get(){
	return instance;
    }
    
    public static <T> Builder<T> build(Class<T> clazz) {
	return new Builder<>(clazz);
    }
    

}
