package org.challenge.turtlesim;

import org.ros.namespace.GraphName;
import org.ros.node.AbstractNodeMain;
import org.ros.node.ConnectedNode;
import org.ros.node.topic.Publisher;

/**
 * Created by Fernando on 18/10/2016.
 */
public class TurtlesimStarClientNode  extends AbstractNodeMain
{
    private Publisher<std_msgs.String> _publisher;

    @Override
    public GraphName getDefaultNodeName()
    {
        return GraphName.of("TurlesimStarClient/CommanderNode");
    }

    @Override
    public void onStart(final ConnectedNode connectedNode)
    {
        _publisher = connectedNode.newPublisher(GraphName.of("commander"), std_msgs.String._TYPE);

    }

    public void StartDrawing()
    {
        if(_publisher != null)
        {
            std_msgs.String str = _publisher.newMessage();
            str.setData("Start");
            _publisher.publish(str);
        }
    }

    public void PauseDrawing()
    {
        if(_publisher != null)
        {
            std_msgs.String str = _publisher.newMessage();
            str.setData("Pause");
            _publisher.publish(str);
        }
    }
}
