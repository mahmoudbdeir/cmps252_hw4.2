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

@Tag("17")
class Record_607 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 607: FirstName is Faustino")
	void FirstNameOfRecord607() {
		assertEquals("Faustino", customers.get(606).getFirstName());
	}

	@Test
	@DisplayName("Record 607: LastName is Holsey")
	void LastNameOfRecord607() {
		assertEquals("Holsey", customers.get(606).getLastName());
	}

	@Test
	@DisplayName("Record 607: Company is Gay & Lesbian Allnce Against")
	void CompanyOfRecord607() {
		assertEquals("Gay & Lesbian Allnce Against", customers.get(606).getCompany());
	}

	@Test
	@DisplayName("Record 607: Address is 16514 Garfield Ave")
	void AddressOfRecord607() {
		assertEquals("16514 Garfield Ave", customers.get(606).getAddress());
	}

	@Test
	@DisplayName("Record 607: City is Paramount")
	void CityOfRecord607() {
		assertEquals("Paramount", customers.get(606).getCity());
	}

	@Test
	@DisplayName("Record 607: County is Los Angeles")
	void CountyOfRecord607() {
		assertEquals("Los Angeles", customers.get(606).getCounty());
	}

	@Test
	@DisplayName("Record 607: State is CA")
	void StateOfRecord607() {
		assertEquals("CA", customers.get(606).getState());
	}

	@Test
	@DisplayName("Record 607: ZIP is 90723")
	void ZIPOfRecord607() {
		assertEquals("90723", customers.get(606).getZIP());
	}

	@Test
	@DisplayName("Record 607: Phone is 562-531-9732")
	void PhoneOfRecord607() {
		assertEquals("562-531-9732", customers.get(606).getPhone());
	}

	@Test
	@DisplayName("Record 607: Fax is 562-531-9748")
	void FaxOfRecord607() {
		assertEquals("562-531-9748", customers.get(606).getFax());
	}

	@Test
	@DisplayName("Record 607: Email is faustino@holsey.com")
	void EmailOfRecord607() {
		assertEquals("faustino@holsey.com", customers.get(606).getEmail());
	}

	@Test
	@DisplayName("Record 607: Web is http://www.faustinoholsey.com")
	void WebOfRecord607() {
		assertEquals("http://www.faustinoholsey.com", customers.get(606).getWeb());
	}
}
