/* This file was generated by SableCC (http://www.sablecc.org/). */

package srt.sableccCarpeta.node;

import srt.sableccCarpeta.analysis.*;

@SuppressWarnings("nls")
public final class TFlecha extends Token
{
    public TFlecha()
    {
        super.setText("-->");
    }

    public TFlecha(int line, int pos)
    {
        super.setText("-->");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TFlecha(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTFlecha(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TFlecha text.");
    }
}
