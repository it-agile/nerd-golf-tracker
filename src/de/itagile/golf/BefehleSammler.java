package de.itagile.golf;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.reflections.Reflections;
import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;

public class BefehleSammler {

	public List<Befehl> befehle() {
		List<Befehl> befehle = new ArrayList<Befehl>();
		for (Class<? extends Befehl> subclazz : subclassesOf(Befehl.class)) {
			befehle.add(instanciate(subclazz));
		}
		return befehle;
	}

	public Befehl instanciate(Class<? extends Befehl> clazz) {
		Befehl instance;
		try {
			instance = clazz.newInstance();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return instance;
	}

	public Set<Class<? extends Befehl>> subclassesOf(Class<Befehl> clazz) {
		turnOffLogging();
		return new Reflections("de.itagile.golf").getSubTypesOf(clazz);
	}

	private void turnOffLogging() {
		((Logger) LoggerFactory.getLogger("org.reflections.Reflections")).setLevel(Level.WARN);
	}

}
