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

@Tag("2")
class Record_1654 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1654: FirstName is Saundra")
	void FirstNameOfRecord1654() {
		assertEquals("Saundra", customers.get(1653).getFirstName());
	}

	@Test
	@DisplayName("Record 1654: LastName is Doetsch")
	void LastNameOfRecord1654() {
		assertEquals("Doetsch", customers.get(1653).getLastName());
	}

	@Test
	@DisplayName("Record 1654: Company is Floorworks")
	void CompanyOfRecord1654() {
		assertEquals("Floorworks", customers.get(1653).getCompany());
	}

	@Test
	@DisplayName("Record 1654: Address is 14582 Goldenwest St")
	void AddressOfRecord1654() {
		assertEquals("14582 Goldenwest St", customers.get(1653).getAddress());
	}

	@Test
	@DisplayName("Record 1654: City is Westminster")
	void CityOfRecord1654() {
		assertEquals("Westminster", customers.get(1653).getCity());
	}

	@Test
	@DisplayName("Record 1654: County is Orange")
	void CountyOfRecord1654() {
		assertEquals("Orange", customers.get(1653).getCounty());
	}

	@Test
	@DisplayName("Record 1654: State is CA")
	void StateOfRecord1654() {
		assertEquals("CA", customers.get(1653).getState());
	}

	@Test
	@DisplayName("Record 1654: ZIP is 92683")
	void ZIPOfRecord1654() {
		assertEquals("92683", customers.get(1653).getZIP());
	}

	@Test
	@DisplayName("Record 1654: Phone is 714-897-1144")
	void PhoneOfRecord1654() {
		assertEquals("714-897-1144", customers.get(1653).getPhone());
	}

	@Test
	@DisplayName("Record 1654: Fax is 714-897-2508")
	void FaxOfRecord1654() {
		assertEquals("714-897-2508", customers.get(1653).getFax());
	}

	@Test
	@DisplayName("Record 1654: Email is saundra@doetsch.com")
	void EmailOfRecord1654() {
		assertEquals("saundra@doetsch.com", customers.get(1653).getEmail());
	}

	@Test
	@DisplayName("Record 1654: Web is http://www.saundradoetsch.com")
	void WebOfRecord1654() {
		assertEquals("http://www.saundradoetsch.com", customers.get(1653).getWeb());
	}
}
