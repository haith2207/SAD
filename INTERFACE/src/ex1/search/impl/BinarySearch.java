package ex1.search.impl;

import ex1.search.SearchIF;

import java.util.ArrayList;

/**
 * Created by haith on 28/06/2016.
 */
public class BinarySearch implements SearchIF {
    private int[] _array;
    private int _searchValue;

    public BinarySearch(int[] array, int searchValue) {
        _array = array;
        _searchValue = searchValue;
    }

    private int doSearch() {
        int start = 0;
        int end = _array.length - 1;
        int mid;

        if (end >= start) {
            for (int i : _array) {
                mid = (end + start) / 2;

                if (_array[mid] == _searchValue) {
                     return mid;
                } else if (_array[mid] < _searchValue) {
                    end = mid + 1;
                } else {
                    start = mid - 1;
                }
            }
        }
        return -1;
    }

    public String display() {
        int index = doSearch();
        String result = index == -1 ? "Not found input value!" : "Found value input at index: " + index;
        return result;
    }
}
