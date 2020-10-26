package cmps252.HW4_2.UnitTesting;

import static org.junit.jupiter.api.Assertions.*;
import java.io.FileNotFoundException;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import cmps252.HW4_2.Customer;
import cmps252.HW4_2.FileParser;

@Tag("25")
class Record_4799 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4799: FirstName is Kari")
	void FirstNameOfRecord4799() {
		assertEquals("Kari", customers.get(4798).getFirstName());
	}

	@Test
	@DisplayName("Record 4799: LastName is Geffre")
	void LastNameOfRecord4799() {
		assertEquals("Geffre", customers.get(4798).getLastName());
	}

	@Test
	@DisplayName("Record 4799: Company is Abbot Management Inc")
	void CompanyOfRecord4799() {
		assertEquals("Abbot Management Inc", customers.get(4798).getCompany());
	}

	@Test
	@DisplayName("Record 4799: Address is 6319 De Soto Ave")
	void AddressOfRecord4799() {
		assertEquals("6319 De Soto Ave", customers.get(4798).getAddress());
	}

	@Test
	@DisplayName("Record 4799: City is Woodland Hills")
	void CityOfRecord4799() {
		assertEquals("Woodland Hills", customers.get(4798).getCity());
	}

	@Test
	@DisplayName("Record 4799: County is Los Angeles")
	void CountyOfRecord4799() {
		assertEquals("Los Angeles", customers.get(4798).getCounty());
	}

	@Test
	@DisplayName("Record 4799: State is CA")
	void StateOfRecord4799() {
		assertEquals("CA", customers.get(4798).getState());
	}

	@Test
	@DisplayName("Record 4799: ZIP is 91367")
	void ZIPOfRecord4799() {
		assertEquals("91367", customers.get(4798).getZIP());
	}

	@Test
	@DisplayName("Record 4799: Phone is 818-346-3015")
	void PhoneOfRecord4799() {
		assertEquals("818-346-3015", customers.get(4798).getPhone());
	}

	@Test
	@DisplayName("Record 4799: Fax is 818-346-2548")
	void FaxOfRecord4799() {
		assertEquals("818-346-2548", customers.get(4798).getFax());
	}

	@Test
	@DisplayName("Record 4799: Email is kari@geffre.com")
	void EmailOfRecord4799() {
		assertEquals("kari@geffre.com", customers.get(4798).getEmail());
	}

	@Test
	@DisplayName("Record 4799: Web is http://www.karigeffre.com")
	void WebOfRecord4799() {
		assertEquals("http://www.karigeffre.com", customers.get(4798).getWeb());
	}
}
