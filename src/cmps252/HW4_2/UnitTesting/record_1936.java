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

@Tag("28")
class Record_1936 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1936: FirstName is Warren")
	void FirstNameOfRecord1936() {
		assertEquals("Warren", customers.get(1935).getFirstName());
	}

	@Test
	@DisplayName("Record 1936: LastName is Hibbitts")
	void LastNameOfRecord1936() {
		assertEquals("Hibbitts", customers.get(1935).getLastName());
	}

	@Test
	@DisplayName("Record 1936: Company is Prospect Florist")
	void CompanyOfRecord1936() {
		assertEquals("Prospect Florist", customers.get(1935).getCompany());
	}

	@Test
	@DisplayName("Record 1936: Address is 67 Mechanic St")
	void AddressOfRecord1936() {
		assertEquals("67 Mechanic St", customers.get(1935).getAddress());
	}

	@Test
	@DisplayName("Record 1936: City is Attleboro")
	void CityOfRecord1936() {
		assertEquals("Attleboro", customers.get(1935).getCity());
	}

	@Test
	@DisplayName("Record 1936: County is Bristol")
	void CountyOfRecord1936() {
		assertEquals("Bristol", customers.get(1935).getCounty());
	}

	@Test
	@DisplayName("Record 1936: State is MA")
	void StateOfRecord1936() {
		assertEquals("MA", customers.get(1935).getState());
	}

	@Test
	@DisplayName("Record 1936: ZIP is 2703")
	void ZIPOfRecord1936() {
		assertEquals("2703", customers.get(1935).getZIP());
	}

	@Test
	@DisplayName("Record 1936: Phone is 508-226-6231")
	void PhoneOfRecord1936() {
		assertEquals("508-226-6231", customers.get(1935).getPhone());
	}

	@Test
	@DisplayName("Record 1936: Fax is 508-226-9811")
	void FaxOfRecord1936() {
		assertEquals("508-226-9811", customers.get(1935).getFax());
	}

	@Test
	@DisplayName("Record 1936: Email is warren@hibbitts.com")
	void EmailOfRecord1936() {
		assertEquals("warren@hibbitts.com", customers.get(1935).getEmail());
	}

	@Test
	@DisplayName("Record 1936: Web is http://www.warrenhibbitts.com")
	void WebOfRecord1936() {
		assertEquals("http://www.warrenhibbitts.com", customers.get(1935).getWeb());
	}
}
