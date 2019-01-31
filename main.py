import tkinter

class MainClass(tkinter.Frame):
    def __init__(self):
        self.root = tkinter.Tk()
        self.root.geometry("%dx%d+0+0"%(self.root.winfo_screenwidth(), self.root.winfo_screenheight()))
        #print("%dx%d+0+0"%(self.root.winfo_screenwidth(), self.root.winfo_screenheight()))
        
        for r in range(768):
            self.root.rowconfigure(r, weight=1)    
        for c in range(1366):
            self.root.columnconfigure(c, weight=1)

        tkinter.Frame.__init__(self, self.root)
        self.chatFrame = tkinter.Frame(self.root, bg='black')
        self.chatFrame.grid(row = 5, column = 5, rowspan = 758, columnspan = 340, sticky = "nsew")
        
        self.cliFrame = tkinter.Frame(self.root, bg='black')
        self.cliFrame.grid(row = 572, column = 350, rowspan = 191, columnspan = 1011, sticky = "nsew")
        
        self.faceFrame = tkinter.Frame(self.root, bg='black')
        self.faceFrame.grid(row = 5, column = 350, rowspan = 562, columnspan = 1011, sticky = "nsew")


        self.root.mainloop()




if __name__ == '__main__':
    MainClass()