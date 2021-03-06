// Generated by jextract

package org.libspng;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class __darwin_sigaltstack {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_POINTER.withName("ss_sp"),
        C_LONG.withName("ss_size"),
        C_INT.withName("ss_flags"),
        MemoryLayout.paddingLayout(32)
    ).withName("__darwin_sigaltstack");
    public static MemoryLayout $LAYOUT() {
        return __darwin_sigaltstack.$struct$LAYOUT;
    }
    static final VarHandle ss_sp$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("ss_sp")));
    public static VarHandle ss_sp$VH() {
        return __darwin_sigaltstack.ss_sp$VH;
    }
    public static MemoryAddress ss_sp$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)__darwin_sigaltstack.ss_sp$VH.get(seg);
    }
    public static void ss_sp$set( MemorySegment seg, MemoryAddress x) {
        __darwin_sigaltstack.ss_sp$VH.set(seg, x);
    }
    public static MemoryAddress ss_sp$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)__darwin_sigaltstack.ss_sp$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ss_sp$set(MemorySegment seg, long index, MemoryAddress x) {
        __darwin_sigaltstack.ss_sp$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ss_size$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("ss_size"));
    public static VarHandle ss_size$VH() {
        return __darwin_sigaltstack.ss_size$VH;
    }
    public static long ss_size$get(MemorySegment seg) {
        return (long)__darwin_sigaltstack.ss_size$VH.get(seg);
    }
    public static void ss_size$set( MemorySegment seg, long x) {
        __darwin_sigaltstack.ss_size$VH.set(seg, x);
    }
    public static long ss_size$get(MemorySegment seg, long index) {
        return (long)__darwin_sigaltstack.ss_size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ss_size$set(MemorySegment seg, long index, long x) {
        __darwin_sigaltstack.ss_size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ss_flags$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("ss_flags"));
    public static VarHandle ss_flags$VH() {
        return __darwin_sigaltstack.ss_flags$VH;
    }
    public static int ss_flags$get(MemorySegment seg) {
        return (int)__darwin_sigaltstack.ss_flags$VH.get(seg);
    }
    public static void ss_flags$set( MemorySegment seg, int x) {
        __darwin_sigaltstack.ss_flags$VH.set(seg, x);
    }
    public static int ss_flags$get(MemorySegment seg, long index) {
        return (int)__darwin_sigaltstack.ss_flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ss_flags$set(MemorySegment seg, long index, int x) {
        __darwin_sigaltstack.ss_flags$VH.set(seg.asSlice(index*sizeof()), x);
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


