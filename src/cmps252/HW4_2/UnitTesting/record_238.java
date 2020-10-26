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

@Tag("18")
class Record_238 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 238: FirstName is Kathi")
	void FirstNameOfRecord238() {
		assertEquals("Kathi", customers.get(237).getFirstName());
	}

	@Test
	@DisplayName("Record 238: LastName is Demetrakos")
	void LastNameOfRecord238() {
		assertEquals("Demetrakos", customers.get(237).getLastName());
	}

	@Test
	@DisplayName("Record 238: Company is Michael W Sawaya Ins Agcy")
	void CompanyOfRecord238() {
		assertEquals("Michael W Sawaya Ins Agcy", customers.get(237).getCompany());
	}

	@Test
	@DisplayName("Record 238: Address is 2976 W Melvina St")
	void AddressOfRecord238() {
		assertEquals("2976 W Melvina St", customers.get(237).getAddress());
	}

	@Test
	@DisplayName("Record 238: City is Milwaukee")
	void CityOfRecord238() {
		assertEquals("Milwaukee", customers.get(237).getCity());
	}

	@Test
	@DisplayName("Record 238: County is Milwaukee")
	void CountyOfRecord238() {
		assertEquals("Milwaukee", customers.get(237).getCounty());
	}

	@Test
	@DisplayName("Record 238: State is WI")
	void StateOfRecord238() {
		assertEquals("WI", customers.get(237).getState());
	}

	@Test
	@DisplayName("Record 238: ZIP is 53216")
	void ZIPOfRecord238() {
		assertEquals("53216", customers.get(237).getZIP());
	}

	@Test
	@DisplayName("Record 238: Phone is 414-265-9922")
	void PhoneOfRecord238() {
		assertEquals("414-265-9922", customers.get(237).getPhone());
	}

	@Test
	@DisplayName("Record 238: Fax is 414-265-9432")
	void FaxOfRecord238() {
		assertEquals("414-265-9432", customers.get(237).getFax());
	}

	@Test
	@DisplayName("Record 238: Email is kathi@demetrakos.com")
	void EmailOfRecord238() {
		assertEquals("kathi@demetrakos.com", customers.get(237).getEmail());
	}

	@Test
	@DisplayName("Record 238: Web is http://www.kathidemetrakos.com")
	void WebOfRecord238() {
		assertEquals("http://www.kathidemetrakos.com", customers.get(237).getWeb());
	}
}
