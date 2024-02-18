//問１　円の面積
document.write("問１", "<br>");

//円の面積の公式　半径**2*3.14
    function area(hankei) {
    return "半径" + hankei + "㎝の円の面積は" + hankei ** 2 * 3.14 + "cm²です。"
}

//半径5cmの場合
document.write(area(5) + "<br>");
//半径7cmの場合
document.write(area(7) + "<br>");
//半径10cmの場合
document.write( area(10) );

//問２　遊園地の入場料
document.write("<br>", "問２", "<br>");

//合計金額の計算方法　otona * 500 + kodomo * 200
function total( otona, kodomo ) {
    return "グループの合計金額は" + (otona * 500 + kodomo * 200) + "円です。"
}

//Aグループの場合
document.write( "A" + total(2, 4) + "<br>" );
//Bグループの場合
document.write( "B" + total(1, 5) + "<br>" );
//Cグループの場合
document.write( "C" + total(3, 7) + "<br>" );