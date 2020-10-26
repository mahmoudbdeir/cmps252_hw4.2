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

@Tag("35")
class Record_2797 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2797: FirstName is Germaine")
	void FirstNameOfRecord2797() {
		assertEquals("Germaine", customers.get(2796).getFirstName());
	}

	@Test
	@DisplayName("Record 2797: LastName is Gazitano")
	void LastNameOfRecord2797() {
		assertEquals("Gazitano", customers.get(2796).getLastName());
	}

	@Test
	@DisplayName("Record 2797: Company is Adler Lowengrub Amiano")
	void CompanyOfRecord2797() {
		assertEquals("Adler Lowengrub Amiano", customers.get(2796).getCompany());
	}

	@Test
	@DisplayName("Record 2797: Address is 458 Greenwich St")
	void AddressOfRecord2797() {
		assertEquals("458 Greenwich St", customers.get(2796).getAddress());
	}

	@Test
	@DisplayName("Record 2797: City is New York")
	void CityOfRecord2797() {
		assertEquals("New York", customers.get(2796).getCity());
	}

	@Test
	@DisplayName("Record 2797: County is New York")
	void CountyOfRecord2797() {
		assertEquals("New York", customers.get(2796).getCounty());
	}

	@Test
	@DisplayName("Record 2797: State is NY")
	void StateOfRecord2797() {
		assertEquals("NY", customers.get(2796).getState());
	}

	@Test
	@DisplayName("Record 2797: ZIP is 10013")
	void ZIPOfRecord2797() {
		assertEquals("10013", customers.get(2796).getZIP());
	}

	@Test
	@DisplayName("Record 2797: Phone is 212-431-5708")
	void PhoneOfRecord2797() {
		assertEquals("212-431-5708", customers.get(2796).getPhone());
	}

	@Test
	@DisplayName("Record 2797: Fax is 212-431-1178")
	void FaxOfRecord2797() {
		assertEquals("212-431-1178", customers.get(2796).getFax());
	}

	@Test
	@DisplayName("Record 2797: Email is germaine@gazitano.com")
	void EmailOfRecord2797() {
		assertEquals("germaine@gazitano.com", customers.get(2796).getEmail());
	}

	@Test
	@DisplayName("Record 2797: Web is http://www.germainegazitano.com")
	void WebOfRecord2797() {
		assertEquals("http://www.germainegazitano.com", customers.get(2796).getWeb());
	}
}
