// Generated by jextract

package org.libspng;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$17 {

    static final FunctionDescriptor arc4random_uniform$FUNC = FunctionDescriptor.of(C_INT,
        C_INT
    );
    static final MethodHandle arc4random_uniform$MH = RuntimeHelper.downcallHandle(
        spng_h.LIBRARIES, "arc4random_uniform",
        "(I)I",
        constants$17.arc4random_uniform$FUNC, false
    );
    static final FunctionDescriptor atexit_b$x0$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle atexit_b$x0$MH = RuntimeHelper.downcallHandle(
        "()V",
        constants$17.atexit_b$x0$FUNC, false
    );
    static final FunctionDescriptor atexit_b$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle atexit_b$MH = RuntimeHelper.downcallHandle(
        spng_h.LIBRARIES, "atexit_b",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$17.atexit_b$FUNC, false
    );
    static final FunctionDescriptor bsearch_b$__compar$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle bsearch_b$__compar$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$17.bsearch_b$__compar$FUNC, false
    );
}


