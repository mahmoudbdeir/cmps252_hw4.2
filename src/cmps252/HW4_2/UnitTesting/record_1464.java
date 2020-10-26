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

@Tag("10")
class Record_1464 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1464: FirstName is Sean")
	void FirstNameOfRecord1464() {
		assertEquals("Sean", customers.get(1463).getFirstName());
	}

	@Test
	@DisplayName("Record 1464: LastName is Linebrink")
	void LastNameOfRecord1464() {
		assertEquals("Linebrink", customers.get(1463).getLastName());
	}

	@Test
	@DisplayName("Record 1464: Company is Scott Stahl & Burbach")
	void CompanyOfRecord1464() {
		assertEquals("Scott Stahl & Burbach", customers.get(1463).getCompany());
	}

	@Test
	@DisplayName("Record 1464: Address is 323 Woodham Ct")
	void AddressOfRecord1464() {
		assertEquals("323 Woodham Ct", customers.get(1463).getAddress());
	}

	@Test
	@DisplayName("Record 1464: City is Fort Walton Beach")
	void CityOfRecord1464() {
		assertEquals("Fort Walton Beach", customers.get(1463).getCity());
	}

	@Test
	@DisplayName("Record 1464: County is Okaloosa")
	void CountyOfRecord1464() {
		assertEquals("Okaloosa", customers.get(1463).getCounty());
	}

	@Test
	@DisplayName("Record 1464: State is FL")
	void StateOfRecord1464() {
		assertEquals("FL", customers.get(1463).getState());
	}

	@Test
	@DisplayName("Record 1464: ZIP is 32547")
	void ZIPOfRecord1464() {
		assertEquals("32547", customers.get(1463).getZIP());
	}

	@Test
	@DisplayName("Record 1464: Phone is 850-863-1932")
	void PhoneOfRecord1464() {
		assertEquals("850-863-1932", customers.get(1463).getPhone());
	}

	@Test
	@DisplayName("Record 1464: Fax is 850-863-0271")
	void FaxOfRecord1464() {
		assertEquals("850-863-0271", customers.get(1463).getFax());
	}

	@Test
	@DisplayName("Record 1464: Email is sean@linebrink.com")
	void EmailOfRecord1464() {
		assertEquals("sean@linebrink.com", customers.get(1463).getEmail());
	}

	@Test
	@DisplayName("Record 1464: Web is http://www.seanlinebrink.com")
	void WebOfRecord1464() {
		assertEquals("http://www.seanlinebrink.com", customers.get(1463).getWeb());
	}
}
