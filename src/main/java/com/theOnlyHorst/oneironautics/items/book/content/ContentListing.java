package com.theOnlyHorst.oneironautics.items.book.content;

import com.google.common.collect.Lists;
import com.theOnlyHorst.oneironautics.items.book.DreamDiaryPage;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class ContentListing extends DreamDiaryPage {

    public String title;
    private final List<TextData> entries = Lists.newArrayList();

    public void addEntry(String text, PageData link) {
        TextData data = new TextData(text);
        if (link != null) {
            data.action = ProtocolGoToPage.GO_TO_RTN + ":" + link.parent.name + "." + link.name;
        }
        this.entries.add(data);
    }

    public boolean hasEntries() {
        return this.entries.size() > 0;
    }

    @Override
    public void build(BookData book, ArrayList<BookElement> list, boolean rightSide) {
        int yOff = 0;
        if (this.title != null) {
            this.addTitle(list, this.title, false);
            yOff = 20;
        }

        int y = yOff;
        int x = 0;
        int w = BookScreen.PAGE_WIDTH;
        int line_height = 9;

        int bot = BookScreen.PAGE_HEIGHT - 30;

        if (this.entries.size() * line_height + yOff > bot) {
            w /= 2;
        }

        for (TextData data : this.entries) {
            list.add(this.createListingElement(y, x, w, line_height, data));
            y += line_height;

            if (y > bot) {
                x += w;
                y = yOff;
            }
        }
    }

    private ListingLeftElement createListingElement(int y, int x, int w, int line_height, TextData data) {
        return new ListingLeftElement(x, y, w, line_height, data);
    }
}
