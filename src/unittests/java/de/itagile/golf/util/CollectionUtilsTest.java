package de.itagile.golf.util;

import static de.itagile.golf.util.CollectionUtils.join;
import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;

import org.junit.Test;

public class CollectionUtilsTest {

	@Test
	public void joinsEmptyCollectionToEmptyString() throws Exception {
		assertThat(join(Arrays.asList(), ""), is(""));
	}
	@Test
	public void joinsElementsOfCollectionUsingSeparator() throws Exception {
		assertThat(join(asList(1, 2), ", "), is("1, 2"));
	}
}
