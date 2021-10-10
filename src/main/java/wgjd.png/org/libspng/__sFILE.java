// Generated by jextract

package org.libspng;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class __sFILE {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_POINTER.withName("_p"),
        C_INT.withName("_r"),
        C_INT.withName("_w"),
        C_SHORT.withName("_flags"),
        C_SHORT.withName("_file"),
        MemoryLayout.paddingLayout(32),
        MemoryLayout.structLayout(
            C_POINTER.withName("_base"),
            C_INT.withName("_size"),
            MemoryLayout.paddingLayout(32)
        ).withName("_bf"),
        C_INT.withName("_lbfsize"),
        MemoryLayout.paddingLayout(32),
        C_POINTER.withName("_cookie"),
        C_POINTER.withName("_close"),
        C_POINTER.withName("_read"),
        C_POINTER.withName("_seek"),
        C_POINTER.withName("_write"),
        MemoryLayout.structLayout(
            C_POINTER.withName("_base"),
            C_INT.withName("_size"),
            MemoryLayout.paddingLayout(32)
        ).withName("_ub"),
        C_POINTER.withName("_extra"),
        C_INT.withName("_ur"),
        MemoryLayout.sequenceLayout(3, C_CHAR).withName("_ubuf"),
        MemoryLayout.sequenceLayout(1, C_CHAR).withName("_nbuf"),
        MemoryLayout.structLayout(
            C_POINTER.withName("_base"),
            C_INT.withName("_size"),
            MemoryLayout.paddingLayout(32)
        ).withName("_lb"),
        C_INT.withName("_blksize"),
        MemoryLayout.paddingLayout(32),
        C_LONG_LONG.withName("_offset")
    ).withName("__sFILE");
    public static MemoryLayout $LAYOUT() {
        return __sFILE.$struct$LAYOUT;
    }
    static final VarHandle _p$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("_p")));
    public static VarHandle _p$VH() {
        return __sFILE._p$VH;
    }
    public static MemoryAddress _p$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)__sFILE._p$VH.get(seg);
    }
    public static void _p$set( MemorySegment seg, MemoryAddress x) {
        __sFILE._p$VH.set(seg, x);
    }
    public static MemoryAddress _p$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)__sFILE._p$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _p$set(MemorySegment seg, long index, MemoryAddress x) {
        __sFILE._p$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle _r$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("_r"));
    public static VarHandle _r$VH() {
        return __sFILE._r$VH;
    }
    public static int _r$get(MemorySegment seg) {
        return (int)__sFILE._r$VH.get(seg);
    }
    public static void _r$set( MemorySegment seg, int x) {
        __sFILE._r$VH.set(seg, x);
    }
    public static int _r$get(MemorySegment seg, long index) {
        return (int)__sFILE._r$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _r$set(MemorySegment seg, long index, int x) {
        __sFILE._r$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle _w$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("_w"));
    public static VarHandle _w$VH() {
        return __sFILE._w$VH;
    }
    public static int _w$get(MemorySegment seg) {
        return (int)__sFILE._w$VH.get(seg);
    }
    public static void _w$set( MemorySegment seg, int x) {
        __sFILE._w$VH.set(seg, x);
    }
    public static int _w$get(MemorySegment seg, long index) {
        return (int)__sFILE._w$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _w$set(MemorySegment seg, long index, int x) {
        __sFILE._w$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle _flags$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("_flags"));
    public static VarHandle _flags$VH() {
        return __sFILE._flags$VH;
    }
    public static short _flags$get(MemorySegment seg) {
        return (short)__sFILE._flags$VH.get(seg);
    }
    public static void _flags$set( MemorySegment seg, short x) {
        __sFILE._flags$VH.set(seg, x);
    }
    public static short _flags$get(MemorySegment seg, long index) {
        return (short)__sFILE._flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _flags$set(MemorySegment seg, long index, short x) {
        __sFILE._flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle _file$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("_file"));
    public static VarHandle _file$VH() {
        return __sFILE._file$VH;
    }
    public static short _file$get(MemorySegment seg) {
        return (short)__sFILE._file$VH.get(seg);
    }
    public static void _file$set( MemorySegment seg, short x) {
        __sFILE._file$VH.set(seg, x);
    }
    public static short _file$get(MemorySegment seg, long index) {
        return (short)__sFILE._file$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _file$set(MemorySegment seg, long index, short x) {
        __sFILE._file$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment _bf$slice(MemorySegment seg) {
        return seg.asSlice(24, 16);
    }
    static final VarHandle _lbfsize$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("_lbfsize"));
    public static VarHandle _lbfsize$VH() {
        return __sFILE._lbfsize$VH;
    }
    public static int _lbfsize$get(MemorySegment seg) {
        return (int)__sFILE._lbfsize$VH.get(seg);
    }
    public static void _lbfsize$set( MemorySegment seg, int x) {
        __sFILE._lbfsize$VH.set(seg, x);
    }
    public static int _lbfsize$get(MemorySegment seg, long index) {
        return (int)__sFILE._lbfsize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _lbfsize$set(MemorySegment seg, long index, int x) {
        __sFILE._lbfsize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle _cookie$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("_cookie")));
    public static VarHandle _cookie$VH() {
        return __sFILE._cookie$VH;
    }
    public static MemoryAddress _cookie$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)__sFILE._cookie$VH.get(seg);
    }
    public static void _cookie$set( MemorySegment seg, MemoryAddress x) {
        __sFILE._cookie$VH.set(seg, x);
    }
    public static MemoryAddress _cookie$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)__sFILE._cookie$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _cookie$set(MemorySegment seg, long index, MemoryAddress x) {
        __sFILE._cookie$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final FunctionDescriptor _close$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle _close$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        __sFILE._close$FUNC, false
    );
    public interface _close {

        int apply(jdk.incubator.foreign.MemoryAddress x0);
        static MemoryAddress allocate(_close fi) {
            return RuntimeHelper.upcallStub(_close.class, fi, __sFILE._close$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(_close fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(_close.class, fi, __sFILE._close$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static _close ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0) -> {
                try {
                    return (int)__sFILE._close$MH.invokeExact((Addressable)addr, x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _close$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("_close")));
    public static VarHandle _close$VH() {
        return __sFILE._close$VH;
    }
    public static MemoryAddress _close$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)__sFILE._close$VH.get(seg);
    }
    public static void _close$set( MemorySegment seg, MemoryAddress x) {
        __sFILE._close$VH.set(seg, x);
    }
    public static MemoryAddress _close$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)__sFILE._close$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _close$set(MemorySegment seg, long index, MemoryAddress x) {
        __sFILE._close$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _close _close (MemorySegment segment) {
        return _close.ofAddress(_close$get(segment));
    }
    static final FunctionDescriptor _read$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_INT
    );
    static final MethodHandle _read$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        __sFILE._read$FUNC, false
    );
    public interface _read {

        int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, int x2);
        static MemoryAddress allocate(_read fi) {
            return RuntimeHelper.upcallStub(_read.class, fi, __sFILE._read$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I");
        }
        static MemoryAddress allocate(_read fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(_read.class, fi, __sFILE._read$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I", scope);
        }
        static _read ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, int x2) -> {
                try {
                    return (int)__sFILE._read$MH.invokeExact((Addressable)addr, x0, x1, x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _read$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("_read")));
    public static VarHandle _read$VH() {
        return __sFILE._read$VH;
    }
    public static MemoryAddress _read$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)__sFILE._read$VH.get(seg);
    }
    public static void _read$set( MemorySegment seg, MemoryAddress x) {
        __sFILE._read$VH.set(seg, x);
    }
    public static MemoryAddress _read$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)__sFILE._read$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _read$set(MemorySegment seg, long index, MemoryAddress x) {
        __sFILE._read$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _read _read (MemorySegment segment) {
        return _read.ofAddress(_read$get(segment));
    }
    static final FunctionDescriptor _seek$FUNC = FunctionDescriptor.of(C_LONG_LONG,
        C_POINTER,
        C_LONG_LONG,
        C_INT
    );
    static final MethodHandle _seek$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;JI)J",
        __sFILE._seek$FUNC, false
    );
    public interface _seek {

        long apply(jdk.incubator.foreign.MemoryAddress x0, long x1, int x2);
        static MemoryAddress allocate(_seek fi) {
            return RuntimeHelper.upcallStub(_seek.class, fi, __sFILE._seek$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;JI)J");
        }
        static MemoryAddress allocate(_seek fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(_seek.class, fi, __sFILE._seek$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;JI)J", scope);
        }
        static _seek ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, long x1, int x2) -> {
                try {
                    return (long)__sFILE._seek$MH.invokeExact((Addressable)addr, x0, x1, x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _seek$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("_seek")));
    public static VarHandle _seek$VH() {
        return __sFILE._seek$VH;
    }
    public static MemoryAddress _seek$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)__sFILE._seek$VH.get(seg);
    }
    public static void _seek$set( MemorySegment seg, MemoryAddress x) {
        __sFILE._seek$VH.set(seg, x);
    }
    public static MemoryAddress _seek$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)__sFILE._seek$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _seek$set(MemorySegment seg, long index, MemoryAddress x) {
        __sFILE._seek$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _seek _seek (MemorySegment segment) {
        return _seek.ofAddress(_seek$get(segment));
    }
    static final FunctionDescriptor _write$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_INT
    );
    static final MethodHandle _write$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        __sFILE._write$FUNC, false
    );
    public interface _write {

        int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, int x2);
        static MemoryAddress allocate(_write fi) {
            return RuntimeHelper.upcallStub(_write.class, fi, __sFILE._write$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I");
        }
        static MemoryAddress allocate(_write fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(_write.class, fi, __sFILE._write$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I", scope);
        }
        static _write ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, int x2) -> {
                try {
                    return (int)__sFILE._write$MH.invokeExact((Addressable)addr, x0, x1, x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle _write$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("_write")));
    public static VarHandle _write$VH() {
        return __sFILE._write$VH;
    }
    public static MemoryAddress _write$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)__sFILE._write$VH.get(seg);
    }
    public static void _write$set( MemorySegment seg, MemoryAddress x) {
        __sFILE._write$VH.set(seg, x);
    }
    public static MemoryAddress _write$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)__sFILE._write$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _write$set(MemorySegment seg, long index, MemoryAddress x) {
        __sFILE._write$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static _write _write (MemorySegment segment) {
        return _write.ofAddress(_write$get(segment));
    }
    public static MemorySegment _ub$slice(MemorySegment seg) {
        return seg.asSlice(88, 16);
    }
    static final VarHandle _extra$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("_extra")));
    public static VarHandle _extra$VH() {
        return __sFILE._extra$VH;
    }
    public static MemoryAddress _extra$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)__sFILE._extra$VH.get(seg);
    }
    public static void _extra$set( MemorySegment seg, MemoryAddress x) {
        __sFILE._extra$VH.set(seg, x);
    }
    public static MemoryAddress _extra$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)__sFILE._extra$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _extra$set(MemorySegment seg, long index, MemoryAddress x) {
        __sFILE._extra$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle _ur$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("_ur"));
    public static VarHandle _ur$VH() {
        return __sFILE._ur$VH;
    }
    public static int _ur$get(MemorySegment seg) {
        return (int)__sFILE._ur$VH.get(seg);
    }
    public static void _ur$set( MemorySegment seg, int x) {
        __sFILE._ur$VH.set(seg, x);
    }
    public static int _ur$get(MemorySegment seg, long index) {
        return (int)__sFILE._ur$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _ur$set(MemorySegment seg, long index, int x) {
        __sFILE._ur$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment _ubuf$slice(MemorySegment seg) {
        return seg.asSlice(116, 3);
    }
    public static MemorySegment _nbuf$slice(MemorySegment seg) {
        return seg.asSlice(119, 1);
    }
    public static MemorySegment _lb$slice(MemorySegment seg) {
        return seg.asSlice(120, 16);
    }
    static final VarHandle _blksize$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("_blksize"));
    public static VarHandle _blksize$VH() {
        return __sFILE._blksize$VH;
    }
    public static int _blksize$get(MemorySegment seg) {
        return (int)__sFILE._blksize$VH.get(seg);
    }
    public static void _blksize$set( MemorySegment seg, int x) {
        __sFILE._blksize$VH.set(seg, x);
    }
    public static int _blksize$get(MemorySegment seg, long index) {
        return (int)__sFILE._blksize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _blksize$set(MemorySegment seg, long index, int x) {
        __sFILE._blksize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle _offset$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("_offset"));
    public static VarHandle _offset$VH() {
        return __sFILE._offset$VH;
    }
    public static long _offset$get(MemorySegment seg) {
        return (long)__sFILE._offset$VH.get(seg);
    }
    public static void _offset$set( MemorySegment seg, long x) {
        __sFILE._offset$VH.set(seg, x);
    }
    public static long _offset$get(MemorySegment seg, long index) {
        return (long)__sFILE._offset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _offset$set(MemorySegment seg, long index, long x) {
        __sFILE._offset$VH.set(seg.asSlice(index*sizeof()), x);
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

