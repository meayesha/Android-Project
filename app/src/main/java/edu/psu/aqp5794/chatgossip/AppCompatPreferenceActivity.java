//package edu.psu.aqp5794.chatgossip;
//
//import android.content.res.Configuration;
//import android.os.Bundle;
//
//import android.view.MenuInflater;
//import android.view.View;
//import android.view.ViewGroup;
//
//import androidx.annotation.LayoutRes;
//import androidx.annotation.Nullable;
//import androidx.appcompat.app.ActionBar;
//import androidx.appcompat.app.AppCompatDelegate;
//import androidx.appcompat.widget.Toolbar;
//import androidx.preference.PreferenceFragmentCompat;
//
//public abstract class AppCompatPreferenceActivity extends PreferenceFragmentCompat {
//    private AppCompatDelegate mDelegate;
//
//  //  @Override
////    protected void onCreate(Bundle savedInstanceState) {
////        getDelegate().installViewFactory();
////        getDelegate().onCreate(savedInstanceState);
////        super.onCreate(savedInstanceState);
////    }
////
////    @Override
////    protected void onPostCreate(Bundle savedInstanceState) {
////        super.onPostCreate(savedInstanceState);
////        getDelegate().onPostCreate(savedInstanceState);
////    }
//
//    public ActionBar getSupportActionBar() {
//        return getDelegate().getSupportActionBar();
//    }
//
//    public void setSupportActionBar(@Nullable Toolbar toolbar) {
//        getDelegate().setSupportActionBar(toolbar);
//    }
//
////    @Override
////    public MenuInflater getMenuInflater() {
////        return getDelegate().getMenuInflater();
////    }
//
////    @Override
////    public void setContentView(@LayoutRes int layoutResID) {
////        getDelegate().setContentView(layoutResID);
////    }
////
////    @Override
////    public void setContentView(View view) {
////        getDelegate().setContentView(view);
////    }
////
////    @Override
////    public void setContentView(View view, ViewGroup.LayoutParams params) {
////        getDelegate().setContentView(view, params);
////    }
//
////    @Override
////    public void addContentView(View view, ViewGroup.LayoutParams params) {
////        getDelegate().addContentView(view, params);
////    }
//
////    @Override
////    protected void onPostResume() {
////        super.onPostResume();
////        getDelegate().onPostResume();
////    }
//
//
////    protected void onTitleChanged(CharSequence title, int color) {
////        super.onTitleChanged(title, color);
////        getDelegate().setTitle(title);
////    }
//
//    @Override
//    public void onConfigurationChanged(Configuration newConfig) {
//        super.onConfigurationChanged(newConfig);
//        getDelegate().onConfigurationChanged(newConfig);
//    }
//
////    @Override
////    protected void onStop() {
////        super.onStop();
////        getDelegate().onStop();
////    }
//
////    @Override
////    protected void onDestroy() {
////        super.onDestroy();
////        getDelegate().onDestroy();
////    }
//
//    public void invalidateOptionsMenu() {
//        getDelegate().invalidateOptionsMenu();
//    }
//
////    private AppCompatDelegate getDelegate() {
////        if (mDelegate == null) {
////            mDelegate = AppCompatDelegate.create(this,null);
////        }
////        return mDelegate;
////    }
//}
//
//}
