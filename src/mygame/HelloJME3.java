package mygame;

import com.jme3.app.SimpleApplication;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.math.Vector3f;
import com.jme3.renderer.RenderManager;
import com.jme3.scene.Geometry;
import com.jme3.scene.shape.Box;
import com.jme3.scene.shape.Sphere;
import com.jme3.texture.Texture;

public class HelloJME3 extends SimpleApplication {

    public static void main(String[] args) {
        HelloJME3 app = new HelloJME3();
        app.start();
    }

    public void simpleInitApp() {
        Box b = new Box(Vector3f.ZERO, 1, 3, 1);
        Geometry geom = new Geometry("Box", b);
        
        Box b2 = new Box(new Vector3f(4,4,0), 4, 1, 1);
        Geometry geom2 = new Geometry("Box", b2);

        Box b3 = new Box(new Vector3f(8,0,0), 1, 3, 1);
        Geometry geom3 = new Geometry("Box", b3);
        

    
        

        
        
        
        Material mat = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        
        
     
        Texture t = assetManager.loadTexture("Textures/box.jpg");
	mat.setTexture("ColorMap",t);
               
        //mat.setColor("Color", ColorRGBA.Blue);
        geom.setMaterial(mat);
        geom2.setMaterial(mat);
        geom3.setMaterial(mat);

        
        
    Sphere pigSphere = new Sphere( 10, 10, 1f);
    Geometry pig_geo = new Geometry("brick ball", pigSphere);

    Material pig_mat = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
    pig_mat.setColor("Color", ColorRGBA.Green);
    pig_geo.setMaterial(pig_mat);
    rootNode.attachChild(pig_geo);
    pig_geo.setLocalTranslation(new Vector3f(2,6,0));

        

        rootNode.attachChild(geom3);
        rootNode.attachChild(geom2);        
        rootNode.attachChild(geom);
    }
}
