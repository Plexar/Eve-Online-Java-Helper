package eu.burbach.eve.api;

import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.NodeList;

public class EveXmlApiAdapter {
	private String keyId;
	private String vCode;
	
	private Document skillTree=null;
	private HashMap<String,String> skillTypeId2Name= null;

	public EveXmlApiAdapter(String k, String v) {
		keyId= k;
		vCode= v;
	}		
	
	private Document read(String f, String... args) {
		try {
			StringBuilder b = new StringBuilder();
			for (int i = 0; i < args.length; i += 2) {
				if (b.length() > 0)
					b.append("&");
				b.append(args[i].toString()).append("=").append(args[i + 1]);
			}
			URL url = new URL("https://api.eveonline.com/" + f + ".xml.aspx?"
					+ b.toString());

			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();

			Document doc = db.parse(url.openStream());

			doc.getDocumentElement().normalize();

			return doc;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	private List<String> get(Document doc, String name, String...args) {
		List<String> res= new ArrayList<>();
		if (doc==null)
			return res;
		NodeList nList= doc.getElementsByTagName("rowset");
		for(int i = 0; i < nList.getLength(); i++) {
			Element e = (Element) nList.item(i);
			String rowName= e.getAttribute("name");
			if(rowName.toLowerCase().equals(name)) {
				NodeList charList = e.getElementsByTagName("row");
				for(int chars = 0; chars < charList.getLength(); chars++) {
					Element charElem = (Element) charList.item(chars);
					List<String> tmp= new ArrayList<>();
					for (String j: args) {
						String value= charElem.getAttribute(j);
						if (value==null || value.trim().length()<=0) {
							tmp.clear();
							break;
						}
						tmp.add(value);						
					}
					res.addAll(tmp);
				}
			}
		}
		
		return res;
	}
	
	public List<String> getCharacterNames() {
		return get(read("account/Characters", "keyID", keyId, "vCode", vCode), "characters","name");
	}
	
	public List<String> getMemberNames() {
		return get(read("corp/MemberTracking", "keyID", keyId, "vCode", vCode), "members","name");
	}
	
	public List<String> getSkillQueue(String charID) {
		if (charID==null || charID.trim().length()<=0)
			return new ArrayList<String>();
		return get(read("char/SkillQueue", "keyID", keyId, "vCode", vCode,"characterID",charID), 
				"skillqueue","queuePosition","typeID","level","startTime","endTime");
	}
	
	public String charName2Id(String name) {
		if (name==null || name.trim().length()<=0)
			return "";
		List<String> l= get(read("eve/CharacterID", "names", name),"characters","characterID");
		if (l.size()<=0)
			return "";
		else
			return l.get(0);
	}

	/**
	 * liefert zu einer Skill ID (Nummer) den Namen als Text; die Liste aller Skills vom wird Eve Server geladen,
	 * falls dies vorher noch nicht geschehen ist
	 * @param typeId Skill ID (Nummer)
	 * @return Name des Skills als Text
	 */
	public String skillTypeId2Name(String typeId) {
		if (skillTree==null) {
			skillTree= read("eve/SkillTree");
		}
		if (skillTypeId2Name==null) {
			skillTypeId2Name= new HashMap<>();
			List<String> list= get(skillTree,"skills","typeID","typeName");
			for (int i=0; i<list.size();i+=2) 
				skillTypeId2Name.put(list.get(i), list.get(i+1));			
		}
		String res= skillTypeId2Name.get(typeId);
		if (res==null)
			return typeId;
		else
			return res;
	}

	/**
	 * liest die bekannten Skills eines Charakters vom Eve Server
	 * @param charId ID (Nummer) des Charakters
	 * @return Liste der Skills in Gruppen zu 3 Werten: Skill ID, Skill Level, Skill Punkte
	 */
	public List<String> getKnownSkills(String charId) {
		return get(read("char/CharacterSheet","keyID", keyId, "vCode", vCode,"characterID",charId),
				"skills","typeID","level","skillpoints");
	}
}