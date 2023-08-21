import tkinter as tk 
from tkinter import Entry, ttk
from tkinter import font
from tkinter.constants import HIDDEN, LEFT, NONE
from tkinter.font import BOLD

# ini untuk fungsi semua tombol
def save_password():
    try:
        file = open("Pasword.txt", "r")
        db = file.read()
        file.close
    except :
        pass
    
    nama_akun = entry1.get()
    password = entry2.get()

    file = open("Pasword.txt", "w")
    file.write(f'{db}{nama_akun} : {password}\n')
    file.close()

def show_pasword() :
    dbtext.delete("1.0", "end")
    file = open("Pasword.txt", "r")
    db = file.read()
    file.close()

    dbtext.insert(tk.END, db)

def hide_pasword():
    dbtext.delete("1.0", "end")

jendela = tk.Tk()
jendela.geometry("800x400")
jendela.title("Pasword Saver v1 2022")

mframe = tk.Frame(jendela)
mframe.pack(fill = tk.BOTH) #tk.both melindugi layar dari jendela

mlabel = tk.Label(mframe,text= "PASSWORD SAVER", font=('Arial',18, BOLD))
mlabel.pack(side=tk.TOP)

#................................. FRAME 1 ....................................
frame1 = tk.Frame(mframe)
frame1.pack(fill=tk.X)

label1 = tk.Label(frame1, width= 10 ,text="Nama Akun", font=('Arial',12,BOLD))
label1.pack(side=LEFT, padx=10, pady= 10)

entry1 = ttk.Entry(frame1)
entry1.pack(side= tk.LEFT, fill=tk.X, expand=True, padx=10)
#................................. FRAME 2 ....................................
frame2 = tk.Frame(mframe)
frame2.pack(fill = tk.X)

label2 = tk.Label(frame2, width= 10, text= "Pasword", font= ("Arial" , 12, BOLD))
label2.pack(side= tk.LEFT, padx= 10, pady=10)

entry2 = ttk.Entry(frame2)
entry2.pack(side = tk.LEFT, fill = tk.X, expand= True, padx=10)
#................................. FRAME 3 ....................................
frame3 = tk.Frame(mframe)
frame3.pack(fill = tk.X)

savebtn = ttk.Button(frame3, text="Save", command= save_password)
savebtn.pack(side=tk.RIGHT, padx= 10, pady = 10)

hidebtn = ttk.Button(frame3, text= "Hide", command= hide_pasword )
hidebtn.pack(side= tk.RIGHT, padx = 10 , pady = 10)

showbtn = ttk.Button(frame3, text= "Show" ,command=show_pasword)
showbtn.pack(side= tk.RIGHT, padx = 10 , pady = 10)
#................................. FRAME 4 ....................................
frame4 = tk.Frame (mframe)
frame4.pack(fill=tk.X, pady= 10)

label4 = ttk.Label(frame4, width= 10, text= "Data Base", font=("Arial", 12, BOLD))
label4.pack(side=tk.LEFT, padx= 10 )

dbtext = tk.Text(frame4, font= ("Arial", 12, BOLD))
dbtext.pack(side=tk.LEFT, fill = tk.BOTH, expand=True, padx= 10)


jendela.mainloop()