// Generated by jextract

package org.libspng;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class __darwin_mcontext_avx64_full {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            C_SHORT.withName("__trapno"),
            C_SHORT.withName("__cpu"),
            C_INT.withName("__err"),
            C_LONG_LONG.withName("__faultvaddr")
        ).withName("__es"),
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                C_LONG_LONG.withName("__rax"),
                C_LONG_LONG.withName("__rbx"),
                C_LONG_LONG.withName("__rcx"),
                C_LONG_LONG.withName("__rdx"),
                C_LONG_LONG.withName("__rdi"),
                C_LONG_LONG.withName("__rsi"),
                C_LONG_LONG.withName("__rbp"),
                C_LONG_LONG.withName("__rsp"),
                C_LONG_LONG.withName("__r8"),
                C_LONG_LONG.withName("__r9"),
                C_LONG_LONG.withName("__r10"),
                C_LONG_LONG.withName("__r11"),
                C_LONG_LONG.withName("__r12"),
                C_LONG_LONG.withName("__r13"),
                C_LONG_LONG.withName("__r14"),
                C_LONG_LONG.withName("__r15"),
                C_LONG_LONG.withName("__rip"),
                C_LONG_LONG.withName("__rflags"),
                C_LONG_LONG.withName("__cs"),
                C_LONG_LONG.withName("__fs"),
                C_LONG_LONG.withName("__gs")
            ).withName("__ss64"),
            C_LONG_LONG.withName("__ds"),
            C_LONG_LONG.withName("__es"),
            C_LONG_LONG.withName("__ss"),
            C_LONG_LONG.withName("__gsbase")
        ).withName("__ss"),
        MemoryLayout.structLayout(
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
            ).withName("__fpu_ymmh15")
        ).withName("__fs"),
        MemoryLayout.paddingLayout(32)
    ).withName("__darwin_mcontext_avx64_full");
    public static MemoryLayout $LAYOUT() {
        return __darwin_mcontext_avx64_full.$struct$LAYOUT;
    }
    public static MemorySegment __es$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    public static MemorySegment __ss$slice(MemorySegment seg) {
        return seg.asSlice(16, 200);
    }
    public static MemorySegment __fs$slice(MemorySegment seg) {
        return seg.asSlice(216, 844);
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


