// Generated by jextract

package org.libspng;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class __darwin_x86_avx512_state64 {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(2, C_INT).withName("__fpu_reserved"),
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                MemoryLayout.valueLayout(1, ByteOrder.nativeOrder()).withName("__invalid"),
                MemoryLayout.valueLayout(1, ByteOrder.nativeOrder()).withName("__denorm"),
                MemoryLayout.valueLayout(1, ByteOrder.nativeOrder()).withName("__zdiv"),
                MemoryLayout.valueLayout(1, ByteOrder.nativeOrder()).withName("__ovrfl"),
                MemoryLayout.valueLayout(1, ByteOrder.nativeOrder()).withName("__undfl"),
                MemoryLayout.valueLayout(1, ByteOrder.nativeOrder()).withName("__precis"),
                MemoryLayout.paddingLayout(2),
                MemoryLayout.valueLayout(2, ByteOrder.nativeOrder()).withName("__pc"),
                MemoryLayout.valueLayout(2, ByteOrder.nativeOrder()).withName("__rc"),
                MemoryLayout.paddingLayout(4)
            )
        ).withName("__fpu_fcw"),
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                MemoryLayout.valueLayout(1, ByteOrder.nativeOrder()).withName("__invalid"),
                MemoryLayout.valueLayout(1, ByteOrder.nativeOrder()).withName("__denorm"),
                MemoryLayout.valueLayout(1, ByteOrder.nativeOrder()).withName("__zdiv"),
                MemoryLayout.valueLayout(1, ByteOrder.nativeOrder()).withName("__ovrfl"),
                MemoryLayout.valueLayout(1, ByteOrder.nativeOrder()).withName("__undfl"),
                MemoryLayout.valueLayout(1, ByteOrder.nativeOrder()).withName("__precis"),
                MemoryLayout.valueLayout(1, ByteOrder.nativeOrder()).withName("__stkflt"),
                MemoryLayout.valueLayout(1, ByteOrder.nativeOrder()).withName("__errsumm"),
                MemoryLayout.valueLayout(1, ByteOrder.nativeOrder()).withName("__c0"),
                MemoryLayout.valueLayout(1, ByteOrder.nativeOrder()).withName("__c1"),
                MemoryLayout.valueLayout(1, ByteOrder.nativeOrder()).withName("__c2"),
                MemoryLayout.valueLayout(3, ByteOrder.nativeOrder()).withName("__tos"),
                MemoryLayout.valueLayout(1, ByteOrder.nativeOrder()).withName("__c3"),
                MemoryLayout.valueLayout(1, ByteOrder.nativeOrder()).withName("__busy")
            )
        ).withName("__fpu_fsw"),
        C_CHAR.withName("__fpu_ftw"),
        C_CHAR.withName("__fpu_rsrv1"),
        C_SHORT.withName("__fpu_fop"),
        C_INT.withName("__fpu_ip"),
        C_SHORT.withName("__fpu_cs"),
        C_SHORT.withName("__fpu_rsrv2"),
        C_INT.withName("__fpu_dp"),
        C_SHORT.withName("__fpu_ds"),
        C_SHORT.withName("__fpu_rsrv3"),
        C_INT.withName("__fpu_mxcsr"),
        C_INT.withName("__fpu_mxcsrmask"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(10, C_CHAR).withName("__mmst_reg"),
            MemoryLayout.sequenceLayout(6, C_CHAR).withName("__mmst_rsrv")
        ).withName("__fpu_stmm0"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(10, C_CHAR).withName("__mmst_reg"),
            MemoryLayout.sequenceLayout(6, C_CHAR).withName("__mmst_rsrv")
        ).withName("__fpu_stmm1"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(10, C_CHAR).withName("__mmst_reg"),
            MemoryLayout.sequenceLayout(6, C_CHAR).withName("__mmst_rsrv")
        ).withName("__fpu_stmm2"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(10, C_CHAR).withName("__mmst_reg"),
            MemoryLayout.sequenceLayout(6, C_CHAR).withName("__mmst_rsrv")
        ).withName("__fpu_stmm3"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(10, C_CHAR).withName("__mmst_reg"),
            MemoryLayout.sequenceLayout(6, C_CHAR).withName("__mmst_rsrv")
        ).withName("__fpu_stmm4"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(10, C_CHAR).withName("__mmst_reg"),
            MemoryLayout.sequenceLayout(6, C_CHAR).withName("__mmst_rsrv")
        ).withName("__fpu_stmm5"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(10, C_CHAR).withName("__mmst_reg"),
            MemoryLayout.sequenceLayout(6, C_CHAR).withName("__mmst_rsrv")
        ).withName("__fpu_stmm6"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(10, C_CHAR).withName("__mmst_reg"),
            MemoryLayout.sequenceLayout(6, C_CHAR).withName("__mmst_rsrv")
        ).withName("__fpu_stmm7"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(16, C_CHAR).withName("__xmm_reg")
        ).withName("__fpu_xmm0"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(16, C_CHAR).withName("__xmm_reg")
        ).withName("__fpu_xmm1"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(16, C_CHAR).withName("__xmm_reg")
        ).withName("__fpu_xmm2"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(16, C_CHAR).withName("__xmm_reg")
        ).withName("__fpu_xmm3"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(16, C_CHAR).withName("__xmm_reg")
        ).withName("__fpu_xmm4"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(16, C_CHAR).withName("__xmm_reg")
        ).withName("__fpu_xmm5"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(16, C_CHAR).withName("__xmm_reg")
        ).withName("__fpu_xmm6"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(16, C_CHAR).withName("__xmm_reg")
        ).withName("__fpu_xmm7"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(16, C_CHAR).withName("__xmm_reg")
        ).withName("__fpu_xmm8"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(16, C_CHAR).withName("__xmm_reg")
        ).withName("__fpu_xmm9"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(16, C_CHAR).withName("__xmm_reg")
        ).withName("__fpu_xmm10"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(16, C_CHAR).withName("__xmm_reg")
        ).withName("__fpu_xmm11"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(16, C_CHAR).withName("__xmm_reg")
        ).withName("__fpu_xmm12"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(16, C_CHAR).withName("__xmm_reg")
        ).withName("__fpu_xmm13"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(16, C_CHAR).withName("__xmm_reg")
        ).withName("__fpu_xmm14"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(16, C_CHAR).withName("__xmm_reg")
        ).withName("__fpu_xmm15"),
        MemoryLayout.sequenceLayout(96, C_CHAR).withName("__fpu_rsrv4"),
        C_INT.withName("__fpu_reserved1"),
        MemoryLayout.sequenceLayout(64, C_CHAR).withName("__avx_reserved1"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(16, C_CHAR).withName("__xmm_reg")
        ).withName("__fpu_ymmh0"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(16, C_CHAR).withName("__xmm_reg")
        ).withName("__fpu_ymmh1"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(16, C_CHAR).withName("__xmm_reg")
        ).withName("__fpu_ymmh2"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(16, C_CHAR).withName("__xmm_reg")
        ).withName("__fpu_ymmh3"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(16, C_CHAR).withName("__xmm_reg")
        ).withName("__fpu_ymmh4"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(16, C_CHAR).withName("__xmm_reg")
        ).withName("__fpu_ymmh5"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(16, C_CHAR).withName("__xmm_reg")
        ).withName("__fpu_ymmh6"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(16, C_CHAR).withName("__xmm_reg")
        ).withName("__fpu_ymmh7"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(16, C_CHAR).withName("__xmm_reg")
        ).withName("__fpu_ymmh8"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(16, C_CHAR).withName("__xmm_reg")
        ).withName("__fpu_ymmh9"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(16, C_CHAR).withName("__xmm_reg")
        ).withName("__fpu_ymmh10"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(16, C_CHAR).withName("__xmm_reg")
        ).withName("__fpu_ymmh11"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(16, C_CHAR).withName("__xmm_reg")
        ).withName("__fpu_ymmh12"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(16, C_CHAR).withName("__xmm_reg")
        ).withName("__fpu_ymmh13"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(16, C_CHAR).withName("__xmm_reg")
        ).withName("__fpu_ymmh14"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(16, C_CHAR).withName("__xmm_reg")
        ).withName("__fpu_ymmh15"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(8, C_CHAR).withName("__opmask_reg")
        ).withName("__fpu_k0"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(8, C_CHAR).withName("__opmask_reg")
        ).withName("__fpu_k1"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(8, C_CHAR).withName("__opmask_reg")
        ).withName("__fpu_k2"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(8, C_CHAR).withName("__opmask_reg")
        ).withName("__fpu_k3"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(8, C_CHAR).withName("__opmask_reg")
        ).withName("__fpu_k4"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(8, C_CHAR).withName("__opmask_reg")
        ).withName("__fpu_k5"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(8, C_CHAR).withName("__opmask_reg")
        ).withName("__fpu_k6"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(8, C_CHAR).withName("__opmask_reg")
        ).withName("__fpu_k7"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(32, C_CHAR).withName("__ymm_reg")
        ).withName("__fpu_zmmh0"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(32, C_CHAR).withName("__ymm_reg")
        ).withName("__fpu_zmmh1"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(32, C_CHAR).withName("__ymm_reg")
        ).withName("__fpu_zmmh2"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(32, C_CHAR).withName("__ymm_reg")
        ).withName("__fpu_zmmh3"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(32, C_CHAR).withName("__ymm_reg")
        ).withName("__fpu_zmmh4"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(32, C_CHAR).withName("__ymm_reg")
        ).withName("__fpu_zmmh5"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(32, C_CHAR).withName("__ymm_reg")
        ).withName("__fpu_zmmh6"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(32, C_CHAR).withName("__ymm_reg")
        ).withName("__fpu_zmmh7"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(32, C_CHAR).withName("__ymm_reg")
        ).withName("__fpu_zmmh8"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(32, C_CHAR).withName("__ymm_reg")
        ).withName("__fpu_zmmh9"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(32, C_CHAR).withName("__ymm_reg")
        ).withName("__fpu_zmmh10"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(32, C_CHAR).withName("__ymm_reg")
        ).withName("__fpu_zmmh11"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(32, C_CHAR).withName("__ymm_reg")
        ).withName("__fpu_zmmh12"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(32, C_CHAR).withName("__ymm_reg")
        ).withName("__fpu_zmmh13"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(32, C_CHAR).withName("__ymm_reg")
        ).withName("__fpu_zmmh14"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(32, C_CHAR).withName("__ymm_reg")
        ).withName("__fpu_zmmh15"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(64, C_CHAR).withName("__zmm_reg")
        ).withName("__fpu_zmm16"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(64, C_CHAR).withName("__zmm_reg")
        ).withName("__fpu_zmm17"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(64, C_CHAR).withName("__zmm_reg")
        ).withName("__fpu_zmm18"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(64, C_CHAR).withName("__zmm_reg")
        ).withName("__fpu_zmm19"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(64, C_CHAR).withName("__zmm_reg")
        ).withName("__fpu_zmm20"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(64, C_CHAR).withName("__zmm_reg")
        ).withName("__fpu_zmm21"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(64, C_CHAR).withName("__zmm_reg")
        ).withName("__fpu_zmm22"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(64, C_CHAR).withName("__zmm_reg")
        ).withName("__fpu_zmm23"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(64, C_CHAR).withName("__zmm_reg")
        ).withName("__fpu_zmm24"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(64, C_CHAR).withName("__zmm_reg")
        ).withName("__fpu_zmm25"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(64, C_CHAR).withName("__zmm_reg")
        ).withName("__fpu_zmm26"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(64, C_CHAR).withName("__zmm_reg")
        ).withName("__fpu_zmm27"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(64, C_CHAR).withName("__zmm_reg")
        ).withName("__fpu_zmm28"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(64, C_CHAR).withName("__zmm_reg")
        ).withName("__fpu_zmm29"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(64, C_CHAR).withName("__zmm_reg")
        ).withName("__fpu_zmm30"),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(64, C_CHAR).withName("__zmm_reg")
        ).withName("__fpu_zmm31")
    ).withName("__darwin_x86_avx512_state64");
    public static MemoryLayout $LAYOUT() {
        return __darwin_x86_avx512_state64.$struct$LAYOUT;
    }
    public static MemorySegment __fpu_reserved$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    public static MemorySegment __fpu_fcw$slice(MemorySegment seg) {
        return seg.asSlice(8, 2);
    }
    public static MemorySegment __fpu_fsw$slice(MemorySegment seg) {
        return seg.asSlice(10, 2);
    }
    static final VarHandle __fpu_ftw$VH = $struct$LAYOUT.varHandle(byte.class, MemoryLayout.PathElement.groupElement("__fpu_ftw"));
    public static VarHandle __fpu_ftw$VH() {
        return __darwin_x86_avx512_state64.__fpu_ftw$VH;
    }
    public static byte __fpu_ftw$get(MemorySegment seg) {
        return (byte)__darwin_x86_avx512_state64.__fpu_ftw$VH.get(seg);
    }
    public static void __fpu_ftw$set( MemorySegment seg, byte x) {
        __darwin_x86_avx512_state64.__fpu_ftw$VH.set(seg, x);
    }
    public static byte __fpu_ftw$get(MemorySegment seg, long index) {
        return (byte)__darwin_x86_avx512_state64.__fpu_ftw$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __fpu_ftw$set(MemorySegment seg, long index, byte x) {
        __darwin_x86_avx512_state64.__fpu_ftw$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle __fpu_rsrv1$VH = $struct$LAYOUT.varHandle(byte.class, MemoryLayout.PathElement.groupElement("__fpu_rsrv1"));
    public static VarHandle __fpu_rsrv1$VH() {
        return __darwin_x86_avx512_state64.__fpu_rsrv1$VH;
    }
    public static byte __fpu_rsrv1$get(MemorySegment seg) {
        return (byte)__darwin_x86_avx512_state64.__fpu_rsrv1$VH.get(seg);
    }
    public static void __fpu_rsrv1$set( MemorySegment seg, byte x) {
        __darwin_x86_avx512_state64.__fpu_rsrv1$VH.set(seg, x);
    }
    public static byte __fpu_rsrv1$get(MemorySegment seg, long index) {
        return (byte)__darwin_x86_avx512_state64.__fpu_rsrv1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __fpu_rsrv1$set(MemorySegment seg, long index, byte x) {
        __darwin_x86_avx512_state64.__fpu_rsrv1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle __fpu_fop$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("__fpu_fop"));
    public static VarHandle __fpu_fop$VH() {
        return __darwin_x86_avx512_state64.__fpu_fop$VH;
    }
    public static short __fpu_fop$get(MemorySegment seg) {
        return (short)__darwin_x86_avx512_state64.__fpu_fop$VH.get(seg);
    }
    public static void __fpu_fop$set( MemorySegment seg, short x) {
        __darwin_x86_avx512_state64.__fpu_fop$VH.set(seg, x);
    }
    public static short __fpu_fop$get(MemorySegment seg, long index) {
        return (short)__darwin_x86_avx512_state64.__fpu_fop$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __fpu_fop$set(MemorySegment seg, long index, short x) {
        __darwin_x86_avx512_state64.__fpu_fop$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle __fpu_ip$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("__fpu_ip"));
    public static VarHandle __fpu_ip$VH() {
        return __darwin_x86_avx512_state64.__fpu_ip$VH;
    }
    public static int __fpu_ip$get(MemorySegment seg) {
        return (int)__darwin_x86_avx512_state64.__fpu_ip$VH.get(seg);
    }
    public static void __fpu_ip$set( MemorySegment seg, int x) {
        __darwin_x86_avx512_state64.__fpu_ip$VH.set(seg, x);
    }
    public static int __fpu_ip$get(MemorySegment seg, long index) {
        return (int)__darwin_x86_avx512_state64.__fpu_ip$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __fpu_ip$set(MemorySegment seg, long index, int x) {
        __darwin_x86_avx512_state64.__fpu_ip$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle __fpu_cs$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("__fpu_cs"));
    public static VarHandle __fpu_cs$VH() {
        return __darwin_x86_avx512_state64.__fpu_cs$VH;
    }
    public static short __fpu_cs$get(MemorySegment seg) {
        return (short)__darwin_x86_avx512_state64.__fpu_cs$VH.get(seg);
    }
    public static void __fpu_cs$set( MemorySegment seg, short x) {
        __darwin_x86_avx512_state64.__fpu_cs$VH.set(seg, x);
    }
    public static short __fpu_cs$get(MemorySegment seg, long index) {
        return (short)__darwin_x86_avx512_state64.__fpu_cs$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __fpu_cs$set(MemorySegment seg, long index, short x) {
        __darwin_x86_avx512_state64.__fpu_cs$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle __fpu_rsrv2$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("__fpu_rsrv2"));
    public static VarHandle __fpu_rsrv2$VH() {
        return __darwin_x86_avx512_state64.__fpu_rsrv2$VH;
    }
    public static short __fpu_rsrv2$get(MemorySegment seg) {
        return (short)__darwin_x86_avx512_state64.__fpu_rsrv2$VH.get(seg);
    }
    public static void __fpu_rsrv2$set( MemorySegment seg, short x) {
        __darwin_x86_avx512_state64.__fpu_rsrv2$VH.set(seg, x);
    }
    public static short __fpu_rsrv2$get(MemorySegment seg, long index) {
        return (short)__darwin_x86_avx512_state64.__fpu_rsrv2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __fpu_rsrv2$set(MemorySegment seg, long index, short x) {
        __darwin_x86_avx512_state64.__fpu_rsrv2$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle __fpu_dp$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("__fpu_dp"));
    public static VarHandle __fpu_dp$VH() {
        return __darwin_x86_avx512_state64.__fpu_dp$VH;
    }
    public static int __fpu_dp$get(MemorySegment seg) {
        return (int)__darwin_x86_avx512_state64.__fpu_dp$VH.get(seg);
    }
    public static void __fpu_dp$set( MemorySegment seg, int x) {
        __darwin_x86_avx512_state64.__fpu_dp$VH.set(seg, x);
    }
    public static int __fpu_dp$get(MemorySegment seg, long index) {
        return (int)__darwin_x86_avx512_state64.__fpu_dp$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __fpu_dp$set(MemorySegment seg, long index, int x) {
        __darwin_x86_avx512_state64.__fpu_dp$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle __fpu_ds$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("__fpu_ds"));
    public static VarHandle __fpu_ds$VH() {
        return __darwin_x86_avx512_state64.__fpu_ds$VH;
    }
    public static short __fpu_ds$get(MemorySegment seg) {
        return (short)__darwin_x86_avx512_state64.__fpu_ds$VH.get(seg);
    }
    public static void __fpu_ds$set( MemorySegment seg, short x) {
        __darwin_x86_avx512_state64.__fpu_ds$VH.set(seg, x);
    }
    public static short __fpu_ds$get(MemorySegment seg, long index) {
        return (short)__darwin_x86_avx512_state64.__fpu_ds$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __fpu_ds$set(MemorySegment seg, long index, short x) {
        __darwin_x86_avx512_state64.__fpu_ds$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle __fpu_rsrv3$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("__fpu_rsrv3"));
    public static VarHandle __fpu_rsrv3$VH() {
        return __darwin_x86_avx512_state64.__fpu_rsrv3$VH;
    }
    public static short __fpu_rsrv3$get(MemorySegment seg) {
        return (short)__darwin_x86_avx512_state64.__fpu_rsrv3$VH.get(seg);
    }
    public static void __fpu_rsrv3$set( MemorySegment seg, short x) {
        __darwin_x86_avx512_state64.__fpu_rsrv3$VH.set(seg, x);
    }
    public static short __fpu_rsrv3$get(MemorySegment seg, long index) {
        return (short)__darwin_x86_avx512_state64.__fpu_rsrv3$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __fpu_rsrv3$set(MemorySegment seg, long index, short x) {
        __darwin_x86_avx512_state64.__fpu_rsrv3$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle __fpu_mxcsr$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("__fpu_mxcsr"));
    public static VarHandle __fpu_mxcsr$VH() {
        return __darwin_x86_avx512_state64.__fpu_mxcsr$VH;
    }
    public static int __fpu_mxcsr$get(MemorySegment seg) {
        return (int)__darwin_x86_avx512_state64.__fpu_mxcsr$VH.get(seg);
    }
    public static void __fpu_mxcsr$set( MemorySegment seg, int x) {
        __darwin_x86_avx512_state64.__fpu_mxcsr$VH.set(seg, x);
    }
    public static int __fpu_mxcsr$get(MemorySegment seg, long index) {
        return (int)__darwin_x86_avx512_state64.__fpu_mxcsr$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __fpu_mxcsr$set(MemorySegment seg, long index, int x) {
        __darwin_x86_avx512_state64.__fpu_mxcsr$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle __fpu_mxcsrmask$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("__fpu_mxcsrmask"));
    public static VarHandle __fpu_mxcsrmask$VH() {
        return __darwin_x86_avx512_state64.__fpu_mxcsrmask$VH;
    }
    public static int __fpu_mxcsrmask$get(MemorySegment seg) {
        return (int)__darwin_x86_avx512_state64.__fpu_mxcsrmask$VH.get(seg);
    }
    public static void __fpu_mxcsrmask$set( MemorySegment seg, int x) {
        __darwin_x86_avx512_state64.__fpu_mxcsrmask$VH.set(seg, x);
    }
    public static int __fpu_mxcsrmask$get(MemorySegment seg, long index) {
        return (int)__darwin_x86_avx512_state64.__fpu_mxcsrmask$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __fpu_mxcsrmask$set(MemorySegment seg, long index, int x) {
        __darwin_x86_avx512_state64.__fpu_mxcsrmask$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment __fpu_stmm0$slice(MemorySegment seg) {
        return seg.asSlice(40, 16);
    }
    public static MemorySegment __fpu_stmm1$slice(MemorySegment seg) {
        return seg.asSlice(56, 16);
    }
    public static MemorySegment __fpu_stmm2$slice(MemorySegment seg) {
        return seg.asSlice(72, 16);
    }
    public static MemorySegment __fpu_stmm3$slice(MemorySegment seg) {
        return seg.asSlice(88, 16);
    }
    public static MemorySegment __fpu_stmm4$slice(MemorySegment seg) {
        return seg.asSlice(104, 16);
    }
    public static MemorySegment __fpu_stmm5$slice(MemorySegment seg) {
        return seg.asSlice(120, 16);
    }
    public static MemorySegment __fpu_stmm6$slice(MemorySegment seg) {
        return seg.asSlice(136, 16);
    }
    public static MemorySegment __fpu_stmm7$slice(MemorySegment seg) {
        return seg.asSlice(152, 16);
    }
    public static MemorySegment __fpu_xmm0$slice(MemorySegment seg) {
        return seg.asSlice(168, 16);
    }
    public static MemorySegment __fpu_xmm1$slice(MemorySegment seg) {
        return seg.asSlice(184, 16);
    }
    public static MemorySegment __fpu_xmm2$slice(MemorySegment seg) {
        return seg.asSlice(200, 16);
    }
    public static MemorySegment __fpu_xmm3$slice(MemorySegment seg) {
        return seg.asSlice(216, 16);
    }
    public static MemorySegment __fpu_xmm4$slice(MemorySegment seg) {
        return seg.asSlice(232, 16);
    }
    public static MemorySegment __fpu_xmm5$slice(MemorySegment seg) {
        return seg.asSlice(248, 16);
    }
    public static MemorySegment __fpu_xmm6$slice(MemorySegment seg) {
        return seg.asSlice(264, 16);
    }
    public static MemorySegment __fpu_xmm7$slice(MemorySegment seg) {
        return seg.asSlice(280, 16);
    }
    public static MemorySegment __fpu_xmm8$slice(MemorySegment seg) {
        return seg.asSlice(296, 16);
    }
    public static MemorySegment __fpu_xmm9$slice(MemorySegment seg) {
        return seg.asSlice(312, 16);
    }
    public static MemorySegment __fpu_xmm10$slice(MemorySegment seg) {
        return seg.asSlice(328, 16);
    }
    public static MemorySegment __fpu_xmm11$slice(MemorySegment seg) {
        return seg.asSlice(344, 16);
    }
    public static MemorySegment __fpu_xmm12$slice(MemorySegment seg) {
        return seg.asSlice(360, 16);
    }
    public static MemorySegment __fpu_xmm13$slice(MemorySegment seg) {
        return seg.asSlice(376, 16);
    }
    public static MemorySegment __fpu_xmm14$slice(MemorySegment seg) {
        return seg.asSlice(392, 16);
    }
    public static MemorySegment __fpu_xmm15$slice(MemorySegment seg) {
        return seg.asSlice(408, 16);
    }
    public static MemorySegment __fpu_rsrv4$slice(MemorySegment seg) {
        return seg.asSlice(424, 96);
    }
    static final VarHandle __fpu_reserved1$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("__fpu_reserved1"));
    public static VarHandle __fpu_reserved1$VH() {
        return __darwin_x86_avx512_state64.__fpu_reserved1$VH;
    }
    public static int __fpu_reserved1$get(MemorySegment seg) {
        return (int)__darwin_x86_avx512_state64.__fpu_reserved1$VH.get(seg);
    }
    public static void __fpu_reserved1$set( MemorySegment seg, int x) {
        __darwin_x86_avx512_state64.__fpu_reserved1$VH.set(seg, x);
    }
    public static int __fpu_reserved1$get(MemorySegment seg, long index) {
        return (int)__darwin_x86_avx512_state64.__fpu_reserved1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void __fpu_reserved1$set(MemorySegment seg, long index, int x) {
        __darwin_x86_avx512_state64.__fpu_reserved1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment __avx_reserved1$slice(MemorySegment seg) {
        return seg.asSlice(524, 64);
    }
    public static MemorySegment __fpu_ymmh0$slice(MemorySegment seg) {
        return seg.asSlice(588, 16);
    }
    public static MemorySegment __fpu_ymmh1$slice(MemorySegment seg) {
        return seg.asSlice(604, 16);
    }
    public static MemorySegment __fpu_ymmh2$slice(MemorySegment seg) {
        return seg.asSlice(620, 16);
    }
    public static MemorySegment __fpu_ymmh3$slice(MemorySegment seg) {
        return seg.asSlice(636, 16);
    }
    public static MemorySegment __fpu_ymmh4$slice(MemorySegment seg) {
        return seg.asSlice(652, 16);
    }
    public static MemorySegment __fpu_ymmh5$slice(MemorySegment seg) {
        return seg.asSlice(668, 16);
    }
    public static MemorySegment __fpu_ymmh6$slice(MemorySegment seg) {
        return seg.asSlice(684, 16);
    }
    public static MemorySegment __fpu_ymmh7$slice(MemorySegment seg) {
        return seg.asSlice(700, 16);
    }
    public static MemorySegment __fpu_ymmh8$slice(MemorySegment seg) {
        return seg.asSlice(716, 16);
    }
    public static MemorySegment __fpu_ymmh9$slice(MemorySegment seg) {
        return seg.asSlice(732, 16);
    }
    public static MemorySegment __fpu_ymmh10$slice(MemorySegment seg) {
        return seg.asSlice(748, 16);
    }
    public static MemorySegment __fpu_ymmh11$slice(MemorySegment seg) {
        return seg.asSlice(764, 16);
    }
    public static MemorySegment __fpu_ymmh12$slice(MemorySegment seg) {
        return seg.asSlice(780, 16);
    }
    public static MemorySegment __fpu_ymmh13$slice(MemorySegment seg) {
        return seg.asSlice(796, 16);
    }
    public static MemorySegment __fpu_ymmh14$slice(MemorySegment seg) {
        return seg.asSlice(812, 16);
    }
    public static MemorySegment __fpu_ymmh15$slice(MemorySegment seg) {
        return seg.asSlice(828, 16);
    }
    public static MemorySegment __fpu_k0$slice(MemorySegment seg) {
        return seg.asSlice(844, 8);
    }
    public static MemorySegment __fpu_k1$slice(MemorySegment seg) {
        return seg.asSlice(852, 8);
    }
    public static MemorySegment __fpu_k2$slice(MemorySegment seg) {
        return seg.asSlice(860, 8);
    }
    public static MemorySegment __fpu_k3$slice(MemorySegment seg) {
        return seg.asSlice(868, 8);
    }
    public static MemorySegment __fpu_k4$slice(MemorySegment seg) {
        return seg.asSlice(876, 8);
    }
    public static MemorySegment __fpu_k5$slice(MemorySegment seg) {
        return seg.asSlice(884, 8);
    }
    public static MemorySegment __fpu_k6$slice(MemorySegment seg) {
        return seg.asSlice(892, 8);
    }
    public static MemorySegment __fpu_k7$slice(MemorySegment seg) {
        return seg.asSlice(900, 8);
    }
    public static MemorySegment __fpu_zmmh0$slice(MemorySegment seg) {
        return seg.asSlice(908, 32);
    }
    public static MemorySegment __fpu_zmmh1$slice(MemorySegment seg) {
        return seg.asSlice(940, 32);
    }
    public static MemorySegment __fpu_zmmh2$slice(MemorySegment seg) {
        return seg.asSlice(972, 32);
    }
    public static MemorySegment __fpu_zmmh3$slice(MemorySegment seg) {
        return seg.asSlice(1004, 32);
    }
    public static MemorySegment __fpu_zmmh4$slice(MemorySegment seg) {
        return seg.asSlice(1036, 32);
    }
    public static MemorySegment __fpu_zmmh5$slice(MemorySegment seg) {
        return seg.asSlice(1068, 32);
    }
    public static MemorySegment __fpu_zmmh6$slice(MemorySegment seg) {
        return seg.asSlice(1100, 32);
    }
    public static MemorySegment __fpu_zmmh7$slice(MemorySegment seg) {
        return seg.asSlice(1132, 32);
    }
    public static MemorySegment __fpu_zmmh8$slice(MemorySegment seg) {
        return seg.asSlice(1164, 32);
    }
    public static MemorySegment __fpu_zmmh9$slice(MemorySegment seg) {
        return seg.asSlice(1196, 32);
    }
    public static MemorySegment __fpu_zmmh10$slice(MemorySegment seg) {
        return seg.asSlice(1228, 32);
    }
    public static MemorySegment __fpu_zmmh11$slice(MemorySegment seg) {
        return seg.asSlice(1260, 32);
    }
    public static MemorySegment __fpu_zmmh12$slice(MemorySegment seg) {
        return seg.asSlice(1292, 32);
    }
    public static MemorySegment __fpu_zmmh13$slice(MemorySegment seg) {
        return seg.asSlice(1324, 32);
    }
    public static MemorySegment __fpu_zmmh14$slice(MemorySegment seg) {
        return seg.asSlice(1356, 32);
    }
    public static MemorySegment __fpu_zmmh15$slice(MemorySegment seg) {
        return seg.asSlice(1388, 32);
    }
    public static MemorySegment __fpu_zmm16$slice(MemorySegment seg) {
        return seg.asSlice(1420, 64);
    }
    public static MemorySegment __fpu_zmm17$slice(MemorySegment seg) {
        return seg.asSlice(1484, 64);
    }
    public static MemorySegment __fpu_zmm18$slice(MemorySegment seg) {
        return seg.asSlice(1548, 64);
    }
    public static MemorySegment __fpu_zmm19$slice(MemorySegment seg) {
        return seg.asSlice(1612, 64);
    }
    public static MemorySegment __fpu_zmm20$slice(MemorySegment seg) {
        return seg.asSlice(1676, 64);
    }
    public static MemorySegment __fpu_zmm21$slice(MemorySegment seg) {
        return seg.asSlice(1740, 64);
    }
    public static MemorySegment __fpu_zmm22$slice(MemorySegment seg) {
        return seg.asSlice(1804, 64);
    }
    public static MemorySegment __fpu_zmm23$slice(MemorySegment seg) {
        return seg.asSlice(1868, 64);
    }
    public static MemorySegment __fpu_zmm24$slice(MemorySegment seg) {
        return seg.asSlice(1932, 64);
    }
    public static MemorySegment __fpu_zmm25$slice(MemorySegment seg) {
        return seg.asSlice(1996, 64);
    }
    public static MemorySegment __fpu_zmm26$slice(MemorySegment seg) {
        return seg.asSlice(2060, 64);
    }
    public static MemorySegment __fpu_zmm27$slice(MemorySegment seg) {
        return seg.asSlice(2124, 64);
    }
    public static MemorySegment __fpu_zmm28$slice(MemorySegment seg) {
        return seg.asSlice(2188, 64);
    }
    public static MemorySegment __fpu_zmm29$slice(MemorySegment seg) {
        return seg.asSlice(2252, 64);
    }
    public static MemorySegment __fpu_zmm30$slice(MemorySegment seg) {
        return seg.asSlice(2316, 64);
    }
    public static MemorySegment __fpu_zmm31$slice(MemorySegment seg) {
        return seg.asSlice(2380, 64);
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


