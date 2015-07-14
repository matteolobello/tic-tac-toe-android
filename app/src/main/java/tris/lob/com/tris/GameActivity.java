package tris.lob.com.tris;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Locale;
import java.util.Random;


public class GameActivity extends Activity {

    private boolean unobooleanox = false,
                    duebooleanox = false,
                    trebooleanox = false,
                    quattrobooleanox = false,
                    cinquebooleanox = false,
                    seibooleanox = false,
                    settebooleanox = false,
                    ottobooleanox = false,
                    novebooleanox =false,
                    unobooleanoy = false,
                    duebooleanoy = false,
                    trebooleanoy = false,
                    quattrobooleanoy = false,
                    cinquebooleanoy = false,
                    seibooleanoy = false,
                    settebooleanoy = false,
                    ottobooleanoy = false,
                    novebooleanoy = false;

    private Button uno,
                   due,
                   tre,
                   quattro,
                   cinque,
                   sei,
                   sette,
                   otto,
                   nove;

    private TextView turn,
                     xcounter,
                     ocounter;

    private int xo = 0;

    private int x1 = 1,
                x2 = 3,
                x3 = 5,
                x4 = 7,
                x5 = 9,
                x6 = 11,
                x7 = 13,
                x8 = 15,
                x9 = 17,
                x10 = 19;

    private int y1 = 2,
                y2 = 4,
                y3 = 6,
                y4 = 8,
                y5 = 10,
                y6 = 12,
                y7 = 14,
                y8 = 16,
                y9 = 18,
                y10 = 20;

    private int xwins = 0,
                owins = 0;

    private String youlost;
    private String youwon;
    private String keepplaying;
    private String stopplaying;
    private String draw;
    private String goodjob;
    private String youlostthematch;
    private String youwonthematch;
    private String ohno = "Oh no!";

