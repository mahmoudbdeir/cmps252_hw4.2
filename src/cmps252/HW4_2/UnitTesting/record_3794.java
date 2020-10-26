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

@Tag("46")
class Record_3794 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3794: FirstName is Denny")
	void FirstNameOfRecord3794() {
		assertEquals("Denny", customers.get(3793).getFirstName());
	}

	@Test
	@DisplayName("Record 3794: LastName is Giambattista")
	void LastNameOfRecord3794() {
		assertEquals("Giambattista", customers.get(3793).getLastName());
	}

	@Test
	@DisplayName("Record 3794: Company is Seabrook Machine Co")
	void CompanyOfRecord3794() {
		assertEquals("Seabrook Machine Co", customers.get(3793).getCompany());
	}

	@Test
	@DisplayName("Record 3794: Address is 441 Murfreesboro Rd")
	void AddressOfRecord3794() {
		assertEquals("441 Murfreesboro Rd", customers.get(3793).getAddress());
	}

	@Test
	@DisplayName("Record 3794: City is Nashville")
	void CityOfRecord3794() {
		assertEquals("Nashville", customers.get(3793).getCity());
	}

	@Test
	@DisplayName("Record 3794: County is Davidson")
	void CountyOfRecord3794() {
		assertEquals("Davidson", customers.get(3793).getCounty());
	}

	@Test
	@DisplayName("Record 3794: State is TN")
	void StateOfRecord3794() {
		assertEquals("TN", customers.get(3793).getState());
	}

	@Test
	@DisplayName("Record 3794: ZIP is 37210")
	void ZIPOfRecord3794() {
		assertEquals("37210", customers.get(3793).getZIP());
	}

	@Test
	@DisplayName("Record 3794: Phone is 615-248-0584")
	void PhoneOfRecord3794() {
		assertEquals("615-248-0584", customers.get(3793).getPhone());
	}

	@Test
	@DisplayName("Record 3794: Fax is 615-248-1974")
	void FaxOfRecord3794() {
		assertEquals("615-248-1974", customers.get(3793).getFax());
	}

	@Test
	@DisplayName("Record 3794: Email is denny@giambattista.com")
	void EmailOfRecord3794() {
		assertEquals("denny@giambattista.com", customers.get(3793).getEmail());
	}

	@Test
	@DisplayName("Record 3794: Web is http://www.dennygiambattista.com")
	void WebOfRecord3794() {
		assertEquals("http://www.dennygiambattista.com", customers.get(3793).getWeb());
	}
}
