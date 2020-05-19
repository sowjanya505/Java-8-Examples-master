package com.dates.examples;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class DisplayAllTimeZoneSortedByTimeZoneNameInJava8 {

	public static void main(String[] args) {

		
		TreeMap<String, String> allTimeZoneSortedByZoneMap = new TreeMap<>();
		
		
		Set<String> differentTimeZonesIds = ZoneId.getAvailableZoneIds();
		
		for(String timeZoneId: differentTimeZonesIds) {
			
			ZonedDateTime zonedDateTime = LocalDateTime.now().atZone(ZoneId.of(timeZoneId));
			
			
			ZoneOffset zoneOffSet = zonedDateTime.getOffset();
			
			
			allTimeZoneSortedByZoneMap.put(ZoneId.of(timeZoneId).toString(), zoneOffSet.toString());
		}
		
		System.out.println("Display all TimeZone name (timeZone name or timeZone area) In Java");
		
		Iterator<Entry<String, String>> entryIterator = allTimeZoneSortedByZoneMap.entrySet().iterator();
		
		while(entryIterator.hasNext()) {
			System.out.println(entryIterator.next());
		}
	}

}
