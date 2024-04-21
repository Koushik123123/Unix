#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
#include<sys/stat.h>
int main(int argc,char *argv[])
{
	if(argc!=3)
	{
		fprintf(stderr,"Usage: %s <filename>\n",argv[0]);
		exit(EXIT_FAILURE);
	}
	char *filename = argv[1];
	char hard_linkname[256],sym_linkname[256];
	struct stat file_stat;
	if(link(filename,"hard_link")==-1)
	{
		perror("Error creating hard link");
		exit(EXIT_FAILURE);
	}
	if(symlink(filename,"sym_link")==-1)
	{
		perror("Error creating symbolic link\n");
		exit(EXIT_FAILURE);
	}	
	if(stat(filename,&file_stat)==-1)
	{
		perror("Error getting file information\n");
		exit(EXIT_FAILURE);
	}
	printf("Informaion about hard link\n");
	printf("Number of links:%ld\n",file_stat.st_nlink);
	if(lstat("sym_link",&file_stat)==-1)
	{
		perror("Error getting symbolic information\n");
		exit(EXIT_FAILURE);
	}
	printf("Informaion about symbolic link\n");
	printf("Number of links:%ld\n",file_stat.st_nlink);
	return 0;
}
