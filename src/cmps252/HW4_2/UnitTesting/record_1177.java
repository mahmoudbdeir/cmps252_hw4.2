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

@Tag("49")
class Record_1177 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1177: FirstName is Lesley")
	void FirstNameOfRecord1177() {
		assertEquals("Lesley", customers.get(1176).getFirstName());
	}

	@Test
	@DisplayName("Record 1177: LastName is Roose")
	void LastNameOfRecord1177() {
		assertEquals("Roose", customers.get(1176).getLastName());
	}

	@Test
	@DisplayName("Record 1177: Company is Business On Hold")
	void CompanyOfRecord1177() {
		assertEquals("Business On Hold", customers.get(1176).getCompany());
	}

	@Test
	@DisplayName("Record 1177: Address is 1909 Springs Rd")
	void AddressOfRecord1177() {
		assertEquals("1909 Springs Rd", customers.get(1176).getAddress());
	}

	@Test
	@DisplayName("Record 1177: City is Vallejo")
	void CityOfRecord1177() {
		assertEquals("Vallejo", customers.get(1176).getCity());
	}

	@Test
	@DisplayName("Record 1177: County is Solano")
	void CountyOfRecord1177() {
		assertEquals("Solano", customers.get(1176).getCounty());
	}

	@Test
	@DisplayName("Record 1177: State is CA")
	void StateOfRecord1177() {
		assertEquals("CA", customers.get(1176).getState());
	}

	@Test
	@DisplayName("Record 1177: ZIP is 94591")
	void ZIPOfRecord1177() {
		assertEquals("94591", customers.get(1176).getZIP());
	}

	@Test
	@DisplayName("Record 1177: Phone is 707-552-9700")
	void PhoneOfRecord1177() {
		assertEquals("707-552-9700", customers.get(1176).getPhone());
	}

	@Test
	@DisplayName("Record 1177: Fax is 707-552-2132")
	void FaxOfRecord1177() {
		assertEquals("707-552-2132", customers.get(1176).getFax());
	}

	@Test
	@DisplayName("Record 1177: Email is lesley@roose.com")
	void EmailOfRecord1177() {
		assertEquals("lesley@roose.com", customers.get(1176).getEmail());
	}

	@Test
	@DisplayName("Record 1177: Web is http://www.lesleyroose.com")
	void WebOfRecord1177() {
		assertEquals("http://www.lesleyroose.com", customers.get(1176).getWeb());
	}
}
