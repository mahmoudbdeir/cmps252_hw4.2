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

@Tag("8")
class Record_2971 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2971: FirstName is Otis")
	void FirstNameOfRecord2971() {
		assertEquals("Otis", customers.get(2970).getFirstName());
	}

	@Test
	@DisplayName("Record 2971: LastName is Wenske")
	void LastNameOfRecord2971() {
		assertEquals("Wenske", customers.get(2970).getLastName());
	}

	@Test
	@DisplayName("Record 2971: Company is A Small World")
	void CompanyOfRecord2971() {
		assertEquals("A Small World", customers.get(2970).getCompany());
	}

	@Test
	@DisplayName("Record 2971: Address is 13806 Turbine")
	void AddressOfRecord2971() {
		assertEquals("13806 Turbine", customers.get(2970).getAddress());
	}

	@Test
	@DisplayName("Record 2971: City is Pflugerville")
	void CityOfRecord2971() {
		assertEquals("Pflugerville", customers.get(2970).getCity());
	}

	@Test
	@DisplayName("Record 2971: County is Travis")
	void CountyOfRecord2971() {
		assertEquals("Travis", customers.get(2970).getCounty());
	}

	@Test
	@DisplayName("Record 2971: State is TX")
	void StateOfRecord2971() {
		assertEquals("TX", customers.get(2970).getState());
	}

	@Test
	@DisplayName("Record 2971: ZIP is 78660")
	void ZIPOfRecord2971() {
		assertEquals("78660", customers.get(2970).getZIP());
	}

	@Test
	@DisplayName("Record 2971: Phone is 512-251-9738")
	void PhoneOfRecord2971() {
		assertEquals("512-251-9738", customers.get(2970).getPhone());
	}

	@Test
	@DisplayName("Record 2971: Fax is 512-251-7065")
	void FaxOfRecord2971() {
		assertEquals("512-251-7065", customers.get(2970).getFax());
	}

	@Test
	@DisplayName("Record 2971: Email is otis@wenske.com")
	void EmailOfRecord2971() {
		assertEquals("otis@wenske.com", customers.get(2970).getEmail());
	}

	@Test
	@DisplayName("Record 2971: Web is http://www.otiswenske.com")
	void WebOfRecord2971() {
		assertEquals("http://www.otiswenske.com", customers.get(2970).getWeb());
	}
}
