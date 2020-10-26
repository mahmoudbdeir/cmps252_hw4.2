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

@Tag("1")
class Record_4908 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4908: FirstName is Deanna")
	void FirstNameOfRecord4908() {
		assertEquals("Deanna", customers.get(4907).getFirstName());
	}

	@Test
	@DisplayName("Record 4908: LastName is Casilles")
	void LastNameOfRecord4908() {
		assertEquals("Casilles", customers.get(4907).getLastName());
	}

	@Test
	@DisplayName("Record 4908: Company is Fashion Craft")
	void CompanyOfRecord4908() {
		assertEquals("Fashion Craft", customers.get(4907).getCompany());
	}

	@Test
	@DisplayName("Record 4908: Address is 5002 S Ash Ave")
	void AddressOfRecord4908() {
		assertEquals("5002 S Ash Ave", customers.get(4907).getAddress());
	}

	@Test
	@DisplayName("Record 4908: City is Tempe")
	void CityOfRecord4908() {
		assertEquals("Tempe", customers.get(4907).getCity());
	}

	@Test
	@DisplayName("Record 4908: County is Maricopa")
	void CountyOfRecord4908() {
		assertEquals("Maricopa", customers.get(4907).getCounty());
	}

	@Test
	@DisplayName("Record 4908: State is AZ")
	void StateOfRecord4908() {
		assertEquals("AZ", customers.get(4907).getState());
	}

	@Test
	@DisplayName("Record 4908: ZIP is 85282")
	void ZIPOfRecord4908() {
		assertEquals("85282", customers.get(4907).getZIP());
	}

	@Test
	@DisplayName("Record 4908: Phone is 480-820-9548")
	void PhoneOfRecord4908() {
		assertEquals("480-820-9548", customers.get(4907).getPhone());
	}

	@Test
	@DisplayName("Record 4908: Fax is 480-820-2489")
	void FaxOfRecord4908() {
		assertEquals("480-820-2489", customers.get(4907).getFax());
	}

	@Test
	@DisplayName("Record 4908: Email is deanna@casilles.com")
	void EmailOfRecord4908() {
		assertEquals("deanna@casilles.com", customers.get(4907).getEmail());
	}

	@Test
	@DisplayName("Record 4908: Web is http://www.deannacasilles.com")
	void WebOfRecord4908() {
		assertEquals("http://www.deannacasilles.com", customers.get(4907).getWeb());
	}
}
