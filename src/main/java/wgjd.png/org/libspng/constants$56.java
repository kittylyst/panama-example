// Generated by jextract

package org.libspng;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$56 {

    static final FunctionDescriptor spng_set_splt$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_INT
    );
    static final MethodHandle spng_set_splt$MH = RuntimeHelper.downcallHandle(
        spng_h.LIBRARIES, "spng_set_splt",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$56.spng_set_splt$FUNC, false
    );
    static final FunctionDescriptor spng_set_time$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle spng_set_time$MH = RuntimeHelper.downcallHandle(
        spng_h.LIBRARIES, "spng_set_time",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$56.spng_set_time$FUNC, false
    );
    static final FunctionDescriptor spng_set_unknown_chunks$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_INT
    );
    static final MethodHandle spng_set_unknown_chunks$MH = RuntimeHelper.downcallHandle(
        spng_h.LIBRARIES, "spng_set_unknown_chunks",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$56.spng_set_unknown_chunks$FUNC, false
    );
    static final FunctionDescriptor spng_set_offs$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle spng_set_offs$MH = RuntimeHelper.downcallHandle(
        spng_h.LIBRARIES, "spng_set_offs",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$56.spng_set_offs$FUNC, false
    );
    static final FunctionDescriptor spng_set_exif$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle spng_set_exif$MH = RuntimeHelper.downcallHandle(
        spng_h.LIBRARIES, "spng_set_exif",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$56.spng_set_exif$FUNC, false
    );
    static final FunctionDescriptor spng_strerror$FUNC = FunctionDescriptor.of(C_POINTER,
        C_INT
    );
    static final MethodHandle spng_strerror$MH = RuntimeHelper.downcallHandle(
        spng_h.LIBRARIES, "spng_strerror",
        "(I)Ljdk/incubator/foreign/MemoryAddress;",
        constants$56.spng_strerror$FUNC, false
    );
}


