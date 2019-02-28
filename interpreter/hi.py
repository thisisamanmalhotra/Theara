import contextlib
with contextlib.redirect_stdout(None):
    import pygame

pygame.mixer.init()
pygame.mixer.music.load("hi.mp3")
pygame.mixer.music.play()