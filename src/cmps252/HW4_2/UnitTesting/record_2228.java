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
class Record_2228 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2228: FirstName is Marcel")
	void FirstNameOfRecord2228() {
		assertEquals("Marcel", customers.get(2227).getFirstName());
	}

	@Test
	@DisplayName("Record 2228: LastName is Visocsky")
	void LastNameOfRecord2228() {
		assertEquals("Visocsky", customers.get(2227).getLastName());
	}

	@Test
	@DisplayName("Record 2228: Company is Scudder, Steven C Esq")
	void CompanyOfRecord2228() {
		assertEquals("Scudder, Steven C Esq", customers.get(2227).getCompany());
	}

	@Test
	@DisplayName("Record 2228: Address is 8976 N Santa Monica Blvd")
	void AddressOfRecord2228() {
		assertEquals("8976 N Santa Monica Blvd", customers.get(2227).getAddress());
	}

	@Test
	@DisplayName("Record 2228: City is Milwaukee")
	void CityOfRecord2228() {
		assertEquals("Milwaukee", customers.get(2227).getCity());
	}

	@Test
	@DisplayName("Record 2228: County is Milwaukee")
	void CountyOfRecord2228() {
		assertEquals("Milwaukee", customers.get(2227).getCounty());
	}

	@Test
	@DisplayName("Record 2228: State is WI")
	void StateOfRecord2228() {
		assertEquals("WI", customers.get(2227).getState());
	}

	@Test
	@DisplayName("Record 2228: ZIP is 53217")
	void ZIPOfRecord2228() {
		assertEquals("53217", customers.get(2227).getZIP());
	}

	@Test
	@DisplayName("Record 2228: Phone is 414-352-8085")
	void PhoneOfRecord2228() {
		assertEquals("414-352-8085", customers.get(2227).getPhone());
	}

	@Test
	@DisplayName("Record 2228: Fax is 414-352-4959")
	void FaxOfRecord2228() {
		assertEquals("414-352-4959", customers.get(2227).getFax());
	}

	@Test
	@DisplayName("Record 2228: Email is marcel@visocsky.com")
	void EmailOfRecord2228() {
		assertEquals("marcel@visocsky.com", customers.get(2227).getEmail());
	}

	@Test
	@DisplayName("Record 2228: Web is http://www.marcelvisocsky.com")
	void WebOfRecord2228() {
		assertEquals("http://www.marcelvisocsky.com", customers.get(2227).getWeb());
	}
}
