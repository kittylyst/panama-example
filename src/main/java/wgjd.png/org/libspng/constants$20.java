// Generated by jextract

package org.libspng;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$20 {

    static final FunctionDescriptor devname$FUNC = FunctionDescriptor.of(C_POINTER,
        C_INT,
        C_SHORT
    );
    static final MethodHandle devname$MH = RuntimeHelper.downcallHandle(
        spng_h.LIBRARIES, "devname",
        "(IS)Ljdk/incubator/foreign/MemoryAddress;",
        constants$20.devname$FUNC, false
    );
    static final FunctionDescriptor devname_r$FUNC = FunctionDescriptor.of(C_POINTER,
        C_INT,
        C_SHORT,
        C_POINTER,
        C_INT
    );
    static final MethodHandle devname_r$MH = RuntimeHelper.downcallHandle(
        spng_h.LIBRARIES, "devname_r",
        "(ISLjdk/incubator/foreign/MemoryAddress;I)Ljdk/incubator/foreign/MemoryAddress;",
        constants$20.devname_r$FUNC, false
    );
    static final FunctionDescriptor getbsize$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle getbsize$MH = RuntimeHelper.downcallHandle(
        spng_h.LIBRARIES, "getbsize",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$20.getbsize$FUNC, false
    );
    static final FunctionDescriptor getloadavg$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT
    );
    static final MethodHandle getloadavg$MH = RuntimeHelper.downcallHandle(
        spng_h.LIBRARIES, "getloadavg",
        "(Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$20.getloadavg$FUNC, false
    );
    static final FunctionDescriptor getprogname$FUNC = FunctionDescriptor.of(C_POINTER);
    static final MethodHandle getprogname$MH = RuntimeHelper.downcallHandle(
        spng_h.LIBRARIES, "getprogname",
        "()Ljdk/incubator/foreign/MemoryAddress;",
        constants$20.getprogname$FUNC, false
    );
    static final FunctionDescriptor setprogname$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle setprogname$MH = RuntimeHelper.downcallHandle(
        spng_h.LIBRARIES, "setprogname",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$20.setprogname$FUNC, false
    );
}


