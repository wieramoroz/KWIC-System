package CS3213;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by junchao on 8/23/2014.
 */
public class InputParser {
    private List<String> _titles;

    public InputParser(){
        this._titles = new ArrayList<String>();
    }

    public void addTitle(String input){

        assert(input != null);
        input = input.toLowerCase();
        _titles.add(input);
    }

    public String[] getAllTitles(){
       return this._titles.toArray(new String[this._titles.size()]);
    }

    public void printTitles(){
        for(int i=0; i<_titles.size();i++){
            System.out.println(_titles.get(i));
        }
    }
}
