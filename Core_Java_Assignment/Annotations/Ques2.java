import java.lang.annotation.Annotation;
	import java.lang.annotation.ElementType;
	import java.lang.annotation.Retention;
	import java.lang.annotation.RetentionPolicy;
	import java.lang.annotation.Target;

	@Target(ElementType.TYPE)
	@Retention(RetentionPolicy.RUNTIME)
	@interface Info{
		int AuthorId();
		String Date();
		String Time();
		String Vesion();
		
	}

	@Info(AuthorId = 23456, Date = "12/11/2021", Time = "12:54", Vesion = "2.0")
	class developer{
		String Author,Supervisor,Description;
		
		public developer(String author, String supervisor, String description) {
			Author = author;
			Supervisor = supervisor;
			Description = description;
		}

		void developerDetail() {
			
			System.out.println("Developer details are : ");
		}
		@Override
		public String toString() {
			return "developer [Author=" + Author + ", Supervisor=" + Supervisor + ", Description=" + Description + "]";
		}

		
	}
