// Generated by jextract

package org.libspng;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class lldiv_t {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG_LONG.withName("quot"),
        C_LONG_LONG.withName("rem")
    );
    public static MemoryLayout $LAYOUT() {
        return lldiv_t.$struct$LAYOUT;
    }
    static final VarHandle quot$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("quot"));
    public static VarHandle quot$VH() {
        return lldiv_t.quot$VH;
    }
    public static long quot$get(MemorySegment seg) {
        return (long)lldiv_t.quot$VH.get(seg);
    }
    public static void quot$set( MemorySegment seg, long x) {
        lldiv_t.quot$VH.set(seg, x);
    }
    public static long quot$get(MemorySegment seg, long index) {
        return (long)lldiv_t.quot$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void quot$set(MemorySegment seg, long index, long x) {
        lldiv_t.quot$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rem$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("rem"));
    public static VarHandle rem$VH() {
        return lldiv_t.rem$VH;
    }
    public static long rem$get(MemorySegment seg) {
        return (long)lldiv_t.rem$VH.get(seg);
    }
    public static void rem$set( MemorySegment seg, long x) {
        lldiv_t.rem$VH.set(seg, x);
    }
    public static long rem$get(MemorySegment seg, long index) {
        return (long)lldiv_t.rem$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rem$set(MemorySegment seg, long index, long x) {
        lldiv_t.rem$VH.set(seg.asSlice(index*sizeof()), x);
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


