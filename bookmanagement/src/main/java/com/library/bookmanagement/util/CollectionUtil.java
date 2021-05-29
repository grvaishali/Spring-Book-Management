package com.library.bookmanagement.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class CollectionUtil {

	private CollectionUtil() {

	}

	public static <T> Collection<T> getCollectionFromIteralbe(Iterable<T> itr) {
		Collection<T> cltn = new ArrayList<T>();

		return StreamSupport.stream(itr.spliterator(), false).collect(Collectors.toList());
	}
}
