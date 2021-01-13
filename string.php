<?php
$a ='amit';
$b = 'anil';
if($a==$b)
echo "both String are equal<br>";
else
echo "Both string are not equal<br>";
if(strcmp($a,$b)>0)
{
echo "string2 sorts before string 1";
}
elseif(strcmp($a,$b)==0)
{
echo"both are equal";
}
elseif(strcmp($a,$b)<0)
{
echo"string 1 sorts before String2";
}
?>
