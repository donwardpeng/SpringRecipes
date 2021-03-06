package com.Chapter3.E3_4;

public class SequenceGenerator {

	private PrefixGenerator prefix;
	private String suffix;
	private int initial;
	private int counter;
	
	public SequenceGenerator(){}
	
	public SequenceGenerator(PrefixGenerator prefix, String suffix, int initial){
		this.suffix = suffix;
		this.prefix = prefix;
		this.initial = initial;
	}

	public void setPrefix( PrefixGenerator  prefix) {
		this.prefix = prefix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	public void setInitial(int initial) {
		this.initial = initial;
	}
	
	public synchronized String getSequence(){
		StringBuffer buffer = new StringBuffer();
		buffer.append(prefix.getPrefix());
		buffer.append(initial + counter++);
		buffer.append(suffix);
		return buffer.toString();
		
	}
	
}
