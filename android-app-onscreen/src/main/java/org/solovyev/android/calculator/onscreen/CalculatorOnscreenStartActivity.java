/*
 * Copyright 2013 serso aka se.solovyev
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Contact details
 *
 * Email: se.solovyev@gmail.com
 * Site:  http://se.solovyev.org
 */

package org.solovyev.android.calculator.onscreen;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;

import javax.annotation.Nonnull;

import org.solovyev.android.Android;
import org.solovyev.android.App;
import org.solovyev.android.calculator.AbstractFixableError;
import org.solovyev.android.calculator.CalculatorPreferences;
import org.solovyev.android.calculator.FixableMessage;
import org.solovyev.android.calculator.FixableMessagesDialog;
import org.solovyev.common.msg.MessageType;

import java.util.Arrays;

public class CalculatorOnscreenStartActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		CalculatorOnscreenService.showOnscreenView(this);

		this.finish();
	}
}
