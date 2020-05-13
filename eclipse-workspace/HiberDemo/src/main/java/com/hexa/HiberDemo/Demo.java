package com.hexa.HiberDemo;

public class Demo {
	
	private int id;
    private String name;
    private String sp;
    
    public Demo() {}
  
	public Demo(int id, String name, String sp) {
		super();
		this.id = id;
		this.name = name;
		this.sp = sp;
	}
	  @Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + id;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			result = prime * result + ((sp == null) ? 0 : sp.hashCode());
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Demo other = (Demo) obj;
			if (id != other.id)
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			if (sp == null) {
				if (other.sp != null)
					return false;
			} else if (!sp.equals(other.sp))
				return false;
			return true;
		}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSp() {
		return sp;
	}
	public void setSp(String sp) {
		this.sp = sp;
	}
	
}
