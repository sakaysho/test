<!doctype HTML>
<html lang = "ja">

<head> 
    <meta charset = "UTF-8">
    <title>D.I.WROKS 掲示板</title>
    <link rel = "stylesheet" type = "text/css" href = "style.css">
</head>

<body>
    
    <?php  
        mb_internal_encoding("utf8");
        $pdo = new PDO(
            "mysql:dbname=lesson01; host=localhost;", 
            "root", 
            ""
        );

        $stmt = $pdo -> query("select * from diworks_keijiban");
    ?>

    <header>

            <div class = "logo">
                <img src = "diblog_logo.jpg">
            </div> 

            <ul>
                <li>トップ</li>
                <li>プロフィール</li>
                <li>D.I.Blogについて</li>
                <li>登録フォーム</li>
                <li>問い合わせ</li>
                <li>その他</li>
            </ul>   
    </header> 

    <main>

        <div class = "main-container">
            
            <div class = "left">

                <div class = "left_title">プログラミングに役立つ掲示板</div>
            
                <div class ="form">
                    <h1>入力フォーム</h1>
                    <form method = "post" action = "insert.php">

                        <div>
                            <label>ハンドルネーム</label>
                            <br>
                            <input type = "text" class = "text" size = "35" name = "handlename">
                        </div>

                        <div>
                            <label>タイトル</label>
                            <br>
                            <input type = "text" class = "text" size = "35" name = "title">
                        </div>

                        <div>
                            <label>コメント</label>
                            <br>
                            <textarea cols = "70" rows = "7" name = "comments"></textarea>
                        </div>

                        <div>
                            <input type = "submit" class = "submit" value = "投稿する">
                        </div>
                    </form>
                </div>

                <?php
                while ($row = $stmt -> fetch ()){
                    echo "<div class = 'kiji'>";
                    echo "<h3>".$row['title']."</h3>";
                    echo "<div class = 'contents'>";
                    echo $row['comments'];
                    echo "<div class = 'handlename'>posted by ".$row['handlename']."</div>";
                    echo "</div>";
                    echo "</div>";
                }
                ?>
            </div>     

            <div class = "right">

                <h2>人気の記事</h2>
                <p>PHPオススメ本</p>
                <p>PHP　MyAdminの使い方</p>
                <p>いま人気のエディタTops</p>
                <p>HTMLの基礎</p>

                <h2>オススメリンク</h2>
                <p>ﾃﾞｨｰｱｲﾜｰｸｽ株式会社</p>
                <p>XAMPPのダウンロード</p>
                <p>Eclipseのダウンロード</p>
                <p>Braketsのダウンロード</p>

                <h2>カテゴリ</h2>
                <p>HTML</p>
                <p>PHP</p>
                <p>MySQL</p>
                <p>JavaScript</p>
            </div>
        </div>
    </main>

    <footer>
    Copyright D.I.works D.I.blog is the one which provides A to Zabout progrmming
    </footer>
</body>
</html>