package edu.shell.freegee.view;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;

public final class Notices {

	  /**
     * Generic class to open an alertDialog with given title, message and button.
     * @param title Title for alertDialog
     * @param text Message
     * @param Button Text for button
     * @param exits 0 does not exit application, 1 forces exit
     */
    public static void alertbuilder(String title, String text, String Button, final int exits, final Activity activity){
    	final String ftitle = title;
    	final String ftext = text;
    	final String fButton = Button;
    	activity.runOnUiThread(new Runnable() {
    		  public void run() {
			    	AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(activity);
			    	    
			    	// set title
			    	alertDialogBuilder.setTitle(ftitle);
			
			    	// set dialog message
			    	alertDialogBuilder
			    	.setMessage(ftext)
			    	.setCancelable(false)
			    	.setPositiveButton(fButton,new DialogInterface.OnClickListener() {
			    	public void onClick(DialogInterface dialog,int id) {
			    	// if this button is clicked, close
			    	// current activity
			    		if(exits==1){
			    			activity.finish();
			    			}
			    	}
			    	});
			
			    	// create alert dialog
			    	AlertDialog alertDialog = alertDialogBuilder.create();
			
			    	// show it
			    	alertDialog.show();
			
			    	}
    	});
    }
}
