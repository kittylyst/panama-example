// Generated by jextract

package org.libspng;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$52 {

    static final FunctionDescriptor spng_get_srgb$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle spng_get_srgb$MH = RuntimeHelper.downcallHandle(
        spng_h.LIBRARIES, "spng_get_srgb",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$52.spng_get_srgb$FUNC, false
    );
    static final FunctionDescriptor spng_get_text$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle spng_get_text$MH = RuntimeHelper.downcallHandle(
        spng_h.LIBRARIES, "spng_get_text",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$52.spng_get_text$FUNC, false
    );
    static final FunctionDescriptor spng_get_bkgd$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle spng_get_bkgd$MH = RuntimeHelper.downcallHandle(
        spng_h.LIBRARIES, "spng_get_bkgd",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$52.spng_get_bkgd$FUNC, false
    );
    static final FunctionDescriptor spng_get_hist$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle spng_get_hist$MH = RuntimeHelper.downcallHandle(
        spng_h.LIBRARIES, "spng_get_hist",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$52.spng_get_hist$FUNC, false
    );
    static final FunctionDescriptor spng_get_phys$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle spng_get_phys$MH = RuntimeHelper.downcallHandle(
        spng_h.LIBRARIES, "spng_get_phys",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$52.spng_get_phys$FUNC, false
    );
    static final FunctionDescriptor spng_get_splt$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle spng_get_splt$MH = RuntimeHelper.downcallHandle(
        spng_h.LIBRARIES, "spng_get_splt",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$52.spng_get_splt$FUNC, false
    );
}


