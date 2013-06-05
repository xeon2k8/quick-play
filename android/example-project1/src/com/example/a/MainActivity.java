package com.example.a;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Fragment;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.view.Menu;
import android.view.MenuInflater;

public class MainActivity extends Activity {

	public static Context appContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        appContext = getApplicationContext();

       //ActionBar gets initiated
        ActionBar actionbar = getActionBar();
      //Tell the ActionBar we want to use Tabs.
        actionbar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
      //initiating both tabs and set text to it.
        ActionBar.Tab PlayerTab = actionbar.newTab().setText("Fragment A");
        ActionBar.Tab StationsTab = actionbar.newTab().setText("Fragment B");
        ActionBar.Tab tres = actionbar.newTab().setText("StreamingReal");
        ActionBar.Tab cuatro = actionbar.newTab().setText("WebView");
 
     //create the two fragments we want to use for display content
        Fragment PlayerFragment = new AFragment();
        Fragment StationsFragment = new BFragment();
        Fragment tresfrag = new CFragment();
        Fragment cuatrofrag = new DFragment();
 
    //set the Tab listener. Now we can listen for clicks.
        PlayerTab.setTabListener(new MyTabsListener(PlayerFragment));
        StationsTab.setTabListener(new MyTabsListener(StationsFragment));
        tres.setTabListener(new MyTabsListener(tresfrag));
        cuatro.setTabListener(new MyTabsListener(cuatrofrag));
        
 
   //add the two tabs to the actionbar
        actionbar.addTab(PlayerTab);
        actionbar.addTab(StationsTab);
        actionbar.addTab(tres);
        actionbar.addTab(cuatro);

//        NotificationCompat.Builder mBuilder =
//        	    new NotificationCompat.Builder(this)
//        	    .setSmallIcon(R.drawable.ic_launcher)
//        	    .setContentTitle("My notification")
//        	    .setContentText("Hello World!").setAutoCancel(true);
//        int mNotificationId = 001;
//        
//	     // Gets an instance of the NotificationManager service
//	     NotificationManager mNotifyMgr = 
//	             (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
//	     // Builds the notification and issues it.
//	     mNotifyMgr.notify(mNotificationId, mBuilder.build());
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return true;
    }
    
}
