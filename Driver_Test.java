public class Driver_Test {

  public static void main(String[] args) {

    WordSearch WSe = new WordSearch(10,14,"words.txt");

    System.out.println("WordSearch WSe = new WordSearch(10,14,\"words.txt\")");
    System.out.println(WSe);
    /*
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
    */

    System.out.println("WSe.addWord(\"CLOUD\",0,2,0,0)");
    if(WSe.addWord("CLOUD",0,2,0,0)) {
      System.out.println("> addition success.");
      System.out.println("> TEST CASE - FAIL");
    } else {
      System.out.println("> addition failure.");
      System.out.println("> TEST CASE - PASS");
    }
    // > addition failure.
    // should fail, rowIncrement and colIncrement both equal 0

    System.out.println(WSe);
    /*
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
    */

    System.out.println("WSe.addWord(\"CLOUD\",0,2,0,1)");
    if(WSe.addWord("CLOUD",0,2,0,1)) {
      System.out.println("> addition success.");
      System.out.println("> TEST CASE - PASS");
    } else {
      System.out.println("> addition failure.");
      System.out.println("> TEST CASE - FAIL");
    }
    // > addition success.
    // should succeed, CLOUD is within bounds, no destructive interference

    System.out.println(WSe);
    /*
      |_ _ C L O U D _ _ _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
    */

    System.out.println("WSe.addWord(\"CLOUD\",0,0,0,1)");
    if(WSe.addWord("CLOUD",0,0,0,1)) {
      System.out.println("> addition success.");
      System.out.println("> TEST CASE - FAIL");
    } else {
      System.out.println("> addition failure.");
      System.out.println("> TEST CASE - PASS");
    }
    // > addition failure.
    // should fail, CLOUD is within bounds, yes destructive interference

    System.out.println(WSe);
    /*
      |_ _ C L O U D _ _ _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
    */

    System.out.println("WSe.addWord(\"TIFA\",1,3,0,-1)");
    if(WSe.addWord("TIFA",1,3,0,-1)) {
      System.out.println("> addition success.");
      System.out.println("> TEST CASE - PASS");
    } else {
      System.out.println("> addition failure.");
      System.out.println("> TEST CASE - FAIL");
    }
    // > addition success.
    // should succeed, TIFA is within bounds, no destructive interference

    System.out.println(WSe);
    /*
      |_ _ C L O U D _ _ _ _ _ _ _|
      |A F I T _ _ _ _ _ _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
    */

    System.out.println("WSe.addWord(\"TIFA\",1,5,0,-1)");
    if(WSe.addWord("TIFA",1,5,0,-1)) {
      System.out.println("> addition success.");
      System.out.println("> TEST CASE - FAIL");
    } else {
      System.out.println("> addition failure.");
      System.out.println("> TEST CASE - PASS");
    }
    // > addition failure.
    // should fail, TIFA is within bounds, yes destructive interference

    System.out.println(WSe);
    /*
      |_ _ C L O U D _ _ _ _ _ _ _|
      |A F I T _ _ _ _ _ _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
    */

    System.out.println("WSe.addWord(\"AERITH\",0,10,0,1)");
    if(WSe.addWord("AERITH",0,10,0,1)) {
      System.out.println("> addition success.");
      System.out.println("> TEST CASE - FAIL");
    } else {
      System.out.println("> addition failure.");
      System.out.println("> TEST CASE - PASS");
    }
    // > addition failure.
    // should fail, AERITH is out of bounds

    System.out.println(WSe);
    /*
      |_ _ C L O U D _ _ _ _ _ _ _|
      |A F I T _ _ _ _ _ _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
    */

    System.out.println("WSe.addWord(\"AERITH\",2,3,0,-1)");
    if(WSe.addWord("AERITH",2,3,0,-1)) {
      System.out.println("> addition success.");
      System.out.println("> TEST CASE - FAIL");
    } else {
      System.out.println("> addition failure.");
      System.out.println("> TEST CASE - PASS");
    }
    // > addition failure.
    // should fail, AERITH is out of bounds

    System.out.println(WSe);
    /*
      |_ _ C L O U D _ _ _ _ _ _ _|
      |A F I T _ _ _ _ _ _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
    */

    System.out.println("WSe.addWord(\"BARRET\",0,8,1,0)");
    if(WSe.addWord("BARRET",0,8,1,0)) {
      System.out.println("> addition success.");
      System.out.println("> TEST CASE - PASS");
    } else {
      System.out.println("> addition failure.");
      System.out.println("> TEST CASE - FAIL");
    }
    // > addition success.
    // should succeed, BARRET is within bounds, no destructive interference

    System.out.println(WSe);
    /*
      |_ _ C L O U D _ B _ _ _ _ _|
      |A F I T _ _ _ _ A _ _ _ _ _|
      |_ _ _ _ _ _ _ _ R _ _ _ _ _|
      |_ _ _ _ _ _ _ _ R _ _ _ _ _|
      |_ _ _ _ _ _ _ _ E _ _ _ _ _|
      |_ _ _ _ _ _ _ _ T _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
    */

    System.out.println("WSe.addWord(\"YUFFIE\",0,0,1,0)");
    if(WSe.addWord("YUFFIE",0,0,1,0)) {
      System.out.println("> addition success.");
      System.out.println("> TEST CASE - FAIL");
    } else {
      System.out.println("> addition failure.");
      System.out.println("> TEST CASE - PASS");
    }
    // > addition failure.
    // should fail, YUFFIE is within bounds, yes destructive interference

    System.out.println(WSe);
    /*
      |_ _ C L O U D _ B _ _ _ _ _|
      |A F I T _ _ _ _ A _ _ _ _ _|
      |_ _ _ _ _ _ _ _ R _ _ _ _ _|
      |_ _ _ _ _ _ _ _ R _ _ _ _ _|
      |_ _ _ _ _ _ _ _ E _ _ _ _ _|
      |_ _ _ _ _ _ _ _ T _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
    */

    System.out.println("WSe.addWord(\"YUFFIE\",6,5,-1,0)");
    if(WSe.addWord("YUFFIE",6,5,-1,0)) {
      System.out.println("> addition success.");
      System.out.println("> TEST CASE - PASS");
    } else {
      System.out.println("> addition failure.");
      System.out.println("> TEST CASE - FAIL");
    }
    // > addition success.
    // should succeed, YUFFIE is within bounds, no destructive interference

    System.out.println(WSe);
    /*
      |_ _ C L O U D _ B _ _ _ _ _|
      |A F I T _ E _ _ A _ _ _ _ _|
      |_ _ _ _ _ I _ _ R _ _ _ _ _|
      |_ _ _ _ _ F _ _ R _ _ _ _ _|
      |_ _ _ _ _ F _ _ E _ _ _ _ _|
      |_ _ _ _ _ U _ _ T _ _ _ _ _|
      |_ _ _ _ _ Y _ _ _ _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
    */

    System.out.println("WSe.addWord(\"YUFFIE\",5,2,-1,0)");
    if(WSe.addWord("YUFFIE",5,2,-1,0)) {
      System.out.println("> addition success.");
      System.out.println("> TEST CASE - FAIL");
    } else {
      System.out.println("> addition failure.");
      System.out.println("> TEST CASE - PASS");
    }
    // > addition failure.
    // should fail, YUFFIE is within bounds, yes destructive interference

    System.out.println(WSe);
    /*
      |_ _ C L O U D _ B _ _ _ _ _|
      |A F I T _ E _ _ A _ _ _ _ _|
      |_ _ _ _ _ I _ _ R _ _ _ _ _|
      |_ _ _ _ _ F _ _ R _ _ _ _ _|
      |_ _ _ _ _ F _ _ E _ _ _ _ _|
      |_ _ _ _ _ U _ _ T _ _ _ _ _|
      |_ _ _ _ _ Y _ _ _ _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
    */

    System.out.println("WSe.addWord(\"AERITH\",8,0,1,0)");
    if(WSe.addWord("AERITH",8,0,1,0)) {
      System.out.println("> addition success.");
      System.out.println("> TEST CASE - FAIL");
    } else {
      System.out.println("> addition failure.");
      System.out.println("> TEST CASE - PASS");
    }
    // > addition failure.
    // should fail, AERITH is out of bounds

    System.out.println(WSe);
    /*
      |_ _ C L O U D _ B _ _ _ _ _|
      |A F I T _ E _ _ A _ _ _ _ _|
      |_ _ _ _ _ I _ _ R _ _ _ _ _|
      |_ _ _ _ _ F _ _ R _ _ _ _ _|
      |_ _ _ _ _ F _ _ E _ _ _ _ _|
      |_ _ _ _ _ U _ _ T _ _ _ _ _|
      |_ _ _ _ _ Y _ _ _ _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
    */

    System.out.println("WSe.addWord(\"AERITH\",2,10,-1,0)");
    if(WSe.addWord("AERITH",2,10,-1,0)) {
      System.out.println("> addition success.");
      System.out.println("> TEST CASE - FAIL");
    } else {
      System.out.println("> addition failure.");
      System.out.println("> TEST CASE - PASS");
    }
    // > addition failure.
    // should fail, AERITH is out of bounds

    System.out.println(WSe);
    /*
      |_ _ C L O U D _ B _ _ _ _ _|
      |A F I T _ E _ _ A _ _ _ _ _|
      |_ _ _ _ _ I _ _ R _ _ _ _ _|
      |_ _ _ _ _ F _ _ R _ _ _ _ _|
      |_ _ _ _ _ F _ _ E _ _ _ _ _|
      |_ _ _ _ _ U _ _ T _ _ _ _ _|
      |_ _ _ _ _ Y _ _ _ _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
    */

    System.out.println("WSe.addWord(\"TIFA\",2,4,0,1)");
    if(WSe.addWord("TIFA",2,4,0,1)) {
      System.out.println("> addition success.");
      System.out.println("> TEST CASE - PASS");
    } else {
      System.out.println("> addition failure.");
      System.out.println("> TEST CASE - FAIL");
    }
    // > addition success.
    // should succeed, TIFA is within bounds, only constructive interference

    System.out.println(WSe);
    /*
      |_ _ C L O U D _ B _ _ _ _ _|
      |A F I T _ E _ _ A _ _ _ _ _|
      |_ _ _ _ T I F A R _ _ _ _ _|
      |_ _ _ _ _ F _ _ R _ _ _ _ _|
      |_ _ _ _ _ F _ _ E _ _ _ _ _|
      |_ _ _ _ _ U _ _ T _ _ _ _ _|
      |_ _ _ _ _ Y _ _ _ _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
    */

    System.out.println("WSe.addWord(\"TIFA\",3,7,0,-1)");
    if(WSe.addWord("TIFA",3,7,0,-1)) {
      System.out.println("> addition success.");
      System.out.println("> TEST CASE - PASS");
    } else {
      System.out.println("> addition failure.");
      System.out.println("> TEST CASE - FAIL");
    }
    // > addition success.
    // should succeed, TIFA is within bounds, only constructive interference

    System.out.println(WSe);
    /*
      |_ _ C L O U D _ B _ _ _ _ _|
      |A F I T _ E _ _ A _ _ _ _ _|
      |_ _ _ _ T I F A R _ _ _ _ _|
      |_ _ _ _ A F I T R _ _ _ _ _|
      |_ _ _ _ _ F _ _ E _ _ _ _ _|
      |_ _ _ _ _ U _ _ T _ _ _ _ _|
      |_ _ _ _ _ Y _ _ _ _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
    */

    System.out.println("WSe.addWord(\"AERITH\",1,0,1,0)");
    if(WSe.addWord("AERITH",1,0,1,0)) {
      System.out.println("> addition success.");
      System.out.println("> TEST CASE - PASS");
    } else {
      System.out.println("> addition failure.");
      System.out.println("> TEST CASE - FAIL");
    }
    // > addition success.
    // should succeed, AERITH is within bounds, only constructive interference

    System.out.println(WSe);
    /*
      |_ _ C L O U D _ B _ _ _ _ _|
      |A F I T _ E _ _ A _ _ _ _ _|
      |E _ _ _ T I F A R _ _ _ _ _|
      |R _ _ _ A F I T R _ _ _ _ _|
      |I _ _ _ _ F _ _ E _ _ _ _ _|
      |T _ _ _ _ U _ _ T _ _ _ _ _|
      |H _ _ _ _ Y _ _ _ _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
    */

    System.out.println("WSe.addWord(\"VINCENT\",7,3,-1,0)");
    if(WSe.addWord("VINCENT",7,3,-1,0)) {
      System.out.println("> addition success.");
      System.out.println("> TEST CASE - PASS");
    } else {
      System.out.println("> addition failure.");
      System.out.println("> TEST CASE - FAIL");
    }
    // > addition success.
    // should succeed, VINCENT is within bounds, only constructive interference

    System.out.println(WSe);
    /*
      |_ _ C L O U D _ B _ _ _ _ _|
      |A F I T _ E _ _ A _ _ _ _ _|
      |E _ _ N T I F A R _ _ _ _ _|
      |R _ _ E A F I T R _ _ _ _ _|
      |I _ _ C _ F _ _ E _ _ _ _ _|
      |T _ _ N _ U _ _ T _ _ _ _ _|
      |H _ _ I _ Y _ _ _ _ _ _ _ _|
      |_ _ _ V _ _ _ _ _ _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
      |_ _ _ _ _ _ _ _ _ _ _ _ _ _|
    */

    System.out.println("WSe.addWord(\"CAIT\",6,1,1,1)");
    if(WSe.addWord("CAIT",6,1,1,1)) {
      System.out.println("> addition success.");
      System.out.println("> TEST CASE - PASS");
    } else {
      System.out.println("> addition failure.");
      System.out.println("> TEST CASE - FAIL");
    }
    // > addition success.
    // should succeed, CAIT is within bounds, no destructive interference

    System.out.println(WSe);
    /*
      |_ _ C L O U D _ B _ _ _ _ _|
      |A F I T _ E _ _ A _ _ _ _ _|
      |E _ _ N T I F A R _ _ _ _ _|
      |R _ _ E A F I T R _ _ _ _ _|
      |I _ _ C _ F _ _ E _ _ _ _ _|
      |T _ _ N _ U _ _ T _ _ _ _ _|
      |H C _ I _ Y _ _ _ _ _ _ _ _|
      |_ _ A V _ _ _ _ _ _ _ _ _ _|
      |_ _ _ I _ _ _ _ _ _ _ _ _ _|
      |_ _ _ _ T _ _ _ _ _ _ _ _ _|
    */

    System.out.println("WSe.addWord(\"CID\",9,2,-1,-1)");
    if(WSe.addWord("CID",9,2,-1,-1)) {
      System.out.println("> addition success.");
      System.out.println("> TEST CASE - PASS");
    } else {
      System.out.println("> addition failure.");
      System.out.println("> TEST CASE - FAIL");
    }
    // > addition success.
    // should succeed, CID is within bounds, no destructive interference

    System.out.println(WSe);
    /*
      |_ _ C L O U D _ B _ _ _ _ _|
      |A F I T _ E _ _ A _ _ _ _ _|
      |E _ _ N T I F A R _ _ _ _ _|
      |R _ _ E A F I T R _ _ _ _ _|
      |I _ _ C _ F _ _ E _ _ _ _ _|
      |T _ _ N _ U _ _ T _ _ _ _ _|
      |H C _ I _ Y _ _ _ _ _ _ _ _|
      |D _ A V _ _ _ _ _ _ _ _ _ _|
      |_ I _ I _ _ _ _ _ _ _ _ _ _|
      |_ _ C _ T _ _ _ _ _ _ _ _ _|
    */

    System.out.println("WSe.addWord(\"CID\",6,2,1,-1)");
    if(WSe.addWord("CID",6,2,1,-1)) {
      System.out.println("> addition success.");
      System.out.println("> TEST CASE - PASS");
    } else {
      System.out.println("> addition failure.");
      System.out.println("> TEST CASE - FAIL");
    }
    // > addition success.
    // should succeed, CID is within bounds, no destructive interference

    System.out.println(WSe);
    /*
      |_ _ C L O U D _ B _ _ _ _ _|
      |A F I T _ E _ _ A _ _ _ _ _|
      |E _ _ N T I F A R _ _ _ _ _|
      |R _ _ E A F I T R _ _ _ _ _|
      |I _ _ C _ F _ _ E _ _ _ _ _|
      |T _ _ N _ U _ _ T _ _ _ _ _|
      |H C C I _ Y _ _ _ _ _ _ _ _|
      |D I A V _ _ _ _ _ _ _ _ _ _|
      |D I _ I _ _ _ _ _ _ _ _ _ _|
      |_ _ C _ T _ _ _ _ _ _ _ _ _|
    */

    System.out.println("WSe.addWord(\"CID\",9,3,-1,1)");
    if(WSe.addWord("CID",9,3,-1,1)) {
      System.out.println("> addition success.");
      System.out.println("> TEST CASE - PASS");
    } else {
      System.out.println("> addition failure.");
      System.out.println("> TEST CASE - FAIL");
    }
    // > addition success.
    // should succeed, CID is within bounds, no destructive interference

    System.out.println(WSe);
    /*
      |_ _ C L O U D _ B _ _ _ _ _|
      |A F I T _ E _ _ A _ _ _ _ _|
      |E _ _ N T I F A R _ _ _ _ _|
      |R _ _ E A F I T R _ _ _ _ _|
      |I _ _ C _ F _ _ E _ _ _ _ _|
      |T _ _ N _ U _ _ T _ _ _ _ _|
      |H C C I _ Y _ _ _ _ _ _ _ _|
      |D I A V _ D _ _ _ _ _ _ _ _|
      |D I _ I I _ _ _ _ _ _ _ _ _|
      |_ _ C C T _ _ _ _ _ _ _ _ _|
    */

    System.out.println("WSe.addWord(\"REDXIII\",1,11,1,1)");
    if(WSe.addWord("REDXIII",1,11,1,1)) {
      System.out.println("> addition success.");
      System.out.println("> TEST CASE - FAIL");
    } else {
      System.out.println("> addition failure.");
      System.out.println("> TEST CASE - PASS");
    }
    // > addition failure.
    // should fail, REDXIII is out of bounds

    System.out.println(WSe);
    /*
      |_ _ C L O U D _ B _ _ _ _ _|
      |A F I T _ E _ _ A _ _ _ _ _|
      |E _ _ N T I F A R _ _ _ _ _|
      |R _ _ E A F I T R _ _ _ _ _|
      |I _ _ C _ F _ _ E _ _ _ _ _|
      |T _ _ N _ U _ _ T _ _ _ _ _|
      |H C C I _ Y _ _ _ _ _ _ _ _|
      |D I A V _ D _ _ _ _ _ _ _ _|
      |D I _ I I _ _ _ _ _ _ _ _ _|
      |_ _ C C T _ _ _ _ _ _ _ _ _|
    */

    System.out.println("WSe.addWord(\"REDXIII\",1,11,-1,-1)");
    if(WSe.addWord("REDXIII",1,11,-1,-1)) {
      System.out.println("> addition success.");
      System.out.println("> TEST CASE - FAIL");
    } else {
      System.out.println("> addition failure.");
      System.out.println("> TEST CASE - PASS");
    }
    // > addition failure.
    // should fail, REDXIII is out of bounds

    System.out.println(WSe);
    /*
      |_ _ C L O U D _ B _ _ _ _ _|
      |A F I T _ E _ _ A _ _ _ _ _|
      |E _ _ N T I F A R _ _ _ _ _|
      |R _ _ E A F I T R _ _ _ _ _|
      |I _ _ C _ F _ _ E _ _ _ _ _|
      |T _ _ N _ U _ _ T _ _ _ _ _|
      |H C C I _ Y _ _ _ _ _ _ _ _|
      |D I A V _ D _ _ _ _ _ _ _ _|
      |D I _ I I _ _ _ _ _ _ _ _ _|
      |_ _ C C T _ _ _ _ _ _ _ _ _|
    */

    System.out.println("WSe.addWord(\"REDXIII\",8,11,1,-1)");
    if(WSe.addWord("REDXIII",8,11,-1,-1)) {
      System.out.println("> addition success.");
      System.out.println("> TEST CASE - FAIL");
    } else {
      System.out.println("> addition failure.");
      System.out.println("> TEST CASE - PASS");
    }
    // > addition failure.
    // should fail, REDXIII is out of bounds

    System.out.println(WSe);
    /*
      |_ _ C L O U D _ B _ _ _ _ _|
      |A F I T _ E _ _ A _ _ _ _ _|
      |E _ _ N T I F A R _ _ _ _ _|
      |R _ _ E A F I T R _ _ _ _ _|
      |I _ _ C _ F _ _ E _ _ _ _ _|
      |T _ _ N _ U _ _ T _ _ _ _ _|
      |H C C I _ Y _ _ _ _ _ _ _ _|
      |D I A V _ D _ _ _ _ _ _ _ _|
      |D I _ I I _ _ _ _ _ _ _ _ _|
      |_ _ C C T _ _ _ _ _ _ _ _ _|
    */

    System.out.println("WSe.addWord(\"REDXIII\",1,11,-1,1)");
    if(WSe.addWord("REDXIII",1,11,-1,1)) {
      System.out.println("> addition success.");
      System.out.println("> TEST CASE - FAIL");
    } else {
      System.out.println("> addition failure.");
      System.out.println("> TEST CASE - PASS");
    }
    // > addition failure.
    // should fail, REDXIII is out of bounds

    System.out.println(WSe);
    /*
      |_ _ C L O U D _ B _ _ _ _ _|
      |A F I T _ E _ _ A _ _ _ _ _|
      |E _ _ N T I F A R _ _ _ _ _|
      |R _ _ E A F I T R _ _ _ _ _|
      |I _ _ C _ F _ _ E _ _ _ _ _|
      |T _ _ N _ U _ _ T _ _ _ _ _|
      |H C C I _ Y _ _ _ _ _ _ _ _|
      |D I A V _ D _ _ _ _ _ _ _ _|
      |D I _ I I _ _ _ _ _ _ _ _ _|
      |_ _ C C T _ _ _ _ _ _ _ _ _|
    */

    System.out.println("WSe.addWord(\"BARRET\",1,6,1,1)");
    if(WSe.addWord("BARRET",1,6,1,1)) {
      System.out.println("> addition success.");
      System.out.println("> TEST CASE - PASS");
    } else {
      System.out.println("> addition failure.");
      System.out.println("> TEST CASE - FAIL");
    }
    // > addition success.
    // should succeed, BARRET is within bounds, only constructive interference

    System.out.println(WSe);
    /*
      |_ _ C L O U D _ B _ _ _ _ _|
      |A F I T _ E B _ A _ _ _ _ _|
      |E _ _ N T I F A R _ _ _ _ _|
      |R _ _ E A F I T R _ _ _ _ _|
      |I _ _ C _ F _ _ E R _ _ _ _|
      |T _ _ N _ U _ _ T _ E _ _ _|
      |H C C I _ Y _ _ _ _ _ T _ _|
      |D I A V _ D _ _ _ _ _ _ _ _|
      |D I _ I I _ _ _ _ _ _ _ _ _|
      |_ _ C C T _ _ _ _ _ _ _ _ _|
    */

    System.out.println("WSe.addWord(\"TIFA\",7,4,-1,-1)");
    if(WSe.addWord("TIFA",7,4,-1,-1)) {
      System.out.println("> addition success.");
      System.out.println("> TEST CASE - PASS");
    } else {
      System.out.println("> addition failure.");
      System.out.println("> TEST CASE - FAIL");
    }
    // > addition success.
    // should succeed, TIFA is within bounds, only constructive interference

    System.out.println(WSe);
    /*
      |_ _ C L O U D _ B _ _ _ _ _|
      |A F I T _ E B _ A _ _ _ _ _|
      |E _ _ N T I F A R _ _ _ _ _|
      |R _ _ E A F I T R _ _ _ _ _|
      |I A _ C _ F _ _ E R _ _ _ _|
      |T _ F N _ U _ _ T _ E _ _ _|
      |H C C I _ Y _ _ _ _ _ T _ _|
      |D I A V T D _ _ _ _ _ _ _ _|
      |D I _ I I _ _ _ _ _ _ _ _ _|
      |_ _ C C T _ _ _ _ _ _ _ _ _|
    */

    System.out.println("WSe.addWord(\"AERITH\",4,11,1,-1)");
    if(WSe.addWord("AERITH",4,11,1,-1)) {
      System.out.println("> addition success.");
      System.out.println("> TEST CASE - PASS");
    } else {
      System.out.println("> addition failure.");
      System.out.println("> TEST CASE - FAIL");
    }
    // > addition success.
    // should succeed, AERITH is within bounds, only constructive interference

    System.out.println(WSe);
    /*
      |_ _ C L O U D _ B _ _ _ _ _|
      |A F I T _ E B _ A _ _ _ _ _|
      |E _ _ N T I F A R _ _ _ _ _|
      |R _ _ E A F I T R _ _ _ _ _|
      |I A _ C _ F _ _ E R _ A _ _|
      |T _ F N _ U _ _ T _ E _ _ _|
      |H C C I _ Y _ _ _ R _ T _ _|
      |D I A V T D _ _ I _ _ _ _ _|
      |D I _ I I _ _ T _ _ _ _ _ _|
      |_ _ C C T _ H _ _ _ _ _ _ _|
    */

    System.out.println("WSe.addWord(\"BARRET\",5,6,-1,1)");
    if(WSe.addWord("BARRET",5,6,-1,1)) {
      System.out.println("> addition success.");
      System.out.println("> TEST CASE - PASS");
    } else {
      System.out.println("> addition failure.");
      System.out.println("> TEST CASE - FAIL");
    }
    // > addition success.
    // should succeed, BARRET is within bounds, only constructive interference

    System.out.println(WSe);
    /*
      |_ _ C L O U D _ B _ _ T _ _|
      |A F I T _ E B _ A _ E _ _ _|
      |E _ _ N T I F A R R _ _ _ _|
      |R _ _ E A F I T R _ _ _ _ _|
      |I A _ C _ F _ A E R _ A _ _|
      |T _ F N _ U B _ T _ E _ _ _|
      |H C C I _ Y _ _ _ R _ T _ _|
      |D I A V T D _ _ I _ _ _ _ _|
      |D I _ I I _ _ T _ _ _ _ _ _|
      |_ _ C C T _ H _ _ _ _ _ _ _|
    */

    System.out.println("WSe.addWord(\"ZACK\",4,4,1,1)");
    if(WSe.addWord("ZACK",4,4,1,1)) {
      System.out.println("> addition success.");
      System.out.println("> TEST CASE - FAIL");
    } else {
      System.out.println("> addition failure.");
      System.out.println("> TEST CASE - PASS");
    }
    // > addition failure.
    // should fail, ZACK is within bounds, yes destructive interference

    System.out.println(WSe);
    /*
      |_ _ C L O U D _ B _ _ T _ _|
      |A F I T _ E B _ A _ E _ _ _|
      |E _ _ N T I F A R R _ _ _ _|
      |R _ _ E A F I T R _ _ _ _ _|
      |I A _ C _ F _ A E R _ A _ _|
      |T _ F N _ U B _ T _ E _ _ _|
      |H C C I _ Y _ _ _ R _ T _ _|
      |D I A V T D _ _ I _ _ _ _ _|
      |D I _ I I _ _ T _ _ _ _ _ _|
      |_ _ C C T _ H _ _ _ _ _ _ _|
    */

    System.out.println("WSe.addWord(\"ZACK\",4,4,-1,-1)");
    if(WSe.addWord("ZACK",4,4,-1,-1)) {
      System.out.println("> addition success.");
      System.out.println("> TEST CASE - FAIL");
    } else {
      System.out.println("> addition failure.");
      System.out.println("> TEST CASE - PASS");
    }
    // > addition failure.
    // should fail, ZACK is within bounds, yes destructive interference

    System.out.println(WSe);
    /*
      |_ _ C L O U D _ B _ _ T _ _|
      |A F I T _ E B _ A _ E _ _ _|
      |E _ _ N T I F A R R _ _ _ _|
      |R _ _ E A F I T R _ _ _ _ _|
      |I A _ C _ F _ A E R _ A _ _|
      |T _ F N _ U B _ T _ E _ _ _|
      |H C C I _ Y _ _ _ R _ T _ _|
      |D I A V T D _ _ I _ _ _ _ _|
      |D I _ I I _ _ T _ _ _ _ _ _|
      |_ _ C C T _ H _ _ _ _ _ _ _|
    */

    System.out.println("WSe.addWord(\"ZACK\",4,4,1,-1)");
    if(WSe.addWord("ZACK",4,4,1,-1)) {
      System.out.println("> addition success.");
      System.out.println("> TEST CASE - FAIL");
    } else {
      System.out.println("> addition failure.");
      System.out.println("> TEST CASE - PASS");
    }
    // > addition failure.
    // should fail, ZACK is within bounds, yes destructive interference

    System.out.println(WSe);
    /*
      |_ _ C L O U D _ B _ _ T _ _|
      |A F I T _ E B _ A _ E _ _ _|
      |E _ _ N T I F A R R _ _ _ _|
      |R _ _ E A F I T R _ _ _ _ _|
      |I A _ C _ F _ A E R _ A _ _|
      |T _ F N _ U B _ T _ E _ _ _|
      |H C C I _ Y _ _ _ R _ T _ _|
      |D I A V T D _ _ I _ _ _ _ _|
      |D I _ I I _ _ T _ _ _ _ _ _|
      |_ _ C C T _ H _ _ _ _ _ _ _|
    */

    System.out.println("WSe.addWord(\"ZACK\",4,4,-1,1)");
    if(WSe.addWord("ZACK",4,4,-1,1)) {
      System.out.println("> addition success.");
      System.out.println("> TEST CASE - FAIL");
    } else {
      System.out.println("> addition failure.");
      System.out.println("> TEST CASE - PASS");
    }
    // > addition failure.
    // should fail, ZACK is within bounds, yes destructive interference

    System.out.println(WSe);
    /*
      |_ _ C L O U D _ B _ _ T _ _|
      |A F I T _ E B _ A _ E _ _ _|
      |E _ _ N T I F A R R _ _ _ _|
      |R _ _ E A F I T R _ _ _ _ _|
      |I A _ C _ F _ A E R _ A _ _|
      |T _ F N _ U B _ T _ E _ _ _|
      |H C C I _ Y _ _ _ R _ T _ _|
      |D I A V T D _ _ I _ _ _ _ _|
      |D I _ I I _ _ T _ _ _ _ _ _|
      |_ _ C C T _ H _ _ _ _ _ _ _|
    */

    if(args.length == 2) {
      WordSearch WSe2 = new WordSearch(Integer.parseInt(args[0]),Integer.parseInt(args[1]),"words.txt");

      System.out.println("WordSearch WSe2 = new WordSearch(args[0],args[1],\"words.txt\")");
      System.out.println(WSe2);
      /*
        example:
        java Driver_Test 10 12
        |_ _ _ _ _ _ _ _ _ _ _ _|
        |_ _ _ _ _ _ _ _ _ _ _ _|
        |_ _ _ _ _ _ _ _ _ _ _ _|
        |_ _ _ _ _ _ _ _ _ _ _ _|
        |_ _ _ _ _ _ _ _ _ _ _ _|
        |_ _ _ _ _ _ _ _ _ _ _ _|
        |_ _ _ _ _ _ _ _ _ _ _ _|
        |_ _ _ _ _ _ _ _ _ _ _ _|
        |_ _ _ _ _ _ _ _ _ _ _ _|
        |_ _ _ _ _ _ _ _ _ _ _ _|

        example:
        java Driver_Test 3 5
        |_ _ _ _ _|
        |_ _ _ _ _|
        |_ _ _ _ _|

        example:
        java Driver_Test 6 6
        |_ _ _ _ _ _|
        |_ _ _ _ _ _|
        |_ _ _ _ _ _|
        |_ _ _ _ _ _|
        |_ _ _ _ _ _|
        |_ _ _ _ _ _|
      */

      WSe2.addAllWords();
      System.out.println(WSe2);
      // hopefully filled WordSearch

    } else if(args.length == 1) {
      System.out.println("MISSING INPUT:\nDriver_Test class needs terminal line args:");
      System.out.println("- int rows [FOUND]\n- int cols [NOT FOUND]");

    } else if(args.length == 0) {
      System.out.println("MISSING INPUT:\nDriver_Test class needs terminal line args:");
      System.out.println("- int rows [NOT FOUND]\n- int cols [NOT FOUND]");

    } else {
      System.out.println("INVALID INPUT:\nDriver_Test class only needs 2 int terminal line args");

    }

    /*
      A spectre is haunting Europe — the spectre of communism. All the powers of old Europe have entered into a holy alliance to exorcise this spectre: Pope and Tsar, Metternich and Guizot, French Radicals and German police-spies.
      Where is the party in opposition that has not been decried as communistic by its opponents in power? Where is the opposition that has not hurled back the branding reproach of communism, against the more advanced opposition parties, as well as against its reactionary adversaries?

      Two things result from this fact:
        I. Communism is already acknowledged by all European powers to be itself a power.
        II. It is high time that Communists should openly, in the face of the whole world, publish their views, their aims, their tendencies, and meet this nursery tale of the Spectre of Communism with a manifesto of the party itself.

      To this end, Communists of various nationalities have assembled in London and sketched the following manifesto, to be published in the English, French, German, Italian, Flemish and Danish languages.
    */


  }

}
