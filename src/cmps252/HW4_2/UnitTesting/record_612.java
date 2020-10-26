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

@Tag("3")
class Record_612 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 612: FirstName is Rocky")
	void FirstNameOfRecord612() {
		assertEquals("Rocky", customers.get(611).getFirstName());
	}

	@Test
	@DisplayName("Record 612: LastName is Holets")
	void LastNameOfRecord612() {
		assertEquals("Holets", customers.get(611).getLastName());
	}

	@Test
	@DisplayName("Record 612: Company is J P Fortier & Sons Inc")
	void CompanyOfRecord612() {
		assertEquals("J P Fortier & Sons Inc", customers.get(611).getCompany());
	}

	@Test
	@DisplayName("Record 612: Address is 4800 Nolan St")
	void AddressOfRecord612() {
		assertEquals("4800 Nolan St", customers.get(611).getAddress());
	}

	@Test
	@DisplayName("Record 612: City is Jacksonville")
	void CityOfRecord612() {
		assertEquals("Jacksonville", customers.get(611).getCity());
	}

	@Test
	@DisplayName("Record 612: County is Duval")
	void CountyOfRecord612() {
		assertEquals("Duval", customers.get(611).getCounty());
	}

	@Test
	@DisplayName("Record 612: State is FL")
	void StateOfRecord612() {
		assertEquals("FL", customers.get(611).getState());
	}

	@Test
	@DisplayName("Record 612: ZIP is 32254")
	void ZIPOfRecord612() {
		assertEquals("32254", customers.get(611).getZIP());
	}

	@Test
	@DisplayName("Record 612: Phone is 904-388-3656")
	void PhoneOfRecord612() {
		assertEquals("904-388-3656", customers.get(611).getPhone());
	}

	@Test
	@DisplayName("Record 612: Fax is 904-388-2531")
	void FaxOfRecord612() {
		assertEquals("904-388-2531", customers.get(611).getFax());
	}

	@Test
	@DisplayName("Record 612: Email is rocky@holets.com")
	void EmailOfRecord612() {
		assertEquals("rocky@holets.com", customers.get(611).getEmail());
	}

	@Test
	@DisplayName("Record 612: Web is http://www.rockyholets.com")
	void WebOfRecord612() {
		assertEquals("http://www.rockyholets.com", customers.get(611).getWeb());
	}
}
