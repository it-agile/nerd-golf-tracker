package de.itagile.golf.util;

import static java.util.stream.Collectors.joining;

import java.util.Collection;

public final class CollectionUtils {

	private CollectionUtils() {
		super();
	}

	public static String join(Collection<?> collection, String separator) {
		return collection.stream().map(String::valueOf).collect(joining(separator));
	}

}
