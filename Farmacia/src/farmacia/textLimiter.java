package farmacia;

import javax.swing.text.*;

public class textLimiter extends PlainDocument {

    private int maxCharacters;

    public textLimiter(int maxCharacters) {
        super();
        this.maxCharacters = maxCharacters;
    }

    @Override
    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
        
        if (str == null) {
            return;
        }
        
        if ((getLength() + str.length()) <= maxCharacters) {
            super.insertString(offs, str, a);
        }
    }
}
