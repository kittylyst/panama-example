// Generated by jextract

package org.libspng;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class sigaction {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.unionLayout(
            C_POINTER.withName("__sa_handler"),
            C_POINTER.withName("__sa_sigaction")
        ).withName("__sigaction_u"),
        C_INT.withName("sa_mask"),
        C_INT.withName("sa_flags")
    ).withName("sigaction");
    public static MemoryLayout $LAYOUT() {
        return sigaction.$struct$LAYOUT;
    }
    public static MemorySegment __sigaction_u$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    static final VarHandle sa_mask$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("sa_mask"));
    public static VarHandle sa_mask$VH() {
        return sigaction.sa_mask$VH;
    }
    public static int sa_mask$get(MemorySegment seg) {
        return (int)sigaction.sa_mask$VH.get(seg);
    }
    public static void sa_mask$set( MemorySegment seg, int x) {
        sigaction.sa_mask$VH.set(seg, x);
    }
    public static int sa_mask$get(MemorySegment seg, long index) {
        return (int)sigaction.sa_mask$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void sa_mask$set(MemorySegment seg, long index, int x) {
        sigaction.sa_mask$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle sa_flags$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("sa_flags"));
    public static VarHandle sa_flags$VH() {
        return sigaction.sa_flags$VH;
    }
    public static int sa_flags$get(MemorySegment seg) {
        return (int)sigaction.sa_flags$VH.get(seg);
    }
    public static void sa_flags$set( MemorySegment seg, int x) {
        sigaction.sa_flags$VH.set(seg, x);
    }
    public static int sa_flags$get(MemorySegment seg, long index) {
        return (int)sigaction.sa_flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void sa_flags$set(MemorySegment seg, long index, int x) {
        sigaction.sa_flags$VH.set(seg.asSlice(index*sizeof()), x);
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


