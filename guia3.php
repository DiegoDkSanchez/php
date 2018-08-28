<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Script de php</title>
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <script src="js/bootstrap.min.js"></script>
</head>
<body>
  
   <article>
   <fieldset>
    <form action="guia3.php" method="POST">
       <h3>Ingrese el numero para generar la tabla</h3>
        <input type="number" name="table" id="table"/>
        <input type="submit" name="send" id="send" value="Send"/>
    </form>
    <br>
    <?php
        if(isset($_POST['table'])):
        $table = isset($_POST['table']) ? $_POST['table'] : 0;
        
       for($i=0;$i<=10;$i++){
           $result = $table*$i;
           echo "<p> $table x $i = $result </p>";
       }
       endif;
    ?>
    </fieldset>
    </article>
    <br>
    <article>
    <fieldset>
            <form action="guia3.php" method="post">
                <h3>Calcular potencia</h3>
                <p>Base</p>
                <input type="number" name="base" id="base"/>
                <p>Potencia</p>
                <input type="number" name="potencia" id="potencia"/>
                <input type="submit" name="send" value="Send"/>
            </form>  
            <br>      
    
        <?php
              if(isset($_POST['base']) && isset($_POST['potencia'])):
            $base = isset($_POST['base']) ? $_POST['base'] : 0;
            $potencia = isset($_POST['potencia'])  ? $_POST['potencia'] : 0;  
            $resultado = pow( $base, $potencia ); 
            echo "$base elevado a $potencia es igual a $resultado";
            
        endif;
        ?>
        
        </fieldset>
    </article>
</body>
</html>