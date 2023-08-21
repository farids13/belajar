import sys
from tkinter.font import BOLD, Font
from PIL import ImageTk, Image
from threading import Thread

import tkinter as tk
from tkinter import ttk, filedialog

class ImageConverter(tk.Frame) : 
    def __init__(self, window):
        super().__init__(window)
        self.init_ui()

    def init_ui(self) :
        self.pack()
        self.label = tk.Label(self, text='IMAGE CONVERTER', font= ('Arial', 22, BOLD) )
        self.label.pack()
        self.openbtn = tk.Button(self, text='Load Image')
        self.openbtn.pack()
        self.imageframe = tk.LabelFrame(self, text='imageview')
        self.imageframe.pack()
        self.labelimage= tk.Label(self.imageframe, width= 100, height= 30,)
        self.labelimage.pack()


window = tk.Tk()
window.geometry('1000x800')
window.title("Image converter")
gui = ImageConverter(window)
window.mainloop() 