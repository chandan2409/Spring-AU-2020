    
function submit()
{
    var username=document.getElementById("username").value;
    var password=document.getElementById("password").value;
    var confirmpassword=document.getElementById("confirmpassword").value;
    var regex_abc=/[abc]/;
    var reg_specialcharacter=/[\$@*]/;
    var regex_cap=/[A-Z]{1}/;
    if(username==="")
    {
        document.getElementById("namemsg").setAttribute("style","display:visible;color:red");
        document.getElementById("successful_message").setAttribute("style","display:none;");

    }
    else{
        document.getElementById("namemsg").setAttribute("style","display:none;");

    }
    if(password!=confirmpassword)
    {
        document.getElementById("confirmpasswordmsg").textContent="Password Not Matched";
        document.getElementById("confirmpasswordmsg").setAttribute("style","display:visible;color:red");
        document.getElementById("successful_message").setAttribute("style","display:none;");


    }
    else{
        document.getElementById("confirmpasswordmsg").setAttribute("style","display:none;");
    }

    
    if(password.length<8)
        {
            document.getElementById("passwordmsg").textContent="Password should contains atleast 8 characters";
            document.getElementById("passwordmsg").setAttribute("style","display:visible;color:red");
            document.getElementById("successful_message").setAttribute("style","display:none;");

    
        }
        else{
            document.getElementById("passwordmsg").setAttribute("style","display:none;");
            if(regex_abc.test(password)==false)
            {
                document.getElementById("passwordmsg").textContent="Password should contains either a or b or c";
                document.getElementById("passwordmsg").setAttribute("style","display:visible;color:red");
                document.getElementById("successful_message").setAttribute("style","display:none;");

            }
            else{
                if(reg_specialcharacter.test(password)==false)
                {
                    document.getElementById("passwordmsg").textContent="Password should contains either $ or @ or *";
                    document.getElementById("passwordmsg").setAttribute("style","display:visible;color:red");
                    document.getElementById("successful_message").setAttribute("style","display:none;");

                }
                else{
                    document.getElementById("passwordmsg").setAttribute("style","display:none;");
                    if(regex_cap.test(password)==false)
                    {
                        document.getElementById("passwordmsg").textContent="Password should contain 1 Capital letter";
                        document.getElementById("passwordmsg").setAttribute("style","display:visible;color:red");  
                        document.getElementById("successful_message").setAttribute("style","display:none;");

                    }
                    else{
                        //document.getElementById("successfull_message").innerHTML="Login Sucessfull";
                        if(password!=confirmpassword)
                            {
                                document.getElementById("confirmpasswordmsg").textContent="Password Not Matched";
                                document.getElementById("confirmpasswordmsg").setAttribute("style","display:visible;color:red");
                                document.getElementById("successful_message").setAttribute("style","display:none;");


                            }
                            else{
                                if(username==="")
                                    {
                                        document.getElementById("namemsg").setAttribute("style","display:visible;color:red");
                                        document.getElementById("successful_message").setAttribute("style","display:none;");

                                    }
                                    else{
                                        document.getElementById("namemsg").setAttribute("style","display:none;");
                                        document.getElementById("confirmpasswordmsg").setAttribute("style","display:none;");
                                
                                        document.getElementById("passwordmsg").setAttribute("style","display:none;");
                                        document.getElementById("successful_message").innerHTML="Login Successfull";

                                    }
                                
                            }

                    }
                }
                
            }
        }
    

}