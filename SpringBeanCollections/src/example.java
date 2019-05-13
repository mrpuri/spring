
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;


public class example {
public List list;
public Map map;
public Properties prop;
public Set set;

public List getList() {
	System.out.print(list);
	return list;
}
public void setList(List list) {
	this.list = list;
}
public Map getMap() {
	System.out.println(map);
	return map;
}
public void setMap(Map map) {
	this.map = map;
}
public Properties getProp() {
	System.out.println(prop);
	return prop;
}
public void setProp(Properties prop) {
	this.prop = prop;
}
public Set getSet() {
	System.out.println(set);
	return set;
}
public void setSet(Set set) {
	this.set = set;
}

}
