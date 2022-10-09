package dte.masteriot.mdp.listofitems;

import android.annotation.SuppressLint;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.selection.ItemKeyProvider;

public class MyItemKeyProvider extends ItemKeyProvider<Long> {

    // From [https://developer.android.com/reference/androidx/recyclerview/selection/ItemKeyProvider]:
    // "Provides selection library access to stable selection keys identifying items presented
    // by a RecyclerView instance."

    // In this app, we decide that our keys will be of type Long.
    // More info: https://developer.android.com/guide/topics/ui/layout/recyclerview-custom#select

    private static final String TAG = "ListOfItems, MyItemKeyProvider";
    MyAdapter adapter;

    /**
     * Creates a new provider with the given scope.
     *
     * @param scope Scope can't be changed at runtime.
     */
    @SuppressLint("LongLogTag")
    protected MyItemKeyProvider(int scope, MyAdapter ad) {
        super(scope);
        adapter = ad;
        Log.d(TAG, "MyItemKeyProvider() called");
    }

    @SuppressLint("LongLogTag")
    @Nullable
    @Override
    public Long getKey(int position) {
        Log.d(TAG, "getKey() called for position " + position);
        return (adapter.getKeyAtPosition(position));
    }

    @SuppressLint("LongLogTag")
    @Override
    public int getPosition(@NonNull Long key) {
        Log.d(TAG, "getPosition() called for key " + key);
        return (adapter.getPositionOfKey(key));
    }
}
