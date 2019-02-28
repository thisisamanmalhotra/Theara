from cmd2 import Cmd
import atexit
import readline
import os 
from subprocess import Popen

#including history
history_file = os.path.expanduser('~/.cli_history')
if not os.path.exists(history_file):
    with open(history_file, "w") as fobj:
        fobj.write("")
readline.read_history_file(history_file)
atexit.register(readline.write_history_file, history_file)

def run(runfile):
        with open(runfile,"r") as rnf:
            exec(rnf.read())



class inter(Cmd): #add commands as do_command functions
    prompt=">>> "

    def do_shake(self,line):
        #call function
        print("Shaking hands...")

    def do_chat(self,line):
        #switch to chat mode
        print("Switching to chat mode...")

    def do_hey(self,line):
        #call function
        run("hi.py")
        print("Oh hi Mark")

    def do_bajaao(self,line):
        #playing music
        run("music.py")
        print("Playing...")

    def do_shadow(self,line):
        print("Entering shadow mode")

    def do_assistant(self,line):
        print("Entering assistant mode")

    def do_idle(self,line):
        print("Entering idle mode")

    def do_movst(self,line):
        print("Moving straight")

    def do_movbk(self,line):
        print("Moving back")
    
    def do_movlt(self,line):
        print("Moving left")

    def do_movrt(self,line):
        print("Moving right")

    def __init__(self):
        Cmd.__init__(self)


if __name__ == '__main__': #basic CLI 
    app = inter()
    app.cmdloop()