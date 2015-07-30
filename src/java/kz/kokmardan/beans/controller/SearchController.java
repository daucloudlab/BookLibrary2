package kz.kokmardan.beans.controller;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.ResourceBundle;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import kz.kokmrdan.enums.SearchType;

@ManagedBean
@SessionScoped
public class SearchController implements Serializable{
    
    private SearchType searchType ;
    private static Map<String, SearchType> searchList = new LinkedHashMap<String, SearchType>() ;
    
    public SearchController(){
        ResourceBundle bundle = ResourceBundle.getBundle("kz.kokmardan.library.nls.messages",
                FacesContext.getCurrentInstance().getViewRoot().getLocale()) ;
        
        searchList.put(bundle.getString("author_name"), searchType.AUTHOR) ;
        searchList.put(bundle.getString("book_name"), searchType.TITLE) ;
    }
    
    public SearchType getSearchType() {
        return searchType;
    }

    public Map<String, SearchType> getSearchList() {
        return searchList;
    }
    
}
