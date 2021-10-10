// Generated by jextract

package org.libspng;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$8 {

    static final FunctionDescriptor mblen$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle mblen$MH = RuntimeHelper.downcallHandle(
        spng_h.LIBRARIES, "mblen",
        "(Ljdk/incubator/foreign/MemoryAddress;J)I",
        constants$8.mblen$FUNC, false
    );
    static final FunctionDescriptor mbstowcs$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle mbstowcs$MH = RuntimeHelper.downcallHandle(
        spng_h.LIBRARIES, "mbstowcs",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;J)J",
        constants$8.mbstowcs$FUNC, false
    );
    static final FunctionDescriptor mbtowc$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle mbtowc$MH = RuntimeHelper.downcallHandle(
        spng_h.LIBRARIES, "mbtowc",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;J)I",
        constants$8.mbtowc$FUNC, false
    );
    static final FunctionDescriptor qsort$__compar$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle qsort$__compar$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$8.qsort$__compar$FUNC, false
    );
    static final FunctionDescriptor qsort$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_LONG,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle qsort$MH = RuntimeHelper.downcallHandle(
        spng_h.LIBRARIES, "qsort",
        "(Ljdk/incubator/foreign/MemoryAddress;JJLjdk/incubator/foreign/MemoryAddress;)V",
        constants$8.qsort$FUNC, false
    );
}

