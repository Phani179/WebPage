<!DOCTYPE html>
<html>
    <head>
        <title>Login</title>
        <link type="text/CSS" rel="stylesheet" href="index.css">
    </head>
    <body style="background-color: aqua;">
        <h1 style="text-align: center;">Form</h1>
        <div id = "form">
            <form action="spring/create" id = "student_form">
                <div>
                    <label for = "Name">Name of the Student(as per SSC) :</label>
                    <br>
                    <input type = "text" name = "Name" placeholder="Enter here">
                </div>
                <div>
                    <label for = "RegNum">Registration Number :</label>
                    <br>
                    <input type = "text" name = "Registration_Number" placeholder="Enter here">
                </div>
                <div>
                    <label for = "Date_of_Birth">Date of Birth :</label>
                    <br>
                    <input type="date" name = "Date_of_Birth">
                </div>
                <div>
                    <label for = "Sex">Sex :</label>
                    <br>
                    <input type = "radio" name = "Sex" value = "Male">Male
                    <input type = "radio" name = "Sex" value = "Female">Female
                    <input type = "radio" name = "Sex" value = "Others">Others
                </div>
                <div>
                    <label for = "Community">Community :</label><br>
                    <input type = "radio" name = "Community" value = "OC">OC
                    <input type = "radio" name = "Community" value = "BC">BC
                    <input type = "radio" name = "Community" value = "ST">ST
                    <input type = "radio" name = "Community" value = "SC">SC
                </div>
                <div>
                    <label for = "Physically challanged">Physically_challanged :</label><br>
                    <input type = "radio" name = "Physically_challanged" value = "Yes">Yes
                    <input type = "radio" name = "Physically_challanged" value = "No">No
                </div>
                <div>
                    <label for = "Address">Address to which communication to be sent : </label><br>
                    <textarea name = "Address" rows="3" placeholder="Enter here"></textarea>
                </div>
                <div>
                    <label for = "Phone_number">Phone Number :</label><br>
                    <input type="password" name = "Phone_number" id = "Phone_number" placeholder="Enter here">
                </div>
                <div>
                    <label for ="Aadhar_number">Aadhar Number :</label><br>
                    <input type="text" name = "Aadhar_number" id="Aadhar_number" placeholder="Enter here">
                </div> 
                <div>
                    <label for ="Email_Id">Email Id :</label><br>
                    <input type="email" name = "Email_Id" id="Email_id" placeholder="Enter here">
                </div>          
                <div>
                    <label for ="degree_qualified">Degree Qualified :</label><br>
                    <select name = "degree_qualified">
                        <option value = "UG">Under-Graduation</option>
                        <option value = "PG">Post-Graduation</option>
                    </select>
                </div>
                <div>
                    <label for ="year_of_passing">Year Of Passing</label><br>
                    <select name = "year_of_passing">
                        <option value = "2020">2020</option>
                        <option value = "2021">2021</option>
                        <option value = "2022">2022</option>
                        <option value = "2023">2023</option>
                        <option value = "2024">2024</option>
                    </select>
                </div>
                <div>
                    <label for = "Branch">Subject Major : </label><br>
                    <input type = "radio" name="Branch" value = "CSE">CSE
                    <input type = "radio" name="Branch" value = "ECE">ECE
                    <input type = "radio" name="Branch" value = "MECH">MECH
                </div>
                <div>
                    <label for ="year_of_admission">Year Of Admission</label><br>
                    <select name = "year_of_admission">
                        <option value = "2018">2018</option>
                        <option value = "2019">2019</option>
                        <option value = "2020">2020</option>
                        <option value = "2021">2021</option>
                        <option value = "2022">2022</option>
                        <option value = "2023">2023</option>
                        <option value = "2024">2024</option>
                    </select>
                </div>
                <div>
                    <label for = "name_of_the_college">Name of the College :</label><br>
                    <input type="text" id = "name_of_the_college" name="name_of_the_college" placeholder="Enter here">
                </div>
                <button type="submit" id = "submit_button">Submit</button>
                <button type="reset" id = "reset_button">Reset</button>
            </form>
        </div>
        
    </body>
</html>
