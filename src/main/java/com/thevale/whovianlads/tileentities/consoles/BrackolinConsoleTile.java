package com.thevale.whovianlads.tileentities.consoles;


import com.thevale.whovianlads.tileentities.ValeTiles;
import net.minecraft.entity.EntitySize;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.vector.Vector3d;
import net.tardis.mod.controls.*;
import net.tardis.mod.registries.ControlRegistry;
import net.tardis.mod.tileentities.ConsoleTile;
import net.tardis.mod.tileentities.console.misc.ControlOverride;


public class BrackolinConsoleTile extends ConsoleTile {

    public static final AxisAlignedBB RENDER_BOX = new AxisAlignedBB(-2, -1, -2, 2, 2.5, 2);

    @Override
    public AxisAlignedBB getRenderBoundingBox() {
        return RENDER_BOX.offset(this.getPos());
    }

    public BrackolinConsoleTile() {
        this(ValeTiles.console_brackolin.get());
    }

    public BrackolinConsoleTile(TileEntityType<?> type) {
        super(type);
       this.registerControlEntry(ControlRegistry.MONITOR.get());
      //Done
       this.controlOverrides.put(FacingControl.class, new ControlOverride(new Vector3d(-0.45, 0.6, 0.125),EntitySize.flexible(0.15F, 0.15F)));
       //Done
       this.controlOverrides.put(StabilizerControl.class, new ControlOverride(new Vector3d(-0.4, 0.6, 0.35),EntitySize.flexible(0.15F, 0.15F)));
       //Done
       this.controlOverrides.put(TelepathicControl.class, new ControlOverride(new Vector3d(0.35, 0.6, -0.225),EntitySize.flexible(0.2F, 0.15F)));
        //Done
       this.controlOverrides.put(CommunicatorControl.class, new ControlOverride(new Vector3d(-0.5, 0.475, -0.4),EntitySize.flexible(0.1875F, 0.1875F)));
        //Done
       this.controlOverrides.put(RefuelerControl.class, new ControlOverride(new Vector3d(0.18, 0.5, -0.7),EntitySize.flexible(0.175F, 0.075F)));
        //Done
       this.controlOverrides.put(RandomiserControl.class, new ControlOverride(new Vector3d(-0.65, 0.5, 0.125),EntitySize.flexible(0.15F, 0.15F)));
        //Done
       this.controlOverrides.put(HandbrakeControl.class, new ControlOverride(new Vector3d(-0.165, 0.5, 0.575),EntitySize.flexible(0.15F, 0.15F)));
        //Done
       this.controlOverrides.put(DoorControl.class, new ControlOverride(new Vector3d(-0.6, 0.475, -0.125),EntitySize.flexible(0.1875F, 0.1875F)));
       //Done
       this.controlOverrides.put(IncModControl.class, new ControlOverride(new Vector3d(-0.24, 0.5, -0.7),EntitySize.flexible(0.075F, 0.075F)));
        //Done
       this.controlOverrides.put(DimensionControl.class, new ControlOverride(new Vector3d(-0, 0.55, -0.45),EntitySize.flexible(0.3F, 0.2F)));
        //Done
       this.controlOverrides.put(LandingTypeControl.class, new ControlOverride(new Vector3d(-0.45, 0.5, 0.5),EntitySize.flexible(0.15F, 0.15F)));

       this.controlOverrides.put(SonicPortControl.class, new ControlOverride(new Vector3d(-0.4, 0.6, -0.1),EntitySize.flexible(0.15F, 0.15F)));
       //Done
       this.controlOverrides.put(XControl.class, new ControlOverride(new Vector3d(0.02, 0.5, -0.7),EntitySize.flexible(0.075F, 0.075F)));
       //Done
       this.controlOverrides.put(YControl.class, new ControlOverride(new Vector3d(-0.065, 0.5, -0.7),EntitySize.flexible(0.075F, 0.075F)));
       //Done
       this.controlOverrides.put(ZControl.class, new ControlOverride(new Vector3d(-0.15, 0.5, -0.7),EntitySize.flexible(0.075F, 0.075F)));

       this.controlOverrides.put(ThrottleControl.class, new ControlOverride(new Vector3d(0.165, 0.5, 0.575),EntitySize.flexible(0.2F, 0.15F)));
       //Done
        this.controlOverrides.put(FastReturnControl.class, new ControlOverride(new Vector3d(0.575, 0.475, -0.325),EntitySize.flexible(0.15F, 0.15F)));

       this.controlOverrides.put(MonitorControl.class, new ControlOverride(new Vector3d(0.4,0.3,0.2),EntitySize.flexible(0.3125F, 0.3125F)));
    }


}