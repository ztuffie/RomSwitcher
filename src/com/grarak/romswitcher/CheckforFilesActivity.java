/*
 * Copyright (C) 2013 The RomSwitcher Project
 *
 * * Licensed under the GNU GPLv2 license
 *
 * The text of the license can be found in the LICENSE file
 * or at https://www.gnu.org/licenses/gpl-2.0.txt
 */

package com.grarak.romswitcher;

import static android.os.Environment.getExternalStorageDirectory;

import java.io.File;

import android.app.Activity;
import android.os.Bundle;

public class CheckforFilesActivity extends Activity {
	
	private static String sdcard = getExternalStorageDirectory().getPath();
	private static final File firstimg = new File(sdcard + "/romswitcher/first.img");
	private static final File secondtimg = new File(sdcard + "/romswitcher/second.img");
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		
	}
}