 # Labeling Data with Pandas

import pandas as pd
import numpy as np


def load_data():
    data = pd.read_csv('C:\Users\ASUS\Documents\File titip\Belajar Coding\Python\Labelingdata.csv')
    return data

twet_buka = load_data()
twet_buka.head()

alist = ['id','date','text']
file = pd.DataFrame(twet_buka(alist))
print(load_data)