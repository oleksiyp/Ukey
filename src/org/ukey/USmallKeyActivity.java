package org.ukey;

import android.app.Activity;
import android.os.Bundle;
import android.text.ClipboardManager;

public class USmallKeyActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
        clipboard.setText("ю");
        finish();
    }
}
