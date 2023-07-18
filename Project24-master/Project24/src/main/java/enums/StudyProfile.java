package enums;

    public enum StudyProfile {
        MEDICINE("Медицина"),
        COMPUTER_SCIENCE("Информатика"),
        PHYSICS("Физика"),
        MATHEMATICS("Математика"),
        JURISPRUDENCE("Юриспруденция"),
        LINGUISTICS("Лингвистика");

        private String profileName;

        StudyProfile(String profileName) {
            this.profileName = profileName;
        }

        public String getProfileName() {
            return profileName;
        }
    }
