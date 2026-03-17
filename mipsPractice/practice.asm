.data

# we'll use this as the input to our program.
# we can make more constants if we need them.
val:
.word 42

# at the end of our program we'll store the result here.
answer:
.word 0

.text

### Code starts here
main:

  lw $t0, val
  
  sw $t0, answer


  ### End of program,
  ### Print the answer, and \n, then exit

  # print value stored in answer
  li $v0,1
  lw $a0,answer
  syscall

  # print newline
  li $v0,11
  li $a0,10
  syscall

  # exit the program
  li $v0,10
  syscall
