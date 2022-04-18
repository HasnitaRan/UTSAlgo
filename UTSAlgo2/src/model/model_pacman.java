package model;

import javax.swing.*;
import java.awt.*;

public class model_pacman {
    private int score;
    private int Jumlahpemain;
    private int Jumlahhantu;
    private int Livepacman;
    private final int lebar=30;
    private final int tinggi=15;

    public model_pacman(){
    }
    private final Font smallFont = new Font("Arial", Font.BOLD, 14);
    private boolean inGame = false;
    private boolean dying = false;

    private Image heart, ghost;
    private Image up, down, left, right;

        }
    //public model_pacman(int sc, int jmlpem, int jmlhnt, int lvpc, int l, int t){
        //this.score = sc;
        //this.Jumlahpemain = jmlhnt;
        //this.Jumlahhantu = jmlhnt;
        //this.Livepacman = lvpc;
        //this.lebar = l;
        //this.tinggi = t;

