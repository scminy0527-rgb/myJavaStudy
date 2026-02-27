package hashMap.task;

import java.util.HashMap;

@FunctionalInterface
public interface PrintMap {
	public void printMap(HashMap<String, String> data, String findText);
}
