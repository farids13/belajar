import tkinter as tk
from tkinter.font import BOLD
window = tk.Tk()
window.title("Serial")
window.geometry("800x300")

def usd_to_idr():
    angka = textbox.get()
    dollar = float(angka) * 14405.5
    text.set("Rp." + str(dollar))
    label2.config(font=('Arial',15,BOLD),fg="green")

label1 = tk.Label(window,text="USD", font=('Arial',16,"bold"))
label1.pack()

textbox = tk.Entry(window, font=('Arial',12,BOLD), width='50', justify=tk.CENTER)
textbox.pack()

btn = tk.Button(window,text="Convert", font=('Arial',12,BOLD),command=usd_to_idr)
btn.pack()

text = tk.StringVar()
text.set("IDR")

label2 = tk.Label(window,font=('Arial',12,BOLD), textvariable=text)
label2.pack()

window.mainloop()