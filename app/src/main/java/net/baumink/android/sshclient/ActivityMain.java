/*
 * Copyright (c) 2017 Benjamin Raison
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package net.baumink.android.sshclient;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;


public class ActivityMain extends AppCompatActivity {

    private static final String TAG = ActivityMain.class.getSimpleName();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();
        for (String s : intent.getExtras().keySet()) {
            Log.d(TAG, s);
        }
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(
                    getString(R.string.format_user, intent.getStringExtra("username"), intent.getStringExtra("server")));
        } else {
            Log.w(TAG, "SupportActionBar is null!");
        }
    }
}
