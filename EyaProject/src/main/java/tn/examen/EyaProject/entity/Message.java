package tn.examen.EyaProject.entity;

import jakarta.persistence.Entity;

public class Message {

        public Message() {
        }

        public boolean equals(final Object o) {
            if (o == this) {
                return true;
            } else if (!(o instanceof Message)) {
                return false;
            } else {
                Message other = (Message)o;
                return other.canEqual(this);
            }
        }

        protected boolean canEqual(final Object other) {
            return other instanceof Message;
        }

        public int hashCode() {
            int result = 31;
            return 1;
        }

        public String toString() {
            return "Message()";
        }
    }

