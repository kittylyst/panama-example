// Generated by jextract

package org.libspng;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class __darwin_mmst_reg {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(10, C_CHAR).withName("__mmst_reg"),
        MemoryLayout.sequenceLayout(6, C_CHAR).withName("__mmst_rsrv")
    ).withName("__darwin_mmst_reg");
    public static MemoryLayout $LAYOUT() {
        return __darwin_mmst_reg.$struct$LAYOUT;
    }
    public static MemorySegment __mmst_reg$slice(MemorySegment seg) {
        return seg.asSlice(0, 10);
    }
    public static MemorySegment __mmst_rsrv$slice(MemorySegment seg) {
        return seg.asSlice(10, 6);
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


