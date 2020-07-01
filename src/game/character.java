package game;

import java.util.ArrayList;

public class character {

	private String _name;
	private int _level;
	private ArrayList<skill> _skills;
	private ArrayList<item> _items;
	private long _guid;

	public character(String name, long guid) {
		_name = name;
		_level = 1;
		_skills = new ArrayList<skill>();
		_items = new ArrayList<item>();
		_guid = guid;
	}

	public boolean removeitem(long guid) {
		return true;
	}
	
}
