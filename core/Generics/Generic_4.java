class Generic<K, V>
{
	K Key;
	V value;
	public K getKey() {
		return Key;
	}
	public void setKey(K key) {
		this.Key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	
}
public class Generic_4 {
	public static void main(String[] args)
	{
		Generic<String, String> ob1=new Generic<>();
		ob1.setKey("1");
		ob1.setValue("Hello");
		Generic<String, java.util.Date> ob2=new Generic<>();
		ob2.setKey("Today is");
		ob2.setValue(new java.util.Date());
		System.out.println(ob1.getKey()+" "+ob1.getValue());
		System.out.println(ob2.getKey()+" "+ob2.getValue());
	}

}