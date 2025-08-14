#Filename:- Decoding - Reading QR Code.py
#Required
#pip install Pillow
#pip install pyzbar

from PIL import Image
from pyzbar.pyzbar import decode

# <QR Code Image> - image.jpg, image.png, image.gif
result = decode(Image.open('final.gif'))
print(result)
