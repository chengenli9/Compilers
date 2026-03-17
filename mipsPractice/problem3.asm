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

  # x = val + 2
  # if (x > 2) {
  #   x = 0
  # } else {
  #   x = 1
  # }
  # answer = x

# (val + 2)
  lw $t1, val
  li $t2, 2
  addu $t0, $t1, $t2

  subu $sp, $sp, 4
  sw $t0, ($sp)


  
  
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
