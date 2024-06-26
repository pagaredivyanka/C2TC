// Class annotation

package com.tnsif.day20_annotations;


@SmartTV(os ="Android")
public class AndroidSeries {
	String model;
	int screenSize;
	
	public AndroidSeries(String model, int screenSize) {
		this.model = model;
		this.screenSize = screenSize;
		
	}

	@Override
	public String toString() {
		return "AndroidSeries [model=" + model + ", screenSize=" + screenSize + "]";
	}

}
