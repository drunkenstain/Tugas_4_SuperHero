package com.example.tugas_4.Model;

import java.util.List;

public class SuperheroResponse {
    private List<Superhero> results;

    public List<Superhero> getResults() {
        return results;
    }

    public void setResults(List<Superhero> results) {
        this.results = results;
    }

    public static class Superhero {
        private String name;
        private Image image;
        private Powerstats powerstats;
        private Biography biography;
        private Appearance appearance;
        private Work work;
        private Connections connections;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Image getImage() {
            return image;
        }

        public void setImage(Image image) {
            this.image = image;
        }

        public Powerstats getPowerstats() {
            return powerstats;
        }

        public void setPowerstats(Powerstats powerstats) {
            this.powerstats = powerstats;
        }

        public Biography getBiography() {
            return biography;
        }

        public void setBiography(Biography biography) {
            this.biography = biography;
        }

        public Appearance getAppearance() {
            return appearance;
        }

        public void setAppearance(Appearance appearance) {
            this.appearance = appearance;
        }

        public Work getWork() {
            return work;
        }

        public void setWork(Work work) {
            this.work = work;
        }

        public Connections getConnections() {
            return connections;
        }

        public void setConnections(Connections connections) {
            this.connections = connections;
        }

        public static class Image {
            private String url;

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }
        }

        public static class Powerstats {
            private String intelligence;
            private String strength;
            private String speed;
            private String durability;
            private String power;
            private String combat;

            public String getIntelligence() {
                return intelligence;
            }

            public void setIntelligence(String intelligence) {
                this.intelligence = intelligence;
            }

            public String getStrength() {
                return strength;
            }

            public void setStrength(String strength) {
                this.strength = strength;
            }

            public String getSpeed() {
                return speed;
            }

            public void setSpeed(String speed) {
                this.speed = speed;
            }

            public String getDurability() {
                return durability;
            }

            public void setDurability(String durability) {
                this.durability = durability;
            }

            public String getPower() {
                return power;
            }

            public void setPower(String power) {
                this.power = power;
            }

            public String getCombat() {
                return combat;
            }

            public void setCombat(String combat) {
                this.combat = combat;
            }
        }

        public static class Biography {
            private String fullName;
            private String alterEgos;
            private List<String> aliases;
            private String placeOfBirth;
            private String firstAppearance;
            private String publisher;
            private String alignment;

            public String getFullName() {
                return fullName;
            }

            public void setFullName(String fullName) {
                this.fullName = fullName;
            }

            public String getAlterEgos() {
                return alterEgos;
            }

            public void setAlterEgos(String alterEgos) {
                this.alterEgos = alterEgos;
            }

            public List<String> getAliases() {
                return aliases;
            }

            public void setAliases(List<String> aliases) {
                this.aliases = aliases;
            }

            public String getPlaceOfBirth() {
                return placeOfBirth;
            }

            public void setPlaceOfBirth(String placeOfBirth) {
                this.placeOfBirth = placeOfBirth;
            }

            public String getFirstAppearance() {
                return firstAppearance;
            }

            public void setFirstAppearance(String firstAppearance) {
                this.firstAppearance = firstAppearance;
            }

            public String getPublisher() {
                return publisher;
            }

            public void setPublisher(String publisher) {
                this.publisher = publisher;
            }

            public String getAlignment() {
                return alignment;
            }

            public void setAlignment(String alignment) {
                this.alignment = alignment;
            }
        }

        public static class Appearance {
            private String gender;
            private String race;
            private List<String> height;
            private List<String> weight;
            private String eyeColor;
            private String hairColor;

            public String getGender() {
                return gender;
            }

            public void setGender(String gender) {
                this.gender = gender;
            }

            public String getRace() {
                return race;
            }

            public void setRace(String race) {
                this.race = race;
            }

            public List<String> getHeight() {
                return height;
            }

            public void setHeight(List<String> height) {
                this.height = height;
            }

            public List<String> getWeight() {
                return weight;
            }

            public void setWeight(List<String> weight) {
                this.weight = weight;
            }

            public String getEyeColor() {
                return eyeColor;
            }

            public void setEyeColor(String eyeColor) {
                this.eyeColor = eyeColor;
            }

            public String getHairColor() {
                return hairColor;
            }

            public void setHairColor(String hairColor) {
                this.hairColor = hairColor;
            }
        }

        public static class Work {
            private String occupation;
            private String base;

            public String getOccupation() {
                return occupation;
            }

            public void setOccupation(String occupation) {
                this.occupation = occupation;
            }

            public String getBase() {
                return base;
            }

            public void setBase(String base) {
                this.base = base;
            }
        }

        public static class Connections {
            private String groupAffiliation;
            private String relatives;

            public String getGroupAffiliation() {
                return groupAffiliation;
            }

            public void setGroupAffiliation(String groupAffiliation) {
                this.groupAffiliation = groupAffiliation;
            }

            public String getRelatives() {
                return relatives;
            }

            public void setRelatives(String relatives) {
                this.relatives = relatives;
            }
        }
    }
}

