// Generated by jextract

package org.libspng;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$11 {

    static final FunctionDescriptor a64l$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle a64l$MH = RuntimeHelper.downcallHandle(
        spng_h.LIBRARIES, "a64l",
        "(Ljdk/incubator/foreign/MemoryAddress;)J",
        constants$11.a64l$FUNC, false
    );
    static final FunctionDescriptor drand48$FUNC = FunctionDescriptor.of(C_DOUBLE);
    static final MethodHandle drand48$MH = RuntimeHelper.downcallHandle(
        spng_h.LIBRARIES, "drand48",
        "()D",
        constants$11.drand48$FUNC, false
    );
    static final FunctionDescriptor ecvt$FUNC = FunctionDescriptor.of(C_POINTER,
        C_DOUBLE,
        C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle ecvt$MH = RuntimeHelper.downcallHandle(
        spng_h.LIBRARIES, "ecvt",
        "(DILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$11.ecvt$FUNC, false
    );
    static final FunctionDescriptor erand48$FUNC = FunctionDescriptor.of(C_DOUBLE,
        C_POINTER
    );
    static final MethodHandle erand48$MH = RuntimeHelper.downcallHandle(
        spng_h.LIBRARIES, "erand48",
        "(Ljdk/incubator/foreign/MemoryAddress;)D",
        constants$11.erand48$FUNC, false
    );
    static final FunctionDescriptor fcvt$FUNC = FunctionDescriptor.of(C_POINTER,
        C_DOUBLE,
        C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle fcvt$MH = RuntimeHelper.downcallHandle(
        spng_h.LIBRARIES, "fcvt",
        "(DILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$11.fcvt$FUNC, false
    );
    static final FunctionDescriptor gcvt$FUNC = FunctionDescriptor.of(C_POINTER,
        C_DOUBLE,
        C_INT,
        C_POINTER
    );
    static final MethodHandle gcvt$MH = RuntimeHelper.downcallHandle(
        spng_h.LIBRARIES, "gcvt",
        "(DILjdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$11.gcvt$FUNC, false
    );
}


