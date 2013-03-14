package org.gatein.wcm.impl.model;

import java.util.ArrayList;
import java.util.List;

import org.gatein.wcm.api.model.security.ACE;
import org.gatein.wcm.api.model.security.ACL;

public class WcmACL implements ACL {

    String id;
    String description;
    ArrayList<ACE> aces;

    protected WcmACL(String id, String description) {
        this.id = id;
        this.description = description;
        aces = new ArrayList<ACE>();
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public List<ACE> getAces() {
        return aces;
    }

    @Override
    public String toString() {
        return "WCMACL [id=" + id + ", description=" + description + ", aces=" + aces + "]";
    }

}
