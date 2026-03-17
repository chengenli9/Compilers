# int x = val + 1
# x = 2 * x
# answer = x - val

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

# int x = val + 1

  # push val into stack
  lw $t0, val
  subu $sp, $sp, 4
  sw $t0, ($sp)

  # push 1 into stack
  li $t0, 1
  subu $sp, $sp, 4
  sw $t0, ($sp)

  # stack 
  # -----
  #   val
  #.    1

  # pop 1 into t2
  lw $t2, ($sp)
  addu $sp, $sp, 4

  # pop val into t1
  lw $t1, ($sp)
  addu $sp, $sp, 4
 
  # t0 = val + 1
  addu $t0, $t1, $t2

  # push result onto stack
  subu $sp, $sp, 4
  sw $t0, ($sp) #**"x"

  # stack 
  # -----
  # val+1
  #.    

# x = 2 * x

  # push 2 into stack
  li $t0, 2
  subu $sp, $sp, 4
  sw $t0, ($sp)

  # load x into t0 and push t0 to the stack
  lw $t0, 4($sp)
  subu $sp, $sp, 4
  sw $t0, ($sp)

  lw $t2, ($sp)
  addu $sp, $sp, 4

  lw $t1, ($sp)
  addu $sp, $sp, 4
 
  mul $t0, $t1, $t2

  # store back into x
  sw $t0, ($sp) 

# answer = x - val

  # push x into stack
  lw $t0, ($sp)
  subu $sp, $sp, 4
  sw $t0, ($sp)
  # push val into stack
  lw $t0, val
  subu $sp, $sp, 4
  sw $t0, ($sp)

  lw $t2, ($sp)
  addu $sp, $sp, 4

  lw $t1, ($sp)
  addu $sp, $sp, 4

  subu $t0, $t1, $t2
  
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
