package com.xworkz.query;

public class College {
    String insertQuery = "INSERT INTO students1_table VALUES" +
            "(1, 'Arjun Reddy', 'arjun.reddy@example.com', 'Arjun@123', '919876543210', 'RV College of Engineering', 'Computer Science', '2023', 125000.00, 'Yes')," +
            "(2, 'Divya Gowda', 'divya.gowda@example.com', 'Divya@456', '919876543211', 'BMS College of Engineering', 'Mechanical Engineering', '2024', 105000.00, 'No')," +
            "(3, 'Harish Shetty', 'harish.shetty@example.com', 'Harish@789', '919876543212', 'MS Ramaiah Institute of Technology', 'Electrical Engineering', '2023', 115000.00, 'Yes')," +
            "(4, 'Pooja Rao', 'pooja.rao@example.com', 'Pooja@101', '919876543213', 'PES University', 'Information Technology', '2025', 135000.00, 'No')," +
            "(5, 'Ravi Kumar', 'ravi.kumar@example.com', 'Ravi@202', '919876543214', 'NIT Surathkal', 'Civil Engineering', '2026', 150000.00, 'Yes')," +
            "(6, 'Sneha Nair', 'sneha.nair@example.com', 'Sneha@303', '919876543215', 'Manipal Institute of Technology', 'Biotechnology', '2027', 140000.00, 'No')," +
            "(7, 'Vinay Patil', 'vinay.patil@example.com', 'Vinay@404', '919876543216', 'Christ University', 'Business Administration', '2028', 90000.00, 'Yes')," +
            "(8, 'Kavya Shankar', 'kavya.shankar@example.com', 'Kavya@505', '919876543217', 'St. Joseph''s College', 'Psychology', '2029', 75000.00, 'No')," +
            "(9, 'Aditya Raj', 'aditya.raj@example.com', 'Aditya@606', '919876543218', 'Dayananda Sagar College', 'Electronics', '2030', 110000.00, 'Yes')," +
            "(10, 'Murthy', 'murthy@example.com', 'murty@707', '919876543219', 'Reva University', 'Pharmacy', '2031', 130000.00, 'No')," +
            "(11, 'Rahul Menon', 'rahul.menon@example.com', 'Rahul@808', '919876543220', 'Mount Carmel College', 'Biochemistry', '2023', 80000.00, 'Yes')," +
            "(12, 'Lakshmi Iyer', 'lakshmi.iyer@example.com', 'Lakshmi@909', '919876543221', 'Jain University', 'Physics', '2032', 95000.00, 'No')," +
            "(13, 'Nikhil Deshpande', 'nikhil.deshpande@example.com', 'Nikhil@010', '919876543222', 'Alliance University', 'Economics', '2033', 87000.00, 'Yes')," +
            "(14, 'Reshma Pai', 'reshma.pai@example.com', 'Reshma@111', '919876543223', 'Garden City University', 'Marketing', '2034', 92000.00, 'No')," +
            "(15, 'Akash R', 'akash.r@example.com', 'Akash@212', '919876543224', 'Acharya Institute of Technology', 'Aerospace Engineering', '2035', 160000.00, 'Yes')," +
            "(16, 'Shreya Rao', 'shreya.rao@example.com', 'Shreya@313', '919876543225', 'Oxford College', 'Nursing', '2036', 105000.00, 'No')," +
            "(17, 'Vivek Joshi', 'vivek.joshi@example.com', 'Vivek@414', '919876543226', 'KLE Technological University', 'Chemical Engineering', '2037', 125000.00, 'Yes')," +
            "(18, 'Anjali P', 'anjali.p@example.com', 'Anjali@515', '919876543227', 'Bangalore Institute of Technology', 'Mathematics', '2038', 70000.00, 'No')," +
            "(19, 'Manoj Kini', 'manoj.kini@example.com', 'Manoj@616', '919876543228', 'New Horizon College', 'Law', '2039', 90000.00, 'Yes')," +
            "(20, 'Priya Shetty', 'priya.shetty@example.com', 'Priya@717', '919876543229', 'Jyoti Nivas College', 'Media Studies', '2040', 85000.00, 'No');";

    public String getInsertQuery() {
        return insertQuery;
    }
}
