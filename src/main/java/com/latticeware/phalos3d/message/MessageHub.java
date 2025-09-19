package com.latticeware.phalos3d.message;

import org.greenrobot.eventbus.EventBus;


/**
 *
 * @author sfisque
 */
public class MessageHub 
{
    private MessageHandler messageHandler = new MessageHandler();
    
    
    public void init()
    {
        EventBus.getDefault().register( messageHandler );
    }

}
