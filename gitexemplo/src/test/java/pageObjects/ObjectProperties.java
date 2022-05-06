package pageObjects;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Map;

import org.yaml.snakeyaml.Yaml;

public class ObjectProperties {
	static Map<?,?> property;
	static String objectPath = "objectRepository/Repository.yml";
	public static void inicializeRepository() {
		try {
			Reader reader = new FileReader(objectPath);
			Yaml yml =  new Yaml();
			property = (Map<?,?>) yml.load(reader);
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static String getElementProperty(String objectString) {
		Map<?,?> map = (Map<?,?>) property.get(objectString.split("\\.")[0]);
		return map.get(objectString.split("\\.")[1]).toString();
	}
}
