package br.com.studiosecret.demogrid.helpers;

import java.util.Collection;

/**
 *
 * @author paulo
 */
public class JQgrid<T> {

    private int page;
    
    private int total;
    
    private int records;
    
    private Collection<T> rows;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getRecords() {
        return records;
    }

    public void setRecords(int records) {
        this.records = records;
    }

    public Collection<T> getRows() {
        return rows;
    }

    public void setRows(Collection<T> rows) {
        this.rows = rows;
    }
}
