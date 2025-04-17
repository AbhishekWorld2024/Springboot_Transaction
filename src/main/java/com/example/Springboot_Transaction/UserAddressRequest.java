package com.example.Springboot_Transaction;



    public class UserAddressRequest {
        private String name;
        private String city;

        // Constructors
        public UserAddressRequest() {}

        public UserAddressRequest(String name, String city) {
            this.name = name;
            this.city = city;
        }

        // Getters and Setters
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }
    }


