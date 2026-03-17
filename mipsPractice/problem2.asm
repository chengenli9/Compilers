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

# answer = (val + 1) * (val - 2) 

  # (val + 1)
  lw $t1, val
  li $t2, 1
  addu $t0, $t1, $t2

  subu $sp, $sp, 4
  sw $t0, ($sp)

  # (val - 2) 
  lw $t1, val
  li $t2, 2
  subu $t0, $t1, $t2

  subu $sp, $sp, 4
  sw $t0, ($sp)

  lw $t2, ($sp)
  addu $sp, $sp, 4
  lw $t1, ($sp)
  addu $sp, $sp, 4

  # (val + 1) * (val - 2) 
  mul $t0, $t1, $t2



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
