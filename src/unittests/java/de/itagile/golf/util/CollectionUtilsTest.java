package de.itagile.golf.util;

import static de.itagile.golf.util.CollectionUtils.join;
import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class CollectionUtilsTest {

	@Test
	void joinsEmptyCollectionToEmptyString() throws Exception {
		assertThat(join(Arrays.asList(), ""), is(""));
	}

	@Test
	void joinsElementsOfCollectionUsingSeparator() throws Exception {
		assertThat(join(asList(1, 2), ", "), is("1, 2"));
	}

}
