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

@Tag("22")
class Record_2146 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2146: FirstName is Genaro")
	void FirstNameOfRecord2146() {
		assertEquals("Genaro", customers.get(2145).getFirstName());
	}

	@Test
	@DisplayName("Record 2146: LastName is Menter")
	void LastNameOfRecord2146() {
		assertEquals("Menter", customers.get(2145).getLastName());
	}

	@Test
	@DisplayName("Record 2146: Company is Valley Pet Center V")
	void CompanyOfRecord2146() {
		assertEquals("Valley Pet Center V", customers.get(2145).getCompany());
	}

	@Test
	@DisplayName("Record 2146: Address is 2436 Bagley St")
	void AddressOfRecord2146() {
		assertEquals("2436 Bagley St", customers.get(2145).getAddress());
	}

	@Test
	@DisplayName("Record 2146: City is Detroit")
	void CityOfRecord2146() {
		assertEquals("Detroit", customers.get(2145).getCity());
	}

	@Test
	@DisplayName("Record 2146: County is Wayne")
	void CountyOfRecord2146() {
		assertEquals("Wayne", customers.get(2145).getCounty());
	}

	@Test
	@DisplayName("Record 2146: State is MI")
	void StateOfRecord2146() {
		assertEquals("MI", customers.get(2145).getState());
	}

	@Test
	@DisplayName("Record 2146: ZIP is 48216")
	void ZIPOfRecord2146() {
		assertEquals("48216", customers.get(2145).getZIP());
	}

	@Test
	@DisplayName("Record 2146: Phone is 313-962-2142")
	void PhoneOfRecord2146() {
		assertEquals("313-962-2142", customers.get(2145).getPhone());
	}

	@Test
	@DisplayName("Record 2146: Fax is 313-962-4935")
	void FaxOfRecord2146() {
		assertEquals("313-962-4935", customers.get(2145).getFax());
	}

	@Test
	@DisplayName("Record 2146: Email is genaro@menter.com")
	void EmailOfRecord2146() {
		assertEquals("genaro@menter.com", customers.get(2145).getEmail());
	}

	@Test
	@DisplayName("Record 2146: Web is http://www.genaromenter.com")
	void WebOfRecord2146() {
		assertEquals("http://www.genaromenter.com", customers.get(2145).getWeb());
	}
}
