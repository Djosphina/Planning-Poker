package tn.examen.EyaProject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.io.Serializable;

@Entity
@Table(
        name = "Ticket"
)
public class Ticket implements Serializable {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    @Column(
            name = "idticket"
    )
    private Long Id;
    private String self;
    private String key;
    @Embedded
    private Fields fields;
    @ManyToOne
    Sprint sprint;

    public Long getId() {
        return this.Id;
    }

    public String getSelf() {
        return this.self;
    }

    public String getKey() {
        return this.key;
    }

    public Fields getFields() {
        return this.fields;
    }

    public Sprint getSprint() {
        return this.sprint;
    }

    public void setId(final Long Id) {
        this.Id = Id;
    }

    public void setSelf(final String self) {
        this.self = self;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setFields(final Fields fields) {
        this.fields = fields;
    }

    public void setSprint(final Sprint sprint) {
        this.sprint = sprint;
    }

    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof Ticket)) {
            return false;
        } else {
            Ticket other = (Ticket)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                label71: {
                    Object this$Id = this.getId();
                    Object other$Id = other.getId();
                    if (this$Id == null) {
                        if (other$Id == null) {
                            break label71;
                        }
                    } else if (this$Id.equals(other$Id)) {
                        break label71;
                    }

                    return false;
                }

                Object this$self = this.getSelf();
                Object other$self = other.getSelf();
                if (this$self == null) {
                    if (other$self != null) {
                        return false;
                    }
                } else if (!this$self.equals(other$self)) {
                    return false;
                }

                label57: {
                    Object this$key = this.getKey();
                    Object other$key = other.getKey();
                    if (this$key == null) {
                        if (other$key == null) {
                            break label57;
                        }
                    } else if (this$key.equals(other$key)) {
                        break label57;
                    }

                    return false;
                }

                Object this$fields = this.getFields();
                Object other$fields = other.getFields();
                if (this$fields == null) {
                    if (other$fields != null) {
                        return false;
                    }
                } else if (!this$fields.equals(other$fields)) {
                    return false;
                }

                Object this$sprint = this.getSprint();
                Object other$sprint = other.getSprint();
                if (this$sprint == null) {
                    if (other$sprint == null) {
                        return true;
                    }
                } else if (this$sprint.equals(other$sprint)) {
                    return true;
                }

                return false;
            }
        }
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Ticket;
    }

    public int hashCode() {
        int PRIME = 31;
        int result = 1;
        Object $Id = this.getId();
        result = result * 59 + ($Id == null ? 43 : $Id.hashCode());
        Object $self = this.getSelf();
        result = result * 59 + ($self == null ? 43 : $self.hashCode());
        Object $key = this.getKey();
        result = result * 59 + ($key == null ? 43 : $key.hashCode());
        Object $fields = this.getFields();
        result = result * 59 + ($fields == null ? 43 : $fields.hashCode());
        Object $sprint = this.getSprint();
        result = result * 59 + ($sprint == null ? 43 : $sprint.hashCode());
        return result;
    }

    public Ticket(final Long Id, final String self, final String key, final Fields fields, final Sprint sprint) {
        this.Id = Id;
        this.self = self;
        this.key = key;
        this.fields = fields;
        this.sprint = sprint;
    }

    public Ticket() {
    }

    @Embeddable
    public static class Fields {
        private String summary;
        private String description;
        @Embedded
        private Priority priority;
        @Embedded
        private Status status;
        @Embedded
        private Assignee assignee;
        @Embedded
        private Reporter reporter;
        private String created;
        private String updated;

        public Fields() {
        }

        public String getSummary() {
            return this.summary;
        }

        public String getDescription() {
            return this.description;
        }

        public Priority getPriority() {
            return this.priority;
        }

        public Status getStatus() {
            return this.status;
        }

        public Assignee getAssignee() {
            return this.assignee;
        }

        public Reporter getReporter() {
            return this.reporter;
        }

        public String getCreated() {
            return this.created;
        }

        public String getUpdated() {
            return this.updated;
        }

        public void setSummary(final String summary) {
            this.summary = summary;
        }

        public void setDescription(final String description) {
            this.description = description;
        }

        public void setPriority(final Priority priority) {
            this.priority = priority;
        }

        public void setStatus(final Status status) {
            this.status = status;
        }

        public void setAssignee(final Assignee assignee) {
            this.assignee = assignee;
        }

        public void setReporter(final Reporter reporter) {
            this.reporter = reporter;
        }

        public void setCreated(final String created) {
            this.created = created;
        }

        public void setUpdated(final String updated) {
            this.updated = updated;
        }

        public boolean equals(final Object o) {
            if (o == this) {
                return true;
            } else if (!(o instanceof Fields)) {
                return false;
            } else {
                Fields other = (Fields)o;
                if (!other.canEqual(this)) {
                    return false;
                } else {
                    label107: {
                        Object this$summary = this.getSummary();
                        Object other$summary = other.getSummary();
                        if (this$summary == null) {
                            if (other$summary == null) {
                                break label107;
                            }
                        } else if (this$summary.equals(other$summary)) {
                            break label107;
                        }

                        return false;
                    }

                    Object this$description = this.getDescription();
                    Object other$description = other.getDescription();
                    if (this$description == null) {
                        if (other$description != null) {
                            return false;
                        }
                    } else if (!this$description.equals(other$description)) {
                        return false;
                    }

                    Object this$priority = this.getPriority();
                    Object other$priority = other.getPriority();
                    if (this$priority == null) {
                        if (other$priority != null) {
                            return false;
                        }
                    } else if (!this$priority.equals(other$priority)) {
                        return false;
                    }

                    label86: {
                        Object this$status = this.getStatus();
                        Object other$status = other.getStatus();
                        if (this$status == null) {
                            if (other$status == null) {
                                break label86;
                            }
                        } else if (this$status.equals(other$status)) {
                            break label86;
                        }

                        return false;
                    }

                    label79: {
                        Object this$assignee = this.getAssignee();
                        Object other$assignee = other.getAssignee();
                        if (this$assignee == null) {
                            if (other$assignee == null) {
                                break label79;
                            }
                        } else if (this$assignee.equals(other$assignee)) {
                            break label79;
                        }

                        return false;
                    }

                    label72: {
                        Object this$reporter = this.getReporter();
                        Object other$reporter = other.getReporter();
                        if (this$reporter == null) {
                            if (other$reporter == null) {
                                break label72;
                            }
                        } else if (this$reporter.equals(other$reporter)) {
                            break label72;
                        }

                        return false;
                    }

                    Object this$created = this.getCreated();
                    Object other$created = other.getCreated();
                    if (this$created == null) {
                        if (other$created != null) {
                            return false;
                        }
                    } else if (!this$created.equals(other$created)) {
                        return false;
                    }

                    Object this$updated = this.getUpdated();
                    Object other$updated = other.getUpdated();
                    if (this$updated == null) {
                        if (other$updated != null) {
                            return false;
                        }
                    } else if (!this$updated.equals(other$updated)) {
                        return false;
                    }

                    return true;
                }
            }
        }

        protected boolean canEqual(final Object other) {
            return other instanceof Fields;
        }

        public int hashCode() {
            int PRIME = 31;
            int result = 1;
            Object $summary = this.getSummary();
            result = result * 59 + ($summary == null ? 43 : $summary.hashCode());
            Object $description = this.getDescription();
            result = result * 59 + ($description == null ? 43 : $description.hashCode());
            Object $priority = this.getPriority();
            result = result * 59 + ($priority == null ? 43 : $priority.hashCode());
            Object $status = this.getStatus();
            result = result * 59 + ($status == null ? 43 : $status.hashCode());
            Object $assignee = this.getAssignee();
            result = result * 59 + ($assignee == null ? 43 : $assignee.hashCode());
            Object $reporter = this.getReporter();
            result = result * 59 + ($reporter == null ? 43 : $reporter.hashCode());
            Object $created = this.getCreated();
            result = result * 59 + ($created == null ? 43 : $created.hashCode());
            Object $updated = this.getUpdated();
            result = result * 59 + ($updated == null ? 43 : $updated.hashCode());
            return result;
        }

        public String toString() {
            String var10000 = this.getSummary();
            return "Ticket.Fields(summary=" + var10000 + ", description=" + this.getDescription() + ", priority=" + this.getPriority() + ", status=" + this.getStatus() + ", assignee=" + this.getAssignee() + ", reporter=" + this.getReporter() + ", created=" + this.getCreated() + ", updated=" + this.getUpdated() + ")";
        }
    }

    @Embeddable
    public static class Reporter {
        @Column(
                name = "reporter_name"
        )
        private String name;

        public Reporter() {
        }

        public String getName() {
            return this.name;
        }

        public void setName(final String name) {
            this.name = name;
        }

        public boolean equals(final Object o) {
            if (o == this) {
                return true;
            } else if (!(o instanceof Reporter)) {
                return false;
            } else {
                Reporter other = (Reporter)o;
                if (!other.canEqual(this)) {
                    return false;
                } else {
                    Object this$name = this.getName();
                    Object other$name = other.getName();
                    if (this$name == null) {
                        if (other$name != null) {
                            return false;
                        }
                    } else if (!this$name.equals(other$name)) {
                        return false;
                    }

                    return true;
                }
            }
        }

        protected boolean canEqual(final Object other) {
            return other instanceof Reporter;
        }

        public int hashCode() {
            int PRIME = 31;
            int result = 1;
            Object $name = this.getName();
            result = result * 59 + ($name == null ? 43 : $name.hashCode());
            return result;
        }

        public String toString() {
            return "Ticket.Reporter(name=" + this.getName() + ")";
        }
    }

    @Embeddable
    public static class Assignee {
        @Column(
                name = "assignee_name"
        )
        private String name;

        public Assignee() {
        }

        public String getName() {
            return this.name;
        }

        public void setName(final String name) {
            this.name = name;
        }

        public boolean equals(final Object o) {
            if (o == this) {
                return true;
            } else if (!(o instanceof Assignee)) {
                return false;
            } else {
                Assignee other = (Assignee)o;
                if (!other.canEqual(this)) {
                    return false;
                } else {
                    Object this$name = this.getName();
                    Object other$name = other.getName();
                    if (this$name == null) {
                        if (other$name != null) {
                            return false;
                        }
                    } else if (!this$name.equals(other$name)) {
                        return false;
                    }

                    return true;
                }
            }
        }

        protected boolean canEqual(final Object other) {
            return other instanceof Assignee;
        }

        public int hashCode() {
            int PRIME = 31;
            int result = 1;
            Object $name = this.getName();
            result = result * 59 + ($name == null ? 43 : $name.hashCode());
            return result;
        }

        public String toString() {
            return "Ticket.Assignee(name=" + this.getName() + ")";
        }
    }

    @Embeddable
    public static class Status {
        @Column(
                name = "status_name"
        )
        private String name;

        public Status() {
        }

        public String getName() {
            return this.name;
        }

        public void setName(final String name) {
            this.name = name;
        }

        public boolean equals(final Object o) {
            if (o == this) {
                return true;
            } else if (!(o instanceof Status)) {
                return false;
            } else {
                Status other = (Status)o;
                if (!other.canEqual(this)) {
                    return false;
                } else {
                    Object this$name = this.getName();
                    Object other$name = other.getName();
                    if (this$name == null) {
                        if (other$name != null) {
                            return false;
                        }
                    } else if (!this$name.equals(other$name)) {
                        return false;
                    }

                    return true;
                }
            }
        }

        protected boolean canEqual(final Object other) {
            return other instanceof Status;
        }

        public int hashCode() {
            int PRIME = 31;
            int result = 1;
            Object $name = this.getName();
            result = result * 59 + ($name == null ? 43 : $name.hashCode());
            return result;
        }

        public String toString() {
            return "Ticket.Status(name=" + this.getName() + ")";
        }
    }

    @Embeddable
    public static class Priority {
        @Column(
                name = "priority_name"
        )
        private String name;

        public Priority() {
        }

        public String getName() {
            return this.name;
        }

        public void setName(final String name) {
            this.name = name;
        }

        public boolean equals(final Object o) {
            if (o == this) {
                return true;
            } else if (!(o instanceof Priority)) {
                return false;
            } else {
                Priority other = (Priority)o;
                if (!other.canEqual(this)) {
                    return false;
                } else {
                    Object this$name = this.getName();
                    Object other$name = other.getName();
                    if (this$name == null) {
                        if (other$name != null) {
                            return false;
                        }
                    } else if (!this$name.equals(other$name)) {
                        return false;
                    }

                    return true;
                }
            }
        }

        protected boolean canEqual(final Object other) {
            return other instanceof Priority;
        }

        public int hashCode() {
            int PRIME = 31;
            int result = 1;
            Object $name = this.getName();
            result = result * 59 + ($name == null ? 43 : $name.hashCode());
            return result;
        }

        public String toString() {
            return "Ticket.Priority(name=" + this.getName() + ")";
        }
    }
}