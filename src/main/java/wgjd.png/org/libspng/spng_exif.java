// Generated by jextract

package org.libspng;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class spng_exif {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("length"),
        C_POINTER.withName("data")
    ).withName("spng_exif");
    public static MemoryLayout $LAYOUT() {
        return spng_exif.$struct$LAYOUT;
    }
    static final VarHandle length$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("length"));
    public static VarHandle length$VH() {
        return spng_exif.length$VH;
    }
    public static long length$get(MemorySegment seg) {
        return (long)spng_exif.length$VH.get(seg);
    }
    public static void length$set( MemorySegment seg, long x) {
        spng_exif.length$VH.set(seg, x);
    }
    public static long length$get(MemorySegment seg, long index) {
        return (long)spng_exif.length$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void length$set(MemorySegment seg, long index, long x) {
        spng_exif.length$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle data$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("data")));
    public static VarHandle data$VH() {
        return spng_exif.data$VH;
    }
    public static MemoryAddress data$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)spng_exif.data$VH.get(seg);
    }
    public static void data$set( MemorySegment seg, MemoryAddress x) {
        spng_exif.data$VH.set(seg, x);
    }
    public static MemoryAddress data$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)spng_exif.data$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void data$set(MemorySegment seg, long index, MemoryAddress x) {
        spng_exif.data$VH.set(seg.asSlice(index*sizeof()), x);
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


