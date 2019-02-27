package nl.tudelft.simulation.jstats.distributions.unit;

import org.djunits.unit.FlowVolumeUnit;
import org.djunits.value.vdouble.scalar.FlowVolume;

import nl.tudelft.simulation.jstats.distributions.DistContinuous;

/**
 * DistContinuousFlowVolume is class defining a distribution for a FlowVolume scalar. <br>
 * <br>
 * Copyright (c) 2003-2019 Delft University of Technology, Jaffalaan 5, 2628 BX Delft, the Netherlands. All rights reserved. See
 * for project information <a href="https://www.simulation.tudelft.nl/" target="_blank">www.simulation.tudelft.nl</a>. The
 * source code and binary code of this software is proprietary information of Delft University of Technology.
 * @author <a href="https://www.tudelft.nl/averbraeck" target="_blank">Alexander Verbraeck</a>
 */
public class DistContinuousFlowVolume extends DistContinuousUnit<FlowVolumeUnit, FlowVolume>
{
    /** */
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new continuous distribution that draws FlowVolume scalars.
     * @param wrappedDistribution DistContinuous; the wrapped continuous distribution
     * @param unit FlowVolumeUnit; the unit for the values of the distribution
     */
    public DistContinuousFlowVolume(final DistContinuous wrappedDistribution, final FlowVolumeUnit unit)
    {
        super(wrappedDistribution, unit);
    }

    /**
     * Constructs a new continuous distribution that draws FlowVolume scalars in SI units.
     * @param wrappedDistribution DistContinuous; the wrapped continuous distribution
     */
    public DistContinuousFlowVolume(final DistContinuous wrappedDistribution)
    {
        super(wrappedDistribution, FlowVolumeUnit.SI);
    }

    /** {@inheritDoc} */
    @Override
    public FlowVolume draw()
    {
        return new FlowVolume(this.wrappedDistribution.draw(), this.unit);
    }
}
