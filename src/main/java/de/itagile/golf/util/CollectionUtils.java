package de.itagile.golf.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionUtils {

	public static String join(Collection<?> collection, String separator) {
		List<Object> interleaved = interleave(collection, separator);
		return join(interleaved);
	}

	private static List<Object> interleave(
			Collection<?> collection, String separator) {
		List<Object> interleaved = new ArrayList<>();
		collection.forEach(object->{
			interleaved.add(object);
			interleaved.add(separator);
		});
		if (! interleaved.isEmpty()) {
			interleaved.remove(interleaved.size() - 1);
		}

		return interleaved;
	}

	private static String join(List<?> collection) {
		StringBuilder result = new StringBuilder();
		collection.forEach(object -> result.append(object.toString()));
		return result.toString();
	}

}
