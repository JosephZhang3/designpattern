# this is a makefile of the c++ project hello
# the standard c++ compiler in the Redhat linux is g++
# written by young on June 27th, 2009
TARGET = C:/users/Jiang/temp
CC = g++
CFLAGS = -g
CFLAGC = -c

MAINC = test.cpp
HELLO = c.cpp
OBJ = c.o

INCLUDE = -I$(TARGET)
EXEC = $(TARGET)/main
           
all: $(EXEC)
$(EXEC): $(OBJ) $(MAINC)
	$(CC)   $(CFLAGS)   $(OBJ)  $(MAINC)    $(INCLUDE)  -o  $@
	del -f $(OBJ)
	@echo "<<<<<< $@ is created successfully! >>>>>>"
$(OBJ): $(HELLO)
	$(CC) $(CFLAGC) $(HELLO) -o $@
	clean:
	del -f $(EXEC)