package com.crazysunj.multityperecyclerviewadapter.header;

import com.crazysunj.multityperecyclerviewadapter.helper.SimpleHelper;
import com.crazysunj.multityperecyclerviewadapter.sticky.ThirdStickyItem;

/**
 * Created by sunjian on 2017/3/28.
 */

public class HeaderThirdItem implements ThirdStickyItem {

    private String name;
    private long id;
    private String stickyName = "第三条粘性";


    public HeaderThirdItem(String name, long id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public long getHeaderId() {
        return 3;
    }

    @Override
    public int getItemType() {
        return SimpleHelper.TYPE_FOUR - 1000;
    }

    @Override
    public String getStickyName() {
        return stickyName;
    }
}
