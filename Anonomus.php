<?php
$fnm=create_function('$a,$b','$c=$a+$b; return $c;');
echo fnm(10,20);
?>
