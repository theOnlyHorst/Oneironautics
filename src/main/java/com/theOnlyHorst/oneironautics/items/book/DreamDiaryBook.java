package com.theOnlyHorst.oneironautics.items.book;

public class DreamDiaryBook {
    public final static BookData INSTANCE = BookLoader.registerBook(Util.RESOURCE, false, false);

    public static void initBook() {
        BookLoader.registerPageType(ContentImageText2.ID, ContentImageText2.class);
        // TODO: conditional file repository, read from config
        INSTANCE.addRepository(new FileRepository(Util.resource("book")));
        INSTANCE.addTransformer(BookTransformer.indexTranformer());
    }
}
