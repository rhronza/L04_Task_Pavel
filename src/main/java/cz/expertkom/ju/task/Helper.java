package cz.expertkom.ju.task;

import java.rmi.UnexpectedException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class Helper {

	private static AtomicBoolean atomicBoolean = new AtomicBoolean(true);

	private static final Object LOCK = new Object();
	private static final List<String> S = new ArrayList<String>();
	
	private static Object o = null;

	public static final String URL = "http://neco";

	static {
		S.add("text");
	}

	private static int i1;
	private static int i2;

	public static String getSum(final int i1, final int i2, List<String> list) {

		int result = i1 + i2;

		if (result > 100) {
			try {
				throw new ResultException(null);
			} catch (ResultException e) {
				
			}
		}
		list.add("text");

		return "jede";
	}

}
