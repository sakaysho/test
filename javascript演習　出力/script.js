//star[0] = ★, star[1] = ☆
var star = ["★", "☆"];
//line[0] = ココカラーーーーーーー, line[1] = ーーーーーーーココマデ
var line = ["<br>ココカラーーーーーーー<br>", "ーーーーーーーココマデ<br>"];


//問１ -> ★を５つ横に並べる
document.write("問１", line[0]);

//aの初期値を１、条件式は５以下、増減式は１つずつ増えるに設定
for (var a = 1; a <= 5; a++) {

//処理内容を★の入力に設定
    document.write(star[0]);
}

//改行して「ーーーーーーーココマデ」を表示させて終了
document.write("<br>");
document.write(line[1]);


//問２ -> ★を3つ横に並べたものを２列にする
document.write("<br>", "問2",line[0]);

//iの初期値を１、条件式は2以下、増減式は１つずつ増えるに設定
for (var i = 1; i <= 2; i++) {

//aの初期値を１、条件式は3以下、増減式は１つずつ増えるに設定
    for (var a = 1; a <= 3; a++) {

//処理内容を★の入力後、改行に設定     
        document.write(star[0]);        
    }   document.write("<br>");
}

//改行して「ーーーーーーーココマデ」を表示させて終了
document.write(line[1]);


//問３ -> ☆を5つ横に並べたものを２列にする
document.write("<br>", "問3", line[0]);

//iの初期値を１、条件式は2以下、増減式は１つずつ増えるに設定
for (var i = 1; i <= 2; i++) {

//aの初期値を１、条件式は5以下、増減式は１つずつ増えるに設定
    for (var a = 1; a <= 5; a++) {

//処理内容を☆の入力後、改行に設定        
        document.write(star[1]);
    }   document.write("<br>") ;
}

//「ーーーーーーーココマデ」を表示させて終了
document.write(line[1]);


//問４ -> ★を5つ横に並べたものを4列にする
document.write("<br>", "問4", line[0]);

//iの初期値を１、条件式は4以下、増減式は１つずつ増えるに設定
for (var i = 1; i <= 4; i ++) {

//aの初期値を１、条件式は5以下、増減式は１つずつ増えるに設定
    for (var a = 1; a <= 5; a++) {       

//処理内容を☆の入力後、改行に設定 
        document.write(star[0]);
    }   document.write("<br>");
}

//改行して「ーーーーーーーココマデ」を表示させて終了
document.write(line[1]);


//問５ -> ★を3つ横に並べたものを4列にする
document.write("<br>", "問5",line[0]);

//iの初期値を１、条件式は4以下、増減式は１つずつ増えるに設定
for (var i = 1; i <= 4; i++) {

//aの初期値を１、条件式は3以下、増減式は１つずつ増えるに設定
    for (var a = 1; a <= 3; a++) {

//処理内容を★の入力後、改行に設定       
        document.write(star[0]);
    }   document.write("<br>");
}

//改行して「ーーーーーーーココマデ」を表示させて終了
document.write(line[1]);


//問６ -> ★と☆を交互に3つ横に並べたものを3列にする
document.write("<br>", "問6", line[0]);

//iの初期値を１、条件式は3以下、増減式は１つずつ増えるに設定
for (var i = 1; i <= 3; i++) {

//aの初期値を１、条件式は3以下、増減式は１つずつ増えるに設定    
    for (var a = 1; a <= 3; a++) {

//aの数値を２で割った際の余りが１の場合、★を表示
        if (a % 2 === 1){
            document.write(star[0]);

//上記の条件以外は☆を表示
        } else  { 
            document.write(star[1]);
        } 
    }   document.write("<br>");
}

//改行して「ーーーーーーーココマデ」を表示させて終了
document.write(line[1]);


//問７ -> ★と☆を交互に5つ横に並べたものを3列にする
document.write("<br>", "問7", line[0]);

//iの初期値を１、条件式は4以下、増減式は１つずつ増えるに設定
for (var i = 1; i <= 4; i++) {

//aの初期値を１、条件式は5以下、増減式は１つずつ増えるに設定 
    for (var a = 1; a <= 5; a++) {

//aの数値を２で割った際の余りが１の場合、★を表示        
        if (a % 2 === 1){
        document.write(star[0]);

//上記の条件以外は☆を表示
        } else {  
            document.write(star[1]);
        }
    }   document.write("<br>");
}

//改行して「ーーーーーーーココマデ」を表示させて終了
document.write(line[1]);


//問８ -> ★を列ごとに1つずつ増やして5列並べる
document.write("<br>", "問8", line[0]);

//iの初期値を１、条件式は5以下、増減式は１つずつ増えるに設定
for (var i = 1; i <= 5; i++) {

//aの初期値を１、条件式はiの数値以下、増減式は１つずつ増えるに設定 
    for (var a = 1; a <= i; a++) {

//処理内容を☆の入力後、改行に設定 
        document.write(star[0]);
    }   document.write("<br>");
}

//改行して「ーーーーーーーココマデ」を表示させて終了
document.write(line[1]);