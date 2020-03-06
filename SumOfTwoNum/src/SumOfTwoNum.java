import java.util.HashMap;
import java.util.Map;

import javax.print.attribute.standard.Finishings;

//ʹ��һ���ϣ��
//�ڽ��е�������Ԫ�ز��뵽���е�ͬʱ
//�ع�ͷ���������Ƿ��Ѿ����ڵ�ǰԪ������Ӧ��Ŀ��Ԫ��
//��������ڣ��������Ѿ��ҵ��˶�Ӧ�⣬���������䷵��

public class SumOfTwoNum {
	
	class NotFindException extends Exception
	{
		public NotFindException(String message) 
		{
			super(message);
		}
	}
	
	public int[] twoSum(int[] nums , int target) throws NotFindException
	{
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0 ; i < nums.length ; i++)
		{
			int complement = target - nums[i];
			if ( map.containsKey(complement) )
			{
				return new int[] {map.get(complement) , i};
			}
			map.put(nums[i], i);
		}
		throw new NotFindException("No Solution");
	}
	
	public static void main(String[] args)
	{
		
		int[] nums = new int[]{2,7,11,15} ;
		int target = 9;
		int[] result;result = new int[2];
		
		try {
			SumOfTwoNum S = new SumOfTwoNum();
			result = S.twoSum(nums, target);
			for (int i = 0 ; i < result.length ; i++)
			{
				System.out.println( result[i] );
			}
		} 
		
		catch (Exception e) {
			// TODO: handle exception
			e.getStackTrace();
		}
				
	}
	
}
