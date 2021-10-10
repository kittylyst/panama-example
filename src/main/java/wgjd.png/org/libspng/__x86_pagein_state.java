// Generated by jextract

package org.libspng;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class __x86_pagein_state {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_INT.withName("__pagein_error")
    ).withName("__x86_pagein_state");
    public static MemoryLayout $LAYOUT() {
        return __x86_pagein_state.$struct$LAYOUT;
    }
    static final VarHandle __pagein_error$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("__pagein_error"));
    public static VarHandle __pagein_error$VH() {
        return __x86_pagein_state.__pagein_error$VH;
    }
    public static int __pagein_error$get(MemorySegment seg) {
        return (int)__x86_pagein_state.__pagein_error$VH.get(seg);
    }
    public static void __pagein_error$set( MemorySegment seg, int x) {
        __x86_pagein_state.__pagein_error$VH.set(seg, x);
    }
    public static int __pagein_error$get(MemorySegment seg, long index) {
        return (int)__x86_pagein_state.__pagein_error$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __pagein_error$set(MemorySegment seg, long index, int x) {
        __x86_pagein_state.__pagein_error$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocate(ResourceScope scope) { return allocate(SegmentAllocator.ofScope(scope)); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment allocateArray(int len, ResourceScope scope) {
        return allocateArray(len, SegmentAllocator.ofScope(scope));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, ResourceScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


