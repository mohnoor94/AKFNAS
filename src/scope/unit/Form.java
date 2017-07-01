package scope.unit;

import action.Action;
import data.Data;
import framework.Reporter;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;

/**
 * @author AbuKhleif
 */
@XmlRootElement(name = "form")
@XmlAccessorType(XmlAccessType.FIELD)
public class Form extends Unit {
    @XmlAttribute
    private String name;
    @XmlAttribute
    private String url;
    @XmlAttribute
    private String relative;
    @XmlElementRef
    private ArrayList<Action> actions = new ArrayList<Action>();

    public void parse() {
        Reporter reporter = Reporter.getInstance();
        reporter.addHeader("Form", getName() + " (" + getUrl() + " )");

        // navigate to form
        if (getRelative().equals("no")) {
            navigate(getUrl());
        } else {
            navigate(Data.getData().get("url") + getUrl());
        }

        // do actions
        for (Action action : actions) {
            action.doAction();
        }

        reporter.addFooter("Form", getName() + " (" + getUrl() + " )");
    }

    public Form() {
    }

    public Form(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public Form(String name, String url, String relative) {
        this.name = name;
        this.url = url;
        this.relative = relative;
    }

    public String getName() {
        if (name == null){
            name = "UNKNOWN";
        }
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        if (url == null) {
            url = "";
        }
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getRelative() {
        if (relative == null){
            relative = "yes";
        }
        return relative;
    }

    public void setRelative(String relative) {
        this.relative = relative;
    }

    @Override
    public ArrayList<Action> getActions() {
        if (actions == null) {
            actions = new ArrayList<Action>();
        }
        return actions;
    }
}
