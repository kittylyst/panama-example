// Generated by jextract

package org.libspng;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$54 {

    static final FunctionDescriptor spng_set_trns$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle spng_set_trns$MH = RuntimeHelper.downcallHandle(
        spng_h.LIBRARIES, "spng_set_trns",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$54.spng_set_trns$FUNC, false
    );
    static final FunctionDescriptor spng_set_chrm$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle spng_set_chrm$MH = RuntimeHelper.downcallHandle(
        spng_h.LIBRARIES, "spng_set_chrm",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$54.spng_set_chrm$FUNC, false
    );
    static final FunctionDescriptor spng_set_chrm_int$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle spng_set_chrm_int$MH = RuntimeHelper.downcallHandle(
        spng_h.LIBRARIES, "spng_set_chrm_int",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$54.spng_set_chrm_int$FUNC, false
    );
    static final FunctionDescriptor spng_set_gama$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_DOUBLE
    );
    static final MethodHandle spng_set_gama$MH = RuntimeHelper.downcallHandle(
        spng_h.LIBRARIES, "spng_set_gama",
        "(Ljdk/incubator/foreign/MemoryAddress;D)I",
        constants$54.spng_set_gama$FUNC, false
    );
    static final FunctionDescriptor spng_set_gama_int$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT
    );
    static final MethodHandle spng_set_gama_int$MH = RuntimeHelper.downcallHandle(
        spng_h.LIBRARIES, "spng_set_gama_int",
        "(Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$54.spng_set_gama_int$FUNC, false
    );
    static final FunctionDescriptor spng_set_iccp$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle spng_set_iccp$MH = RuntimeHelper.downcallHandle(
        spng_h.LIBRARIES, "spng_set_iccp",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$54.spng_set_iccp$FUNC, false
    );
}


