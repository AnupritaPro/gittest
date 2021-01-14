<?php
class A{
	function check(){
		if(isset($this)){
			echo "$this is defined(";
			echo get_class($this);
			echo ")\n";
			}
		else 
		{
		echo "this is not defined";
		}
	}
}

class B{
	function bcheck(){
		A::check();
		}
	}


$a= new A();
$a->check();
A::check();

$b=new B();
$b->bcheck();
B::bcheck();

?>
