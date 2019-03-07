package combatSysModel.DEM.atomicModel;

import combatSysModel.DEM.AtomicModelBase;
import combatSysModel.OM.OM_Environment;
import nl.tudelft.simulation.dsol.formalisms.devs.ESDEVS.CoupledModel;
import nl.tudelft.simulation.dsol.simulators.DEVSSimulator;

public class Environment extends AtomicModelBase<OM_Environment>{

    @Override
    protected void constructPort() {

    }

    @Override
    protected void constructPhase() {

    }

    @Override
    protected void constructModelData() {

    }

    @Override
    protected void deltaExternalFunc(Object value) {

    }

    @Override
    protected void deltaInternalFunc() {

    }

    @Override
    protected void lambdaFunc() {

    }

    public Environment(String modelName, CoupledModel.TimeDouble parentModel) {
        super(modelName, parentModel);
    }

    public Environment(String modelName, DEVSSimulator.TimeDouble simulator) {
        super(modelName, simulator);
    }
}