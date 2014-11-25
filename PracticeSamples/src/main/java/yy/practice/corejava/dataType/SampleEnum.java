package yy.practice.corejava.dataType;

public enum SampleEnum {
	
	SAMPLE1("value1"),
	SAMPLE2("value2"),
	SAMPLE3("value3");
	
	SampleEnum(String typeCode) {
		this.setValue(typeCode);
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	private String value;
	
	
	public static SampleEnum getEnumByValue(String value){
		
		for(SampleEnum s: values()){
			if(value.equals(s.getValue())){
				return s;
			}
		}
		return null;
	}
}
