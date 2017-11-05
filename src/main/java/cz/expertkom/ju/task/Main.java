package cz.expertkom.ju.task;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class Main {

	private static final Map<Long, String> map = new HashMap<Long, String>();

	public static void main(String[] args) {

		{
			Calendar c = Calendar.getInstance();
			c.clear();
			c.set(1950, 0, 12, 0, 0, 0);

			String desc = "Jan Novak";
			map.put(c.getTimeInMillis(), desc);

			c = Calendar.getInstance();
			c.clear();
			c.set(1951, 0, 12, 0, 0, 0);

			desc = "Jana Novakova";
			map.put(c.getTimeInMillis(), desc);

			for (java.util.Map.Entry<Long, String> e : map.entrySet()) {
				System.out.println(e.getKey());
				System.out.println(e.getValue());
			}
		}
		{
			String user = getUser(1951, 1, 12);
			System.out.println("user:" + user);

		}

	}

	private static String getUser(int y, int m, int d) {
		Calendar c = Calendar.getInstance();
		c.clear();
		c.set(y, m - 1, d, 0, 0, 0);
		String user = map.get(c.getTimeInMillis());
		return user;
	}

}
