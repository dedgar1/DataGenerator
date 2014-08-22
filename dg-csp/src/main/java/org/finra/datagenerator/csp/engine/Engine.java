package org.finra.datagenerator.csp.engine;

import org.finra.datagenerator.distributor.SearchDistributor;
import java.io.InputStream;

/**
 * Created with IntelliJ IDEA.
 * User: k24364 Marshall Peters
 * Date: 8/21/14
 */
public interface Engine {
    void process(SearchDistributor distributor);
    void setModelByInputFileStream(InputStream inputFileStream);
    void setModelByText(String model);

    Engine setBootstrapMin(int min);
}