    /*private int firstPlay() {
     *   int min = 1; int max = 2;
     *
     *   Random r = new Random();
     *   int randomplayer = r.nextInt((max - min) + 1) + min;
     *   return randomplayer;
     * }
     *
     *private boolean firstXTurn() {
     *   if (game.firstPlay() == 1) {
     *       return true;
     *   } else {
     *       return false;
     *   }
    }*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        setImmersiveMode();

        uno = (Button)findViewById(R.id.button);
        due = (Button)findViewById(R.id.button2);
        tre = (Button)findViewById(R.id.button3);
        quattro = (Button)findViewById(R.id.button4);
        cinque = (Button)findViewById(R.id.button5);
        sei = (Button)findViewById(R.id.button6);
        sette = (Button)findViewById(R.id.button7);
        otto = (Button)findViewById(R.id.button8);
        nove = (Button)findViewById(R.id.button9);

        turn = (TextView)findViewById(R.id.textView3);
        xcounter = (TextView)findViewById(R.id.textView6);
        ocounter = (TextView)findViewById(R.id.textView7);


        youlost = getString(R.string.youlost);
        youwon = getString(R.string.youwon);
        keepplaying = getString(R.string.keepplaying);
        stopplaying = getString(R.string.stopplaying);
        draw = getString(R.string.draw);
        goodjob = getString(R.string.goodjob);
        youlostthematch = getString(R.string.youlostthematch);
        youwonthematch = getString(R.string.youwonthematch);

        uno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setUno();
            }
        });

        due.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setDue();
            }
        });

        tre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setTre();
            }
        });

        quattro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setQuattro();
            }
        });

        cinque.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setCinque();
            }
        });

        sei.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setSei();
            }
        });

        sette.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setSette();
            }
        });

        otto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setOtto();
            }
        });

        nove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setNove();
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.game, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


    void setUno() {
        xo = xo + 1;

        if (x1 == xo || x2 == xo || x3 == xo || x4 == xo || x5 == xo
            || x6 == xo || x7 == xo || x8 == xo || x9 == xo || x10 == xo) {
            turn.setText("O Turn");
            uno.setText(" X ");
            unobooleanox = true;
        } else if (y1 == xo || y2 == xo || y3 == xo || y4 == xo || y5 == xo
                || y6 == xo || y7 == xo || y8 == xo || y9 == xo || y10 == xo) {
            turn.setText("X Turn");
            uno.setText(" O ");
            unobooleanoy = true;
        }

        if (duebooleanox == true && unobooleanox == true) {
            if (trebooleanox == true) { xWins(); } else {}
        }
        if (quattrobooleanox == true && unobooleanox == true) {
            if (settebooleanox == true) { xWins(); } else{}
        }
        if (cinquebooleanox == true && unobooleanox == true) {
           if (novebooleanox == true) { xWins(); } else{}
        }
        if (duebooleanoy == true && unobooleanoy == true) {
            if (trebooleanoy == true) { oWins(); } else{}
        }
        if (quattrobooleanoy == true && unobooleanoy == true) {
            if (settebooleanoy == true) { oWins(); } else{}
        }
        if (cinquebooleanoy == true && unobooleanoy == true) {
            if (novebooleanoy == true) { oWins(); } else{}
        }
        uno.setClickable(false);
        drawChecker();
    }

    void setDue() {
        xo = xo + 1;

        if (x1 == xo || x2 == xo || x3 == xo || x4 == xo || x5 == xo
                || x6 == xo || x7 == xo || x8 == xo || x9 == xo || x10 == xo) {
            turn.setText("O Turn");
            due.setText(" X ");
            duebooleanox = true;
        } else if (y1 == xo || y2 == xo || y3 == xo || y4 == xo || y5 == xo
                || y6 == xo || y7 == xo || y8 == xo || y9 == xo || y10 == xo) {
            turn.setText("X Turn");
            due.setText(" O ");
            duebooleanoy = true;
        }

        if (cinquebooleanox == true && duebooleanox == true) {
            if (ottobooleanox == true) { xWins(); } else{}
        }
        if (unobooleanox == true && duebooleanox == true) {
           if (trebooleanox == true) { xWins(); } else{}
        }
        if (cinquebooleanoy == true && duebooleanoy == true) {
            if (ottobooleanoy == true) { oWins(); } else{}
        }
        if (unobooleanoy == true && duebooleanoy == true) {
           if (trebooleanoy == true) { oWins(); } else{}
        }
        due.setClickable(false);
        drawChecker();
    }

    private void setTre() {
        xo = xo + 1;

        if (x1 == xo || x2 == xo || x3 == xo || x4 == xo || x5 == xo
                || x6 == xo || x7 == xo || x8 == xo || x9 == xo || x10 == xo) {
            turn.setText("O Turn");
            tre.setText(" X ");
            trebooleanox = true;
        } else if (y1 == xo || y2 == xo || y3 == xo || y4 == xo || y5 == xo
                || y6 == xo || y7 == xo || y8 == xo || y9 == xo || y10 == xo) {
            turn.setText("X Turn");
            tre.setText(" O ");
            trebooleanoy = true;
        }

        if (cinquebooleanox == true && trebooleanox == true) {
            if (settebooleanox == true) { xWins(); } else{}
        }
        if (seibooleanox == true && trebooleanox == true) {
            if (novebooleanox == true){ xWins(); } else{}
        }
        if (duebooleanox == true && trebooleanox == true) {
            if (unobooleanox == true) { xWins(); } else{}
        }
        if (cinquebooleanoy == true && trebooleanoy == true) {
           if (settebooleanoy == true) { oWins(); } else{}
        }
        if (seibooleanoy == true && trebooleanoy == true) {
           if (novebooleanoy == true) { oWins(); } else{}
        }
        if (duebooleanoy == true && trebooleanoy == true) {
            if (unobooleanoy == true) { oWins(); } else{}
        }
        tre.setClickable(false);
        drawChecker();
    }

    private void setQuattro() {
        xo = xo + 1;

        if (x1 == xo || x2 == xo || x3 == xo || x4 == xo || x5 == xo
                || x6 == xo || x7 == xo || x8 == xo || x9 == xo || x10 == xo) {
            turn.setText("O Turn");
            quattro.setText(" X ");
            quattrobooleanox = true;
        } else if (y1 == xo || y2 == xo || y3 == xo || y4 == xo || y5 == xo
                || y6 == xo || y7 == xo || y8 == xo || y9 == xo || y10 == xo) {
            turn.setText("X Turn");
            quattro.setText(" O ");
            quattrobooleanoy = true;
        }

        if (unobooleanox == true && quattrobooleanox == true) {
            if (settebooleanox == true) { xWins(); } else{}
        }
        if (cinquebooleanox == true && quattrobooleanox == true) {
            if (seibooleanox == true) { xWins(); } else{}
        }
        if (unobooleanoy == true && quattrobooleanoy == true) {
            if (settebooleanoy == true) { oWins(); } else{}
        }
        if (cinquebooleanoy == true && quattrobooleanoy == true) {
            if (seibooleanoy == true) { oWins(); } else{}
        }
        quattro.setClickable(false);
        drawChecker();
    }

    private void setCinque() {
        xo = xo + 1;

        if (x1 == xo || x2 == xo || x3 == xo || x4 == xo || x5 == xo
                || x6 == xo || x7 == xo || x8 == xo || x9 == xo || x10 == xo) {
            turn.setText("O Turn");
            cinque.setText(" X ");
            cinquebooleanox = true;
        } else if (y1 == xo || y2 == xo || y3 == xo || y4 == xo || y5 == xo
                || y6 == xo || y7 == xo || y8 == xo || y9 == xo || y10 == xo) {
            turn.setText("X Turn");
            cinque.setText(" O ");
            cinquebooleanoy = true;
        }

        if (unobooleanox == true && cinquebooleanox == true) {
            if (novebooleanox == true) { xWins(); } else{}
        }
        if (duebooleanox == true && cinquebooleanox == true) {
            if (ottobooleanox == true) { xWins(); } else{}
        }
        if (trebooleanox == true && cinquebooleanox == true) {
            if (settebooleanox == true) { xWins();  } else{}
        }
        if (quattrobooleanox == true && cinquebooleanox == true) {
            if (seibooleanox == true) { xWins(); } else{}
        }
        if (unobooleanoy == true && cinquebooleanoy == true) {
            if (novebooleanoy == true) { oWins(); } else{}
        }
        if (duebooleanoy == true && cinquebooleanoy == true) {
            if (ottobooleanoy == true) { oWins(); } else{}
        }
        if (trebooleanoy == true && cinquebooleanoy == true) {
            if (settebooleanoy == true) { oWins(); } else{}
        }
        if (quattrobooleanoy == true && cinquebooleanoy == true) {
            if (seibooleanoy == true) { oWins(); } else{}
        }
        cinque.setClickable(false);
        drawChecker();
    }

    private void setSei() {
        xo = xo + 1;
        if (x1 == xo || x2 == xo || x3 == xo || x4 == xo || x5 == xo
                || x6 == xo || x7 == xo || x8 == xo || x9 == xo || x10 == xo) {
            turn.setText("O Turn");
            sei.setText(" X ");
            seibooleanox = true;
        } else if (y1 == xo || y2 == xo || y3 == xo || y4 == xo || y5 == xo
                || y6 == xo || y7 == xo || y8 == xo || y9 == xo || y10 == xo) {
            turn.setText("X Turn");
            sei.setText(" O ");
            seibooleanoy = true;
        }

        if (trebooleanox == true && seibooleanox == true) {
            if (novebooleanox == true) { xWins(); } else{}
        }
        if (quattrobooleanox == true && seibooleanox == true) {
            if (cinquebooleanox == true) { xWins(); } else{}
        }
        if (trebooleanoy == true && seibooleanoy == true) {
            if (novebooleanoy == true) { oWins(); } else{}
        }
        if (quattrobooleanoy == true && seibooleanoy == true) {
            if (cinquebooleanoy == true) { oWins(); } else{}
        }
        sei.setClickable(false);
        drawChecker();
    }

    private void setSette() {
        xo = xo + 1;

        if (x1 == xo || x2 == xo || x3 == xo || x4 == xo || x5 == xo
                || x6 == xo || x7 == xo || x8 == xo || x9 == xo || x10 == xo) {
            turn.setText("O Turn");
            sette.setText(" X ");
            settebooleanox = true;
        } else if (y1 == xo || y2 == xo || y3 == xo || y4 == xo || y5 == xo
                || y6 == xo || y7 == xo || y8 == xo || y9 == xo || y10 == xo){
           turn.setText("X Turn");
           sette.setText(" O ");
           settebooleanoy = true;
        }

        if (cinquebooleanox == true && settebooleanox == true) {
            if (trebooleanox == true) { xWins(); } else{}
        }
        if (unobooleanox == true && settebooleanox == true) {
            if (quattrobooleanox == true) { xWins(); } else{}
        }
        if (ottobooleanox == true && settebooleanox == true) {
            if (novebooleanox == true) { xWins(); } else{}
        }
        if (cinquebooleanoy == true && settebooleanoy == true) {
            if (trebooleanoy == true) { oWins(); } else{}
        }
        if (unobooleanoy == true && settebooleanoy == true) {
            if (quattrobooleanoy == true) { oWins(); } else{}
        }
        if (ottobooleanoy == true && settebooleanoy == true) {
            if (novebooleanoy == true) { oWins(); } else{}
        }
        sette.setClickable(false);
        drawChecker();
    }

    private void setOtto() {
        xo = xo + 1;

        if (x1 == xo || x2 == xo || x3 == xo || x4 == xo || x5 == xo
                || x6 == xo || x7 == xo || x8 == xo || x9 == xo || x10 == xo) {
            turn.setText("O Turn");
            otto.setText(" X ");
            ottobooleanox = true;
        } else if (y1 == xo || y2 == xo || y3 == xo || y4 == xo || y5 == xo
                || y6 == xo || y7 == xo || y8 == xo || y9 == xo || y10 == xo) {
            turn.setText("X Turn");
            otto.setText(" O ");
            ottobooleanoy = true;
        }

        if (cinquebooleanox == true && ottobooleanox == true) {
            if (duebooleanox == true) { xWins(); } else{}
        }
        if (settebooleanox == true && ottobooleanox == true) {
            if (novebooleanox == true) { xWins(); } else{}
        }
        if (cinquebooleanoy == true && ottobooleanoy == true) {
            if (duebooleanoy == true) { oWins(); } else{}
        }
        if (settebooleanoy == true && ottobooleanoy == true) {
            if (novebooleanoy == true) { oWins(); } else{}
        }
        otto.setClickable(false);
        drawChecker();
    }

    private void setNove() {
        xo = xo + 1;

        if (x1 == xo || x2 == xo || x3 == xo || x4 == xo || x5 == xo
                || x6 == xo || x7 == xo || x8 == xo || x9 == xo || x10 == xo) {
            turn.setText("O Turn");
            nove.setText(" X ");
            novebooleanox = true;
        } else if (y1 == xo || y2 == xo || y3 == xo || y4 == xo || y5 == xo
                || y6 == xo || y7 == xo || y8 == xo || y9 == xo || y10 == xo) {
            turn.setText("X Turn");
            nove.setText(" O ");
            novebooleanoy = true;
        }

        if (cinquebooleanox == true &&  novebooleanox == true) {
            if (unobooleanox == true) { xWins(); } else{}
        }
        if (trebooleanox == true &&  novebooleanox == true) {
            if (seibooleanox == true) { xWins(); } else{}
        }
        if (settebooleanox == true &&  novebooleanox == true) {
            if (ottobooleanox == true) { xWins(); } else{}
        }
        if (cinquebooleanoy == true &&  novebooleanoy == true) {
            if (unobooleanoy == true) { oWins(); } else{}
        }
        if (trebooleanoy == true &&  novebooleanoy == true) {
            if (seibooleanoy == true) { oWins(); } else{}
        }
        if (settebooleanoy == true &&  novebooleanoy == true) {
            if (ottobooleanoy == true) { oWins(); } else{}
        }
        nove.setClickable(false);
        drawChecker();
    }

    private void oWins() {
        owins = owins + 1;
        ocounter.setText(" " + String.valueOf(owins));
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("O Wins!");
        builder.setMessage(goodjob);
        builder.setCancelable(false);
        builder.setPositiveButton(keepplaying, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                reset();
                dialog.dismiss();
                setImmersiveMode();
            }
        });
        builder.setNegativeButton(stopplaying, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                reset();
                finish();
                dialog.dismiss();
                setImmersiveMode();
            }
        });
        builder.show();
    }

    void xWins() {
        xwins = xwins + 1;
        xcounter.setText(" " + String.valueOf(xwins));
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("X Wins!");
        builder.setMessage(goodjob);
        builder.setCancelable(false);
        builder.setPositiveButton(keepplaying, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                reset();
                dialog.dismiss();
                setImmersiveMode();
            }
        });
        builder.setNegativeButton(stopplaying, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                reset();
                finish();
                dialog.dismiss();
                setImmersiveMode();
            }
        });
        builder.show();
    }

    void setImmersiveMode() {
        getWindow().getDecorView()
                .setSystemUiVisibility(
                        View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                                | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                                | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                                | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                                | View.SYSTEM_UI_FLAG_FULLSCREEN
                                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                );
    }

    private void drawChecker() {
        if (uno.isClickable() == false && due.isClickable() == false && tre.isClickable() == false
                && quattro.isClickable() == false && cinque.isClickable() == false
                && sei.isClickable() == false && sette.isClickable() == false && otto.isClickable() == false
                && nove.isClickable() == false) {
            draw();
        } else {}
    }

    private void draw() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Draw!");
        builder.setMessage("Get another try...");
        builder.setCancelable(false);
        builder.setPositiveButton(keepplaying, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                reset();
                dialog.dismiss();
                setImmersiveMode();
            }
        });
        builder.setNegativeButton(stopplaying, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                reset();
                finish();
                dialog.dismiss();
                setImmersiveMode();
            }
        });
        builder.show();
    }
    void reset() {
        unobooleanox = false;
        duebooleanox =  false;
        trebooleanox = false;
        quattrobooleanox = false;
        cinquebooleanox = false;
        seibooleanox = false;
        settebooleanox = false;
        ottobooleanox = false;
        novebooleanox = false;
        unobooleanoy = false;
        duebooleanoy = false;
        trebooleanoy = false;
        quattrobooleanoy = false;
        cinquebooleanoy = false;
        seibooleanoy = false;
        settebooleanoy = false;
        ottobooleanoy = false;
        novebooleanoy = false;
        xo = 0;
        uno.setText("   ");
        due.setText("   ");
        tre.setText("   ");
        quattro.setText("   ");
        cinque.setText("   ");
        sei.setText("   ");
        sette.setText("   ");
        otto.setText("   ");
        nove.setText("   ");
        uno.setClickable(true);
        due.setClickable(true);
        tre.setClickable(true);
        quattro.setClickable(true);
        cinque.setClickable(true);
        sei.setClickable(true);
        sette.setClickable(true);
        otto.setClickable(true);
        nove.setClickable(true);
        xwins = 0;
        owins = 0;
    }

}
