package com.thevale.whovianlads.util;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.tardis.mod.client.models.interiordoors.IInteriorDoorRenderer;
import net.tardis.mod.enums.EnumDoorState;
import net.tardis.mod.misc.IDoorType;

import java.util.function.Function;
import java.util.function.Supplier;

public enum EnumDoorTypes implements IDoorType {

    WARDROBE(state -> {
            switch(state) {
            case CLOSED: return 0.0D;
                case ONE: return -100.0;
                case BOTH : return 100.0;
                default:return 0.0;
            }
        }, EnumDoorState.CLOSED, EnumDoorState.ONE, EnumDoorState.BOTH),
    STREETSIDE(state -> {
            switch(state) {
            case CLOSED: return 0.0D;
                case ONE: return 90.0D;
                case BOTH : return -90.0D;
                default:return 0.0;
            }
        }, EnumDoorState.CLOSED, EnumDoorState.ONE, EnumDoorState.BOTH),
    BRACKOLIN (state -> {
        switch(state) {
            case CLOSED: return 0.0D;
            case ONE: return 90.0D;
            case BOTH : return -90.0D;
            default:return 0.0;
        }
    }, EnumDoorState.CLOSED, EnumDoorState.ONE, EnumDoorState.BOTH),
    RANI (state -> {
        switch(state) {
            case CLOSED: return 0.0D;
            case ONE: return -80.0D;
            default:return 0.0;
        }
    }, EnumDoorState.CLOSED, EnumDoorState.ONE);




        Function<EnumDoorState, Double> func;
        EnumDoorState[] validStates;
        Supplier<Supplier<IInteriorDoorRenderer>> renderer;

        EnumDoorTypes(Function<EnumDoorState, Double> func, EnumDoorState... states){
            this.validStates = states;
            this.func = func;
        }

        @Override
        public EnumDoorState[] getValidStates() {
            return this.validStates;
        }

        @Override
        public double getRotationForState(EnumDoorState state) {
            return func.apply(state);
        }

        @OnlyIn(Dist.CLIENT)
        public void setInteriorDoorModel(IInteriorDoorRenderer renderer) {
            this.renderer = () -> () -> renderer;
        }

        @OnlyIn(Dist.CLIENT)
        public IInteriorDoorRenderer getInteriorDoorRenderer() {
            return this.renderer.get().get();
        }

    }

