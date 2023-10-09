package com.tns.inheritance;

public class Bullet {

	private String modelName;
	// set getters and setters
		public String getModelName() {
			return modelName;
		}

		public void setModelName(String modelName) {
			this.modelName = modelName;
		}
	// to string function
		
		@Override
		public String toString() {
			return "Bullet [modelName=" + modelName + "]";
		}
		
		
}
