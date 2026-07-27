public class MapUsingHash {
    private Entity[] entities;
    public MapUsingHash(){
        entities = new Entity[100];
    }

    public void put(String key, String values){
        int hash = Math.abs(key.hashCode() % entities.length);
        entities[hash] = new Entity(key, values); // overwrite if collision occurs
    }

    public String get(String key){
        int hash = Math.abs(key.hashCode() % entities.length);
        if(entities[hash] != null && entities[hash].key.equals(key)){
            return entities[hash].value;
        } else {
            return null;    
        }
    }

    public void remove(String key){
        int hash = Math.abs(key.hashCode() % entities.length);
        if(entities[hash] != null && entities[hash].key.equals(key)){
            entities[hash] = null; // remove the entity if the key matches
        } 
    }

    private class Entity{
        String key;
        String value;
        public Entity(String key, String value){
            this.key = key;
            this.value = value;
        }
    }
}
