package com.example.aum.busroute;

import android.support.annotation.NonNull;
import android.widget.Filter;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by aum on 9/17/2016.
 */
public class CustomFilter extends Filter{
     List<ItemObject> itemList2;

    RecyclerViewAdapter  rcAdapter;
    public CustomFilter(List<ItemObject> itemList,RecyclerViewAdapter rcAdapter)
    {
         this.rcAdapter=rcAdapter;
         this.itemList2=itemList;
    }

    @Override
    protected FilterResults performFiltering(CharSequence constraint) {
        FilterResults results=new FilterResults();
        if (constraint != null && constraint.length()>0){
            constraint=constraint.toString().toUpperCase();
            List<ItemObject> itemObjects=new List<ItemObject>() {
                @Override
                public void add(int location, ItemObject object) {

                }

                @Override
                public boolean add(ItemObject object) {
                    return false;
                }

                @Override
                public boolean addAll(int location, Collection<? extends ItemObject> collection) {
                    return false;
                }

                @Override
                public boolean addAll(Collection<? extends ItemObject> collection) {
                    return false;
                }

                @Override
                public void clear() {

                }

                @Override
                public boolean contains(Object object) {
                    return false;
                }

                @Override
                public boolean containsAll(Collection<?> collection) {
                    return false;
                }

                @Override
                public ItemObject get(int location) {
                    return null;
                }

                @Override
                public int indexOf(Object object) {
                    return 0;
                }

                @Override
                public boolean isEmpty() {
                    return false;
                }

                @NonNull
                @Override
                public Iterator<ItemObject> iterator() {
                    return null;
                }

                @Override
                public int lastIndexOf(Object object) {
                    return 0;
                }

                @Override
                public ListIterator<ItemObject> listIterator() {
                    return null;
                }

                @NonNull
                @Override
                public ListIterator<ItemObject> listIterator(int location) {
                    return null;
                }

                @Override
                public ItemObject remove(int location) {
                    return null;
                }

                @Override
                public boolean remove(Object object) {
                    return false;
                }

                @Override
                public boolean removeAll(Collection<?> collection) {
                    return false;
                }

                @Override
                public boolean retainAll(Collection<?> collection) {
                    return false;
                }

                @Override
                public ItemObject set(int location, ItemObject object) {
                    return null;
                }

                @Override
                public int size() {
                    return 0;
                }

                @NonNull
                @Override
                public List<ItemObject> subList(int start, int end) {
                    return null;
                }

                @NonNull
                @Override
                public Object[] toArray() {
                    return new Object[0];
                }

                @NonNull
                @Override
                public <T> T[] toArray(T[] array) {
                    return null;
                }
            };
            for (int i=0;i<itemList2.size();i++)
            {
                if (itemList2.get(i).getName().toUpperCase().contains(constraint))
                {
                    itemObjects.add(itemList2.get(i));
                }
            }
            results.count=itemObjects.size();
            results.values=itemObjects;
        }
        else {
            results.count=itemList2.size();
            results.values=itemList2;
        }


        return results;
    }

    @Override
    protected void publishResults(CharSequence constraint, FilterResults results) {
      rcAdapter.itemList= (List<ItemObject>) results.values ;
        rcAdapter.notifyDataSetChanged();
    }
}
