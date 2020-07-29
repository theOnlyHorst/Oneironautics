package com.theOnlyHorst.oneironautics.items.book.content;

import com.google.common.collect.Lists;
import com.theOnlyHorst.oneironautics.items.book.DreamDiaryPage;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class ContentListingCentered extends DreamDiaryPage {

    private String title;
    private final List<TextData> entries = Lists.newArrayList();

    public void addEntry(String text, PageData link) {
        TextData data = new TextData(text);
        if (link != null) {
            data.action = ProtocolGoToPage.GO_TO_RTN + ":" + link.parent.name + "." + link.name;
        }
        this.entries.add(data);
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

        for (TextData data : this.entries) {
            int ex = x + w / 2 - book.fontRenderer.getStringWidth(data.text) / 2;

            list.add(new ListingCenteredElement(ex, y, w, 9, data));
            y += 9;
        }
    }
}
