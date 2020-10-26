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

@Tag("12")
class Record_1243 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1243: FirstName is Rosanna")
	void FirstNameOfRecord1243() {
		assertEquals("Rosanna", customers.get(1242).getFirstName());
	}

	@Test
	@DisplayName("Record 1243: LastName is Groscost")
	void LastNameOfRecord1243() {
		assertEquals("Groscost", customers.get(1242).getLastName());
	}

	@Test
	@DisplayName("Record 1243: Company is I O Interconnect")
	void CompanyOfRecord1243() {
		assertEquals("I O Interconnect", customers.get(1242).getCompany());
	}

	@Test
	@DisplayName("Record 1243: Address is 214 Fulford Ave")
	void AddressOfRecord1243() {
		assertEquals("214 Fulford Ave", customers.get(1242).getAddress());
	}

	@Test
	@DisplayName("Record 1243: City is Bel Air")
	void CityOfRecord1243() {
		assertEquals("Bel Air", customers.get(1242).getCity());
	}

	@Test
	@DisplayName("Record 1243: County is Harford")
	void CountyOfRecord1243() {
		assertEquals("Harford", customers.get(1242).getCounty());
	}

	@Test
	@DisplayName("Record 1243: State is MD")
	void StateOfRecord1243() {
		assertEquals("MD", customers.get(1242).getState());
	}

	@Test
	@DisplayName("Record 1243: ZIP is 21014")
	void ZIPOfRecord1243() {
		assertEquals("21014", customers.get(1242).getZIP());
	}

	@Test
	@DisplayName("Record 1243: Phone is 410-879-4455")
	void PhoneOfRecord1243() {
		assertEquals("410-879-4455", customers.get(1242).getPhone());
	}

	@Test
	@DisplayName("Record 1243: Fax is 410-879-4732")
	void FaxOfRecord1243() {
		assertEquals("410-879-4732", customers.get(1242).getFax());
	}

	@Test
	@DisplayName("Record 1243: Email is rosanna@groscost.com")
	void EmailOfRecord1243() {
		assertEquals("rosanna@groscost.com", customers.get(1242).getEmail());
	}

	@Test
	@DisplayName("Record 1243: Web is http://www.rosannagroscost.com")
	void WebOfRecord1243() {
		assertEquals("http://www.rosannagroscost.com", customers.get(1242).getWeb());
	}
}
