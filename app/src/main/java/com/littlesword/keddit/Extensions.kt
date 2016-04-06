@file:JvmName("ExtensionsUtils")
package com.littlesword.keddit

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by kongw1 on 6/04/16.
 */
fun ViewGroup.inflate(layoutid : Int, attachToRoot: Boolean = false): View {
    return LayoutInflater.from(context).inflate(layoutid, this, attachToRoot);
}
