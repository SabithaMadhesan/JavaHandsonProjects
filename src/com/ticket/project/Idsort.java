package com.ticket.project;

import java.util.Comparator;

public class Idsort implements Comparator<Pojo> {

	Pojo s1;
	Pojo s2;

	public Idsort() {
		// super();
	}

	public Idsort(Pojo s1, Pojo s2) {
		// super();
		this.s1 = s1;
		this.s2 = s2;
	}

	@Override
	public int compare(Pojo o1, Pojo o2) {
		if (o1.getId() > o2.getId())
			return 1;
		else if (o1.getId() == o2.getId())
			return 0;
		else
			return -1;
	}

}
