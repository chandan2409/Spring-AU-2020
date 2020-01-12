 

function sort()

{

    var ul = document.getElementById('sortlist');

    var li = ul.getElementsByTagName('li');

    var array = new Array();

    for (var i = 0; i < li.length; i++) {

        array.push(li[i].innerText)

    }

    var array1=new Array();

    array1=array.sort();

    for (var i = 0; i < li.length; i++) {

        li[i].innerText=array1[i];

    }

 

}

function suggest()

{

    var ul = document.getElementById('usernamelist');

    var li1 = ul.getElementsByTagName('li');

    var username=document.getElementById("username").value;

    var array = ["user1008","starwars999","jack_109","anishpb"];

    var regex = new RegExp(".*" +username + ".*");

    console.log(regex);
 var in_html="<ul>"

 
    for (var i = 0; i < array.length; i++) {

        if(regex.test(array[i])==true)

        {

            in_html+="<li>"+array[i]+"</li>";
            console.log(li1[i]);
        }


    }

    in_html+="</ul>";
    console.log(in_html);

    ul.innerHTML=in_html;
 


}