package flood;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author Mercury
 */
public class SelectorCell extends BoardCell
{
    private final ISelectorCellEventListener selectorCellEventListener;
    
    public SelectorCell(ISelectorCellEventListener parent)
    {
        selectorCellEventListener = parent;
        
        addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                buttonClicked(e);
            }
        });
    }
    
    private void buttonClicked(MouseEvent e)
    {
        selectorCellEventListener.SelectorCellClicked(this);
    }
}
