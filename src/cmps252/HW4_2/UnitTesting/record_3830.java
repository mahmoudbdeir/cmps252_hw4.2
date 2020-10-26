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

@Tag("47")
class Record_3830 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3830: FirstName is Vanessa")
	void FirstNameOfRecord3830() {
		assertEquals("Vanessa", customers.get(3829).getFirstName());
	}

	@Test
	@DisplayName("Record 3830: LastName is Vandewalle")
	void LastNameOfRecord3830() {
		assertEquals("Vandewalle", customers.get(3829).getLastName());
	}

	@Test
	@DisplayName("Record 3830: Company is R Computer")
	void CompanyOfRecord3830() {
		assertEquals("R Computer", customers.get(3829).getCompany());
	}

	@Test
	@DisplayName("Record 3830: Address is 1732 Old Orangeburg Rd")
	void AddressOfRecord3830() {
		assertEquals("1732 Old Orangeburg Rd", customers.get(3829).getAddress());
	}

	@Test
	@DisplayName("Record 3830: City is Lexington")
	void CityOfRecord3830() {
		assertEquals("Lexington", customers.get(3829).getCity());
	}

	@Test
	@DisplayName("Record 3830: County is Lexington")
	void CountyOfRecord3830() {
		assertEquals("Lexington", customers.get(3829).getCounty());
	}

	@Test
	@DisplayName("Record 3830: State is SC")
	void StateOfRecord3830() {
		assertEquals("SC", customers.get(3829).getState());
	}

	@Test
	@DisplayName("Record 3830: ZIP is 29073")
	void ZIPOfRecord3830() {
		assertEquals("29073", customers.get(3829).getZIP());
	}

	@Test
	@DisplayName("Record 3830: Phone is 803-957-7263")
	void PhoneOfRecord3830() {
		assertEquals("803-957-7263", customers.get(3829).getPhone());
	}

	@Test
	@DisplayName("Record 3830: Fax is 803-957-5281")
	void FaxOfRecord3830() {
		assertEquals("803-957-5281", customers.get(3829).getFax());
	}

	@Test
	@DisplayName("Record 3830: Email is vanessa@vandewalle.com")
	void EmailOfRecord3830() {
		assertEquals("vanessa@vandewalle.com", customers.get(3829).getEmail());
	}

	@Test
	@DisplayName("Record 3830: Web is http://www.vanessavandewalle.com")
	void WebOfRecord3830() {
		assertEquals("http://www.vanessavandewalle.com", customers.get(3829).getWeb());
	}
}
