#include<stdio.h>
#include<unistd.h>
int main()
{
	printf("_POSIX_VERSION constant:%ld\n",_POSIX_VERSION);
	#ifdef _POSIX_ASYNCHROOUS_IO 
		printf("POSIX Asynchronous I/O supported\n");
	#endif
	
	#ifdef _POSIX_BARRIERS 
		printf("POSIX Barriers supported\n");
	#endif
	
	#ifdef _POSIX_CHOWN_RESTRICTED 
		printf("POSIX Chown Restricted supported\n");
	#endif
	
	#ifdef _POSIX_CLOCK_SElECTION 
		printf("POSIX Clock Seletion supported\n");
	#endif
	
	#ifdef _POSIX_CPUTIME 
		printf("POSIX CPU Time supported\n");
	#endif
	
	#ifdef _POSIX_FSYNC 
		printf("POSIX Fsync supported\n");
	#endif
	
	#ifdef _POSIX_IPV6 
		printf("POSIX IPv6 supported\n");
	#endif
	
	#ifdef _POSIX_JOB_COTROL 
		printf("POSIX Job Control supported\n");
	#endif
	
	#ifdef _POSIX_MAPPED_FILES 
		printf("POSIX Mapped Files supported\n");
	#endif
	
	#ifdef _POSIX_MEMLOCK 
		printf("POSIX Memlock supported\n");
	#endif
	
	#ifdef _POSIX_MEMLOCK_RANGE 
		printf("POSIX Memlock Range supported\n");
	#endif
	
	#ifdef _POSIX_MEMORY_PROTCTION
		printf("POSIX Memory Protection supported\n");
	#endif
	
	#ifdef _POSIX_MESSAGE_PASSING 
		printf("POSIX Message Passing supported\n");
	#endif
	
	#ifdef _POSIX_MONOTINIC_CLOCK 
		printf("POSIX Monotonic Clock supported\n");
	#endif
	
	#ifdef _POSIX_NO_TURNC 
		printf("POSIX No Truncation supported\n");
	#endif
	
	#ifdef _POSIX_PRIORITIZED_IO 
		printf("POSIX Prioritized I/O supported\n");
	#endif
	
	#ifdef _POSIX_PRIORITY_SCHEDULING 
		printf("POSIX Priority Scheduling supported\n");
	#endif
	
	#ifdef _POSIX_RAW_SOCKETS 
		printf("POSIX Raw Sockets supported\n");
	#endif
	
	#ifdef _POSIX_REALTIME_SIGNALS 
		printf("POSIX Real-time Signals supported\n");
	#endif
	
	#ifdef _POSIX_SAVED_IDS 
		printf("POSIX Saved IDs supported\n");
	#endif
	
	#ifdef _POSIX_SEMAPHORES 
		printf("POSIX SemaPhores supported\n");
	#endif
	
	#ifdef _POSIX_SHARED_MEMORY_OBJECTS 
		printf("POSIX Shared Memory Objects supported\n");
	#endif
	
	#ifdef _POSIX_SHELL
		printf("POSIX Shell supported\n");
	#endif
	
	#ifdef _POSIX_SPAWN 
		printf("POSIX Spawn supported\n");
	#endif
	
	#ifdef _POSIX_SPIN_LOCKS 
		printf("POSIX Spin Locks supported\n");
	#endif
	
	#ifdef _POSIX_SPORADIC_SERVER 
		printf("POSIX Sporadic Server supported\n");
	#endif
	
	#ifdef _POSIX_SYNCHRONIZED_IO 
		printf("POSIX Synchronized I/O supported\n");
	#endif
	
	#ifdef _POSIX_THREAD_ATTER_STACKADDR 
		printf("POSIX Thread Attribute Stack Address supported\n");
	#endif
	
	#ifdef _POSIX_THREAD_ATTER_STACKSIZE 
		printf("POSIX Thread Attribute Stack Size supported\n");
	#endif
	
	#ifdef _POSIX_THREAD_CPUTIME 
		printf("POSIX Thread CPU Time supported\n");
	#endif
	
	#ifdef _POSIX_THREAD_PRIO_INHERIT
		printf("POSIX Thread Priority Inheritance supported\n");
	#endif
	
	#ifdef _POSIX_THREAD_ATTER_STACKADDR 
		printf("POSIX Thread Attribute Stack Address supported\n");
	#endif
	
	#ifdef _POSIX_THREAD_PRIO_PROJECT
		printf("POSIX Thread Priority Project supported\n");
	#endif
	
	#ifdef _POSIX_THREAD_PRIORITY_SCHEDULING
		printf("POSIX Thread Priority Scheduling supported\n");
	#endif
	
	#ifdef _POSIX_THREAD_PROCESS_SHARED
		printf("POSIX Thread Process Shared supported\n");
	#endif
	
	#ifdef _POSIX_THREAD_ROBUST_PRIO_INHERIT
		printf("POSIX Thread Robust Priority Inheritance supported\n");
	#endif
	
	#ifdef _POSIX_THREAD_ROBUST_PRIO_PROJECT
		printf("POSIX Thread Robust Priority Project supported\n");
	#endif
	
	#ifdef _POSIX_THREAD_SAFE_FUNCTIONS
		printf("POSIX Thread Safe Functions supported\n");
	#endif
	
	#ifdef _POSIX_THREAD_SPORADIC_SERVER
		printf("POSIX Thread Sporadic Server supported\n");
	#endif
	
	#ifdef _POSIX_THREADS
		printf("POSIX Threads supported\n");
	#endif
	
	#ifdef _POSIX_TIMEOUTS
		printf("POSIX Timeouts supported\n");
	#endif
	
	#ifdef _POSIX_TIMERS
		printf("POSIX Timers supported\n");
	#endif
	
	#ifdef _POSIX_TRACE
		printf("POSIX Trace supported\n");
	#endif
	
	#ifdef _POSIX_TYPED_MEMORY_OBJECTS
		printf("POSIX Typed Memory Objects supported\n");
	#endif
	
	#ifdef _POSIX_VDISABLE
		printf("POSIX VDisable supported\n");
	#endif
	
	#ifdef _POSIX_V6_ILP32_OFF32
		printf("POSIX V6 ILP32 OFF32 supported\n");
	#endif
	
	#ifdef _POSIX_V6_ILP32_OFFBIG
		printf("POSIX V6 ILP32 OFFBIG supported\n");
	#endif
	
	#ifdef _POSIX_V6_LP64_OFF64
		printf("POSIX V6 LP64 OFF64 supported\n");
	#endif
	
	#ifdef _POSIX_V6_LPBIG_OFFBIG
		printf("POSIX V6 LPBIG OFFBIG supported\n");
	#endif
	
	#ifdef _POSIX_V7_ILP32_OFF32
		printf("POSIX V7 ILP32 OFF32 supported\n");
	#endif
	
	#ifdef _POSIX_V7_ILP32_OFFBIG
		printf("POSIX V7 ILP32 OFFBIG supported\n");
	#endif
	
	#ifdef _POSIX_V7_LP64_OFF64
		printf("POSIX V7 LP64 OFF64 supported\n");
	#endif
	
	#ifdef _POSIX_V7_ILPBIG_OFFBIG
		printf("POSIX V7 LPBIG OFFBIG supported\n");
	#endif
 
	return 0;
}
