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

@Tag("44")
class Record_2881 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2881: FirstName is Kristin")
	void FirstNameOfRecord2881() {
		assertEquals("Kristin", customers.get(2880).getFirstName());
	}

	@Test
	@DisplayName("Record 2881: LastName is Oehlenschlage")
	void LastNameOfRecord2881() {
		assertEquals("Oehlenschlage", customers.get(2880).getLastName());
	}

	@Test
	@DisplayName("Record 2881: Company is Aviar Travel Agency")
	void CompanyOfRecord2881() {
		assertEquals("Aviar Travel Agency", customers.get(2880).getCompany());
	}

	@Test
	@DisplayName("Record 2881: Address is 1631 Pass Rd")
	void AddressOfRecord2881() {
		assertEquals("1631 Pass Rd", customers.get(2880).getAddress());
	}

	@Test
	@DisplayName("Record 2881: City is Biloxi")
	void CityOfRecord2881() {
		assertEquals("Biloxi", customers.get(2880).getCity());
	}

	@Test
	@DisplayName("Record 2881: County is Harrison")
	void CountyOfRecord2881() {
		assertEquals("Harrison", customers.get(2880).getCounty());
	}

	@Test
	@DisplayName("Record 2881: State is MS")
	void StateOfRecord2881() {
		assertEquals("MS", customers.get(2880).getState());
	}

	@Test
	@DisplayName("Record 2881: ZIP is 39531")
	void ZIPOfRecord2881() {
		assertEquals("39531", customers.get(2880).getZIP());
	}

	@Test
	@DisplayName("Record 2881: Phone is 228-831-4703")
	void PhoneOfRecord2881() {
		assertEquals("228-831-4703", customers.get(2880).getPhone());
	}

	@Test
	@DisplayName("Record 2881: Fax is 228-831-5702")
	void FaxOfRecord2881() {
		assertEquals("228-831-5702", customers.get(2880).getFax());
	}

	@Test
	@DisplayName("Record 2881: Email is kristin@oehlenschlage.com")
	void EmailOfRecord2881() {
		assertEquals("kristin@oehlenschlage.com", customers.get(2880).getEmail());
	}

	@Test
	@DisplayName("Record 2881: Web is http://www.kristinoehlenschlage.com")
	void WebOfRecord2881() {
		assertEquals("http://www.kristinoehlenschlage.com", customers.get(2880).getWeb());
	}
}
