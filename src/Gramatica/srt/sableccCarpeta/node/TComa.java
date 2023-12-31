/* This file was generated by SableCC (http://www.sablecc.org/). */

package srt.sableccCarpeta.node;

import srt.sableccCarpeta.analysis.*;

@SuppressWarnings("nls")
public final class TComa extends Token
{
    public TComa()
    {
        super.setText(",");
    }

    public TComa(int line, int pos)
    {
        super.setText(",");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TComa(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTComa(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TComa text.");
    }
}
