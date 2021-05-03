class Friend {
  private String userName;
  private String biography;
  private int followers;
  private boolean isPrivateAccount;

  public Friend(String userName) {
    setUserName(userName);
    this.followers = 0;
    this.isPrivateAccount = false;
  }

  public String getUserName() {
    return this.userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getBiography() {
    return this.biography;
  }

  public void setBiography(String biography) {
    this.biography = biography;
  }

  public int getFollowers() {
    return this.followers;
  }

  public void setFollowers(int followers) {
    this.followers = followers;
  }

  public boolean isPrivateAccount() {
    return this.isPrivateAccount;
  }

  public void setProtection(boolean isPrivateAccount) {
    this.isPrivateAccount = isPrivateAccount;
  }
}
