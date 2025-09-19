package com.latticeware.phalos3d.message;


import java.util.logging.Level;
import java.util.logging.Logger;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;


/**
 *
 * @author sfisque
 */

public class MessageHandler
{
    private static final Logger LOG = Logger.getLogger( MessageHandler.class.getName() );
    
    
    @Subscribe( threadMode = ThreadMode.ASYNC )
    public void onMessage( String _event )
    {
LOG.log( Level.INFO, "onMessage :: {0}", _event );
    }
}
