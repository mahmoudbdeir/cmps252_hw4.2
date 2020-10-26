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

@Tag("16")
class Record_3126 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3126: FirstName is Olen")
	void FirstNameOfRecord3126() {
		assertEquals("Olen", customers.get(3125).getFirstName());
	}

	@Test
	@DisplayName("Record 3126: LastName is Mcgranahan")
	void LastNameOfRecord3126() {
		assertEquals("Mcgranahan", customers.get(3125).getLastName());
	}

	@Test
	@DisplayName("Record 3126: Company is Respond First Aid Systems")
	void CompanyOfRecord3126() {
		assertEquals("Respond First Aid Systems", customers.get(3125).getCompany());
	}

	@Test
	@DisplayName("Record 3126: Address is 832 Cedar Pky")
	void AddressOfRecord3126() {
		assertEquals("832 Cedar Pky", customers.get(3125).getAddress());
	}

	@Test
	@DisplayName("Record 3126: City is Schererville")
	void CityOfRecord3126() {
		assertEquals("Schererville", customers.get(3125).getCity());
	}

	@Test
	@DisplayName("Record 3126: County is Lake")
	void CountyOfRecord3126() {
		assertEquals("Lake", customers.get(3125).getCounty());
	}

	@Test
	@DisplayName("Record 3126: State is IN")
	void StateOfRecord3126() {
		assertEquals("IN", customers.get(3125).getState());
	}

	@Test
	@DisplayName("Record 3126: ZIP is 46375")
	void ZIPOfRecord3126() {
		assertEquals("46375", customers.get(3125).getZIP());
	}

	@Test
	@DisplayName("Record 3126: Phone is 219-865-0709")
	void PhoneOfRecord3126() {
		assertEquals("219-865-0709", customers.get(3125).getPhone());
	}

	@Test
	@DisplayName("Record 3126: Fax is 219-865-4113")
	void FaxOfRecord3126() {
		assertEquals("219-865-4113", customers.get(3125).getFax());
	}

	@Test
	@DisplayName("Record 3126: Email is olen@mcgranahan.com")
	void EmailOfRecord3126() {
		assertEquals("olen@mcgranahan.com", customers.get(3125).getEmail());
	}

	@Test
	@DisplayName("Record 3126: Web is http://www.olenmcgranahan.com")
	void WebOfRecord3126() {
		assertEquals("http://www.olenmcgranahan.com", customers.get(3125).getWeb());
	}
}
