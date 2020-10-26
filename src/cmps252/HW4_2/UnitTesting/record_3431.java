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

@Tag("5")
class Record_3431 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3431: FirstName is Traci")
	void FirstNameOfRecord3431() {
		assertEquals("Traci", customers.get(3430).getFirstName());
	}

	@Test
	@DisplayName("Record 3431: LastName is Fiorilli")
	void LastNameOfRecord3431() {
		assertEquals("Fiorilli", customers.get(3430).getLastName());
	}

	@Test
	@DisplayName("Record 3431: Company is American Molded Products Inc")
	void CompanyOfRecord3431() {
		assertEquals("American Molded Products Inc", customers.get(3430).getCompany());
	}

	@Test
	@DisplayName("Record 3431: Address is 1 Se 3rd Ave")
	void AddressOfRecord3431() {
		assertEquals("1 Se 3rd Ave", customers.get(3430).getAddress());
	}

	@Test
	@DisplayName("Record 3431: City is Miami")
	void CityOfRecord3431() {
		assertEquals("Miami", customers.get(3430).getCity());
	}

	@Test
	@DisplayName("Record 3431: County is Miami-Dade")
	void CountyOfRecord3431() {
		assertEquals("Miami-Dade", customers.get(3430).getCounty());
	}

	@Test
	@DisplayName("Record 3431: State is FL")
	void StateOfRecord3431() {
		assertEquals("FL", customers.get(3430).getState());
	}

	@Test
	@DisplayName("Record 3431: ZIP is 33131")
	void ZIPOfRecord3431() {
		assertEquals("33131", customers.get(3430).getZIP());
	}

	@Test
	@DisplayName("Record 3431: Phone is 305-373-7569")
	void PhoneOfRecord3431() {
		assertEquals("305-373-7569", customers.get(3430).getPhone());
	}

	@Test
	@DisplayName("Record 3431: Fax is 305-373-7183")
	void FaxOfRecord3431() {
		assertEquals("305-373-7183", customers.get(3430).getFax());
	}

	@Test
	@DisplayName("Record 3431: Email is traci@fiorilli.com")
	void EmailOfRecord3431() {
		assertEquals("traci@fiorilli.com", customers.get(3430).getEmail());
	}

	@Test
	@DisplayName("Record 3431: Web is http://www.tracifiorilli.com")
	void WebOfRecord3431() {
		assertEquals("http://www.tracifiorilli.com", customers.get(3430).getWeb());
	}
}
