// Generated by jextract

package org.libspng;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class rusage_info_v4 {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(16, C_CHAR).withName("ri_uuid"),
        C_LONG_LONG.withName("ri_user_time"),
        C_LONG_LONG.withName("ri_system_time"),
        C_LONG_LONG.withName("ri_pkg_idle_wkups"),
        C_LONG_LONG.withName("ri_interrupt_wkups"),
        C_LONG_LONG.withName("ri_pageins"),
        C_LONG_LONG.withName("ri_wired_size"),
        C_LONG_LONG.withName("ri_resident_size"),
        C_LONG_LONG.withName("ri_phys_footprint"),
        C_LONG_LONG.withName("ri_proc_start_abstime"),
        C_LONG_LONG.withName("ri_proc_exit_abstime"),
        C_LONG_LONG.withName("ri_child_user_time"),
        C_LONG_LONG.withName("ri_child_system_time"),
        C_LONG_LONG.withName("ri_child_pkg_idle_wkups"),
        C_LONG_LONG.withName("ri_child_interrupt_wkups"),
        C_LONG_LONG.withName("ri_child_pageins"),
        C_LONG_LONG.withName("ri_child_elapsed_abstime"),
        C_LONG_LONG.withName("ri_diskio_bytesread"),
        C_LONG_LONG.withName("ri_diskio_byteswritten"),
        C_LONG_LONG.withName("ri_cpu_time_qos_default"),
        C_LONG_LONG.withName("ri_cpu_time_qos_maintenance"),
        C_LONG_LONG.withName("ri_cpu_time_qos_background"),
        C_LONG_LONG.withName("ri_cpu_time_qos_utility"),
        C_LONG_LONG.withName("ri_cpu_time_qos_legacy"),
        C_LONG_LONG.withName("ri_cpu_time_qos_user_initiated"),
        C_LONG_LONG.withName("ri_cpu_time_qos_user_interactive"),
        C_LONG_LONG.withName("ri_billed_system_time"),
        C_LONG_LONG.withName("ri_serviced_system_time"),
        C_LONG_LONG.withName("ri_logical_writes"),
        C_LONG_LONG.withName("ri_lifetime_max_phys_footprint"),
        C_LONG_LONG.withName("ri_instructions"),
        C_LONG_LONG.withName("ri_cycles"),
        C_LONG_LONG.withName("ri_billed_energy"),
        C_LONG_LONG.withName("ri_serviced_energy"),
        C_LONG_LONG.withName("ri_interval_max_phys_footprint"),
        C_LONG_LONG.withName("ri_runnable_time")
    ).withName("rusage_info_v4");
    public static MemoryLayout $LAYOUT() {
        return rusage_info_v4.$struct$LAYOUT;
    }
    public static MemorySegment ri_uuid$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    static final VarHandle ri_user_time$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("ri_user_time"));
    public static VarHandle ri_user_time$VH() {
        return rusage_info_v4.ri_user_time$VH;
    }
    public static long ri_user_time$get(MemorySegment seg) {
        return (long)rusage_info_v4.ri_user_time$VH.get(seg);
    }
    public static void ri_user_time$set( MemorySegment seg, long x) {
        rusage_info_v4.ri_user_time$VH.set(seg, x);
    }
    public static long ri_user_time$get(MemorySegment seg, long index) {
        return (long)rusage_info_v4.ri_user_time$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ri_user_time$set(MemorySegment seg, long index, long x) {
        rusage_info_v4.ri_user_time$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ri_system_time$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("ri_system_time"));
    public static VarHandle ri_system_time$VH() {
        return rusage_info_v4.ri_system_time$VH;
    }
    public static long ri_system_time$get(MemorySegment seg) {
        return (long)rusage_info_v4.ri_system_time$VH.get(seg);
    }
    public static void ri_system_time$set( MemorySegment seg, long x) {
        rusage_info_v4.ri_system_time$VH.set(seg, x);
    }
    public static long ri_system_time$get(MemorySegment seg, long index) {
        return (long)rusage_info_v4.ri_system_time$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ri_system_time$set(MemorySegment seg, long index, long x) {
        rusage_info_v4.ri_system_time$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ri_pkg_idle_wkups$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("ri_pkg_idle_wkups"));
    public static VarHandle ri_pkg_idle_wkups$VH() {
        return rusage_info_v4.ri_pkg_idle_wkups$VH;
    }
    public static long ri_pkg_idle_wkups$get(MemorySegment seg) {
        return (long)rusage_info_v4.ri_pkg_idle_wkups$VH.get(seg);
    }
    public static void ri_pkg_idle_wkups$set( MemorySegment seg, long x) {
        rusage_info_v4.ri_pkg_idle_wkups$VH.set(seg, x);
    }
    public static long ri_pkg_idle_wkups$get(MemorySegment seg, long index) {
        return (long)rusage_info_v4.ri_pkg_idle_wkups$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ri_pkg_idle_wkups$set(MemorySegment seg, long index, long x) {
        rusage_info_v4.ri_pkg_idle_wkups$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ri_interrupt_wkups$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("ri_interrupt_wkups"));
    public static VarHandle ri_interrupt_wkups$VH() {
        return rusage_info_v4.ri_interrupt_wkups$VH;
    }
    public static long ri_interrupt_wkups$get(MemorySegment seg) {
        return (long)rusage_info_v4.ri_interrupt_wkups$VH.get(seg);
    }
    public static void ri_interrupt_wkups$set( MemorySegment seg, long x) {
        rusage_info_v4.ri_interrupt_wkups$VH.set(seg, x);
    }
    public static long ri_interrupt_wkups$get(MemorySegment seg, long index) {
        return (long)rusage_info_v4.ri_interrupt_wkups$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ri_interrupt_wkups$set(MemorySegment seg, long index, long x) {
        rusage_info_v4.ri_interrupt_wkups$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ri_pageins$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("ri_pageins"));
    public static VarHandle ri_pageins$VH() {
        return rusage_info_v4.ri_pageins$VH;
    }
    public static long ri_pageins$get(MemorySegment seg) {
        return (long)rusage_info_v4.ri_pageins$VH.get(seg);
    }
    public static void ri_pageins$set( MemorySegment seg, long x) {
        rusage_info_v4.ri_pageins$VH.set(seg, x);
    }
    public static long ri_pageins$get(MemorySegment seg, long index) {
        return (long)rusage_info_v4.ri_pageins$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ri_pageins$set(MemorySegment seg, long index, long x) {
        rusage_info_v4.ri_pageins$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ri_wired_size$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("ri_wired_size"));
    public static VarHandle ri_wired_size$VH() {
        return rusage_info_v4.ri_wired_size$VH;
    }
    public static long ri_wired_size$get(MemorySegment seg) {
        return (long)rusage_info_v4.ri_wired_size$VH.get(seg);
    }
    public static void ri_wired_size$set( MemorySegment seg, long x) {
        rusage_info_v4.ri_wired_size$VH.set(seg, x);
    }
    public static long ri_wired_size$get(MemorySegment seg, long index) {
        return (long)rusage_info_v4.ri_wired_size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ri_wired_size$set(MemorySegment seg, long index, long x) {
        rusage_info_v4.ri_wired_size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ri_resident_size$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("ri_resident_size"));
    public static VarHandle ri_resident_size$VH() {
        return rusage_info_v4.ri_resident_size$VH;
    }
    public static long ri_resident_size$get(MemorySegment seg) {
        return (long)rusage_info_v4.ri_resident_size$VH.get(seg);
    }
    public static void ri_resident_size$set( MemorySegment seg, long x) {
        rusage_info_v4.ri_resident_size$VH.set(seg, x);
    }
    public static long ri_resident_size$get(MemorySegment seg, long index) {
        return (long)rusage_info_v4.ri_resident_size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ri_resident_size$set(MemorySegment seg, long index, long x) {
        rusage_info_v4.ri_resident_size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ri_phys_footprint$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("ri_phys_footprint"));
    public static VarHandle ri_phys_footprint$VH() {
        return rusage_info_v4.ri_phys_footprint$VH;
    }
    public static long ri_phys_footprint$get(MemorySegment seg) {
        return (long)rusage_info_v4.ri_phys_footprint$VH.get(seg);
    }
    public static void ri_phys_footprint$set( MemorySegment seg, long x) {
        rusage_info_v4.ri_phys_footprint$VH.set(seg, x);
    }
    public static long ri_phys_footprint$get(MemorySegment seg, long index) {
        return (long)rusage_info_v4.ri_phys_footprint$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ri_phys_footprint$set(MemorySegment seg, long index, long x) {
        rusage_info_v4.ri_phys_footprint$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ri_proc_start_abstime$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("ri_proc_start_abstime"));
    public static VarHandle ri_proc_start_abstime$VH() {
        return rusage_info_v4.ri_proc_start_abstime$VH;
    }
    public static long ri_proc_start_abstime$get(MemorySegment seg) {
        return (long)rusage_info_v4.ri_proc_start_abstime$VH.get(seg);
    }
    public static void ri_proc_start_abstime$set( MemorySegment seg, long x) {
        rusage_info_v4.ri_proc_start_abstime$VH.set(seg, x);
    }
    public static long ri_proc_start_abstime$get(MemorySegment seg, long index) {
        return (long)rusage_info_v4.ri_proc_start_abstime$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ri_proc_start_abstime$set(MemorySegment seg, long index, long x) {
        rusage_info_v4.ri_proc_start_abstime$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ri_proc_exit_abstime$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("ri_proc_exit_abstime"));
    public static VarHandle ri_proc_exit_abstime$VH() {
        return rusage_info_v4.ri_proc_exit_abstime$VH;
    }
    public static long ri_proc_exit_abstime$get(MemorySegment seg) {
        return (long)rusage_info_v4.ri_proc_exit_abstime$VH.get(seg);
    }
    public static void ri_proc_exit_abstime$set( MemorySegment seg, long x) {
        rusage_info_v4.ri_proc_exit_abstime$VH.set(seg, x);
    }
    public static long ri_proc_exit_abstime$get(MemorySegment seg, long index) {
        return (long)rusage_info_v4.ri_proc_exit_abstime$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ri_proc_exit_abstime$set(MemorySegment seg, long index, long x) {
        rusage_info_v4.ri_proc_exit_abstime$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ri_child_user_time$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("ri_child_user_time"));
    public static VarHandle ri_child_user_time$VH() {
        return rusage_info_v4.ri_child_user_time$VH;
    }
    public static long ri_child_user_time$get(MemorySegment seg) {
        return (long)rusage_info_v4.ri_child_user_time$VH.get(seg);
    }
    public static void ri_child_user_time$set( MemorySegment seg, long x) {
        rusage_info_v4.ri_child_user_time$VH.set(seg, x);
    }
    public static long ri_child_user_time$get(MemorySegment seg, long index) {
        return (long)rusage_info_v4.ri_child_user_time$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ri_child_user_time$set(MemorySegment seg, long index, long x) {
        rusage_info_v4.ri_child_user_time$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ri_child_system_time$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("ri_child_system_time"));
    public static VarHandle ri_child_system_time$VH() {
        return rusage_info_v4.ri_child_system_time$VH;
    }
    public static long ri_child_system_time$get(MemorySegment seg) {
        return (long)rusage_info_v4.ri_child_system_time$VH.get(seg);
    }
    public static void ri_child_system_time$set( MemorySegment seg, long x) {
        rusage_info_v4.ri_child_system_time$VH.set(seg, x);
    }
    public static long ri_child_system_time$get(MemorySegment seg, long index) {
        return (long)rusage_info_v4.ri_child_system_time$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ri_child_system_time$set(MemorySegment seg, long index, long x) {
        rusage_info_v4.ri_child_system_time$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ri_child_pkg_idle_wkups$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("ri_child_pkg_idle_wkups"));
    public static VarHandle ri_child_pkg_idle_wkups$VH() {
        return rusage_info_v4.ri_child_pkg_idle_wkups$VH;
    }
    public static long ri_child_pkg_idle_wkups$get(MemorySegment seg) {
        return (long)rusage_info_v4.ri_child_pkg_idle_wkups$VH.get(seg);
    }
    public static void ri_child_pkg_idle_wkups$set( MemorySegment seg, long x) {
        rusage_info_v4.ri_child_pkg_idle_wkups$VH.set(seg, x);
    }
    public static long ri_child_pkg_idle_wkups$get(MemorySegment seg, long index) {
        return (long)rusage_info_v4.ri_child_pkg_idle_wkups$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ri_child_pkg_idle_wkups$set(MemorySegment seg, long index, long x) {
        rusage_info_v4.ri_child_pkg_idle_wkups$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ri_child_interrupt_wkups$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("ri_child_interrupt_wkups"));
    public static VarHandle ri_child_interrupt_wkups$VH() {
        return rusage_info_v4.ri_child_interrupt_wkups$VH;
    }
    public static long ri_child_interrupt_wkups$get(MemorySegment seg) {
        return (long)rusage_info_v4.ri_child_interrupt_wkups$VH.get(seg);
    }
    public static void ri_child_interrupt_wkups$set( MemorySegment seg, long x) {
        rusage_info_v4.ri_child_interrupt_wkups$VH.set(seg, x);
    }
    public static long ri_child_interrupt_wkups$get(MemorySegment seg, long index) {
        return (long)rusage_info_v4.ri_child_interrupt_wkups$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ri_child_interrupt_wkups$set(MemorySegment seg, long index, long x) {
        rusage_info_v4.ri_child_interrupt_wkups$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ri_child_pageins$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("ri_child_pageins"));
    public static VarHandle ri_child_pageins$VH() {
        return rusage_info_v4.ri_child_pageins$VH;
    }
    public static long ri_child_pageins$get(MemorySegment seg) {
        return (long)rusage_info_v4.ri_child_pageins$VH.get(seg);
    }
    public static void ri_child_pageins$set( MemorySegment seg, long x) {
        rusage_info_v4.ri_child_pageins$VH.set(seg, x);
    }
    public static long ri_child_pageins$get(MemorySegment seg, long index) {
        return (long)rusage_info_v4.ri_child_pageins$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ri_child_pageins$set(MemorySegment seg, long index, long x) {
        rusage_info_v4.ri_child_pageins$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ri_child_elapsed_abstime$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("ri_child_elapsed_abstime"));
    public static VarHandle ri_child_elapsed_abstime$VH() {
        return rusage_info_v4.ri_child_elapsed_abstime$VH;
    }
    public static long ri_child_elapsed_abstime$get(MemorySegment seg) {
        return (long)rusage_info_v4.ri_child_elapsed_abstime$VH.get(seg);
    }
    public static void ri_child_elapsed_abstime$set( MemorySegment seg, long x) {
        rusage_info_v4.ri_child_elapsed_abstime$VH.set(seg, x);
    }
    public static long ri_child_elapsed_abstime$get(MemorySegment seg, long index) {
        return (long)rusage_info_v4.ri_child_elapsed_abstime$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ri_child_elapsed_abstime$set(MemorySegment seg, long index, long x) {
        rusage_info_v4.ri_child_elapsed_abstime$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ri_diskio_bytesread$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("ri_diskio_bytesread"));
    public static VarHandle ri_diskio_bytesread$VH() {
        return rusage_info_v4.ri_diskio_bytesread$VH;
    }
    public static long ri_diskio_bytesread$get(MemorySegment seg) {
        return (long)rusage_info_v4.ri_diskio_bytesread$VH.get(seg);
    }
    public static void ri_diskio_bytesread$set( MemorySegment seg, long x) {
        rusage_info_v4.ri_diskio_bytesread$VH.set(seg, x);
    }
    public static long ri_diskio_bytesread$get(MemorySegment seg, long index) {
        return (long)rusage_info_v4.ri_diskio_bytesread$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ri_diskio_bytesread$set(MemorySegment seg, long index, long x) {
        rusage_info_v4.ri_diskio_bytesread$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ri_diskio_byteswritten$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("ri_diskio_byteswritten"));
    public static VarHandle ri_diskio_byteswritten$VH() {
        return rusage_info_v4.ri_diskio_byteswritten$VH;
    }
    public static long ri_diskio_byteswritten$get(MemorySegment seg) {
        return (long)rusage_info_v4.ri_diskio_byteswritten$VH.get(seg);
    }
    public static void ri_diskio_byteswritten$set( MemorySegment seg, long x) {
        rusage_info_v4.ri_diskio_byteswritten$VH.set(seg, x);
    }
    public static long ri_diskio_byteswritten$get(MemorySegment seg, long index) {
        return (long)rusage_info_v4.ri_diskio_byteswritten$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ri_diskio_byteswritten$set(MemorySegment seg, long index, long x) {
        rusage_info_v4.ri_diskio_byteswritten$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ri_cpu_time_qos_default$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("ri_cpu_time_qos_default"));
    public static VarHandle ri_cpu_time_qos_default$VH() {
        return rusage_info_v4.ri_cpu_time_qos_default$VH;
    }
    public static long ri_cpu_time_qos_default$get(MemorySegment seg) {
        return (long)rusage_info_v4.ri_cpu_time_qos_default$VH.get(seg);
    }
    public static void ri_cpu_time_qos_default$set( MemorySegment seg, long x) {
        rusage_info_v4.ri_cpu_time_qos_default$VH.set(seg, x);
    }
    public static long ri_cpu_time_qos_default$get(MemorySegment seg, long index) {
        return (long)rusage_info_v4.ri_cpu_time_qos_default$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ri_cpu_time_qos_default$set(MemorySegment seg, long index, long x) {
        rusage_info_v4.ri_cpu_time_qos_default$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ri_cpu_time_qos_maintenance$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("ri_cpu_time_qos_maintenance"));
    public static VarHandle ri_cpu_time_qos_maintenance$VH() {
        return rusage_info_v4.ri_cpu_time_qos_maintenance$VH;
    }
    public static long ri_cpu_time_qos_maintenance$get(MemorySegment seg) {
        return (long)rusage_info_v4.ri_cpu_time_qos_maintenance$VH.get(seg);
    }
    public static void ri_cpu_time_qos_maintenance$set( MemorySegment seg, long x) {
        rusage_info_v4.ri_cpu_time_qos_maintenance$VH.set(seg, x);
    }
    public static long ri_cpu_time_qos_maintenance$get(MemorySegment seg, long index) {
        return (long)rusage_info_v4.ri_cpu_time_qos_maintenance$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ri_cpu_time_qos_maintenance$set(MemorySegment seg, long index, long x) {
        rusage_info_v4.ri_cpu_time_qos_maintenance$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ri_cpu_time_qos_background$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("ri_cpu_time_qos_background"));
    public static VarHandle ri_cpu_time_qos_background$VH() {
        return rusage_info_v4.ri_cpu_time_qos_background$VH;
    }
    public static long ri_cpu_time_qos_background$get(MemorySegment seg) {
        return (long)rusage_info_v4.ri_cpu_time_qos_background$VH.get(seg);
    }
    public static void ri_cpu_time_qos_background$set( MemorySegment seg, long x) {
        rusage_info_v4.ri_cpu_time_qos_background$VH.set(seg, x);
    }
    public static long ri_cpu_time_qos_background$get(MemorySegment seg, long index) {
        return (long)rusage_info_v4.ri_cpu_time_qos_background$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ri_cpu_time_qos_background$set(MemorySegment seg, long index, long x) {
        rusage_info_v4.ri_cpu_time_qos_background$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ri_cpu_time_qos_utility$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("ri_cpu_time_qos_utility"));
    public static VarHandle ri_cpu_time_qos_utility$VH() {
        return rusage_info_v4.ri_cpu_time_qos_utility$VH;
    }
    public static long ri_cpu_time_qos_utility$get(MemorySegment seg) {
        return (long)rusage_info_v4.ri_cpu_time_qos_utility$VH.get(seg);
    }
    public static void ri_cpu_time_qos_utility$set( MemorySegment seg, long x) {
        rusage_info_v4.ri_cpu_time_qos_utility$VH.set(seg, x);
    }
    public static long ri_cpu_time_qos_utility$get(MemorySegment seg, long index) {
        return (long)rusage_info_v4.ri_cpu_time_qos_utility$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ri_cpu_time_qos_utility$set(MemorySegment seg, long index, long x) {
        rusage_info_v4.ri_cpu_time_qos_utility$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ri_cpu_time_qos_legacy$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("ri_cpu_time_qos_legacy"));
    public static VarHandle ri_cpu_time_qos_legacy$VH() {
        return rusage_info_v4.ri_cpu_time_qos_legacy$VH;
    }
    public static long ri_cpu_time_qos_legacy$get(MemorySegment seg) {
        return (long)rusage_info_v4.ri_cpu_time_qos_legacy$VH.get(seg);
    }
    public static void ri_cpu_time_qos_legacy$set( MemorySegment seg, long x) {
        rusage_info_v4.ri_cpu_time_qos_legacy$VH.set(seg, x);
    }
    public static long ri_cpu_time_qos_legacy$get(MemorySegment seg, long index) {
        return (long)rusage_info_v4.ri_cpu_time_qos_legacy$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ri_cpu_time_qos_legacy$set(MemorySegment seg, long index, long x) {
        rusage_info_v4.ri_cpu_time_qos_legacy$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ri_cpu_time_qos_user_initiated$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("ri_cpu_time_qos_user_initiated"));
    public static VarHandle ri_cpu_time_qos_user_initiated$VH() {
        return rusage_info_v4.ri_cpu_time_qos_user_initiated$VH;
    }
    public static long ri_cpu_time_qos_user_initiated$get(MemorySegment seg) {
        return (long)rusage_info_v4.ri_cpu_time_qos_user_initiated$VH.get(seg);
    }
    public static void ri_cpu_time_qos_user_initiated$set( MemorySegment seg, long x) {
        rusage_info_v4.ri_cpu_time_qos_user_initiated$VH.set(seg, x);
    }
    public static long ri_cpu_time_qos_user_initiated$get(MemorySegment seg, long index) {
        return (long)rusage_info_v4.ri_cpu_time_qos_user_initiated$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ri_cpu_time_qos_user_initiated$set(MemorySegment seg, long index, long x) {
        rusage_info_v4.ri_cpu_time_qos_user_initiated$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ri_cpu_time_qos_user_interactive$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("ri_cpu_time_qos_user_interactive"));
    public static VarHandle ri_cpu_time_qos_user_interactive$VH() {
        return rusage_info_v4.ri_cpu_time_qos_user_interactive$VH;
    }
    public static long ri_cpu_time_qos_user_interactive$get(MemorySegment seg) {
        return (long)rusage_info_v4.ri_cpu_time_qos_user_interactive$VH.get(seg);
    }
    public static void ri_cpu_time_qos_user_interactive$set( MemorySegment seg, long x) {
        rusage_info_v4.ri_cpu_time_qos_user_interactive$VH.set(seg, x);
    }
    public static long ri_cpu_time_qos_user_interactive$get(MemorySegment seg, long index) {
        return (long)rusage_info_v4.ri_cpu_time_qos_user_interactive$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ri_cpu_time_qos_user_interactive$set(MemorySegment seg, long index, long x) {
        rusage_info_v4.ri_cpu_time_qos_user_interactive$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ri_billed_system_time$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("ri_billed_system_time"));
    public static VarHandle ri_billed_system_time$VH() {
        return rusage_info_v4.ri_billed_system_time$VH;
    }
    public static long ri_billed_system_time$get(MemorySegment seg) {
        return (long)rusage_info_v4.ri_billed_system_time$VH.get(seg);
    }
    public static void ri_billed_system_time$set( MemorySegment seg, long x) {
        rusage_info_v4.ri_billed_system_time$VH.set(seg, x);
    }
    public static long ri_billed_system_time$get(MemorySegment seg, long index) {
        return (long)rusage_info_v4.ri_billed_system_time$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ri_billed_system_time$set(MemorySegment seg, long index, long x) {
        rusage_info_v4.ri_billed_system_time$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ri_serviced_system_time$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("ri_serviced_system_time"));
    public static VarHandle ri_serviced_system_time$VH() {
        return rusage_info_v4.ri_serviced_system_time$VH;
    }
    public static long ri_serviced_system_time$get(MemorySegment seg) {
        return (long)rusage_info_v4.ri_serviced_system_time$VH.get(seg);
    }
    public static void ri_serviced_system_time$set( MemorySegment seg, long x) {
        rusage_info_v4.ri_serviced_system_time$VH.set(seg, x);
    }
    public static long ri_serviced_system_time$get(MemorySegment seg, long index) {
        return (long)rusage_info_v4.ri_serviced_system_time$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ri_serviced_system_time$set(MemorySegment seg, long index, long x) {
        rusage_info_v4.ri_serviced_system_time$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ri_logical_writes$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("ri_logical_writes"));
    public static VarHandle ri_logical_writes$VH() {
        return rusage_info_v4.ri_logical_writes$VH;
    }
    public static long ri_logical_writes$get(MemorySegment seg) {
        return (long)rusage_info_v4.ri_logical_writes$VH.get(seg);
    }
    public static void ri_logical_writes$set( MemorySegment seg, long x) {
        rusage_info_v4.ri_logical_writes$VH.set(seg, x);
    }
    public static long ri_logical_writes$get(MemorySegment seg, long index) {
        return (long)rusage_info_v4.ri_logical_writes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ri_logical_writes$set(MemorySegment seg, long index, long x) {
        rusage_info_v4.ri_logical_writes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ri_lifetime_max_phys_footprint$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("ri_lifetime_max_phys_footprint"));
    public static VarHandle ri_lifetime_max_phys_footprint$VH() {
        return rusage_info_v4.ri_lifetime_max_phys_footprint$VH;
    }
    public static long ri_lifetime_max_phys_footprint$get(MemorySegment seg) {
        return (long)rusage_info_v4.ri_lifetime_max_phys_footprint$VH.get(seg);
    }
    public static void ri_lifetime_max_phys_footprint$set( MemorySegment seg, long x) {
        rusage_info_v4.ri_lifetime_max_phys_footprint$VH.set(seg, x);
    }
    public static long ri_lifetime_max_phys_footprint$get(MemorySegment seg, long index) {
        return (long)rusage_info_v4.ri_lifetime_max_phys_footprint$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ri_lifetime_max_phys_footprint$set(MemorySegment seg, long index, long x) {
        rusage_info_v4.ri_lifetime_max_phys_footprint$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ri_instructions$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("ri_instructions"));
    public static VarHandle ri_instructions$VH() {
        return rusage_info_v4.ri_instructions$VH;
    }
    public static long ri_instructions$get(MemorySegment seg) {
        return (long)rusage_info_v4.ri_instructions$VH.get(seg);
    }
    public static void ri_instructions$set( MemorySegment seg, long x) {
        rusage_info_v4.ri_instructions$VH.set(seg, x);
    }
    public static long ri_instructions$get(MemorySegment seg, long index) {
        return (long)rusage_info_v4.ri_instructions$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ri_instructions$set(MemorySegment seg, long index, long x) {
        rusage_info_v4.ri_instructions$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ri_cycles$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("ri_cycles"));
    public static VarHandle ri_cycles$VH() {
        return rusage_info_v4.ri_cycles$VH;
    }
    public static long ri_cycles$get(MemorySegment seg) {
        return (long)rusage_info_v4.ri_cycles$VH.get(seg);
    }
    public static void ri_cycles$set( MemorySegment seg, long x) {
        rusage_info_v4.ri_cycles$VH.set(seg, x);
    }
    public static long ri_cycles$get(MemorySegment seg, long index) {
        return (long)rusage_info_v4.ri_cycles$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ri_cycles$set(MemorySegment seg, long index, long x) {
        rusage_info_v4.ri_cycles$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ri_billed_energy$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("ri_billed_energy"));
    public static VarHandle ri_billed_energy$VH() {
        return rusage_info_v4.ri_billed_energy$VH;
    }
    public static long ri_billed_energy$get(MemorySegment seg) {
        return (long)rusage_info_v4.ri_billed_energy$VH.get(seg);
    }
    public static void ri_billed_energy$set( MemorySegment seg, long x) {
        rusage_info_v4.ri_billed_energy$VH.set(seg, x);
    }
    public static long ri_billed_energy$get(MemorySegment seg, long index) {
        return (long)rusage_info_v4.ri_billed_energy$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ri_billed_energy$set(MemorySegment seg, long index, long x) {
        rusage_info_v4.ri_billed_energy$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ri_serviced_energy$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("ri_serviced_energy"));
    public static VarHandle ri_serviced_energy$VH() {
        return rusage_info_v4.ri_serviced_energy$VH;
    }
    public static long ri_serviced_energy$get(MemorySegment seg) {
        return (long)rusage_info_v4.ri_serviced_energy$VH.get(seg);
    }
    public static void ri_serviced_energy$set( MemorySegment seg, long x) {
        rusage_info_v4.ri_serviced_energy$VH.set(seg, x);
    }
    public static long ri_serviced_energy$get(MemorySegment seg, long index) {
        return (long)rusage_info_v4.ri_serviced_energy$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ri_serviced_energy$set(MemorySegment seg, long index, long x) {
        rusage_info_v4.ri_serviced_energy$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ri_interval_max_phys_footprint$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("ri_interval_max_phys_footprint"));
    public static VarHandle ri_interval_max_phys_footprint$VH() {
        return rusage_info_v4.ri_interval_max_phys_footprint$VH;
    }
    public static long ri_interval_max_phys_footprint$get(MemorySegment seg) {
        return (long)rusage_info_v4.ri_interval_max_phys_footprint$VH.get(seg);
    }
    public static void ri_interval_max_phys_footprint$set( MemorySegment seg, long x) {
        rusage_info_v4.ri_interval_max_phys_footprint$VH.set(seg, x);
    }
    public static long ri_interval_max_phys_footprint$get(MemorySegment seg, long index) {
        return (long)rusage_info_v4.ri_interval_max_phys_footprint$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ri_interval_max_phys_footprint$set(MemorySegment seg, long index, long x) {
        rusage_info_v4.ri_interval_max_phys_footprint$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ri_runnable_time$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("ri_runnable_time"));
    public static VarHandle ri_runnable_time$VH() {
        return rusage_info_v4.ri_runnable_time$VH;
    }
    public static long ri_runnable_time$get(MemorySegment seg) {
        return (long)rusage_info_v4.ri_runnable_time$VH.get(seg);
    }
    public static void ri_runnable_time$set( MemorySegment seg, long x) {
        rusage_info_v4.ri_runnable_time$VH.set(seg, x);
    }
    public static long ri_runnable_time$get(MemorySegment seg, long index) {
        return (long)rusage_info_v4.ri_runnable_time$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ri_runnable_time$set(MemorySegment seg, long index, long x) {
        rusage_info_v4.ri_runnable_time$VH.set(seg.asSlice(index*sizeof()), x);
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


