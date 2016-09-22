package kr.co.logeo.slidemenua01;

import org.mospi.moml.framework.pub.core.MOMLActivity;

import android.os.Bundle;

public class SlideMenuA01Activity extends MOMLActivity {
    
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        this.loadApplication("moml/applicationInfo.xml");
    }
    
    protected void onDestroy() {
    	super.onDestroy();
    	System.exit(0);
    }
    
}
