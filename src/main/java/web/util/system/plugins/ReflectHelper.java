package web.util.system.plugins;
import java.lang.reflect.Field;

public class ReflectHelper {
	  public static Field getFieldByFieldName(Object obj, String fieldName)
	  {
	    if ((obj == null) || (fieldName == null)) {
	      return null;
	    }
	    for (Class superClass = obj.getClass(); superClass != Object.class; ) {
	      try
	      {
	        return superClass.getDeclaredField(fieldName);
	      }
	      catch (Exception localException)
	      {
	        superClass = superClass
	          .getSuperclass();
	      }

	    }

	    return null;
	  }

	  public static Object getValueByFieldName(Object obj, String fieldName)
	  {
	    Object value = null;
	    try {
	      Field field = getFieldByFieldName(obj, fieldName);
	      if (field != null)
	        if (field.isAccessible()) {
	          value = field.get(obj);
	        } else {
	          field.setAccessible(true);
	          value = field.get(obj);
	          field.setAccessible(false);
	        }
	    }
	    catch (Exception localException) {
	    }
	    return value;
	  }

	  @SuppressWarnings("unchecked")
	public static <T> T getValueByFieldType(Object obj, Class<T> fieldType)
	  {
	    Object value = null;
	    for (Class superClass = obj.getClass(); superClass != Object.class; superClass = superClass
	      .getSuperclass()) {
	      try
	      {
	        Field[] fields = superClass.getDeclaredFields();
	        for (Field f : fields) {
	          if (f.getType() == fieldType) {
	            if (f.isAccessible()) {
	              value = f.get(obj);
	              break;
	            }
	            f.setAccessible(true);
	            value = f.get(obj);
	            f.setAccessible(false);
	            break;
	          }
	        }

	        if (value == null);
	      }
	      catch (Exception localException)
	      {
	      }
	    }
	    return  (T) value;
	  }

	  public static boolean setValueByFieldName(Object obj, String fieldName, Object value)
	  {
	    try
	    {
	      Field field = obj.getClass().getDeclaredField(fieldName);

	      if (field.isAccessible()) {
	        field.set(obj, value);
	      } else {
	        field.setAccessible(true);
	        field.set(obj, value);
	        field.setAccessible(false);
	      }
	      return true;
	    } catch (Exception localException) {
	    }
	    return false;
	  }
}
