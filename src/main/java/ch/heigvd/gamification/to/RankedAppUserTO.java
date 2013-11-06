package ch.heigvd.gamification.to;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Alexandre Perusset
 */
@XmlRootElement(name="user")
public class RankedAppUserTO {
  
  private long id;
  
  private long points;
  
  private String name;
  
  private String surname;
  
  private String nickname;
  
  public RankedAppUserTO() {
  }
  
  public RankedAppUserTO(long id, long points, String name, String surname, String nickname) {
    this.id = id;
    this.points = points;
    this.name = name;
    this.surname = surname;
    this.nickname = nickname;
  }
  
  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getPoints() {
    return points;
  }
  
  public void setPoints(long points) {
    this.points = points;
  }
  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }
  
}