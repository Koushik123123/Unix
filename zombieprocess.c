#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
#include<sys/wait.h>
void create_zombie_process() 
{
	pid_t pid=fork();
	if(pid==-1)
	{
		perror("fork");
		exit(EXIT_FAILURE);
	}
	else if(pid>0)
	{
		printf("parent process created a zombie process(PID: %d)\n",pid);
	}
	else 
	{
		printf("Zombie process created(PID: %d)\n",getpid());
		exit(EXIT_SUCCESS);
	}
}
void prevent_zombie_process() 
{
	pid_t pid=fork();
	if(pid==-1)
	{
		perror("fork");
		exit(EXIT_SUCCESS);
	}
	else if(pid>0)
	{
		printf("Parent process created a child process(PID: %d)\n",pid);
		sleep(2);
	}
	else 
	{
		pid=fork();
		if(pid==-1)
		{
			perror("fork");
			exit(EXIT_FAILURE);
		}
		else if(pid>0)
		{
			printf("First child process(Pid: %d)exited\n",getpid());
			exit(EXIT_SUCCESS);
		}
		else 
		{
			printf("Grandchild process(PID: %d)\n",getpid());
			sleep(5);
			printf("Grandchild process completed\n");
			exit(EXIT_SUCCESS);
		}
	}
}
void create_orphan_process() 
{
	pid_t pid=fork();
	if(pid==-1)
	{
		perror("fork");
		exit(EXIT_FAILURE);
	}
	else if(pid>0)
	{
		printf("Parent process(PID: %d)\n",getpid());
		sleep(2);
	}
	else 
	{
		printf("Orphan process(PID: %d)\n",getpid());
		sleep(5);
		printf("\nOrphan process completed\n");
		exit(EXIT_SUCCESS);
	}
}
void parent_child_scenario() 
{
	pid_t pid=fork();
	if(pid==-1)
	{
		perror("fork");
		exit(EXIT_FAILURE);
	}
	else if(pid>0)
	{
		printf("Parent process(PID: %d)\n",getpid());
		wait(NULL);
	}
	else 
	{
		printf("child process(PID: %d)\n",getpid());
		exit(EXIT_SUCCESS);
	}
}
int main()
{
	printf("Demonstrating Zombie Process:\n");
	create_zombie_process();
	sleep(5);
	printf("Preventing zombie process:\n");
	prevent_zombie_process();
	sleep(7);
	printf("\n creating an orphan process:\n");
	create_orphan_process();
	printf("Parent child scenario:\n");
	parent_child_scenario();
	return 0;
}	
