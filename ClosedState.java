public class ClosedState implements AccountState
{   
    
    @Override
    public void activate(Account account) 
    {
        // TODO Auto-generated method stub
        System.out.println("--- You cannot activate a closed account!");
        account.setState(new ClosedState());
    }

    @Override
    public void suspend(Account account) 
    {
        // TODO Auto-generated method stub
        System.out.println("--- You cannot suspend a closed account!");
        account.setState(new ClosedState());
    }

    @Override
    public void closed(Account account) 
    {
        // TODO Auto-generated method stub
        System.out.println("--- Account is already closed");
        account.setState(new ClosedState());
    }

    @Override
    public void withdraw(Double withdrawAmount, Account account) 
    {
        // TODO Auto-generated method stub
        System.out.println("--- You cannot witdhraw with a closed account!");
        System.out.println(account.toString());
        account.setState(new ClosedState());
    }

    @Override
    public void deposit(Double depositAmount, Account account) 
    {
        // TODO Auto-generated method stub
        System.out.println("--- You cannot deposit with a closed account!");
        System.out.println(account.toString());
        account.setState(new ClosedState());
    }

   


    
}
