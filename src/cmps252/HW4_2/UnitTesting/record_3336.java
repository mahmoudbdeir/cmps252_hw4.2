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

@Tag("19")
class Record_3336 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3336: FirstName is Newton")
	void FirstNameOfRecord3336() {
		assertEquals("Newton", customers.get(3335).getFirstName());
	}

	@Test
	@DisplayName("Record 3336: LastName is Stamnos")
	void LastNameOfRecord3336() {
		assertEquals("Stamnos", customers.get(3335).getLastName());
	}

	@Test
	@DisplayName("Record 3336: Company is Dyersburg Glass & Ovrhd Door")
	void CompanyOfRecord3336() {
		assertEquals("Dyersburg Glass & Ovrhd Door", customers.get(3335).getCompany());
	}

	@Test
	@DisplayName("Record 3336: Address is 125 E Carpenter Frwy")
	void AddressOfRecord3336() {
		assertEquals("125 E Carpenter Frwy", customers.get(3335).getAddress());
	}

	@Test
	@DisplayName("Record 3336: City is Irving")
	void CityOfRecord3336() {
		assertEquals("Irving", customers.get(3335).getCity());
	}

	@Test
	@DisplayName("Record 3336: County is Dallas")
	void CountyOfRecord3336() {
		assertEquals("Dallas", customers.get(3335).getCounty());
	}

	@Test
	@DisplayName("Record 3336: State is TX")
	void StateOfRecord3336() {
		assertEquals("TX", customers.get(3335).getState());
	}

	@Test
	@DisplayName("Record 3336: ZIP is 75062")
	void ZIPOfRecord3336() {
		assertEquals("75062", customers.get(3335).getZIP());
	}

	@Test
	@DisplayName("Record 3336: Phone is 972-869-7025")
	void PhoneOfRecord3336() {
		assertEquals("972-869-7025", customers.get(3335).getPhone());
	}

	@Test
	@DisplayName("Record 3336: Fax is 972-869-5327")
	void FaxOfRecord3336() {
		assertEquals("972-869-5327", customers.get(3335).getFax());
	}

	@Test
	@DisplayName("Record 3336: Email is newton@stamnos.com")
	void EmailOfRecord3336() {
		assertEquals("newton@stamnos.com", customers.get(3335).getEmail());
	}

	@Test
	@DisplayName("Record 3336: Web is http://www.newtonstamnos.com")
	void WebOfRecord3336() {
		assertEquals("http://www.newtonstamnos.com", customers.get(3335).getWeb());
	}
}
