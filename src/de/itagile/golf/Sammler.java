package de.itagile.golf;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.reflections.Reflections;
import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;

public class Sammler<T> {

	private Class<T> clazz;

	public Sammler(Class<T> clazz) {
		this.clazz = clazz;
	}

	public List<T> sammle() {
		List<T> ernte = new ArrayList<T>();
		for (Class<? extends T> subclazz : subclassesOf(clazz)) {
			ernte.add(instanciate(subclazz));
		}
		return ernte;
	}

	public T instanciate(Class<? extends T> clazz) {
		T instance;
		try {
			instance = clazz.newInstance();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return instance;
	}

	public Set<Class<? extends T>> subclassesOf(Class<T> clazz) {
		turnOffLogging();
		return new Reflections("de.itagile.golf").getSubTypesOf(clazz);
	}

	private void turnOffLogging() {
		((Logger) LoggerFactory.getLogger("org.reflections.Reflections")).setLevel(Level.WARN);
	}

}
