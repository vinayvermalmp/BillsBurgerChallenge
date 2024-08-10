package abstractDemo;

public class MyLinkedList implements NodeList{
    private ListItem root;

    public MyLinkedList(ListItem root){
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem){
        if(this.root == null){
            this.root = newItem;
            return true;
        }

        ListItem currentItem = this.root;
        while(currentItem != null){
            if(currentItem.compareTo(newItem) < 0 ){
                if (currentItem.next() != null){
                    currentItem = currentItem.next();
                    return false;
                }else{
                    currentItem.setNext(newItem).setPrevious(currentItem);
                    return true;
                }
            }else if (currentItem.compareTo(newItem) > 0) {
                if (currentItem.previous() != null){
                    currentItem.previous()
                            .setNext(newItem.setPrevious(currentItem.previous())
                            .setNext(currentItem).setPrevious(newItem));
                } else {
                    newItem.setNext(this.root).setPrevious(newItem);
                    this.root = newItem;
                }
                return true;
            }else {
                System.out.println(newItem.getValue() + " is already present, not added.");
                return false;
            }
        }
        return false;
    }
    @Override
    public boolean removeItem(ListItem item){
        if(item != null) {
            System.out.println("Deleting item " + item.getValue());
        }
        ListItem currentItem = this.root;
        while(currentItem != null) {
            if(currentItem.compareTo(item) == 0){
                if (currentItem == this.root) {
                    this.root = currentItem.next();
                } else {
                    currentItem.previous().setNext(currentItem.next());
                    if(currentItem.next() != null){
                        currentItem.next().setPrevious(currentItem.previous());
                    }
                }
                return true;
            } else if(currentItem.compareTo(item) < 0) {
                currentItem = currentItem.next();
            } else{ // comparison > 0
                return false;
            }
        }
        return  false;
    }
    @Override
    public void traverse(ListItem root){
        if(root == null){
            System.out.println("The list is empty.");
        }
        while (root != null) {
            System.out.println(root.getValue());
            root = root.next();
        }
    }
}