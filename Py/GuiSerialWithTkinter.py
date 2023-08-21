from distutils import command
from logging import root
from tkinter import *
from tkinter import font
from turtle import st
from cv2 import distanceTransformWithLabels
import serial.tools.list_ports
import functools

ports = serial.tools.list_ports.comports()
serialObj = serial.Serial()

root = Tk()
root.config(bg='gray')

def InitComPort(index):
    currentPort = str(ports[index])
    comPortVar = str(currentPort.split(' ')[0])
    print(comPortVar)
    serialObj.port = comPortVar
    serialObj.baudrate = 9600
    serialObj.open()

for onePort in ports:
    comButton = Button(root, text = onePort, font= ('Arial', '14'), height= 1, width=55, command = functools.partial(InitComPort, index = ports.index(onePort)))
    comButton.grid(row=ports.index(onePort))
    print (ports.index(onePort))

dataCanvas = Canvas(root, width= 600, height=400)
dataCanvas.grid(row=0,column=1, rowspan= 1000, sticky='ns')

vsb = Scrollbar(root, orient='vertical', command = dataCanvas.yview) #untuk scroll
vsb.grid(row = 0, column = 2, rowspan=1000, sticky='ns') # pilihan pada sticki itu n,e,s,w 4 arah sesuai dengan kompas jadi n itu utara selalu menujuk ke atas dsb

dataCanvas.config(yscrollcommand= vsb.set)

dataFrame = Frame(dataCanvas, bg = 'white')
dataCanvas.create_window((10,0),window=dataFrame,anchor='nw')

def checkSerialPort():
    if serialObj.isOpen() and serialObj.in_waiting:
        recentPacket = serialObj.readline()
        recentPacketString = recentPacket.decode('utf').rstrip('\n')
        Label(dataFrame, text = recentPacketString, font=('Arial', 13), bg='white').pack()

while True:
    root.update()
    checkSerialPort()
    dataCanvas.config(scrollregion=dataCanvas.bbox("all"))