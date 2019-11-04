package com.zipcodewilmington.phonebook;

import java.util.*;

import static java.util.Arrays.asList;

/**
 * Created by leon on 1/23/18.
 */
public class PhoneBook {
    private Map<String, List<String>> map;

    public PhoneBook(Map<String, List<String>> map) {
        this.map = new HashMap<>();
    }

    public PhoneBook() {
        this(null);
    }

    public void add(String name, String phoneNumber) {
        map.put(name, Arrays.asList(phoneNumber));
    }

    public void addAll(String name, String... phoneNumbers) {
        map.put(name, Arrays.asList(phoneNumbers));
    }

    public void remove(String name) {
        map.remove(name);
    }

    public Boolean hasEntry(String name) {
        return map.containsKey(name);
    }

    public List<String> lookup(String name) {
        return map.get(name);
    }

    public String reverseLookup(String phoneNumber)  {
        //String keyLookup = "";
        for(Map.Entry<String, List<String>> pair: map.entrySet()) {
            if(map.get(pair.getKey()).equals(phoneNumber))
                return pair.getKey();

        }
        return null;
    }

    public List<String> getAllContactNames() {
        ArrayList<String> keyList = new ArrayList<String>();
        for(Map.Entry<String, List<String>> pair: map.entrySet()) {
            keyList.add(pair.getKey());
        }
        //Collections.sort(map);
        return keyList;
    }

    public Map<String, List<String>> getMap() {
        return map;
    }
}
