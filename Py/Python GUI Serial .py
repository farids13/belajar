from distutils import command
from socket import timeout
from tkinter import*
from matplotlib.pyplot import connect, get
import serial.tools.list_ports


def conect_menu_init():
    global root
    global connect_btn
    global refresh_btn
    root = Tk()
    root.title("Serial Comunication")
    root.geometry("500x500")
    root.config(bg="white")

    port_lable = Label(root, text="Available Port(s):", bg="white")
    port_lable.grid(column=1, row=3, pady=20, padx=10)


    port_bd = Label(root, text="Baudrate:", bg="white")
    port_bd.grid(column=1, row=4, pady=20, padx=10)

    refresh_btn = Button(root, text= "R", height = 2, width=10, command= update_coms)
    refresh_btn.grid(column=3, row=3)

    connect_btn = Button(root, text="Connect", height= 2, width= 10, command=koneksi)
    connect_btn.grid(column=3, row=4)
    baud_select()
    update_coms()

def baud_select():
    global clicked_bd, drop_bd
    clicked_bd = StringVar()
    bds = ["-","300","600","1200","2400","4800","9600","14400","19200","28800","38400","56000","57600","115200","128000","256000"]
    clicked_bd.set(bds[6])
    drop_bd = OptionMenu(root, clicked_bd, *bds, command= connect_check)
    drop_bd.config(width= 20)
    drop_bd.grid(column= 2, row= 4, padx= 50, pady= 50)

def update_coms():
    global clicked_com, drop_com
    ports = serial.tools.list_ports.comports()
    coms = [com[0] for com in ports]
    coms.insert(0, "-")
    try:
        drop_com.destroy()
    except:
        pass
    clicked_com = StringVar()
    clicked_com.set(coms[0])
    drop_com = OptionMenu(root, clicked_com, *coms, command=connect_check)
    drop_com.config(width= 20)
    drop_com.grid(column= 2, row= 3, padx= 50, pady= 50)
    connect_check(0)

def connect_check(args):
    if "-" in clicked_com.get() or "-" in clicked_bd.get():
        connect_btn ["state"] = "disable"
    else:
        connect_btn ["state"] = "active"

def readSerial():
    global serialData, ser
    while serialData:
        data = ser.readline()
        print (data)

def koneksi():
    global serialData, ser
    if connect_btn["text"] in "Disconnect":
        connect_btn["text"] = "Connect"
        refresh_btn ["state"] = "active"
        drop_com ["state"] = "active"
        drop_bd ["state"] = "active"
        serialData = False
    else:
        connect_btn["text"] = "Disconnect"
        refresh_btn ["state"] = "disable"
        drop_com ["state"] = "disable"
        drop_bd ["state"] = "disable"
        port = clicked_com.get()
        baud = clicked_bd.get()
        serialData = True
        print(port, baud)
        try:
            ser = serial.Serial(port, baud, timeout = 0)
        except:
            pass
        readSerial()


conect_menu_init()
root.mainloop()