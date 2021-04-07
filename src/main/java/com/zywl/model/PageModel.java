package com.zywl.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageModel {

    private int pageSize = 5;

    private int pageNow = 0;

    private int pageNumber = 1;

    private int dataCount;

    public void noPage(){
        this.pageNow = 0;
        this.pageSize = Integer.MAX_VALUE;
    }

}
