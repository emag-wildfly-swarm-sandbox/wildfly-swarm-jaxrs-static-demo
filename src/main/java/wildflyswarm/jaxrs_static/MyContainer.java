package wildflyswarm.jaxrs_static;

import org.wildfly.swarm.container.Container;

public class MyContainer {

  public static Container newContainer() throws Exception {
    Container container = new Container();
    return container;
  }
}
