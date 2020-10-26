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

@Tag("35")
class Record_2408 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2408: FirstName is Emmitt")
	void FirstNameOfRecord2408() {
		assertEquals("Emmitt", customers.get(2407).getFirstName());
	}

	@Test
	@DisplayName("Record 2408: LastName is Skalla")
	void LastNameOfRecord2408() {
		assertEquals("Skalla", customers.get(2407).getLastName());
	}

	@Test
	@DisplayName("Record 2408: Company is C & P Carbide Co Inc")
	void CompanyOfRecord2408() {
		assertEquals("C & P Carbide Co Inc", customers.get(2407).getCompany());
	}

	@Test
	@DisplayName("Record 2408: Address is 7333 Coldwater Canyon Ave")
	void AddressOfRecord2408() {
		assertEquals("7333 Coldwater Canyon Ave", customers.get(2407).getAddress());
	}

	@Test
	@DisplayName("Record 2408: City is North Hollywood")
	void CityOfRecord2408() {
		assertEquals("North Hollywood", customers.get(2407).getCity());
	}

	@Test
	@DisplayName("Record 2408: County is Los Angeles")
	void CountyOfRecord2408() {
		assertEquals("Los Angeles", customers.get(2407).getCounty());
	}

	@Test
	@DisplayName("Record 2408: State is CA")
	void StateOfRecord2408() {
		assertEquals("CA", customers.get(2407).getState());
	}

	@Test
	@DisplayName("Record 2408: ZIP is 91605")
	void ZIPOfRecord2408() {
		assertEquals("91605", customers.get(2407).getZIP());
	}

	@Test
	@DisplayName("Record 2408: Phone is 818-764-3002")
	void PhoneOfRecord2408() {
		assertEquals("818-764-3002", customers.get(2407).getPhone());
	}

	@Test
	@DisplayName("Record 2408: Fax is 818-764-3204")
	void FaxOfRecord2408() {
		assertEquals("818-764-3204", customers.get(2407).getFax());
	}

	@Test
	@DisplayName("Record 2408: Email is emmitt@skalla.com")
	void EmailOfRecord2408() {
		assertEquals("emmitt@skalla.com", customers.get(2407).getEmail());
	}

	@Test
	@DisplayName("Record 2408: Web is http://www.emmittskalla.com")
	void WebOfRecord2408() {
		assertEquals("http://www.emmittskalla.com", customers.get(2407).getWeb());
	}
}
